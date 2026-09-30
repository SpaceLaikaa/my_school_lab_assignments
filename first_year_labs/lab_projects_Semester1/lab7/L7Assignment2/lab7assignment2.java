package first_year_labs.lab_projects_Semester1.lab7.L7Assignment2;

import java.util.Scanner;

public class lab7assignment2 {

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        Scanner sc = new Scanner(System.in);

        int balance = acc.getBalance();
        int accountID = acc.getAccountID();
        boolean exit = true;

        while(exit) {
            System.out.println("-----------------");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Account Details");
            System.out.println("4. Exit");
            System.out.println("-----------------");
            int UserInput = sc.nextInt();

            if (UserInput == 1) { //DEposit
                balance = Deposit(balance);
                System.out.println("New balance: " + balance + "$");

            }
            else if (UserInput == 2) { //Withdraw
                System.out.println("Enter a withdrawal amount: ");
                int withdraw = sc.nextInt();
                balance = Withdraw(withdraw, balance);
                System.out.println("You successfully withdraw " + withdraw + "$ Your new Balance is: " + balance + "$");
            }
            else if (UserInput == 3) {
                AccountDetail(balance, accountID);
            }
            else if (UserInput == 4) {
                System.out.println("Thank you for choosing us, Have a nice day!");
                exit = false;
            }
            else {
                System.out.println("Enter a valid input.");
            }
        }
        }

    public static int Deposit(int B){
        Scanner sc = new Scanner(System.in);
        int balance = B;

        System.out.println("Enter deposit amount: ");
        int deposit = sc.nextInt();

        if(deposit > 0){balance = balance+deposit; return balance;}
        else{System.out.println("Please enter a valute greater than 0"); return 0;}
    }

    public static int Withdraw(int W, int B){
        Scanner sc = new Scanner(System.in);
        if (W<=B){
            B = B - W;
            return B;
        }
        else{
            System.out.println("You can't withdraw that. Do you want to borrow money from the bank? " );
            String YesBorrow = sc.nextLine();
            if(YesBorrow.equalsIgnoreCase("Yes")){
                B = B - W;
                return B;
            }
            else{
                System.out.println("Insufficient balance!");
            }
        }
        return B;
    }

    public static void AccountDetail(int B, int ID){
        System.out.println("Balance: " + B +"$\nAccountID: " + ID);
    }
}
