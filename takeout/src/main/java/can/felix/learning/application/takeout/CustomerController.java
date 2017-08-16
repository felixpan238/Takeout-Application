package can.felix.learning.application.takeout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/customer/full")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @RequestMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable int id) {
        return customerService.getCustomerById(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/customer")
    public void addCustomer(@RequestBody Customer customer) {
        customerService.insertCustomer(customer);
    }

    @RequestMapping(method= RequestMethod.PUT, value="/customer")
    public void updateCustomer(@RequestBody Customer customer) {
        customerService.updateCustomer(customer);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/customer/{id}")
    public void deleteCustomer(@PathVariable int id) {
        customerService.deleteCustomer(id);
    }
}
