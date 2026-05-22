package lab_projects_Semester2.s2lab13;

public class BikeDelivery extends Delivery{
    public BikeDelivery(String orderId, double distanceKm, double baseFee) {
        super(orderId, distanceKm, baseFee);
    }

    @Override
    public double calculateTotal() {
        return getBaseFee() + (getDistanceKm() * 2.0);
    }
}
