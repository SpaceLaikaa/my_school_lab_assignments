package lab_projects_Semester2.s2lab6.Task2;

public class GameCharacter implements Damageable, Upgradeable{
    String name;
    private double health;
    private int level;

    public GameCharacter(String name,double health,int level){
        this.name=name;
        this.health=health;
        this.level=level;
    }

    @Override
    public void upgrade(){
        level+=1;
        health+=20;
        System.out.println("Character "+name+" leveled up to "+level+". Health: "+health+".");
    }
    @Override
    public void takeDamage(int amount){
        health-=amount;
        System.out.println("Character "+name+" took "+amount+" damage. Remaining health: "+health);
    }
    @Override
    public boolean isDestroyed(){
        if(health<=0){return true;} else{return false;}
    }
}
