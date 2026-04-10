package bymyself.MidTermExercise.UniversitySystem;

public class LocalParcel extends Parcel {
    @Override
    public double estimateFee(){
        return  8 + (getMass() * 1.5) + (getTravelDistance() * 0.04);
    }
}
