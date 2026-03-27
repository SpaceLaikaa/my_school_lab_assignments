package lab_projects_Semester2.s2lab5;

import java.util.Scanner;

public class Shipment {
    private String trackingNo;
    private String contentType;
    private int weightKg;
    private int distanceKm;

    public Shipment(String trackingNo,String contentType,int weightKg,int distanceKm){
        this.trackingNo = trackingNo;
        this.contentType = contentType;
        this.weightKg=weightKg;
        this.distanceKm=distanceKm;
    }

    public int getDistanceKm() {return distanceKm;}
    public int getWeightKg() {return weightKg;}
    public String getContentType() {return contentType;}
    public String getTrackingNo() {return trackingNo;}

    public void setContentType(String contentType) {this.contentType = contentType;}
    public void setTrackingNo(String trackingNo) {this.trackingNo = trackingNo;}
    public void setDistanceKm(int distanceKm) {this.distanceKm = distanceKm;}
    public void setWeightKg(int weightKg) {this.weightKg = weightKg;}

    //Task1
    public double calculateFee(){
        return weightKg*distanceKm;//Price will change depends on the shipment type
    }

    public void printReceipt(){          //So getClass and getSimpleName methods are used to get class name
        String shipmentType = ExpressShipping.class.getSimpleName();
        System.out.println("Tracking No: "+trackingNo+" Content Type: "+contentType+" Shipment Type: "+getClass().getSimpleName());
        System.out.println("Weight(KG): "+weightKg+" Distance(KM): "+distanceKm+" Total Fee: "+calculateFee());
    }

    public void printExpressNote(){
        Scanner sc = new Scanner(System.in);
        System.out.println("As an express user would you like to write a note to the courier?");
        String answer = sc.nextLine();

        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Write down your note: ");
            String expressNote=sc.nextLine();
            System.out.println("Note: "+expressNote);
        }
    }

    //Bonus task
    public double finalFee(){
        return calculateFee();
    }
}
