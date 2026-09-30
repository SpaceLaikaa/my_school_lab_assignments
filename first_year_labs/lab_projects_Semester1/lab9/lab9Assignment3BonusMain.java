package first_year_labs.lab_projects_Semester1.lab9;

public class lab9Assignment3BonusMain {
    public void main(String[] args) {
        EmployeeManager EM = new EmployeeManager();
        EM.loadEmployeesFromFile("src/lab_projects/lab9/q3.txt");
        EM.addEmployee("Arda","Software Engineer","arda3535@example.com");
        EM.displayEmployees();
        EM.searchEmployee("Arda");
    }
}
