package bymyself.quiz2Exercise;

import java.sql.Array;
import java.util.ArrayList;

public class Warehouse {
    public static void main(String[] args) {
        ArrayList<Product> inventory = new ArrayList<>();
        Product apple = new Food("12","Apple",1.29,5,"01/04/2026");
        Product chicken = new Food("34","Chicken",4.99,7,"04/15/2026");
        Product laptop = new Electronics("27","Laptop",499,4,6);
        Product machine = new Electronics("13","Machine",299,2,16);
        inventory.add(apple);
        inventory.add(chicken);
        inventory.add(laptop);
        inventory.add(machine);

        for (Product p : inventory){
            double productValues =p.calculateStockValue();
            System.out.println(productValues);

        }

    }
}
