package Order.domain;

import java.util.UUID;

public class Payment {
    private UUID paymentId;
    private final PaymentMethod paymentMethod;

    public Payment(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Payment(UUID paymentId, PaymentMethod paymentMethod) {
        this.paymentId = paymentId;
        this.paymentMethod = paymentMethod;
    }

    public UUID getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(UUID paymentId){
        this.paymentId = paymentId;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
}
