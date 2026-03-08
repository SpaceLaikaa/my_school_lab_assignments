package lab_projects_Semester2.s2lab3;

import java.util.ArrayList;
import java.util.Iterator;

public class Course {
    private int courseCode;
    private String courseName;
    private ArrayList<Student> enrolledStudents;
    private ArrayList<Student> probationList; //Bonus task

    public Course(int courseCode, String courseName){
        this.courseCode=courseCode;
        this.courseName=courseName;
        enrolledStudents = new ArrayList<>();
        probationList = new ArrayList<>();
    }

    //bonus task
    public void filterProbation(){
        Iterator<Student> iterator = enrolledStudents.iterator(); //I used iterator for shifting error.
        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.getGpa()<2.0){
                probationList.add(student);
                iterator.remove();
                System.out.println("Moved to probation: "+student.getName());
            }
        }
        System.out.println("Probation List Size: "+probationList.size());
        System.out.println("Enrollment List Size: "+enrolledStudents.size());
    }

    public void searchByName(String keyword){
        ArrayList<Student> results;
        Iterator<Student> enrolledIterator = enrolledStudents.iterator();
        Iterator<Student> probationIterator = probationList.iterator();

    }

    //Tasks
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
        boolean real = false;
        int realID = Integer.parseInt(id);
        int studentCount = 0;

        for(Student students : enrolledStudents) {
            if(realID==students.getStudentID()){
                System.out.println("Removing Student: "+students.getStudentID());
                enrolledStudents.remove(studentCount);
                valid = true; real = true;
                break;
            }
             studentCount++;
        }
        if(!real){System.out.println("");}
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
