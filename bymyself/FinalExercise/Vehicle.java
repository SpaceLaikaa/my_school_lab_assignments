package bymyself.FinalExercise;

public class Vehicle extends CampusAsset{
    private double fuelConsumptionRate;
    private String fuelType;

    public Vehicle(double activeHours, String name, String id, double fuelConsumptionRate,String fuelType){
        super(activeHours, name, id);
        this.fuelConsumptionRate = fuelConsumptionRate;
        this.fuelType=fuelType;
    }

    public double getFuelConsumptionRate() {return fuelConsumptionRate;}
    public void setFuelConsumptionRate(double fuelConsumptionRate) {this.fuelConsumptionRate = fuelConsumptionRate;}

    public String getFuelType() {return fuelType;}
    public void setFuelType(String fuelType) {this.fuelType = fuelType;}
}
