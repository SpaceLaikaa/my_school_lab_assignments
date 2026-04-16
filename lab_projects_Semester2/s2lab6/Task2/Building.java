package lab_projects_Semester2.s2lab6.Task2;

public class Building implements Damageable,Repairable,Upgradeable{
    public String type;
    public double health;
    public int level;

    @Override
    public void repair(int amount){

    }
    @Override
    public void takeDamage(int amount){

    }
    @Override
    public boolean isDestroyed(){
        return false;//placeholder
    }
    @Override
    public void upgrade(){

    }

}
