package bymyself.MidTermExercise.ComputerSystem;

public class Laptop extends Computer implements Upgradable{
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
    //Implemented Interface Methods
    @Override
    public void upgrade(){
        for(Component c : components){
            c.upgradeSpecs();
        }
        setBasePrice(getBasePrice()*2);
        System.out.println("DONE!");
    }

}
