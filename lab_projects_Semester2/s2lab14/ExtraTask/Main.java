package lab_projects_Semester2.s2lab14.ExtraTask;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        Employee d1 = new Developer(1,"Arda","Java");
        Employee d2 = new Developer(1,"Baris","C");
        Employee m1 = new Manager(2,"Eren",3);
        Employee m2 = new Manager(1,"Yagiz",5);

        employees[0] = d1;
        employees[1] = d2;
        employees[2] = m1;
        employees[3] = m2;

        for(Employee e : employees){
            System.out.println(e.toString());
        }
        for (Employee e : employees){
            if(e instanceof Manager){
                Manager manager = (Manager) e;
                System.out.println(manager.getTeamSize());
            } else if (e instanceof Developer) {
                Developer developer = (Developer) e;
                System.out.println(developer.getProgrammingLanguage());
            }
        }
    }
}
