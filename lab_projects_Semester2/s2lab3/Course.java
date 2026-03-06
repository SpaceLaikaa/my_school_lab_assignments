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
        boolean add=false;
        for (int i = 0; i < enrolledStudents.length; i++) {
            if(enrolledStudents[i]==null){
                enrolledStudents[i]=s;
                System.out.println("Student enrolled: "+s.getName());
                add = true;
                break;
            }
        }
        if(!add){System.out.println("Course Full: Cannot enroll more than 3 students.");}
    }
}
