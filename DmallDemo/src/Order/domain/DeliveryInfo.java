package Order.domain;

import java.time.ZonedDateTime;

public class DeliveryInfo {
    private final DeliveryMethod deliveryMethod;
    private final ZonedDateTime deliveryDate;

    public DeliveryInfo(DeliveryMethod deliveryMethod, ZonedDateTime deliveryDate) {
        this.deliveryMethod = deliveryMethod;
        this.deliveryDate = deliveryDate;
    }

    public DeliveryMethod getDeliveryMethod() {
        return deliveryMethod;
    }

    public ZonedDateTime getDeliveryDate() {
        return deliveryDate;
    }
}
