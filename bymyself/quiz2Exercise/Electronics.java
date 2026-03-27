package bymyself.quiz2Exercise;

public class Electronics extends Product{
    private int warrantyMonths;
    public Electronics(String productID,String name, double unitPrice, int stockQuantity,int warrantyMonths){
        super(productID, name, unitPrice, stockQuantity);
        this.warrantyMonths = warrantyMonths;
    }
}
