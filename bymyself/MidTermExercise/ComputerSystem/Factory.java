package bymyself.MidTermExercise.ComputerSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Factory {
    ArrayList<Computer> computers = new ArrayList<>();

    HashMap<Integer, Computer> computerMap = new HashMap<>();

    public void sortByOrder(){
        Collections.sort(this.computers);
    }

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

    public Computer getComputerById(int id){
        return computerMap.get(id);
    }

    public void printAllComputers(){
        double totalPrice =0;
        for(Computer computer : computers){
            Collections.sort(computers);
            System.out.println("ID: "+computer.getId()+" | Brand: "+computer.getBrand());
            totalPrice += computer.getBasePrice();
        }
        System.out.println("Total Price: "+totalPrice);
    }
 }
