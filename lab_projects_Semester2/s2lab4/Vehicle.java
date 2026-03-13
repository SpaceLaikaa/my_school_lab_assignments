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

    public class Truck extends Vehicle {
        private double cargoCapacity;

        public Truck(String licensePlate, double dailyRate) {
            super(licensePlate, dailyRate);
        }

        @Override
        public void safetyCheck(){
            if(cargoCapacity<40){
                System.out.println("Safe to ride.");
            }
            else if(cargoCapacity>=40){
                System.out.println("Truck is over the weight limit(40). Unsafe Vehicle.");
            }
        }
    }

    public class HeavyDutyTruck extends Truck{
        private double axleCount=0;
        public HeavyDutyTruck(String licensePlate, double dailyRate){
            super(licensePlate,dailyRate);
        }
            @Override
            public void calculateRental(int days){
                double costCalculation=0;
                int extraCost=0;

                if(axleCount<2&&axleCount>0){

                }
                costCalculation = days*dailyRate;
                System.out.println("It will cost "+ costCalculation+" for "+days+"day");
            }
    }

}
