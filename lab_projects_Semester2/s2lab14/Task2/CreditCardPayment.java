package lab_projects_Semester2.s2lab14.Task2;

public class CreditCardPayment extends Payment{

    public CreditCardPayment(String customerName, double amount) {
        super(customerName, amount);
    }

    @Override
    public double calculateFinalAmount(){
        return getAmount() + (getAmount() * 0.05);
    }
}
