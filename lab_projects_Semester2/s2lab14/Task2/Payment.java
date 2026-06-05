package lab_projects_Semester2.s2lab14.Task2;

public abstract class Payment {
    private String customerName;
    private double amount;

    public double getAmount() {return amount;}
    public void setAmount(double amount) {this.amount = amount;}

    public Payment(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }

    public String getCustomerName() {return customerName;}
    public void setCustomerName(String customerName) {this.customerName = customerName;}

    @Override
    public String toString() {
        return "Customer Name: "+customerName+", Amount: "+amount;
    }
}
