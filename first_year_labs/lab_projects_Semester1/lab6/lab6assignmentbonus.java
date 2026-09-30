package first_year_labs.lab_projects_Semester1.lab6;

import java.util.Arrays;
import java.util.Random;

public class lab6assignmentbonus {
    public static void main(String[] args) {
        Random r = new Random();
        int j = 0;
        int i = 0;
        int[][] scores = new int[5][4];
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 4; j++) {
                scores[i][j] = r.nextInt(1, 101);
            }
        }
        System.out.println(Arrays.toString(scores[0]));
        System.out.println(Arrays.toString(scores[j]));
    }
}
