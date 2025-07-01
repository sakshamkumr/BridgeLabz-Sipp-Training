package MultiLevel.OnlineRetail;

import java.time.LocalDate;

public class ShippedOrder extends Order {

    protected String trackingNumber;

    public ShippedOrder(String orderId, LocalDate orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Shipped with tracking number: " + trackingNumber;
    }
}
