package bymyself.quiz2Exercise;

public class Electronics extends Product{
    private int warrantyMonths;
    public Electronics(String productID,String name, double unitPrice, int stockQuantity,int warrantyMonths){
        super(productID, name, unitPrice, stockQuantity);
        this.warrantyMonths = warrantyMonths;
    }
    @Override
    public double calculateStockValue(){
        return (getUnitPrice()*getStockQuantity())*110/100;
    }
    @Override
    public void displayInfo(){
        System.out.println(super.toString());
        System.out.println("Warranty Months: "+warrantyMonths);
    }

}
