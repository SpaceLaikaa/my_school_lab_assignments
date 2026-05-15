package lab_projects_Semester2.s2lab12.model;

public class EmployeeRecord {
    private String ID;
    private String name;
    private String email;

    public EmployeeRecord(String ID, String name, String email){
        this.ID=ID;
        this.name=name;
        this.email=email;
    }

    public String getName() {return name;}
    public String getEmail() {return email;}
    public String getID() {return ID;}

    public void setEmail(String email) {this.email = email;}
    public void setID(String ID) {this.ID = ID;}
    public void setName(String name) {this.name = name;}

    public String getInfo(){
        return ID+" | "+name+" | "+email;
    }
}
