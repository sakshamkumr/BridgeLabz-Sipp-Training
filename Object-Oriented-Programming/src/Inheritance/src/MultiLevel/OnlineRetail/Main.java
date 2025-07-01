package MultiLevel.OnlineRetail;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("ORD001", LocalDate.now().minusDays(5));
        ShippedOrder shipped = new ShippedOrder("ORD002", LocalDate.now().minusDays(3), "TRK123");
        DeliveredOrder delivered = new DeliveredOrder("ORD003", LocalDate.now().minusDays(7), "TRK456", LocalDate.now().minusDays(1));

        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }
}
