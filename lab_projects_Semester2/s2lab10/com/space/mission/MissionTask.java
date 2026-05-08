package lab_projects_Semester2.s2lab10.com.space.mission;

public class MissionTask {
   private String name;
   private double requiredFuel;
   private String requiredExperience;
   private boolean isCompleted;

   public MissionTask(String name, double requiredFuel,String requiredExperience){
       this.name=name;
       this.requiredFuel=requiredFuel;
       this.requiredExperience=requiredExperience;
       isCompleted=false;
   }

    public String getName() {return name;}
    public double getRequiredFuel() {return requiredFuel;}
    public String getRequiredExperience() {return requiredExperience;}
    public boolean getIsCompleted(){return isCompleted;}

    public void setName(String name) {this.name = name;}
    public void setRequiredExperience(String requiredExperience) {this.requiredExperience = requiredExperience;}
    public void setRequiredFuel(double requiredFuel) {this.requiredFuel = requiredFuel;}
    public void setCompleted(boolean completed) {isCompleted = completed;}

    @Override
    public String toString(){
       return "Mission Name: "+name+"|Required Experience: "+requiredExperience+"|Required Fuel: "+requiredFuel+"|Completed: "+isCompleted;
    }
}
