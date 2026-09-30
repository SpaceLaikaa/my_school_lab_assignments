package first_year_labs.lab_projects_Semester1.lab4;

import java.util.Scanner;

public class lab4assignment5{

    public static int fizzBuzz(int n){

        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = 0;
        int result = 0;
        for (a = 1; a<=b;a++){
            result = a;
            if (b <= 0){
                System.out.println("Please enter a valid number.");
            }
            if (result % 3 == 0  && result % 5 == 0){
                System.out.print("FizzBuzz ");
                continue;
            }
            if(result % 3 == 0 && result % 5 != 0){
                System.out.print("Fizz ");
                continue;
            }
            if(result % 3 != 0 && result % 5 == 0){
                System.out.print("Buzz ");
                continue;
            }
            System.out.print(result + " ");

        }
    }
}