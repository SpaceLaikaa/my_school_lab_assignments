package lab_projects_Semester2.s2lab14.Task1;

public class ProductRecord {
    private String productName;
    private String categoryName;
    private int quantity;
    private double price;

    public ProductRecord(String productName, String categoryName, int quantity, double price) {
        this.productName = productName;
        this.categoryName = categoryName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName() {return productName;}
    public void setProductName(String productName) {this.productName = productName;}

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}

    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {this.quantity = quantity;}

    public String getCategoryName() {return categoryName;}
    public void setCategoryName(String categoryName) {this.categoryName = categoryName;}

    @Override
    public String toString(){
        return "Product name: "+productName+", Category: "+categoryName+", Quantity: "+quantity+", Price: "+price;
    }
}
