package bymyself.gameSystem;

public class Warrior extends GameCharacter{
    private double stamina;

    public Warrior(String name, int level, double baseHealth, double stamina) {
        super(name, level, baseHealth);
        this.stamina = stamina;
    }

    @Override
    public double calculatePower(){
        return (getLevel() * 10.5) + (stamina * 2.0);
    }

    @Override
    public String toString(){
        return super.toString() +" | Class: Warrior | Stamina: "+stamina;
    }
    }

