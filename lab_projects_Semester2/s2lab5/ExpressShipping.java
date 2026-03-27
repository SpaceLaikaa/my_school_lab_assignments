package lab_projects_Semester2.s2lab5;

public class ExpressShipping extends Shipment{
    public ExpressShipping(String trackingNo, String contentType, int weightKg, int distanceKm) {
        super(trackingNo, contentType, weightKg, distanceKm);
    }

    @Override
    public double calculateFee(){
        return 20+25+0.12*getDistanceKm()+2.2*getWeightKg();
    }

    @Override
    public double finalFee(){
        return calculateFee();
    }
}
