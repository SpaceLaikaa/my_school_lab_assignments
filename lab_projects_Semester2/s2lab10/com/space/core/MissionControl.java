package lab_projects_Semester2.s2lab10.com.space.core;

import lab_projects_Semester2.s2lab10.com.space.exceptions.InsufficientFuelException;
import lab_projects_Semester2.s2lab10.com.space.exceptions.MissionDataException;
import lab_projects_Semester2.s2lab10.com.space.mission.MissionTask;
import lab_projects_Semester2.s2lab10.com.space.core.SpaceCraft;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MissionControl {
    private String missionName;
    private ArrayList<SpaceCraft> spaceCrafts;
    private ArrayList<Astronaut> astronauts;


    public MissionControl(String missionName, ArrayList spaceCrafts, ArrayList astronauts){
        this.missionName=missionName;
        this.spaceCrafts=new ArrayList();
        this.astronauts=new ArrayList();
    }

    public void addSpacecraft(SpaceCraft spaceCraft){
        spaceCrafts.add(spaceCraft);
    }

    public void removeSpacecraft(String craftName){
        try{
            for (int i = 0; i < spaceCrafts.size(); i++) {
                if(spaceCrafts.get(i).getCraftName().equalsIgnoreCase(craftName)){
                    spaceCrafts.remove(i);
                }
            }
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
                if(astronauts.get(i).getName().equalsIgnoreCase(astronautName)){
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
            if (a.getName().equals(astronautName)){return a;}
        }
        return null;
    }
    public SpaceCraft getSpacecraft(String craftName){
        for(SpaceCraft a : spaceCrafts){
            if (a.getCraftName().equals(craftName)){return a;}
        }
        return null;
    }

    public void launchTask(String craftName,String astronautName, MissionTask task) throws MissionDataException {

        Astronaut astronaut1 = getAstronaut(astronautName);
        SpaceCraft spaceCraft1 = getSpacecraft(craftName);
        try {
            if (spaceCraft1 == null || astronaut1 == null) {
                throw new NullPointerException("Missing astronaut or spacecraft.");
            }

            spaceCraft1.executeTask(task);
            astronaut1.performTask(task);

        } catch (InsufficientFuelException e) {
            throw new MissionDataException("Fuel system error during launch", e);

        } catch (NullPointerException e) {
            throw new MissionDataException("Missing mission resource error", e);

        } catch (RuntimeException e) {
            throw new MissionDataException("Astronaut experience or runtime error", e);
        } finally {
            System.out.println("Mission control finished processing task: " + craftName);
            System.out.println("Mission control finished processing task: " + astronautName);
        }
    }

    void exportMissionLog(String logText) {
        PrintWriter out = null;
        try{
            out = new PrintWriter(new FileWriter("logs.txt"));
            out.println(logText);
        } catch (IOException e) {
            System.out.println("Error: Could not write mission log to file. " + e.getMessage());
        } finally {
            if(out!=null){
                out.close();
            }
        }

    }
}
