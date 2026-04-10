package bymyself.MidTermExercise.ComputerSystem;

public abstract class Computer {
    private int id;
    private String brand;
    private double basePrice;

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


}
