package first_year_labs.lab_projects_Semester1.lab4;

import java.util.Scanner;


public class lab4assignment2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = -1;
        int n2 = -1;
        int result = 0;
        System.out.println("Enter start: ");
        n1 = sc.nextInt();
        System.out.println("Enter end: ");
        n2 = sc.nextInt();
        int z = -1;

        for(z = n1 ; z<=n2;z++){


            result = result+z;


        }
        System.out.println(result);

    }
}
