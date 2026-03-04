package lab_projects_Semester2.s2lab2;

public class DigitalBank {
    public static void main(String[] args) {
        Bank.setTransferFeeRate(0.02);

        DigitalBank db = new DigitalBank();
        BankAccount acc1 = db.new BankAccount("Arda", 12345678901L);
        BankAccount acc2 = db.new BankAccount("Zehra", 98765432109L);

        acc1.deposit(1000);
        acc1.withdraw(200);
        acc1.transferTo(500, acc2);

        acc1.withdraw(2000);

        acc1.displayAccountInfo();
        acc1.displayHistory();

        acc2.displayAccountInfo();
        acc2.displayHistory();
    }

    public class BankAccount {
        private String ownerName;
        private long iban;
        private double balance;
        private String[] transactionHistory;

        public BankAccount(String ownerName, long iban){
            this.ownerName = ownerName;
            this.iban = iban;
            this.balance = 0;
            this.transactionHistory = new String[10];
        }

        public String getOwnerName(){return ownerName;}
        public long getIban(){return iban;}
        public double getBalance(){return balance;}
        public String[] getTransactionHistory(){return  transactionHistory;}

        public void setOwnerName(String ownerName){this.ownerName=ownerName;}
        public void setIban(long iban){this.iban=iban;}
        public void setTransactionHistory(String[] transactionHistory){this.transactionHistory=transactionHistory;}
        public void setBalance(double balance){this.balance=balance;}

        private void addTransaction(String record){
            int currentCount = 0;
            for (int i = 0; i < transactionHistory.length; i++) {
                if (transactionHistory[i] != null) {
                    currentCount++;
                }
            }
            if (currentCount < 10) {
                transactionHistory[currentCount] = record;
            } else {
                for (int i = 1; i < transactionHistory.length; i++) {
                    transactionHistory[i - 1] = transactionHistory[i];
                }
                transactionHistory[9] = record;
            }
        }

        public void deposit(double amount) {
            if (amount > 0) {
                this.balance += amount;
                addTransaction("DEPOSIT: " + amount);
            } else {
                addTransaction("FAILED_DEPOSIT: " + amount);
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && this.balance >= amount) {
                this.balance -= amount;
                addTransaction("WITHDRAW: " + amount);
            } else {
                addTransaction("FAILED_WITHDRAW: " + amount);
            }
        }

        public void transferTo(double amount, BankAccount targetAccount) {
            double fee = Bank.calculateTransferFee(amount);
            double totalCost = amount + fee;

            if (amount > 0 && this.balance >= totalCost && targetAccount != null) {
                this.balance -= totalCost;
                targetAccount.balance += amount;
                addTransaction("TRANSFER_TO: " + amount);
                targetAccount.addTransaction("RECEIVED_TRANSFER: " + amount);
            } else {
                addTransaction("FAILED_TRANSFER: " + amount);
            }
        }

        public void displayAccountInfo() {
            System.out.println("Owner: " + ownerName + " | IBAN: " + iban + " | Balance: " + balance);
        }

        public void displayHistory() {
            System.out.println("--- History for " + ownerName + " ---");
            for (String record : transactionHistory) {
                if (record != null) System.out.println(record);
            }
        }
    }

    public static class Bank {
        private static double transferFeeRate;
        public static void setTransferFeeRate(double rate){ transferFeeRate = rate; }
        public static double getTransferFeeRate(){ return transferFeeRate; }
        public static double calculateTransferFee(double amount){ return amount * transferFeeRate; }
    }
}