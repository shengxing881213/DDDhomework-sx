package Order.repository;

import Order.domain.Order;
import Order.domain.OrderStatus;
import repository.OrderRepository;

import java.util.ArrayList;
import java.util.UUID;

public class OrderRepositoryMemoryImp implements OrderRepository {
    private ArrayList<Order> orders = new ArrayList<Order>();

    public void SaveOrder(Order o){
        orders.add(o);
    }

    public Order QueryOrder(UUID Id, OrderStatus orderStatus){
        while (true){
            Order order = orders.stream().filter(o->o.getId().equals(Id)).findAny().orElse(null);
            if (order.getOrderStatus().toString().equals(orderStatus.toString())){
                return order;
            }
        }
    }
}
