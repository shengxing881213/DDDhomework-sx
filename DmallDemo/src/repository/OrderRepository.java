package repository;

import Order.domain.Order;
import Order.domain.OrderStatus;

import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

public interface OrderRepository {
     void SaveOrder(Order o);
     Order QueryOrder(UUID Id, OrderStatus orderStatus);
}
