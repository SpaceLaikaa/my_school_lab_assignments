package lab_projects_Semester2.s2lab12.service;

import lab_projects_Semester2.s2lab12.model.EmployeeRecord;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class DataManager {
    ArrayList<EmployeeRecord> employeeRecords = new ArrayList<>();

    public ArrayList<EmployeeRecord> dataHandler(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String firstLine = br.readLine();
            if (firstLine != null) {
                String[] headers = firstLine.split(",");
                System.out.println(headers[0] + "\t" + "Name" + "\t\t\t" + headers[2]);
                System.out.println("---------------------------------------------------------");
            }

            String line;
            while ((line = br.readLine()) != null) {
                String[] listParts = line.split(",");

                String ID = listParts[0].trim();
                String name = listParts[1].trim().replaceAll("  ", "").toUpperCase();
                String email = listParts[2].trim();

                EmployeeRecord employeeRecord = new EmployeeRecord(ID, name, email);
                employeeRecords.add(employeeRecord);
            }

            for (EmployeeRecord e : employeeRecords) {
                System.out.println(e.getInfo());
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        return employeeRecords;
    }

    public
}