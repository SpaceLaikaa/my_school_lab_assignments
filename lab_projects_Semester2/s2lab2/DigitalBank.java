package lab_projects_Semester2.s2lab2;

public class DigitalBank {
    public static void main(String[] args) {

    }

    public class BankAccount {
        private String ownerName;
        private long iban;
        private double balance;
        private String[] transactionHistory;

        public BankAccount(String ownerName, long iban){
            this.ownerName = ownerName;
            this.iban = iban;
            balance=0;
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

    }
}

