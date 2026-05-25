package bymyself.FinalExercise;

public class Building extends CampusAsset{
    private int energyConsumption;
    private double totalArea;

    public Building(double activeHours, String name, String id) {
        super(activeHours, name, id);
    }

    @Override
    public double calculateCarbonFootprint() {
        return energyConsumption * totalArea * getActiveHours() * 0.5;
    }
}
