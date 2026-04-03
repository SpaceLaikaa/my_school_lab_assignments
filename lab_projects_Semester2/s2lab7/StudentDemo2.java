package lab_projects_Semester2.s2lab7;

import java.util.ArrayList;

public class StudentDemo2 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student(15, "Arda", 87, "Good");
        Student student2 = new Student(31, "Hamza", 84, "Very Good");
        Student student3 = new Student(7, "Oguz", 35, "Bad");
        Student student4 = new Student(26, "Baris", 98, "Meh");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        for(Student s : students ){
            s.displayInfo();

            StudentManager studentManager = new StudentManager();
            boolean check40 = studentManager.checkStudent(s, st ->st.getGrade() >= 30 && st.getGrade()<=40);
            boolean check90 = studentManager.checkStudent(s, st->st.getGrade() >= 85 && st.getGrade()<=90);
            boolean check75 = studentManager.checkStudent(s, st->st.getGrade()>75);
            boolean check60 = studentManager.checkStudent(s, st->st.getGrade()>=60);

            if(check40){
                double newGrade40 = studentManager.applyGradeOperation(s, grade -> 40);
                s.setGrade((int)newGrade40);

                System.out.println("Increased Note: 40\n===New Display===");
                s.displayInfo();
            }
            if(check90){
                double newGrade90 = studentManager.applyGradeOperation(s,grade -> 90);
                s.setGrade((int)newGrade90);

                System.out.println("Increased Note: 90\n===New Display===");
                s.displayInfo();
            }
            if(check75){
                double newGrade75 = studentManager.applyGradeOperation(s,grade -> grade+5);
                s.setGrade((int)newGrade75);
            }
            else{studentManager.applyGradeOperation(s,grade -> grade);}
            if(check60){
                System.out.println("You Passed The Semester");
            } else {
                System.out.println("You Failed...");
            }
        }

    }
}
