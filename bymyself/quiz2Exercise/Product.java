package bymyself.quiz2Exercise;

public class Product {
    private  String productID;
    private String name;
    private double unitPrice;
    private int stockQuantity;

    public Product(String productID, String name, double unitPrice, int stockQuantity){
        this.productID=productID;
        this.stockQuantity = stockQuantity;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public double getUnitPrice() {return unitPrice;}
    public int getStockQuantity() {return stockQuantity;}
    public String getProductID() {return productID;}
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}
    public void setProductID(String productID) {this.productID = productID;}
    public void setStockQuantity(int stockQuantity) {this.stockQuantity = stockQuantity;}
    public void setUnitPrice(double unitPrice) {this.unitPrice = unitPrice;}


}
