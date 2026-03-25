package bymyself.gameSystem;
import java.util.Random;

public class CombatEngine {
    public static void simulateDuel(GameCharacter c1, GameCharacter c2){
        Random random = new Random();
        int damage = random.nextInt(1,11);//D10
            if(c1.calculatePower()>c2.calculatePower()){
                c2.takeDamage(damage);
                System.out.println(c2.getName()+" lost. His current health is "+ c2.getCurrentHealth());
            }
            else if (c1.calculatePower()<c2.calculatePower()) {
                c1.takeDamage(damage);
                System.out.println(c1.getName()+" lost. His current health is "+ c1.getCurrentHealth());
            }
            else {
                System.out.println("Draw.");
            }
    }
}
