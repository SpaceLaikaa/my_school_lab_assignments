package lab_projects_Semester2.s2lab10.com.space.core;

import lab_projects_Semester2.s2lab10.com.space.mission.MissionTask;
import lab_projects_Semester2.s2lab10.com.space.core.*;
import lab_projects_Semester2.s2lab10.com.space.exceptions.*;

import java.util.ArrayList;

public class MissionTest {
    public static void main(String[] args) {
        SpaceCraft sc1 = new SpaceCraft("Good Night-G1",75);
        SpaceCraft sc2 = new SpaceCraft("Love-M4",80);
        Astronaut ast1 = new Astronaut("Arda",5);
        Astronaut ast2 = new Astronaut("Zehra", 3);

        ArrayList<SpaceCraft> spaceCrafts = new ArrayList<>();
        ArrayList<Astronaut> astronauts = new ArrayList<>();

        MissionControl missionControl = new MissionControl("Lovers HQ", spaceCrafts,astronauts);

        MissionTask Task1 = new MissionTask("Finding Love",30,3);
        MissionTask Task2 = new MissionTask("Landing on Moon",90,4);
        MissionTask Task3 = new MissionTask("Launching Rocket",25,10);

        missionControl.addAstronaut(ast1); missionControl.addAstronaut(ast2);

        missionControl.addSpacecraft(sc1); missionControl.addSpacecraft(sc2);

        missionControl.printMissionMembers();

        missionControl.removeAstronaut("Arda");
        missionControl.removeSpacecraft("Love-M4");

        System.out.println("\n====AFTER REMOVAL====");
        missionControl.printMissionMembers();

        System.out.println("\n====TASKS====");
        try {
            System.out.println("TASK 1");
            missionControl.launchTask("Good Night-G1","Zehra",Task1);
//            System.out.println("\nTASK 2");
//            missionControl.launchTask("Good Night-G1", "Zehra",Task2); FUEL EXCEPTION
//            System.out.println("\nTASK 3");
//            missionControl.launchTask("Good Night-G1", "",Task1); NULL EXCEPTION
//            System.out.println("\nTASK 4");
//            missionControl.launchTask("Good Night-G1", "Zehra",Task3);  NO EXP FOR TASK
        } catch (MissionDataException e) {
            throw new RuntimeException(e);
        }
    }
}
