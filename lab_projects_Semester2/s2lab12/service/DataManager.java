package lab_projects_Semester2.s2lab12.service;

import lab_projects_Semester2.s2lab12.model.EmployeeRecord;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class DataManager {
        ArrayList<EmployeeRecord> employeeRecords = new ArrayList<>();

    public ArrayList<EmployeeRecord> dataHandler(Path path){

        try(BufferedReader br = Files.newBufferedReader(path)){
            String line;
            while ((line = br.readLine())!=null){
                String[] listParts = line.trim().split(",");
                if(br.readLine().startsWith("0")){
                    String ID = listParts[0];
                    String name = listParts[1];
                    String email = listParts[2];
                    EmployeeRecord employeeRecord = new EmployeeRecord(ID,name,email);
                    employeeRecords.add(employeeRecord);
                }
                else{continue;}
            }
        } catch (IOException e){
            System.out.println("File error: "+e.getMessage());
        }


        return null; //placeholder
    }
}
