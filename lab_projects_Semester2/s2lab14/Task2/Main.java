package lab_projects_Semester2.s2lab14.Task2;

public class Main {
    public static void main(String[] args) {
        Payment payment1 = new CashPayment("Yagiz",30);
        Payment payment2 = new CreditCardPayment("Arda",25);
        Payment payment3 = new CashPayment("Baris", 26);

        Payment[] payments = new Payment[3];
        payments[0] = payment1; payments[1] = payment2; payments[2] = payment3;

        System.out.println("========");
        for(Payment p : payments){
            System.out.println(p.toString());
            System.out.println(p.calculateFinalAmount());
            System.out.println("========");
        }
    }
}
