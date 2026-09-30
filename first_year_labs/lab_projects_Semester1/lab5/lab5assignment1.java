package first_year_labs.lab_projects_Semester1.lab5;

import java.util.Scanner;

public class lab5assignment1 {
    public static int sumDigits(int n){
        int n2 = 0;
        if (n<0){
            n2 = n * -1;
        }
        else {
            n2 = n;
        }
        if (n / 10 < 1){
            return n;
        }
        return ( n % 10) + sumDigits(n /10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(sumDigits(a));
    }
}
