package bymyself.gameSystem;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Random random= new Random();
        int attackAmount = random.nextInt(1,7);// actually its D6

        GameCharacter warrior1 = new Warrior("Arda",2,12,30);
        GameCharacter wizard1 = new Wizard("Zehra",2,8,12);
        GameCharacter warrior2 = new Warrior("Hamza",4,15,34);
        GameCharacter paladin1 = new Paladin("Baris",1,15,5,22);

        ArrayList<GameCharacter> GameCharacters = new ArrayList<>();//creates arraylist
        GameCharacters.add(warrior1);
        GameCharacters.add(wizard1);
        GameCharacters.add(warrior2);
        GameCharacters.add(paladin1);

        Collections.sort(GameCharacters);//Sorts the arraylist

        warrior1.takeDamage(attackAmount);
        System.out.println("=====Power List=====");
        for(GameCharacter gc : GameCharacters){
            System.out.println(gc);
        }

        warrior1.takeDamage(attackAmount);

        CombatEngine.simulateDuel(warrior1, paladin1);
    }
}
