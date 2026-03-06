package lab_projects_Semester2.s2lab3;

public class Course {
    private int courseCode;
    private String courseName;

    Student[] enrolledStudents ;

    public Course(int courseCode, String courseName){
        this.courseCode=courseCode;
        this.courseName=courseName;
        enrolledStudents = new Student[3];
    }

    public void addStudent(Student s){
        int studentCount=0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            studentCount++;
            if(studentCount==enrolledStudents.length){System.out.println("Course Full: Cannot enroll more than 3 students.");}
            else{s = enrolledStudents[i];}
        }
    }
}
