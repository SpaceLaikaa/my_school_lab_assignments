package lab_projects_Semester2.s2lab2;

import java.util.Scanner;

//Q1 = Constructor lets us access the private variables from an another class.
//Q2 = Static is belong to the class rather than any object. However not-static methods belong to an object.

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount bankAccount1 = new BankAccount("Arda", 12345678912L,400);//Doesnt matter constructor balance is 0
        BankAccount bankAccount2 = new BankAccount("Hamza", 12345678910L,300);

        System.out.println("-----------------");
        System.out.println("1. Deposit"); System.out.println("2. Withdraw");
        System.out.println("3. Balance"); System.out.println("4. Send");
        System.out.println("5. Exit");
        System.out.println("-----------------");
        String userChoice = sc.nextLine();

        //Deposit
        if(userChoice.equalsIgnoreCase("1")||userChoice.equalsIgnoreCase("deposit")){
            System.out.println("How much money do you want to deposit ?");
            double userDepositChoice = sc.nextInt();
            if(userDepositChoice<=0){System.out.println("Not Valid");}
            else{bankAccount1.deposit(userDepositChoice);}

        }

        //Withdraw
        else if(userChoice.equalsIgnoreCase("2")||userChoice.equalsIgnoreCase("withdraw")){
            if(bankAccount1.getBalance()<=0){System.out.println("You are poor. (0 balance)");}
            else{System.out.println("Balance: "+bankAccount1.getBalance());
                System.out.println("How much money do you want to withdraw?");
                double userWithdrawChoice = sc.nextInt();
                bankAccount1.withdraw(userWithdrawChoice);}
        }

        //Balance Check
        else if(userChoice.equalsIgnoreCase("3")||userChoice.equalsIgnoreCase("Balance")){
            bankAccount1.displayAccountInfo();
        }

        //Send Money
        else if(userChoice.equalsIgnoreCase("4")||userChoice.equalsIgnoreCase("Send")){
            System.out.println("Which IBAN Account do you want to send money to?");
            long userSendIban = sc.nextLong();
            if(userSendIban==bankAccount2.getIban()){
                System.out.println("How much?");
                double userSendMoney = sc.nextDouble();
                bankAccount1.sendMoney(userSendMoney, bankAccount2);
            }
            else{System.out.println("Not valid.");}
        }

        //Exit
        else if (userChoice.equals("5")||userChoice.equalsIgnoreCase("exit")){System.out.println("Have a nice day!");}
        else{System.out.println("Not Valid");}
    }
}

    class BankAccount {
        private String ownerName;
        private long iban;
        private double balance=0;


        public BankAccount(String ownerName, long iban, double balance) {
            String stringIban = iban+"";
            if(stringIban.length() == 11){
                this.balance = 0;
                this.iban = iban;
                this.ownerName = ownerName;
            }
            else{
                System.out.println("Please enter a valid IBAN (11 decimal)");
            }
        }

        public void setBalance(double balance){this.balance = balance;}
        public void setIban(long iban){this.iban=iban;}
        public void setOwnerName(String ownerName){this.ownerName = ownerName;}

        public long getIban(){return iban;}
        public double getBalance(){return balance;}
        public String getOwnerName(){return ownerName;}

        public void deposit(double depositAmount){
            double newBalanceDeposit = getBalance()+depositAmount;
            System.out.println(depositAmount+"$ added to your account.\nNew Balance: "+newBalanceDeposit);
        }
        public void withdraw(double withdrawAmount){
            double newBalanceWithdraw = getBalance()-withdrawAmount;
            System.out.println(withdrawAmount+"$ withdrawed from your account. \nNew Balance: "+newBalanceWithdraw);
        }
        public void displayAccountInfo(){System.out.println(getBalance());}

        public void sendMoney(double sendAmount,BankAccount bankAccount){
            System.out.println("Successfully sent the money.");
            System.out.println("Receiver New Balance: "+(bankAccount.getBalance()+sendAmount));
            System.out.println("Your New Balance: "+(getBalance()-sendAmount));

        }
    }

