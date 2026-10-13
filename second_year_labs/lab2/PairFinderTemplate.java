package second_year_labs.lab2;

public class PairFinderTemplate {

    public static boolean hasPairWithSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) {
            return false;
        }

        // TODO: Implement an algorithm that achieves O(n) running time.

        return false;
    }

    public static int countPairsWithSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) {
            return 0;
        }

        int count = 0;

        // TODO: Adapt your approach from Task 1 to count all distinct pairs.

        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {-4, 1, 2, 7, 11};
        System.out.println("[-4, 1, 2, 7, 11], target = 9 -> " + hasPairWithSum(arr1, 9));

        int[] arr2 = {1, 2, 4, 8};
        System.out.println("[1, 2, 4, 8], target = 7 -> " + hasPairWithSum(arr2, 7));

        int[] arr3 = {3, 3};
        System.out.println("[3, 3], target = 6 -> " + hasPairWithSum(arr3, 6));

        System.out.println("[], target = 5 -> " + hasPairWithSum(new int[]{}, 5));
        System.out.println("[5], target = 5 -> " + hasPairWithSum(new int[]{5}, 5));

        int[] arr4 = {1, 2, 3, 4, 5, 6};
        System.out.println("[1, 2, 3, 4, 5, 6], target = 7 -> " + countPairsWithSum(arr4, 7));

        int[] arr5 = {1, 2, 4, 8};
        System.out.println("[1, 2, 4, 8], target = 7 -> " + countPairsWithSum(arr5, 7));

        System.out.println("[7], target = 7 -> " + countPairsWithSum(new int[]{7}, 7));
    }
}