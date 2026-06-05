package lab_projects_Semester2.s2lab14;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DataReader {

    public void readData(Path dataPath){
        try(BufferedReader br = Files.newBufferedReader(dataPath)){



        } catch (IOException e){
            System.out.println("Cannot find readable data file path");
        }
    }

}
