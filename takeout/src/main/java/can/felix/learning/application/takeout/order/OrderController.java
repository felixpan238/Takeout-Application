package can.felix.learning.application.takeout.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(method= RequestMethod.GET, value="/order/full")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @RequestMapping(method= RequestMethod.GET, value="/order/{id}")
    public Order getOrder(@PathVariable int id) {
        return orderService.getOrderById(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/order")
    public void addOrder(@RequestBody Order order) {
        orderService.insertOrder(order);
    }

    @RequestMapping(method= RequestMethod.PUT, value="/order")
    public void updateOrder(@RequestBody Order order) {
        orderService.updateOrder(order);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/order/{id}")
    public void deleteOrder(@PathVariable int id) {
        orderService.deleteOrder(id);
    }
}
