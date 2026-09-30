package first_year_labs.lab_projects_Semester1.lab4;

public class lab4assignment4{

    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int original = 1234;
        int result = reverseNumber(original);
        System.out.println("Reversed: " + result);
    }
}