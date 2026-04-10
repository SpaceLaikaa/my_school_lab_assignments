package bymyself.MidTermExercise.ComputerSystem;

public class Desktop extends Computer{
    public Desktop(int id, String brand, double basePrice){
        super(id, brand, basePrice);
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() + (getBasePrice() * 0.05);
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
