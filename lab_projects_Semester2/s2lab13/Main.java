package lab_projects_Semester2.s2lab13;

public class Main {
    public static void main(String[] args) {
        BikeDelivery bike1 = new BikeDelivery("35",13,15);
        BikeDelivery bike2 = new BikeDelivery("26",19,20);
        CarDelivery car1 = new CarDelivery("07",20,50);

        Delivery[] array = new Delivery[3];
        array[0] = bike1;
        array[1] = bike2;
        array[2] = car1;

        for(Delivery deliver : array){
            deliver.printReceipt();
        }
    }
}
