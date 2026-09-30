package first_year_labs.lab_projects_Semester1.lab9;

public class Employee {
    private String name;
    private String department;
    private String email;


    public Employee(String name, String department, String email){
        this.name = name;
        this.department = department;
        this.email = email;
    }

    public String getDepartment() {return department;}
    public String getEmail() {return email;}
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}
    public void setDepartment(String department) {this.department = department;}
    public void setEmail(String email){this.email = email;}

    public String toString(){
        return name + ", "+department+" and "+email;
    }
}
