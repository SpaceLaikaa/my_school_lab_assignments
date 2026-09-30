package first_year_labs.lab_projects_Semester1.lab3;

import java.util.Random;
import java.util.Scanner;

public class Lab3assignment3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random randomGenerator = new Random();

        int x = randomGenerator.nextInt(1000);
        int y = randomGenerator.nextInt(1000);

        int sum = x + y;
        int difference = x - y;
        long product = x * y;


        System.out.print("Select 1, 2, 3 or 4, and you will see the result: ");
        int girdi = input.nextInt();

        switch(girdi) {
            case 1:
                System.out.print("Here is your random sum: " + sum );
                break;
            case 2:
                System.out.print("Here is your random difference: " + difference);
                break;
            case 3:
                System.out.print("Here is your random product: " + product);
                break;
            case 4:
                if (y != 0){
                    float z = (float) x;
                    float v = (float) y;
                    float division = z/v;
                    System.out.print("Here is your random division: " + division);}
                    break;
            default:
                System.out.print("Invalid input");
            }
    }
}
