package can.felix.learning.application.takeout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/order/full")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @RequestMapping("/order/{id}")
    public Order getOrder(@PathVariable String id) {
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
