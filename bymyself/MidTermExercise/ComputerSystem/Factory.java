package bymyself.MidTermExercise.ComputerSystem;

import java.util.ArrayList;
import java.util.HashMap;

public class Factory {
    ArrayList<Computer> computers = new ArrayList<>();

    HashMap<Integer, Computer> computerMap = new HashMap<>();


    public void addComputer(Computer c){
        computers.add(c);
        computerMap.put(c.getId(), c);
    }

    public void removeComputerId(int id){
        if(computerMap.containsKey(id)){
            Computer computerRemove = computerMap.get(id);

            computers.remove(computerRemove);
            computerMap.remove(id);
            System.out.println("Computer with ID " + id + " has been removed.");
        }
        else {
            System.out.println("Error: Computer ID " + id + " does not exist in the factory.");
        }

    }
 }
