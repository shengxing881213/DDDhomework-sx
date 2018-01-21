package Order.domain;

import Order.event.DeliveryEvent;
import Order.event.ModifyOrderEvent;
import Order.event.PaymentEvent;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.UUID;

public class Order {
    private UUID Id;
    private Customer customer;
    private CargoReceiver cargoReceiver;
    private OrderItem orderItem;
    private DeliveryInfo deliveryInfo;
    private Payment payment;
    private OrderStatus orderStatus;

    public Order(Customer customer, CargoReceiver cargoReceiver, OrderItem orderItem, DeliveryInfo deliveryInfo, Payment payment) {
        this.orderItem = orderItem;
        this.deliveryInfo = deliveryInfo;
        this.payment = payment;
        this.orderStatus = OrderStatus.Ini;
        this.Id = UUID.randomUUID();
        this.customer = customer;
        this.cargoReceiver = cargoReceiver;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public UUID getId() {
        return Id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public CargoReceiver getCargoReceiver() {
        return cargoReceiver;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void onPay(PaymentEvent paymentEvent) {
        this.orderStatus = OrderStatus.Paied;
        this.payment = paymentEvent.getPayment();
    }

    public void onDelivery(DeliveryEvent deliveryEvent) {
        this.orderStatus = OrderStatus.Deliveried;
    }

    public void onModifyCargo(ModifyOrderEvent modifyOrderEvent) {
        this.cargoReceiver.setAddress(modifyOrderEvent.getAddress());
    }
}
