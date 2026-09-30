package first_year_labs.lab_projects_Semester1.lab3;

import java.util.Random;

public class Lab3assignment1 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int h = randomGenerator.nextInt(25);
        int m = randomGenerator.nextInt(61);
        if(h > m) {
            System.out.printf("The hour is bigger than minute: %02d:%02d",h,m);
        }
        else if(h < m) {
            System.out.printf("The minute is bigger than hour: %02d:%02d",h,m);
        }
        else{
            System.out.printf("The minute is equal to hour %02d:%02d",h,m);
        }

    }
}
