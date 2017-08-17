package can.felix.learning.application.takeout.customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getAllCustomers();
    public void insertCustomer(Customer customer);
    public void updateCustomer(Customer customer);
    public void deleteCustomer(int id);
    public Customer findById (Long id);
    public List<Customer> findByFirstName(String name);
}
