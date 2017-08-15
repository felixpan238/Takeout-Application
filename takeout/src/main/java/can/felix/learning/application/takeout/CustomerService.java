package can.felix.learning.application.takeout;

import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public interface CustomerService {
    public List<Customer> getAllCustomers();
    public Customer getCustomerById(String id);
    public void insertCustomer(Customer customer);
    public void updateCustomer(Customer customer);
    public void deleteCustomer(int id);

}
