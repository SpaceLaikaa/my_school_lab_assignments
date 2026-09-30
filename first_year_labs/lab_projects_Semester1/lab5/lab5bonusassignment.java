package first_year_labs.lab_projects_Semester1.lab5;

import java.util.Scanner;

public class lab5bonusassignment {

    public static int fib(int n){
        if (n == 0 ){
            return 0;
        }
        else if (n == 1 ){
            return 1;
        }
        return  fib(n-1) + fib(n -2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println(fib(a));
    }
}
