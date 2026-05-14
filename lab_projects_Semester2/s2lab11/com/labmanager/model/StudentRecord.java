package lab_projects_Semester2.s2lab11.com.labmanager.model;

import java.io.Serializable;

public class StudentRecord implements Serializable {
    private static final long serialVersionUID = 1L;
    private int studentID;
    private String name;
    private int completedLabs;
    private double averageScore;
    private transient String temporaryPassword ; //transient = dont Serialize this variable.

    public StudentRecord(int studentID,String name, int completedLabs, double averageScore, String temporaryPassword){
        this.studentID=studentID;
        this.completedLabs=completedLabs;
        this.averageScore=averageScore;
        this.temporaryPassword=temporaryPassword;
        this.name=name;
    }

    public String getName() {return name;}
    public double getAverageScore() {return averageScore;}
    public int getCompletedLabs() {return completedLabs;}
    public int getStudentID() {return studentID;}
    public static long getSerialVersionUID() {return serialVersionUID;}
    public String getTemporaryPassword() {return temporaryPassword;}

    public void setAverageScore(double averageScore) {this.averageScore = averageScore;}
    public void setStudentID(int studentID) {this.studentID = studentID;}
    public void setCompletedLabs(int completedLabs) {this.completedLabs = completedLabs;}
    public void setTemporaryPassword(String temporaryPassword) {this.temporaryPassword = temporaryPassword;}
    public void setName(String name) {this.name = name;}

    public boolean isSuccessful(){
        if(completedLabs >= 7 && averageScore>=60){return true;}
        else{return false;}
    }

    public String getInfo(){
        return "Student Name: "+name+" | Student ID: "+studentID+" | Completed Labs: "+completedLabs+
                " | Average Score: "+averageScore+" | Temporary Password: "+temporaryPassword;
    }
}
