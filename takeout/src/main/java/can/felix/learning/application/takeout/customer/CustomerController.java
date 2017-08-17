package can.felix.learning.application.takeout.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(method= RequestMethod.GET, value = "/customer/full")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @RequestMapping(method= RequestMethod.GET, value = "/customer/{id}")
    public Customer findById(@PathVariable Long id) {
        return customerService.findById(id);
    }

    @RequestMapping(method= RequestMethod.GET, value = "/customer/search/{name}")
    public List<Customer> findByFirstName(@PathVariable String name) {
        return customerService.findByFirstName(name);
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
