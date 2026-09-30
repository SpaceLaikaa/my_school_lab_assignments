package first_year_labs.lab_projects_Semester1.lab5;

import java.util.Scanner;

public class lab5assignment2 {
    public static long power(long base, int exp){
        if (base == 0 && exp == 0){
            System.out.print("Invalid Input :? ");
            return -999999999;
        }

        else if(base == 0){
            return 0;
        }
        else if (exp == 0){
            return 1;
        }
        return base * power(base, exp - 1);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        int bs = sc.nextInt();
        System.out.println("Enter the exponent number: ");
        int ex = sc.nextInt();
        System.out.print(power(bs, ex));
    }
}
