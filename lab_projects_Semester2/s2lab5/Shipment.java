package lab_projects_Semester2.s2lab5;

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

    public void printReceipt(){
        System.out.println("Tracking No: "+trackingNo+" Content Type: "+contentType+" Shipment Type: (Empty For now)");
        System.out.println("Weight(KG): "+weightKg+" Distance(KM): "+distanceKm+"Total Fee: "+calculateFee());
    }

}
