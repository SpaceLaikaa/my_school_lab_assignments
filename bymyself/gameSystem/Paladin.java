package bymyself.gameSystem;

public class Paladin extends Warrior {
    private double faithPoints;

    public Paladin(String name, int level, double baseHealth, double stamina,double faithPoints) {
        super(name, level, baseHealth, stamina);
        this.faithPoints = faithPoints;
    }

    @Override
    public double calculatePower(){
        return super.calculatePower()+(faithPoints*1.5);
    }

    @Override
    public String toString(){
        return super.toString()+" | SubClass: Paladin | Faith Points: "+faithPoints+" | Power: "+calculatePower();
    }
}
