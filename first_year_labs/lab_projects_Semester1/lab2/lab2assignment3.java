package first_year_labs.lab_projects_Semester1.lab2;

import java.util.Scanner;

public class lab2assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value as a kuruş: ");
        int kurus = input.nextInt();
        float kurusfloat = (float) kurus;
        float liraandkurus = kurusfloat / 3;
        float kuruslar = liraandkurus % 100;
        float bolunmusliralar =  liraandkurus / 100;
        int son = (int) bolunmusliralar;
        System.out.printf("buyrun %d lira %f kurus ",son,kuruslar);
    }
}
