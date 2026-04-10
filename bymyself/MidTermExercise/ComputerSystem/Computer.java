package bymyself.MidTermExercise.ComputerSystem;

import java.nio.channels.ConnectionPendingException;
import java.util.ArrayList;

public abstract class Computer implements Comparable<Computer>{
    private int id;
    private String brand;
    private double basePrice;

    ArrayList<Component> components = new ArrayList<>();
    @Override
    public int compareTo(Computer other) {
        return Double.compare(this.calculatePrice(), other.calculatePrice());
    }

    public Computer(int id,String brand, double basePrice){
        this.id = id;
        this.brand = brand;
        this.basePrice = basePrice;
    }

    public int getId() {return id;}
    public String getBrand() {return brand;}
    public double getBasePrice() {return basePrice;}

    public void setBasePrice(double basePrice) {this.basePrice = basePrice;}
    public void setBrand(String brand) {this.brand = brand;}
    public void setId(int id) {this.id = id;}

    public void addComponent(Component c){
        components.add(c);
    }

    public double getTotalComponentPrice(){
        double sumPrice=0;
        for(Component com : components){
            sumPrice+=com.getPrice();
        }
        return sumPrice;
    }

    public double getTotalPowerUsage(){
        double totalPower=0;
        for(Component com : components){
            totalPower+=com.getPowerUsage();
        }
        return totalPower;
    }

    public abstract double calculatePrice();

    @Override
    public String toString() {
        return "id: " + id + " | Brand: " + brand + " | BasePrice: " + basePrice + " | Components: " + components;
    }


}
