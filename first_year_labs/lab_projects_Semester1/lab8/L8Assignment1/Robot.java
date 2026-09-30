package first_year_labs.lab_projects_Semester1.lab8.L8Assignment1;

public class Robot {
    TaskBatch TB = new TaskBatch();

    private String modelName;
    private int batteryLevel;
    private String status;

    public Robot(String MN, int BL, String status) {
        this.modelName = MN;
        this.batteryLevel = BL;
        this.status = status;
    }

    //Part A
    public void displayRobotInfo() {
        System.out.println("Model Name: " + modelName + "\nBattery Level: " + batteryLevel + "%\nStatus: " + status);
    }

    public String getModelName() {return modelName;}

    public int getBatteryLevel() {return batteryLevel;}

    public String getStatus() {return status;}

    public void setModelName(String modelName) {this.modelName = modelName;}

    public void setBatteryLevel(int batteryLevel) {this.batteryLevel = batteryLevel;}

    public void setStatus(String status) {this.status = status;}



    //Part B
    public boolean isBatteryEnough(int requiredAmount) { //Used it for Part C
        if (batteryLevel >= requiredAmount) return true;
        else return false;
    }
    public int consumeBattery(int amount){
        batteryLevel -= amount;
        return batteryLevel;
    }
    public int chargeBattery(int amount){
        if(batteryLevel>=100){
            status = "Active";
            return batteryLevel;
        }
        else status = "Charging";  return batteryLevel += amount;
    }
    //Part D
    public void performTask(Task t){
        System.out.println("Robot is currently trying to attempt a task: " + t.getTaskName() );
        if(this.status.equalsIgnoreCase("Charging")){
            System.out.println("Failure: Robot cannot perform a task while charging...");
        }
        else{
            if (isBatteryEnough(t.getEnergyCost())){
                consumeBattery(t.getEnergyCost());
                System.out.println("Success! Task " + t.getTaskName() + " completed.");
                System.out.println("Remaining Battery: " + this.batteryLevel + "%");
            }
            else {
                System.out.println("Failure: Not enough battery for " + t.getTaskName());
            }
        }
    }
    //         ===Bonus Part===
    public void performTaskBatch(TaskBatch batch) {
        if (batch.getTotalEnergyCost() == 0) {
            System.out.println("ERROR, no task detected!");
            return;
        }

        int totalCost = batch.getTotalEnergyCost();
        if (!isBatteryEnough(totalCost)) {
            System.out.println("Failure: Not enough battery for the whole batch!");
            return;
        }

        System.out.println("The Robot is processing the batch...");

        Task[] tasks = batch.getTasks(); // now returns Task[]
        for (int i = 0; i < TB.getTaskCount(); i++) {
            performTask(tasks[i]); // process each task individually
        }

        displayRobotInfo(); // show updated info after batch
    }


}

