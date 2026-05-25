package bymyself.FinalExercise;

public class CampusAsset implements CarbonEmitter{
    private double activeHours;
    private String name;
    private String id;


    public String getId() {return id;}
    public double getActiveHours() {return activeHours;}
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}
    public void setActiveHours(double activeHours) {this.activeHours = activeHours;}
    public void setId(String id) {this.id = id;}

    public CampusAsset(double activeHours, String name, String id) {
        this.activeHours = activeHours;
        this.name = name;
        this.id = id;
    }

    public void displayInfo(){
        System.out.println("Name: "+name+", ID: "+id+", Active Hours: "+activeHours);
    }
}
