package first_year_labs.lab_projects_Semester1.lab7.L7AssignmentBonus;

import java.util.Scanner;

public class lab7assignmentBonusProductDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many products will be in the store? ");
        int size = sc.nextInt();

        Product[] products = new Product[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter name for product " + (i + 1) + ":");
            String name = sc.next();

            System.out.println("Enter stock quantity:");
            int stock = sc.nextInt();

            products[i] = new Product(name, stock);
        }

        System.out.println("\n--- SHOPPING SCREEN ---");
        System.out.print("Enter the name of the product you want to buy: ");
        String searchName = sc.next();

        boolean isFound = false;

        for (int i = 0; i < size; i++) {
            if (products[i].getName().equalsIgnoreCase(searchName)) {
                products[i].buyOne();
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("No such product!");
        }
    }
}