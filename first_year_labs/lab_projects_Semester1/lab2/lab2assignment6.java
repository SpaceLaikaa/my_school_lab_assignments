package first_year_labs.lab_projects_Semester1.lab2;

import java.util.Scanner;

public class lab2assignment6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature in Celsius: ");
        int celsius = input.nextInt();
        float float_celsius = (float) celsius;
        float fahrenheit = float_celsius * 9/5 + 32;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
    }
}