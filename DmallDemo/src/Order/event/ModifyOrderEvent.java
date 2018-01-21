package Order.event;

import Order.domain.Address;

import java.time.ZonedDateTime;
import java.util.UUID;

public class ModifyOrderEvent {
    private final int userId;
    private final UUID orderId;
    private ZonedDateTime zonedDateTime;
    private Address address;

    public ModifyOrderEvent(int userId, UUID orderId, Address address, ZonedDateTime zonedDateTime) {
        this.userId = userId;
        this.orderId = orderId;
        this.zonedDateTime = zonedDateTime;
        this.address = address;
    }

    public int getUserId() {
        return userId;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
