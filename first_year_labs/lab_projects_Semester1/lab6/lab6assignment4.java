package first_year_labs.lab_projects_Semester1.lab6;

import java.util.Arrays;
import java.util.Random;

public class lab6assignment4 {


    static void main(String[] args) {
        Random r = new Random();
        int count = 0;
        int i = 0;
        int[] pool = new int[30];

        for(;i<30;i++){
            pool[i] = r.nextInt(1,100);
        }

        for(i=0;i<30;i++){
            if(pool[i] == pool[0]){
                continue;
            }
            else if(pool[i]>pool[i-1] && pool[i]>pool[i+1]){
                System.out.print("peak " + pool[i] + "| ");
                count++;
            }
            else{
                continue;
            }
        }
        System.out.println("");
        System.out.println("There were " + count + " peak point.");

        System.out.println(Arrays.toString(pool));
    }
}
