package lab_projects_Semester2.s2lab10.com.space.core;

import lab_projects_Semester2.s2lab10.com.space.exceptions.InsufficientFuelException;
import lab_projects_Semester2.s2lab10.com.space.mission.MissionTask;

public class SpaceCraft {
    private String craftName;
    private double fuelLevel;

    public SpaceCraft(String craftName,double fuelLevel){
        this.craftName=craftName;
        this.fuelLevel=fuelLevel;
    }

    public double getFuelLevel() {return fuelLevel;}
    public String getCraftName() {return craftName;}

    public void setFuelLevel(double fuelLevel) {this.fuelLevel = fuelLevel;}
    public void setCraftName(String craftName) {this.craftName = craftName;}

    @Override
    public String toString(){
        return "Space Craft Name: "+craftName+"|Fuel Level: "+fuelLevel;
    }

    public void executeTask(MissionTask task) throws InsufficientFuelException{
        if(fuelLevel>task.getRequiredFuel()){
            fuelLevel--;//placeholder
        }
        else{throw new InsufficientFuelException();}
    }
}
