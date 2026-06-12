package lab_projects_Semester2.s2lab14.ExtraTask;

public class Employee {
    private int employeeId;
    private String employeeName;

    public int getEmployeeId() {return employeeId;}
    public void setEmployeeId(int employeeId) {this.employeeId = employeeId;}

    public String getEmployeeName() {return employeeName;}
    public void setEmployeeName(String employeeName) {this.employeeName = employeeName;}

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }
}
