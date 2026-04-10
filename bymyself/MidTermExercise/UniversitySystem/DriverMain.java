package bymyself.MidTermExercise.UniversitySystem;

public class DriverMain {
    public static void main(String[] args) {
        Advisor advisor1 = new Advisor();

        TutorialGroup tg1 = new TutorialGroup();

        Learner learner1 = new Learner(101, "Arda Akkas", "SE", 65);
        Learner learner2 = new Learner(102, "Oguz Arag", "CS", 90);
        Learner learner3 = new Learner(103, "Yagiz Sen", "SE", 70);
        Learner learner4 = new Learner(104, "Baris Yalap", "SE", 60);
        Learner learner5 = new Learner(105, "Talha Avcu", "SE", 50);

        System.out.println("--- 1. Adding Items ---");
        advisor1.placeItem("Notebook");
        advisor1.placeItem("Laptop");
        advisor1.placeItem("Mouse");
        advisor1.listItems();

        System.out.println("--- 2. Searching ---");
        advisor1.hasItem("Notebook");
        advisor1.hasItem("Pencil");
        advisor1.hasItem("Mouse");

        System.out.println("--- 3. Deleting ---");
        advisor1.deleteItem("Notebook");
        advisor1.deleteItem("World");

        System.out.println("--- 4. Finale List ---");
        advisor1.listItems();
        System.out.println("----------------------");

        //Task2

        tg1.registerLearner(learner1);
        tg1.registerLearner(learner2);
        tg1.registerLearner(learner3);
        tg1.registerLearner(learner4);
        tg1.registerLearner(learner5);

        tg1.dropLearner("102");
        tg1.dropLearner("113");
        tg1.compareAvgScore();
        tg1.compareById();



        for(Learner learner : tg1.members){
            learner.showProfile();
        }
    }
}
