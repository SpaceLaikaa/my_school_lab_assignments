package lab_projects_Semester2.s2lab6.Task2;

public class GameCharacter implements Damageable, Upgradeable{
    public String name;
    public double health;
    public int level;

    public GameCharacter(String name,double health,int level){
        this.name=name;
        this.health=health;
        this.level=level;
    }

    @Override
    public void upgrade(){

    }
    @Override
    public void takeDamage(int amount){
        health-=amount;
        System.out.println("Character "+name+" took "+amount+" damage. Remaining health: "+health);
    }
    @Override
    public boolean isDestroyed(){
        return false;//placeholder
    }
}
