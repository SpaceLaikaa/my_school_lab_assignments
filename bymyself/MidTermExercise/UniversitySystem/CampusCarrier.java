package bymyself.MidTermExercise.UniversitySystem;

public class CampusCarrier {
    private String vehicleCode;
    private double baseFeePerDay;

    public CampusCarrier(String vehicleCode,double baseFeePerDay){
        this.vehicleCode = vehicleCode;
        this.baseFeePerDay = baseFeePerDay;
    }

    public double getBaseFeePerDay() {return baseFeePerDay;}
    public String getVehicleCode() {return vehicleCode;}

    public void setVehicleCode(String vehicleCode) {this.vehicleCode = vehicleCode;}
    public void setBaseFeePerDay(double baseFeePerDay) {this.baseFeePerDay = baseFeePerDay;}

    public double computeUsageFee(int days){
        double totalFee = getBaseFeePerDay() * days;
        return totalFee;
    }

    public void inspectVehicle(){
        System.out.println("Everything is okay");
    }

}
