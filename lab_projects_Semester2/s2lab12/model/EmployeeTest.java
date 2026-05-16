package lab_projects_Semester2.s2lab12.model;

import lab_projects_Semester2.s2lab12.service.DataManager;

import javax.xml.crypto.Data;
import java.nio.file.Path;
import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<EmployeeRecord> employeeRecords = new ArrayList<>();

        DataManager DM1 = new DataManager();


        employeeRecords=DM1.dataHandler(Path.of("C:\\Users\\ardaa\\IdeaProjects\\JavaFirst\\src\\lab_projects_Semester2\\s2lab12\\data\\data.csv"));
        DM1.writeHandledData(employeeRecords, Path.of("C:\\Users\\ardaa\\IdeaProjects\\JavaFirst\\src\\lab_projects_Semester2\\s2lab12\\output\\Handled_Data.csv"));
    }
}
