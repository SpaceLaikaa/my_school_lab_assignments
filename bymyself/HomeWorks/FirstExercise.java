package bymyself.HomeWorks;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// 1.1  Write a program to solve the selection problem Let k=N/2 Draw a table showing
public class FirstExercise {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Random r = new Random(10000);

        for (int i=0;i<=N;i++){
            numbers.add(r.nextInt());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(numbers.get(i));
        }

    }
}
