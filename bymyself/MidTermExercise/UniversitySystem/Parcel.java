package bymyself.MidTermExercise.UniversitySystem;

public class Parcel {
    private String parcelCode;
    private String category;
    private double mass;
    private double travelDistance;

    public double getMass() {
        return mass;
    }

    public double getTravelDistance() {
        return travelDistance;
    }

    public String getCategory() {
        return category;
    }

    public String getParcelCode() {
        return parcelCode;
    }

    public double estimateFee(){
        double fee = 5 + (mass * 2.0) + (travelDistance * 0.05);
        System.out.println(fee);
        return fee;
    }
    public void displaySlip(){

    }
}
