package bymyself.MidTermExercise;

public class DriverMain {
    public static void main(String[] args) {
        Advisor advisor1 = new Advisor();

        Learner learner1 = new Learner(101, "Arda Akkas", "SE", 85);
        Learner learner2 = new Learner(102, "Oguz Arag", "CS", 90);

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
    }
}
