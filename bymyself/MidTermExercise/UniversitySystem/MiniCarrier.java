package bymyself.MidTermExercise.UniversitySystem;

public class MiniCarrier extends CampusCarrier{
    private double loadLimit;

    public MiniCarrier(String vehicleCode, double baseFeePerDay,double loadLimit) {
        super(vehicleCode, baseFeePerDay);
        this.loadLimit=loadLimit;
    }

    @Override
    public void inspectVehicle(){
        System.out.println("Light Carrier");
    }
}
