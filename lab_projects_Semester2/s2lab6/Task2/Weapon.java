package lab_projects_Semester2.s2lab6.Task2;

public class Weapon implements Damageable,Repairable{
    public String name;
    public double durability;

    public Weapon(String name,double durability){
        this.name=name;
        this.durability=durability;
    }

    @Override
    public void repair(int amount){
        durability+=amount;
        System.out.println("Weapon "+name+" repaired. Durability: "+durability);
    }

    @Override
    public void takeDamage(int amount){
        durability-=amount;
        System.out.println("Weapon "+name+" durability reduced to "+durability+".");
    }
    @Override
    public boolean isDestroyed(){
        if(durability<=0){return true;} else{return false;}
    }
}
