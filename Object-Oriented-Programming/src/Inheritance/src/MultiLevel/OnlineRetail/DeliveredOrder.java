package MultiLevel.OnlineRetail;

import java.time.LocalDate;
import java.util.Date;

public class DeliveredOrder extends ShippedOrder {
    protected LocalDate deliveryDate;

    public DeliveredOrder(String orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Delivered on: " + deliveryDate;
    }
}
