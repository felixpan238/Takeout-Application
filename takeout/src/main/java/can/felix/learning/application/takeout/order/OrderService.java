package can.felix.learning.application.takeout.order;

import java.util.List;

public interface OrderService {
    public List<Order> getAllOrders();
    public Order getOrderById(int id);
    public void insertOrder(Order order);
    public void updateOrder(Order order);
    public void deleteOrder(int id);
}
