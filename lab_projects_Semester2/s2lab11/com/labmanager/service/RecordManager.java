package lab_projects_Semester2.s2lab11.com.labmanager.service;



import lab_projects_Semester2.s2lab11.com.labmanager.model.StudentRecord;
import java.io.BufferedReader; //reads files line by line using readLine() without overloading the memory
import java.io.BufferedWriter;
import java.io.IOException; //checked exception thrown when a file is missing or unreadable
import java.io.PrintWriter;
import java.nio.file.Files; // The powerhouse utility class that handles opening, deleting, or copying files via methods
import java.nio.file.Path;
import java.nio.file.Paths; // Paths.get() = converts String to Path for bufferedReader.
import java.util.ArrayList;

public class RecordManager {
    public static ArrayList<StudentRecord> readRecords(Path inputPath){
        ArrayList<StudentRecord> studentRecords = new ArrayList<>();
        try(BufferedReader br = Files.newBufferedReader(inputPath)){
            String line;

            while((line = br.readLine()) != null){
                String[] parts = line.split(",");

                if(parts.length==5){
                    String studentID = parts[0];
                    String name = parts[1];
                    int completedLabs = Integer.parseInt(parts[2]);
                    double averageScore = Double.parseDouble(parts[3]);
                    String temporaryPassword = parts[4];
                    StudentRecord SR1 = new StudentRecord(studentID,name,completedLabs,averageScore,temporaryPassword);
                    studentRecords.add(SR1);
                }
                else{continue;}
            }
        }catch(IOException e){
            System.out.println("File error: "+e.getMessage());
        }
        return studentRecords;
    }

    public static void writeSuccessfulReport(ArrayList<StudentRecord> records, Path reportPath){

        try(PrintWriter out = new PrintWriter(Files.newBufferedWriter(reportPath))){
            out.println("====Success Report===="); //title
            for(StudentRecord record : records){
                if(record.isSuccessful()){
                    out.println(record.getInfo());
                }
            }
        } catch (IOException e){
            System.out.println("File error: "+e.getMessage());
        }
    }

    public static void writeSummaryReport(ArrayList<StudentRecord> records, Path summaryPath){
        int successfulStudents=0;
        int totalStudents=0;
        int unscsflStudents=0;
        double classScore=0;

        for (StudentRecord record : records){
            totalStudents++;
            classScore += record.getAverageScore();

            if(record.isSuccessful()){successfulStudents++;}
            else {unscsflStudents++;}
        }
        if(totalStudents>0){classScore/=totalStudents;}

        try(PrintWriter summaryOut = new PrintWriter(Files.newBufferedWriter(summaryPath))){
            summaryOut.println("====Report Summary====");
            summaryOut.println("Successful Students: "+successfulStudents+" | Unsuccessful Students: "+unscsflStudents+
                                " | Total Students: "+totalStudents+" | Class Average Score: "+classScore);
        } catch(IOException e){
            System.out.println("File error: "+e.getMessage());
        }
    }
}
