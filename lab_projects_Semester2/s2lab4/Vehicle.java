package lab_projects_Semester2.s2lab4;

public class Vehicle {
    private String licensePlate;
    private double dailyRate;


    public Vehicle(String licensePlate,double dailyRate){
        this.licensePlate = licensePlate;
        this.dailyRate = dailyRate;
    }

    public void calculateRental(int days){
        double costCalculation=0;
        costCalculation = days*dailyRate;
        System.out.println("It will cost "+ costCalculation+" for "+days+"day");
    }

    public void safetyCheck(){
        System.out.println("License Plate: "+licensePlate+" ,Brakes: Working, Lights: Working");
    }

}
