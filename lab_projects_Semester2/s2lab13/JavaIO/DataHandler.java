package lab_projects_Semester2.s2lab13.JavaIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class DataHandler {
    public void FileHandler(){

        String name;
        String score;

        Path scoresPath = Path.of("C:\\Users\\ardaa\\IdeaProjects\\JavaFirst\\src\\lab_projects_Semester2\\s2lab12\\output\\Handled_Data.csv");
        try(BufferedReader bf = Files.newBufferedReader(scoresPath)){
            String line;
            while ((line = bf.readLine()) != null){
                String[] lineParts = line.split(",");
                if(lineParts.length == 2 && lineParts[0] != null){
                    name = lineParts[0];
                    score = lineParts[1];
                    Integer.parseInt(score);

                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}