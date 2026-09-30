package first_year_labs.lab_projects_Semester1.lab2;

import java.util.Scanner;

public class lab2assignment5 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your first quiz score: ");
    double _1 = input.nextInt();
    System.out.print("Enter your second quiz score: ");
    double _2 = input.nextInt();
    System.out.print("Enter your third quiz score: ");
    double _3 = input.nextInt();

    System.out.print("Enter your Final exam score: ");
    double _finalscore4 = input.nextInt();


    double quiz_score = ((_1 +_2 +_3) / 300) * 40;
    double final_score = (_finalscore4 / 100) * 60 ;
    double sonuc = quiz_score + final_score;
    System.out.println(sonuc);
    }
}
