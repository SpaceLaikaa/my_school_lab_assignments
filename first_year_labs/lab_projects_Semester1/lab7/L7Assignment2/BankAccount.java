package first_year_labs.lab_projects_Semester1.lab7.L7Assignment2;
import java.util.Random;

public class BankAccount {
    Random r = new Random(System.currentTimeMillis());

    private int accountID;
    private int balance;

    public BankAccount(){
        accountID = r.nextInt(101);
        balance = r.nextInt(1001);
    }

    public int getAccountID(){return accountID;}
    public int getBalance(){return balance;}

    public void setAccountID(int accountID){
        this.accountID = accountID;
    }
    public void setBalance(int balance){
        this.balance = balance;}




}
