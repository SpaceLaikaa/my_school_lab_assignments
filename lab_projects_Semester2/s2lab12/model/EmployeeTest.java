package lab_projects_Semester2.s2lab12.model;

import lab_projects_Semester2.s2lab12.service.DataManager;

import javax.xml.crypto.Data;
import java.nio.file.Path;
import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
        DataManager DM1 = new DataManager();


        DM1.dataHandler(Path.of("C:\\Users\\ardaa\\IdeaProjects\\JavaFirst\\src\\lab_projects_Semester2\\s2lab12\\data\\data.csv"));
    }
}
