package first_year_labs.lab_projects_Semester1.lab8.L8Assignment1;

import java.util.Scanner;

public class FactoryDemoL8A1 {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Part E
        TaskBatch Batch1 = new TaskBatch();


        //Part C
        Task Task1 = new Task("Clean",25);
        Task Task2 = new Task("Wash", 35);
        //Added for Part E
        Task Task3 = new Task("Walk",10);

        Batch1.addTask(Task1);
        Batch1.addTask(Task2);
        Batch1.addTask(Task3);

        //Part A
        Robot Robo1 = new Robot("Nagasaki-15", 100,"Active");
        Robot Robo2 = new Robot("Osaka-38", 100,"Active");
        Robot Robo3 = new Robot("Tokyo-48", 100,"Active");

        System.out.println("=====Robot 1=====");
        Robo1.displayRobotInfo();
        System.out.println("");
        System.out.println("=====Robot 2=====");
        Robo2.displayRobotInfo();
        System.out.println("");
        System.out.println("=====Robot 3=====");
        Robo3.displayRobotInfo();

        //Part B
        System.out.println("\nHow much battery do you want to consume on Robot 1? ");
        int consumeBattery = sc.nextInt();
        int consumedBatteryR1 = Robo1.consumeBattery(consumeBattery); //Will use "consumedBatteryR1" for Part C
        System.out.println("Robot 1's new battery is: " + consumedBatteryR1 + "%");

        //Part C & D
        System.out.println("Task 1: Clean (25% Consumation)\nTask 2: Wash (35% Consumation)");
        int whichTask = sc.nextInt();


        System.out.println("\n[BEFORE TASK] Robot Status:");
        Robo1.displayRobotInfo();
        System.out.println("---------------------------");

        switch (whichTask) {
            case 1:
                Robo1.performTask(Task1);
                break;
            case 2:
                Robo1.performTask(Task2);
                break;
            default:
                System.out.println("Invalid task selection!");
        }

        System.out.println("---------------------------");
        System.out.println("[AFTER TASK] Robot Status:");

        Robo1.displayRobotInfo();

        //Part E

        Batch1.printBatchInfo();
        System.out.println("Total energy cost: " + Batch1.getTotalEnergyCost());
        //Bonus Part
        Robo1.performTaskBatch(Batch1);
    }
    }








                            // ====== PART C VERSION ======
//        switch (whichTask){
//            case 1:{
//                if (Robo1.isBatteryEnough(Task1.getEnergyCost())){
//                    consumedBatteryR1 -= Task1.getEnergyCost();
//                    System.out.println("Cleaning process.... Done! New Battery: " + consumedBatteryR1);
//                    break;
//                }
//                else System.out.println("Not Enough Battery..."); break;
//            }
//            case 2:
//                if(Robo1.isBatteryEnough(Task2.getEnergyCost())){
//                    consumedBatteryR1 -= Task2.getEnergyCost();
//                    System.out.println("Washing process.... Done! New Battery: " + consumedBatteryR1);
//                    break;
//                }
//                else System.out.println("Not Enough Battery..."); break;

//end of Part C
