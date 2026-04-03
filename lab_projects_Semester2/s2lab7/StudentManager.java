package lab_projects_Semester2.s2lab7;

public class StudentManager {

    public double applyGradeOperation(Student s, Student.GradeOperation operation){
        return operation.apply(s.getGrade());
    }

    public boolean checkStudent(Student s, Student.StudentChecker checker){
        return checker.check(s);
    }
}
