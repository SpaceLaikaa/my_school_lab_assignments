package lab_projects_Semester2.s2lab3;


public class Student {
    private int studentID;
    private String name;
    private double gpa;

    public Student(int studentID, String name, double gpa){
        this.studentID = studentID;
        this.name=name;
        this.gpa=gpa;
    }

    public int getStudentID(){return studentID;}
    public String  getName(){return name;}
    public double getGpa(){return gpa;}

    public void setStudentID(int studentID){this.studentID = studentID;}
    public void setName(String name){this.name=name;}
    public void setGpa(double gpa){this.gpa=gpa;}

    public void printInfo(){
        System.out.println("Student ID: "+this.studentID+"| Student Name: "+this.name+"| Student GPA: "+this.gpa);
    }

}
