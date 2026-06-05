package lab_projects_Semester2.s2lab14;

import java.nio.file.Path;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DataReader reader =  new DataReader();

        ArrayList<ProductRecord> productRecords =reader.readData(Path.of("C:\\Users\\ardaa\\IdeaProjects\\JavaFirst\\src\\lab_projects_Semester2\\s2lab13\\JavaIO\\scores.txt"));

        for(ProductRecord pr : productRecords){
            System.out.println(pr.toString());
        }
    }
}
