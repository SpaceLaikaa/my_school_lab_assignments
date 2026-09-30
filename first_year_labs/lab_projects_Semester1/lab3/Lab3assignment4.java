package first_year_labs.lab_projects_Semester1.lab3;

import java.util.Scanner;

public class Lab3assignment4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("You will be entering 3 different integers that represent side lengths a,b and c. It may only" +
                "be between 1 - 500. Enter the first integer a: ");
        int a = input.nextInt();
        if(a > 500) {System.out.print("Please enter a valid number.");}

        else {
            System.out.println("Enter the second integer b: ");
            int b = input.nextInt();

            if(b > 500) {System.out.print("Please enter a valid number.");}

            else{
            System.out.println("Enter the third integer c: ");
            int c = input.nextInt();

                if(c > 500) {
                    System.out.print("Please enter a valid number.");
                    return;
            }
                if (a + b <= c && a + c <= b && b + c <= a){
                    System.out.print("NOT A TRIANGLE");
                }
                else if(a != b && a !=c && b !=c) {
                    System.out.println("SCALENE");
                }
                else if(a == b && a == c && c == b){
                    System.out.println("EQUILATERAL");
                }
                else{
                    System.out.println("ISOSCELES");
                }

                int perimeter = a + b + c;
                System.out.print("Perimeter = " + perimeter);
            }



        }
    }
}
