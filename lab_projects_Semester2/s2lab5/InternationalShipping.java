package lab_projects_Semester2.s2lab5;

public class InternationalShipping extends Shipment{
    public InternationalShipping(String trackingNo, String contentType, int weightKg, int distanceKm) {
        super(trackingNo, contentType, weightKg, distanceKm);
    }

    @Override
    public double calculateFee(){
        if(getDistanceKm()<=800){
            return 30+40+0.15*getDistanceKm()+3*getWeightKg();
        }
        else {return 30+40+0.15*getDistanceKm()+3*getWeightKg()+35;}//long distance
    }

    @Override
    public double finalFee(){
        if(getWeightKg()<10){
            return calculateFee()*((double) 97/100);
        }
        else{return calculateFee();}
    }
}
