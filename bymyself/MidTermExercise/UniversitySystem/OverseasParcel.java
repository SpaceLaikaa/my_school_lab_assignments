package bymyself.MidTermExercise.UniversitySystem;

public class OverseasParcel extends Parcel{
    @Override
    public double estimateFee(){
        if(getTravelDistance()>1000){
            System.out.println(super.estimateFee()+40);
            return super.estimateFee()+40;
        }
        else{return super.estimateFee();}
    }
}
