package can.felix.learning.application.takeout;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderDetailService {
    public List<OrderDetail> getAllOrderDetails();
    public OrderDetail getOrderDetailById(String id);
    public void insertOrderDetail(OrderDetail orderDetail);
    public void updateOrderDetail(OrderDetail orderDetail);
    public void deleteOrderDetail(int id);

}
