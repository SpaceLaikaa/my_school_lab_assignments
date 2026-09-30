package first_year_labs.lab_projects_Semester1.lab4;

import java.util.Scanner;

public class lab4assignment6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start: ");
        int n1 = sc.nextInt();
        System.out.println("Enter end: ");
        int end = sc.nextInt();
        int loop = 1001;

        boolean isPrime = true;
        for (int i = 2; i < n1; i++) {
            if (n1 % i == 0) {
                isPrime = false;
                break;
            }
        }

        for (int floop=1;floop<=loop;floop++) {
            if (n1 == end){
                break;
            }

            else if (floop == 1000){
                System.out.println("Infinite loop detected!");
            }
            else if (n1 % 2 == 0) {
                n1 = n1 / 2;
                continue;
            }
            else if (n1 % 3 == 0) {
                n1 = n1+4;
                continue;
            }

            else if (isPrime && n1 > 1){
                n1 = n1*2;
                continue;
            }
            else {
                n1= n1+1;
                continue;
            }
          }
        System.out.println("Finally, start and end is equal.");
        }
    }

