package first_year_labs.lab_projects_Semester1.lab5;

import java.util.Scanner;

public class lab5assignment0 {
    public static int factorial(int a){

        if (a == 0){
            return 1;
        }
            int result = a * factorial(a-1);
            return(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(factorial(n));
    }
}
