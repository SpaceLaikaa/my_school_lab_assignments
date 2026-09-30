package first_year_labs.lab_projects_Semester1.lab3;

import java.util.Scanner;

public class Lab3assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Student ID: ");
        long ID = input.nextLong();

        if(ID % 2 == 0 && ID % 3 != 0){
            System.out.print("Student is in ALPHA TEAM!");
        }
        else if(ID % 5 == 0 && ID % 7 != 0) {
            System.out.print("Student is in BETA TEAM!");
        }
        else if(ID % 9 > 5) {
            System.out.print("Student is in THETA TEAM!");
        }
        else {
            System.out.print("Student is in SIGMA TEAM!");
        }
    }
}

