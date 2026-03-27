package bymyself.quiz2Exercise;

public class Food extends Product{
    private String expirationDate;
    public Food(String productID,String name,double unitPrice,int stockQuantity,String expirationDate){
        super(productID, name, unitPrice, stockQuantity);
        this.expirationDate=expirationDate;
    }
}
