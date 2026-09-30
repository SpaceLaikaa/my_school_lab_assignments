package first_year_labs.lab_projects_Semester1.lab6;

import java.util.Arrays;


public class lab6assignment1 {
    public static int[] finalArr(int[] oldRoster, int newSize){
        int[] newArr = new int[newSize];
        for(int i = 0; i < oldRoster.length; i++){
            newArr[i] = oldRoster[i];
        }
        return newArr;
    }

    static void main(String[] args) {


        int[] oldArr = new int[42];
        for (int i = 0; i < oldArr.length; i++) {
            oldArr[i] = 1000 + i;
        }

        int newsize = 55;
        int[] oldArr2 =finalArr(oldArr, newsize);

        System.out.println(Arrays.toString(oldArr));
        System.out.println(Arrays.toString(finalArr(oldArr2, newsize)));
        }

    }

