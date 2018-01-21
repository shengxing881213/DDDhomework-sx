package test;

import Order.domain.*;
import Order.event.DeliveryEvent;
import Order.event.ModifyOrderEvent;
import Order.event.PaymentEvent;
import Order.repository.OrderRepositoryMemoryImp;
import Order.service.OrderService;
import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderRepositoryTest {
    private OrderRepositoryMemoryImp order = new OrderRepositoryMemoryImp();
    private OrderService orderservice = new OrderService();

    @Test
    public void the_order_should_be_same_as_create(){
        Order newOrder = orderservice.CreateOrder();
        order.SaveOrder(newOrder);
        Order actualOrder = order.QueryOrder(newOrder.getId(),newOrder.getOrderStatus());
        assertEquals(newOrder.getId(),actualOrder.getId());
        assertEquals(newOrder,actualOrder);
        //test pay event
        double amnt = newOrder.getOrderItem().getProduct().getPrice().getAmnt()*newOrder.getOrderItem().getAmnt();
        PaymentEvent paymentEvent = new PaymentEvent(newOrder.getId(),
                new Payment(UUID.randomUUID(), PaymentMethod.Alipay),
                new Price(amnt,newOrder.getOrderItem().getProduct().getPrice().getCurrency()));
        newOrder = orderservice.onPay(paymentEvent);

        //test DeliveryEvent
        DeliveryEvent deliveryEvent = new DeliveryEvent(newOrder.getId(),UUID.randomUUID(), ZonedDateTime.now());
        newOrder = orderservice.onDelivery(deliveryEvent);
        order.SaveOrder(newOrder);

        //test modify address info
        Address address = new Address("China","Shanghai","Shanghai","Pudong","Xiangnan","39");
        ModifyOrderEvent modifyOrderEvent = new ModifyOrderEvent(1000,newOrder.getId(),address,ZonedDateTime.now());
        orderservice.onModifyCargoInfo(modifyOrderEvent);
    }
}
