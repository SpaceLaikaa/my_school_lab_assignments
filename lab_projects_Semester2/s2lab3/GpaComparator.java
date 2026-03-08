package lab_projects_Semester2.s2lab3;

import java.util.Comparator;

public class GpaComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGpa(), s1.getGpa());
    }
}
