package bymyself.MidTermExercise.ComputerSystem;

public class Desktop extends Computer implements Upgradable, PowerConsumable{
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

        //Implemented Interface Methods
    @Override
    public double getPowerUsage() {
        return getTotalPowerUsage();
    }

    @Override
    public void upgrade() {
        try{
            for(Component c : components){
                c.upgradeSpecs();
                c.setPowerUsage(c.getPowerUsage()*2);
            }
            setBasePrice(getBasePrice()*2);
            System.out.println("DONE!");
            getPowerUsage();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
