package Order.event;

import java.time.ZonedDateTime;
import java.util.UUID;

public class DeliveryEvent {
    private UUID orderId;
    private UUID deliveryId;
    private ZonedDateTime zonedDateTime;

    public DeliveryEvent(UUID orderId, UUID deliveryId, ZonedDateTime zonedDateTime) {
        this.orderId = orderId;
        this.deliveryId = deliveryId;
        this.zonedDateTime = zonedDateTime;
    }

    public UUID getOrderId() {
        return orderId;
    }
}
