package lab_projects_Semester2.s2lab10.com.space.core;

import java.util.ArrayList;

public class MissionControl {
    private String missionName;
    private ArrayList<SpaceCraft> spaceCrafts;
    private ArrayList<Astronaut> astronauts;

    public MissionControl(String missionName, ArrayList spaceCrafts, ArrayList astronauts){
        this.missionName=missionName;
        spaceCrafts=new ArrayList();
        astronauts=new ArrayList();
    }

    public void addSpacecraft(SpaceCraft spaceCraft){
        spaceCrafts.add(spaceCraft);
    }

    public void removeSpacecraft(String craftName){
        try{
            spaceCrafts.remove(craftName);
        }catch(Exception e){
            System.out.println("Empty list can't remove. Error");
        }
    }

    public void addAstronaut(Astronaut astronaut){
        astronauts.add(astronaut);
    }

    public void removeAstronaut(String astronautName){
        try{
            for(int i =0;i<astronauts.size();i++){
                if(astronauts.get(i).equals(astronautName)){
                    astronauts.remove(i);
                }
            }
        }catch (Exception e){
            System.out.println("Empty list can't remove. Error");
        }
    }

    public void printMissionMembers(){
        for(Astronaut a : astronauts){
            System.out.println(a);
        }
        for(SpaceCraft sc : spaceCrafts){
            System.out.println(sc);
        }
    }

    public Astronaut getAstronaut(String astronautName){
        for(Astronaut a : astronauts){
            if (a.equals(astronautName)){return a;}
        }
        return null;
    }
    public SpaceCraft getSpacecraft(String craftName){
        for(SpaceCraft a : spaceCrafts){
            if (a.equals(craftName)){return a;}
        }
        return null;
    }
    }