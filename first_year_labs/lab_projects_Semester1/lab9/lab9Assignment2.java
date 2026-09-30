package first_year_labs.lab_projects_Semester1.lab9;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Formatter;
import java.io.FileWriter;

public class lab9Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file path: (example: q2.txt)");
        String filePath = sc.nextLine();

        switch (filePath){
            case "q2.txt", "q2":{
                Scanner reader = null;
                Formatter f = null;
                FileWriter fw = null;

                try{
                    reader = new Scanner(Paths.get("src/lab_projects/lab9/q2.txt"));
                    while (reader.hasNextLine()){
                        String line = reader.nextLine();
                        if(line.trim().isEmpty()) continue;
                        String[] words = line.split(" ");
                        for (int i = 0;i<words.length;i+=3){
                            words[i]=words[i].replace("Hello","Hi");
                        }
                    }

                    fw = new FileWriter("src/lab_projects/lab9/output.txt", true);
                    f = new Formatter(fw);
                    f.format("Replaced 'Hello' with 'Hi' in q2.txt");
                }catch (IOException e){
                    System.out.println(e.getStackTrace());
                }finally {
                    if (reader !=null){reader.close();}
                    if (f != null){f.close();}
                }
                break;
            }
            default:{
                System.out.println("Please enter a valid input (q2.txt)");
                break;
            }
        }
    }
}
