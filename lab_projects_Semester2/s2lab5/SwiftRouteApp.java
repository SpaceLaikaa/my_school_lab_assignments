package lab_projects_Semester2.s2lab5;
import java.util.Scanner;

public class SwiftRouteApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===Shipment Entry Menu===");
        System.out.println("1.Standart");
        System.out.println("2.Express");
        System.out.println("3.International");
        int userShipmentTypeChoice = sc.nextInt();

        System.out.println("Write Shipment Tracking No: ");
        String userTrackingNoChoice = sc.nextLine();
        System.out.println("Write Shipment Content Type: ");
        String userContentTypeChoice = sc.nextLine();
        System.out.println("Write Shipment Weight (KG): ");
        int userWeightChoice=sc.nextInt();
        System.out.println("Write Shipment Distance (KM): ");
        int userDistanceChoice=sc.nextInt();

        if(userShipmentTypeChoice==1){                             //Could've shorten the variable names
            Shipment standartShipment = new Shipment(userTrackingNoChoice,userContentTypeChoice,userWeightChoice,userDistanceChoice);
        }
        else if(userShipmentTypeChoice==2){
            Shipment expressShipment = new Shipment(userTrackingNoChoice,userContentTypeChoice,userWeightChoice,userDistanceChoice);
        }
        else if (userShipmentTypeChoice==3){
            Shipment internationalShipment = new Shipment(userTrackingNoChoice,userContentTypeChoice,userWeightChoice,userDistanceChoice);
        }
    }
}
