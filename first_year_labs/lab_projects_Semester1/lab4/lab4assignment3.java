package first_year_labs.lab_projects_Semester1.lab4;

import java.util.Scanner;

public class lab4assignment3 {
    public static long factorial(long n){
        long result = 1;
        long z = -1;
        for(z = 1 ; z<=n;z++){
            result = result * z;

        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n1 = sc.nextInt();

        long result = factorial(n1);
        System.out.println(result);

}
}