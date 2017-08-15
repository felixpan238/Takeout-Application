package can.felix.learning.application.takeout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;

    @RequestMapping("/orderdetail/full")
    public List<OrderDetail> getAllOrderDetails() {
        return orderDetailService.getAllOrderDetails();
    }

    @RequestMapping("/orderdetail/{id}")
    public OrderDetail getOrderDetail(@PathVariable String id) {
        return orderDetailService.getOrderDetailById(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/orderdetail")
    public void addOrderDetail(@RequestBody OrderDetail orderDetail) {
        orderDetailService.insertOrderDetail(orderDetail);
    }

    @RequestMapping(method= RequestMethod.PUT, value="/orderdetail")
    public void updateOrderDetail(@RequestBody OrderDetail orderDetail) {
        orderDetailService.updateOrderDetail(orderDetail);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/orderdetail/{id}")
    public void deleteOrderDetail(@PathVariable int id) {
        orderDetailService.deleteOrderDetail(id);
    }
}
