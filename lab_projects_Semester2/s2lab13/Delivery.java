package lab_projects_Semester2.s2lab13;

public abstract class Delivery {
    private String orderId;
    private double distanceKm;
    private double baseFee;

    public Delivery(String orderId, double distanceKm, double baseFee){
        this.orderId=orderId;
        this.distanceKm=distanceKm;
        this.baseFee=baseFee;
    }

    public double getBaseFee() {return baseFee;}
    public double getDistanceKm() {return distanceKm;}
    public String getOrderId() {return orderId;}

    public void setBaseFee(double baseFee) {this.baseFee = baseFee;}
    public void setOrderId(String orderId) {this.orderId = orderId;}
    public void setDistanceKm(double distanceKm) {this.distanceKm = distanceKm;}

    public abstract double calculateTotal();

    public void printReceipt(){
        System.out.println("Order ID: "+orderId+", Delivery Type: "+getClass().getSimpleName()
                +", Distance: "+distanceKm+", Base Fee: "+baseFee+", Total Fee: "+calculateTotal());
    }
}
