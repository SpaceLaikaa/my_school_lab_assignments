package lab_projects_Semester2.s2lab6.Task2;

public class GameDemo {
    public static void main(String[] args) {
        GameManager gm = new GameManager();
        GameCharacter player1 = new GameCharacter("Arda",35,3);
        Weapon weapon1 = new Weapon("OathKeeper",48);
        Building building1 = new Building("Inn",360,3);

        gm.applyDamage(player1,50);
        if(player1.isDestroyed()){
            System.out.println(player1.name+" died in combat.");
        } else{
            System.out.println("Just a scratch.");
        }
        gm.applyDamage(weapon1,12);
        gm.repairObject(weapon1,8);

    }
}
