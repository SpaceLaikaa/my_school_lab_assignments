package lab_projects_Semester2.s2lab3;

public class EnrollmentDemo {
    public static void main(String[] args) {
        Student student1 = new Student(15, "Oguz",3.6);
        Student student2 = new Student(27, "Hamza",3.2);
        Student student3 = new Student(12, "Arda",2.9);

        student1.printInfo();
        student2.printInfo();
        student3.printInfo();

        Course SE115 = new Course(115,"SE115");

        //Task 3
        SE115.addStudent(student1);
        SE115.addStudent(student2);
        SE115.addStudent(student3);
        SE115.addStudent(student3);
        SE115.displayEnrolledStudents();
        System.out.println("-----------");
        //Task 4
        SE115.removeStudentByID("12");
        SE115.removeStudentByID("50");

    }
}
