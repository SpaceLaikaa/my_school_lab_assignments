package lab_projects_Semester2.s2lab3;

import java.util.ArrayList;

public class Course {
    private int courseCode;
    private String courseName;
    private ArrayList<Student> enrolledStudents;

    public Course(int courseCode, String courseName){
        this.courseCode=courseCode;
        this.courseName=courseName;
        enrolledStudents = new ArrayList<>();
    }

    public void addStudent(Student s){
        if (enrolledStudents.size() >= 3) {
            System.out.println("Course Full: Cannot enroll more than 3 students.");
        } else {
            enrolledStudents.add(s);
            System.out.println("Student enrolled: " + s.getName());
        }
    }
    public void displayEnrolledStudents(){
        System.out.println("Enrolled Students: ");
        for(Student students : enrolledStudents){
            System.out.println(students.getName());
        }
    }

    public void removeStudentByID(String id){
        boolean valid = false;
        int realID = Integer.parseInt(id);
        int studentCount = 0;
        for(Student students : enrolledStudents) {
            if(realID==students.getStudentID()){
                System.out.println("Removing Student: "+students.getStudentID());
                enrolledStudents.remove(studentCount);
                valid = true;
                break;
            }
            studentCount++;
        }
        if(!valid){System.out.println("No ID Such as "+id);}
    }
}









               // WITH ARRAY
//package lab_projects_Semester2.s2lab3;
//
//public class Course {
//    private int courseCode;
//    private String courseName;
//
//    Student[] enrolledStudents ;
//
//    public Course(int courseCode, String courseName){
//        this.courseCode=courseCode;
//        this.courseName=courseName;
//        enrolledStudents = new Student[3];
//    }
//
//    public void addStudent(Student s){
//        boolean add=false;
//        for (int i = 0; i < enrolledStudents.length; i++) {
//            if(enrolledStudents[i]==null){
//                enrolledStudents[i]=s;
//                System.out.println("Student enrolled: "+s.getName());
//                add = true;
//                break;
//            }
//        }
//        if(!add){System.out.println("Course Full: Cannot enroll more than 3 students.");}
//    }
//}
