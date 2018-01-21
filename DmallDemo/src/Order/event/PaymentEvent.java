package Order.event;

import Order.domain.Payment;
import Order.domain.Price;

import java.util.UUID;

public class PaymentEvent {
    private UUID orderId;
    private Payment payment;
    private Price totalPrice;

    public PaymentEvent(UUID orderId, Payment payment, Price totalPrice) {
        this.orderId = orderId;
        this.payment = payment;
        this.totalPrice = totalPrice;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public Payment getPayment() {
        return payment;
    }

    public Price getTotalPrice() {
        return totalPrice;
    }
}
