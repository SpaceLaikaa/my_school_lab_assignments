package bymyself.MidTermExercise.ComputerSystem;

public class Laptop extends Computer{
    public Laptop(int id, String brand, double basePrice){
        super(id, brand, basePrice);
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() + (getBasePrice() * 0.10);
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
