package lab_projects_Semester2.s2lab13.DeliveryTask;

public class Main {
    public static void main(String[] args) {
        BikeDelivery bike1 = new BikeDelivery("35",13,15);
        BikeDelivery bike2 = new BikeDelivery("26",19,20);
        CarDelivery car1 = new CarDelivery("07",20,50);


        Delivery[] array = new Delivery[3];
        array[0] = bike1;
        array[1] = bike2;
        array[2] = car1;

        String[] strings = {"Arda", "Akkas", "Baris"};

        RecordBox<Delivery> recordBox1 = new RecordBox<>(array);
        RecordBox<String> recordBoxString = new RecordBox<>(strings);

        for(Delivery deliver : array){
            System.out.println(deliver.toString());
        }

        System.out.println("==========");
        recordBox1.printAll();
        recordBoxString.printAll();

        System.out.println(recordBox1.getRecord(2).toString());
    }
}
