package bymyself.MidTermExercise.UniversitySystem;

public class FastTrackParcel extends Parcel{

    @Override
    public double estimateFee(){
        return 15 + (getMass() * 2.5) + (getTravelDistance() * 0.06);
    }
}
