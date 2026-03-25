package bymyself.gameSystem;

public class Wizard extends GameCharacter {
    private double intelligence;

    public Wizard(String name, int level, double baseHealth, double intelligence){
        super(name, level, baseHealth);
        this.intelligence = intelligence;
    }

    @Override
    public double calculatePower() {
        return (getLevel()*10.5) + (intelligence*3.5);
    }

    @Override
    public String toString(){
        return super.toString() +" | Class: Wizard | Intelligence: "+intelligence+" | Power: "+calculatePower();
        //Overrides and continues toString method for wizard
    }
}
