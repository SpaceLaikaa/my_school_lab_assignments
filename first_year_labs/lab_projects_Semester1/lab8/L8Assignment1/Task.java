package first_year_labs.lab_projects_Semester1.lab8.L8Assignment1;

public class Task {
    //part C
    private String taskName;
    private int energyCost;

    public Task(String TN, int EC){
        this.taskName = TN;
        this.energyCost = EC;
    }

    public String getTaskName(){return taskName;}
    public int getEnergyCost(){return energyCost;}

    public void setTaskName(String taskName){this.taskName = taskName;}
    public void setEnergyCost(int energyCost){this.energyCost = energyCost;}

    //Part D
    public void describeTask(){
        System.out.println("Task: " + taskName + " Energy Cost: " + energyCost);
    }
}
