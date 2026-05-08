package lab_projects_Semester2.s2lab10.com.space.core;

import lab_projects_Semester2.s2lab10.com.space.mission.MissionTask;

public class Astronaut {
    private String name;
    private int experienceLevel;

    public Astronaut(String name, int experienceLevel){
        this.name=name;
        this.experienceLevel=experienceLevel;
    }

    public String getName() {return name;}
    public int getExperienceLevel() {return experienceLevel;}

    public void setExperienceLevel(int experienceLevel) {this.experienceLevel = experienceLevel;}
    public void setName(String name) {this.name = name;}

    @Override
    public String toString(){
        return "Astronaut name: "+name+"|Experience Level: "+experienceLevel;
    }

    public void performTask(MissionTask task){
        System.out.println("Astronaut is attempting a task");
        if(experienceLevel>= task.getRequiredExperience()){
            System.out.println("Astronaut successfully completed the task.");
            experienceLevel++;
        }
        else{
            throw new RuntimeException("Astronaut "+name+" does not have enough experience for this task");
        }
    }
}
