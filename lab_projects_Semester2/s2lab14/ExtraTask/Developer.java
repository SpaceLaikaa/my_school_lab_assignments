package lab_projects_Semester2.s2lab14.ExtraTask;

public class Developer extends Employee{
    private String programmingLanguage;

    public Developer(int employeeId, String employeeName,String programmingLanguage){
        super(employeeId,employeeName);
        this.programmingLanguage=programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
