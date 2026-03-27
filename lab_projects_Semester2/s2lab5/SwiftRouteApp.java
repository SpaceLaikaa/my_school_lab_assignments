package lab_projects_Semester2.s2lab5;
import java.util.HashMap;
import java.util.Scanner;

public class SwiftRouteApp {
    public static void main(String[] args) {
        HashMap<String,Shipment> shipmentHashMap= new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("===Shipment Entry Menu===");
        System.out.println("1.Standart");
        System.out.println("2.Express");
        System.out.println("3.International");
        int userShipmentTypeChoice = sc.nextInt();

        //Datas for hashmap
        System.out.println("Write Shipment Tracking No: ");
        String userTrackingNoChoice = sc.next();

        System.out.println("Write Shipment Content Type: ");
        String userContentTypeChoice = sc.next();
        System.out.println("Write Shipment Weight (KG): ");
        int userWeightChoice=sc.nextInt();
        System.out.println("Write Shipment Distance (KM): ");
        int userDistanceChoice=sc.nextInt();
        sc.close();

        String mapKey = userTrackingNoChoice+"-"+userContentTypeChoice;

        if(userShipmentTypeChoice==1){                             //Could've shorten the variable names
            Shipment standartShipment = new Shipment(userTrackingNoChoice,userContentTypeChoice,userWeightChoice,userDistanceChoice);
            shipmentHashMap.put(mapKey,standartShipment);

            System.out.println("Standard Shipment send successfully! Shipment Code(Do not share it): "+mapKey);
            standartShipment.printReceipt();

        }
        else if(userShipmentTypeChoice==2){
            Shipment expressShipment = new Shipment(userTrackingNoChoice,userContentTypeChoice,userWeightChoice,userDistanceChoice);
            shipmentHashMap.put(mapKey,expressShipment);

            System.out.println("Express Shipment send successfully! Shipment Code(Do not share it): "+mapKey);
            expressShipment.printExpressNote();
            expressShipment.printReceipt();

        }
        else if (userShipmentTypeChoice==3){
            Shipment internationalShipment = new Shipment(userTrackingNoChoice,userContentTypeChoice,userWeightChoice,userDistanceChoice);
            shipmentHashMap.put(mapKey,internationalShipment);

            System.out.println("Shipment send successfully! Shipment Code(Do not share it): "+mapKey);
            internationalShipment.printReceipt();
        }
    }
}
