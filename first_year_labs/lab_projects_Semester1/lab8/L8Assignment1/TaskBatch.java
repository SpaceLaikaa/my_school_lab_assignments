package first_year_labs.lab_projects_Semester1.lab8.L8Assignment1;

//Part E
public class TaskBatch {

    private Task[] tasks;
    private int taskCount;


    public TaskBatch(){
        this.tasks = new Task[5];
        this.taskCount = 0;
    }


    public void addTask(Task t){
        if(taskCount<5){
            tasks[taskCount] = t;
            taskCount++;
            System.out.println("Task added: " + t.getTaskName());
        }
        else System.out.println("ERROR, cannot add more than 5 tasks.");
    }

    public int getTaskCount(){return taskCount;}

    public int getTotalEnergyCost(){
        if(taskCount ==0){
            System.out.println("ERROR, no task detected!");
            return 0;
        }
        int totalEnergyCost =0;
        for(int i =0; i<taskCount;i++){
            totalEnergyCost+= tasks[i].getEnergyCost();
        }
        return totalEnergyCost;
    }

    public Task[] getTasks() {
        if (taskCount == 0) {
            System.out.println("ERROR, no task detected!");
            return new Task[0]; // return empty array if no tasks
        }
        return tasks; // return the array of tasks
    }


    public void printBatchInfo(){
        if(taskCount==0){
            System.out.println("ERROR, no task detected!");
        }

        for (int i =0;i<taskCount;i++){
            System.out.println("");//For Spacing
            System.out.println("====Robot"+ (i+1) + "====");
            System.out.println("Task names & energy costs: \n" + getTasks());
        }
    }
}

