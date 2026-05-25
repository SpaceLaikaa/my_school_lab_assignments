package bymyself.FinalExercise;

public class Building extends CampusAsset{
    private int energyConsumption;
    private double totalArea;

    public Building(double activeHours, String name, String id, int energyConsumption, double totalArea) {
        if (totalArea<=0){throw new InvalidEmissionDataException("Total Area Cannot Be Lower or Equal to zero.");}
        super(activeHours, name, id);
        this.energyConsumption=energyConsumption;
        this.totalArea=totalArea;
    }

    @Override
    public double calculateCarbonFootprint() {
        return energyConsumption * totalArea * getActiveHours() * 0.5;
    }

    public double getTotalArea() {return totalArea;}
    public void setTotalArea(double totalArea) {this.totalArea = totalArea;}

    public int getEnergyConsumption() {return energyConsumption;}
    public void setEnergyConsumption(int energyConsumption) {this.energyConsumption = energyConsumption;}
}
