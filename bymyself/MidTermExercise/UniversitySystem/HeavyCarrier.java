package bymyself.MidTermExercise.UniversitySystem;

public class HeavyCarrier extends CampusCarrier{
    private int wheelUnits;
    public HeavyCarrier(String vehicleCode,double baseFeePerDay,int wheelUnits){
        super(vehicleCode,baseFeePerDay);
        this.wheelUnits=wheelUnits;
    }
    @Override
    public double computeUsageFee(int days){
        double totalFee = (getBaseFeePerDay()*days)+(wheelUnits*20);
        return totalFee;
    }

}
