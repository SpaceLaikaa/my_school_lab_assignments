package lab_projects_Semester2.s2lab7;

public class Student {
    private int id;
    private String name;
    private int grade;
    private String performanceGrade;

    public Student(int id,String name,int grade,String performanceGrade){
        this.id=id;
        this.name=name;
        this.grade=grade;
        this.performanceGrade=performanceGrade;
    }

    public void setGrade(int grade) {this.grade = grade;}

    public int getId() {return id;}
    public int getGrade() {return grade;}
    public String getName() {return name;}
    public String getPerformanceGrade() {return performanceGrade;}

    public void displayInfo(){
        System.out.println("ID: "+id+"\nName: "+name+"\nGrade: "+grade+"\nPerformance Grade: "+performanceGrade);
    }

    public interface GradeOperation{
        public abstract double apply(double grade);
    }
    public interface StudentChecker{
        public abstract boolean check(Student s);
    }


}
