package first_year_labs.lab_projects_Semester1.lab9;

import java.io.IOException;//To write IOException I suppose?
import java.nio.file.Paths;//To use Paths.get
import java.util.Scanner;
import java.util.Formatter;//To write a file -- Formatter f = null;  f = new Formatter ("people.txt");
import java.io.FileWriter;//Hm I think formatter makes a txt file and fileWriter writes in that txt file -
                          //fw=new FileWriter("word_stats.txt", true);   FileWriter fw = null;

public class lab9Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file path: (example: q1.txt)");
        String filePath = sc.nextLine();

        int totalWords=0;
        String[] uniqueWords = new String[1000];
        int totalUniqueWords=0;

        switch (filePath){
            case "q1.txt","q1": {
                Scanner reader = null;
                Formatter f = null; //java.util.Formatter
                FileWriter fw = null; //java.io.FileWriter
                try {
                    reader = new Scanner(Paths.get("q1.txt"));
                    while (reader.hasNextLine()) {
                        String line = reader.nextLine();
                        if (line.trim().isEmpty()) continue;
                        String[] words = reader.nextLine().split(" ");//Briefly when reader sees a "space" it takes the part before to the array
                        for (int i = 0; i < words.length; i++) {
                            words[i] = words[i].replace(",", "");
                            words[i] = words[i].replace(".", "");
                            words[i] = words[i].toLowerCase();
                            System.out.print(words[i]+" ");
                            totalWords++;

                        }
                    }
                    fw = new FileWriter("word_stats.txt", true);
                    f = new Formatter(fw); //For preventing collision
                    f.format("Total words: "+totalWords);
                    fw.append("\nTesting for appending.");
                } catch (IOException e ) {
                    e.printStackTrace();
                    System.out.println("Something Went Wrong...");
                } finally {
                    if (reader != null)reader.close();
                    if (f!= null) f.close();
                }
                break;
            }
            default: {
                System.out.println("Please enter a valid input (q1.txt - q2.txt - q3.txt)");
                break;
            }
        }
    }
}
