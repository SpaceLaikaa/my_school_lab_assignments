package lab_projects_Semester2.s2lab13;

public class CarDelivery extends Delivery {

    public CarDelivery(String orderId, double distanceKm, double baseFee) {
        super(orderId, distanceKm, baseFee);
    }

    @Override
    public double calculateTotal() {
        return getBaseFee() + (getDistanceKm() * 3.5) + 15.0;
    }
}
