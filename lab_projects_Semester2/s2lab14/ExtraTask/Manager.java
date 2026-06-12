package lab_projects_Semester2.s2lab14.ExtraTask;

public class Manager extends Employee{
    private int teamSize;

    public Manager(int employeeId, String employeeName,int teamSize) {
        super(employeeId, employeeName);
        this.teamSize=teamSize;
    }

    public int getTeamSize() {return teamSize;}

    public void setTeamSize(int teamSize) {this.teamSize = teamSize;}
}
