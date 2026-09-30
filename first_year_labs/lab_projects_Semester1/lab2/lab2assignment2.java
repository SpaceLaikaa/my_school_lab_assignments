package first_year_labs.lab_projects_Semester1.lab2;

import java.util.Scanner;

public class lab2assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a float number: ");
        float myFloat = input.nextFloat();
        int myInt = (int) myFloat;
        System.out.printf("Here is your float number %f and here is your converted number %01d",myFloat,myInt);
    }
}

/* lab 2 second question */