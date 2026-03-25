package lab_projects_Semester2.s2lab5;

public class StandartShipping extends Shipment{
    public StandartShipping(String trackingNo, String contentType, int weightKg, int distanceKm) {
        super(trackingNo, contentType, weightKg, distanceKm);
    }

    @Override
    public double calculateFee(){
        return 15 + 0.08*getDistanceKm()+1.5*getWeightKg();
    }
}
