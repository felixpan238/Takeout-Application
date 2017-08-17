package can.felix.learning.application.takeout.orderdetails;

import java.util.List;

public interface OrderDetailService {
    public List<OrderDetail> getAllOrderDetails();
    public OrderDetail getOrderDetailById(int id);
    public void insertOrderDetail(OrderDetail orderDetail);
    public void updateOrderDetail(OrderDetail orderDetail);
    public void deleteOrderDetail(int id);
}
