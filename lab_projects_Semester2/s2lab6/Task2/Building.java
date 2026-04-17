package lab_projects_Semester2.s2lab6.Task2;

import javax.xml.crypto.dsig.CanonicalizationMethod;

public class Building implements Damageable,Repairable,Upgradeable{
    private String type;
    private double health;
    private int level;

    public Building(String type,double health,int level){
        this.type=type;
        this.health=health;
        this.level=level;
    }

    @Override
    public void repair(int amount){
        health+=amount;
        System.out.println(type+" building repaired. Health: "+health);
    }
    @Override
    public void takeDamage(int amount){
        health-=amount;
        System.out.println(type+" building took "+amount+" damage. Remaining health: "+health);
    }
    @Override
    public boolean isDestroyed(){
        if(health<=0){return true;} else{return false;}
    }
    @Override
    public void upgrade(){
        level+=1;
        System.out.println(type+" building upgraded to level "+level);
    }

}
