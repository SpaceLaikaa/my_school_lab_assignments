package lab_projects_Semester2.s2lab6.Task2;

public class GameCharacter implements Damageable, Upgradeable{
    public String name;
    public double health;
    public int level;

    @Override
    public void upgrade(){

    }
    @Override
    public void takeDamage(int amount){

    }
    @Override
    public boolean isDestroyed(){
        return false;//placeholder
    }
}
