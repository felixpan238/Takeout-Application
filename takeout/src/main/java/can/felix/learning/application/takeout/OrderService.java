package can.felix.learning.application.takeout;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    public List<Order> getAllOrders();
    public Order getOrderById(int id);
    public void insertOrder(Order order);
    public void updateOrder(Order order);
    public void deleteOrder(int id);

}
