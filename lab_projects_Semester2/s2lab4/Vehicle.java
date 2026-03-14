package lab_projects_Semester2.s2lab4;

public class Vehicle {
    private String licensePlate;
    protected double dailyRate;

    public Vehicle(String licensePlate, double dailyRate) {
        this.licensePlate = licensePlate;
        this.dailyRate = dailyRate;
    }

    public void calculateRental(int days) {
        double costCalculation = days * dailyRate;
        System.out.println("It will cost " + costCalculation + " for " + days + " days");
    }

    public static class Truck extends Vehicle {
        private double cargoCapacity;

        public Truck(String licensePlate, double dailyRate, double cargoCapacity) {
            super(licensePlate, dailyRate);
            this.cargoCapacity = cargoCapacity;
        }
    }

    public static class HeavyDutyTruck extends Truck {
        private double axleCount = 0;

        public HeavyDutyTruck(String licensePlate, double dailyRate, double cargoCapacity, double axleCount) {
            super(licensePlate, dailyRate, cargoCapacity);
            this.axleCount = axleCount;
        }

        @Override
        public void calculateRental(int days) {
            int extraCost = (axleCount > 4) ? 3 : (axleCount > 2 ? 2 : 1);
            double costCalculation = days * dailyRate * extraCost;
            System.out.println("Axle Count: " + axleCount + " | Cost: " + costCalculation);
        }
    }

    public static void main(String[] args) {
        Vehicle truck1 = new Vehicle.Truck("35 ARDA 35", 2.0, 39);
        Vehicle heavyTruck1 = new Vehicle.HeavyDutyTruck("26 BRS 26", 3.0, 45, 5);
        Vehicle heavyTruck2 = new Vehicle.HeavyDutyTruck("06 OGZ 06", 1.5, 20, 3);

        Vehicle[] vehicles = {truck1, heavyTruck1, heavyTruck2};

        for (Vehicle v : vehicles) {
            v.calculateRental(5);
        }
    }
}