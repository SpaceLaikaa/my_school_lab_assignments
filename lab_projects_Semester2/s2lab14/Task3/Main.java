package lab_projects_Semester2.s2lab14.Task3;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TriangleChecker checker = (a,b,c) -> (a+b>c) & (a+c>b) & (c+b>a) & (a+b+c>0);

        for (int i = 1; i <= 3; i++) {
            System.out.println("\nEnter dimensions for Set #" + i + ":");

            System.out.print("Enter side a: ");
            int a = scanner.nextInt();

            System.out.print("Enter side b: ");
            int b = scanner.nextInt();

            System.out.print("Enter side c: ");
            int c = scanner.nextInt();

            boolean isValidTriangle = checker.canFormTriangle(a, b, c);

            if (isValidTriangle) {
                System.out.println("=> Success! The dimensions (" + a + ", " + b + ", " + c + ") CAN form a triangle.");
            } else {
                System.out.println("=> Failure! The dimensions CANNOT form a triangle (Rule or greater-than-zero violation).");
            }
        }

        System.out.println("\n3 sets checked. Program finished.");
        scanner.close();

    }
}