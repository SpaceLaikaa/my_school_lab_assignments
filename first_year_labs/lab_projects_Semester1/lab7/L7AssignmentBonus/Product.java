package first_year_labs.lab_projects_Semester1.lab7.L7AssignmentBonus;

public class Product {

    private String name;
    private int stock;

    public Product(String name, int stock){
        this.name = name;
        this.stock = stock;
    }

    public int getStock(){return stock;}
    public String getName(){return name;}

    public void setName(String name) {
        this.name = name;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void buyOne(){
        if(stock > 0){
            stock--;
            System.out.println("Successfully bought a " + name + " Remaining stock: " + stock);
        }
        else{
            System.out.println("Out of stock");
        }
    }

    public void printInfo(){
        System.out.println("Product: " + name + " | Stock: " + stock);
    }
}
