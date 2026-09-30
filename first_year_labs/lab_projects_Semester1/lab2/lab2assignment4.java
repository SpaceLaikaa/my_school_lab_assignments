package first_year_labs.lab_projects_Semester1.lab2;

import java.util.Scanner;

public class lab2assignment4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 5;
        System.out.println(x++); //post-increment
        System.out.println(++x); //pre-increment

        int z = 3;
        int y = z++ + ++z + z--;
        System.out.println("z = " + z + ", y = " + y);
    }
}


