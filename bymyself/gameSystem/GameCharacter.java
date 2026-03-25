package bymyself.gameSystem;



public class GameCharacter implements Comparable<GameCharacter> {
    private String  name;
    private int level;
    private double baseHealth;
    private double currentHealth;

    public GameCharacter(String name, int level, double baseHealth){
        this.name = name;
        this.level=level;
        this.baseHealth = baseHealth;
        this.currentHealth = baseHealth;
    }

    public double getBaseHealth() {return baseHealth;}
    public int getLevel() {return level;}
    public String getName() {return name;}
    public double getCurrentHealth(){return currentHealth;}

    public double calculatePower(){return level * 10.5;}

    public void takeDamage(double amount){
        System.out.println("");
        System.out.println("==ENEMY ENCOUNTER==");
        System.out.println("You take "+amount+" damage.");
        currentHealth-=amount;
        System.out.println("Current Health: "+currentHealth);
        if(currentHealth<=0){
            System.out.println("You get slashed. You died miserably.");
            return; //stop
        }
    }

    @Override
    public int compareTo(GameCharacter otherCharacter){
        return Double.compare(otherCharacter.calculatePower(),this.calculatePower());
    }

    @Override
    public String toString(){
        return "Character: "+name+" | Level: "+level+" | Base Health: "+baseHealth;
        //To print With for each
    }
}
