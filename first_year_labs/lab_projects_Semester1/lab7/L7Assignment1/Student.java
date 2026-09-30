package first_year_labs.lab_projects_Semester1.lab7.L7Assignment1;

public class Student {
    String name;
    int age;


    public Student(){
        this.name = "null";
        this.age = 0;
    }

    public Student(String getN, int getA){
        this.name = getN;
        this.age = getA;
    }

    public void printStudentInfo(){
        System.out.println("Students: " + name + ", Ages: " + age);
        }


}


