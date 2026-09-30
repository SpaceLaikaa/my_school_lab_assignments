package first_year_labs.lab_projects_Semester1.lab2;

import java.util.Scanner;

public class lab2assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.printf("Here is your name %s and this is your age %02d" ,name,age);
    }
}

/* lab 2 first question */