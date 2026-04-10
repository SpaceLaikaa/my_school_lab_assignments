package bymyself.MidTermExercise.ComputerSystem;

import org.w3c.dom.ls.LSOutput;

public abstract class  Component {
    private String modelName;
    private double price;
    private int powerUsage;

    public Component(String modelName,double price,int powerUsage){
        this.modelName=modelName;
        this.price=price;
        this.powerUsage=powerUsage;
    }

    public double getPrice() {return price;}
    public int getPowerUsage() {return powerUsage;}
    public String getModelName() {return modelName;}

    public void setPowerUsage(int powerUsage) {this.powerUsage = powerUsage;}
    public void setModelName(String modelName) {this.modelName = modelName;}
    public void setPrice(double price) {this.price = price;}

    public abstract void upgradeSpecs(); //doubles subclass-specific attributes
    public abstract String getType(); //returns component type as string

    @Override
    public String  toString(){
        return "Model: "+modelName+" | Price: "+price+" | Power Usage: "+powerUsage;
    }
}
