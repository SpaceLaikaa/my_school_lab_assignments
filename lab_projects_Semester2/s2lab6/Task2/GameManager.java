package lab_projects_Semester2.s2lab6.Task2;

public class GameManager {
    public void applyDamage(Damageable d, int amount){
        d.takeDamage(amount);
    }
    public void repairObject(Repairable r, int amount){
        r.repair(amount);
    }
    public void upgradeObject(Upgradeable u){
        u.upgrade();
    }
}
