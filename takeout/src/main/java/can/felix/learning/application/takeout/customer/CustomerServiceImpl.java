package can.felix.learning.application.takeout.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

//    private String getInsertStatement(Customer customer){
//        return ("INSERT INTO customers VALUES(null,'" + customer.getFirstName() + "','" + customer.getLastName() +
//                "','" + customer.getPhone() + "','"+ customer.getEmail() +
//                "','" + customer.getStreet() + "','"+ customer.getCity() +
//                "','" + customer.getProvince() + "','"+ customer.getPostalCode() +"');");
//    }
//
//    private String getUpdateStatement(Customer customer){
//        return ("UPDATE customers SET " +
//                "first_name = '" + customer.getFirstName() +
//                "', last_name = '" + customer.getLastName() +
//                "', phone = '" + customer.getPhone() +
//                "', email = '" + customer.getEmail() +
//                "', street = '" + customer.getStreet() +
//                "', city = '" + customer.getCity() +
//                "', province = '" + customer.getProvince() +
//                "', postal_code = '" + customer.getPostalCode() +
//                "' WHERE id = " + customer.getId() + ";");
//    }
//
//    private String getDeleteStatement(int id){
//        return ("DELETE FROM customers WHERE id = " + id + ";");
//    }
//
//    private String getSelectCustomersQueryStatement(){
//        return ("SELECT * FROM customers;");
//    }
//
//    private String getCustomerByIdQueryStatement( String id){
//        return ("SELECT * FROM customers WHERE id = " + id + ";");
//    }

    public List<Customer> getAllCustomers(){
        List<Customer> fullList = new ArrayList<>();
        customerRepository.findAll()
                .forEach(fullList::add);
        return fullList;

//        List<Customer> fullList = new ArrayList<>();
//        MySQLAccess dao = new MySQLAccess();
//
//        try {
//            dao.connectToDatabase();
//
//            // Selects full table of customers
//            ResultSet resultSet = dao.querySQLStatement(this.getSelectCustomersQueryStatement());
//            while (resultSet.next()) {
//                fullList.add(new Customer(
//                        Integer.parseInt(resultSet.getString("id")),
//                        resultSet.getString("first_name"),
//                        resultSet.getString("last_name"),
//                        resultSet.getString("phone"),
//                        resultSet.getString("email"),
//                        resultSet.getString("street"),
//                        resultSet.getString("city"),
//                        resultSet.getString("province"),
//                        resultSet.getString("postal_code")
//                ));
//            }
//
//        }catch (Exception e) {
//            // do nothing
//        }finally {
//            try {
//                dao.closeConnectionToDatabase();
//            } catch (Exception e) {
//                // do nothing
//            }
//
//        }
//        return fullList;
    }

    public Customer findById(Long id){
        Optional<Customer> customer = customerRepository.findById(id.intValue());
        if (customer.isPresent()){
            return customer.get();
        }else{
            throw new ResourceNotFoundException("Customer " + id + " not found.");
        }

//
//        Customer customer = null;
//        MySQLAccess dao = new MySQLAccess();
//
//        try {
//            dao.connectToDatabase();
//
//            // Selects full table of menu items
//            ResultSet resultSet = dao.querySQLStatement(this.getCustomerByIdQueryStatement(id));
//            if (resultSet.next()) {
//                customer = new Customer(
//                        Integer.parseInt(resultSet.getString("id")),
//                        resultSet.getString("first_name"),
//                        resultSet.getString("last_name"),
//                        resultSet.getString("phone"),
//                        resultSet.getString("email"),
//                        resultSet.getString("street"),
//                        resultSet.getString("city"),
//                        resultSet.getString("province"),
//                        resultSet.getString("postal_code")
//                );
//            }
//
//        }catch (Exception e) {
//            // do nothing
//        }finally {
//            try {
//                dao.closeConnectionToDatabase();
//            } catch (Exception e) {
//                // do nothing
//            }
//        }
//
//        return customer;
    }

    public List<Customer> findByFirstName(String name){
        return customerRepository.findByFirstNameStartsWith(name);
    }

    public void insertCustomer(Customer customer){
        customerRepository.save(customer);

//        MySQLAccess dao = new MySQLAccess();
//
//        try {
//            dao.connectToDatabase();
//            dao.updateSQLStatement(this.getInsertStatement(customer));
//
//        }catch (Exception e) {
//            // do nothing
//        }finally {
//            try {
//                dao.closeConnectionToDatabase();
//            } catch (Exception e) {
//                // do nothing
//            }
//
//        }
    }

    public void updateCustomer(Customer customer){
        customerRepository.save(customer);
//        MySQLAccess dao = new MySQLAccess();
//
//        try {
//            dao.connectToDatabase();
//            dao.updateSQLStatement(this.getUpdateStatement(customer));
//
//        }catch (Exception e) {
//            // do nothing
//        }finally {
//            try {
//                dao.closeConnectionToDatabase();
//            } catch (Exception e) {
//                // do nothing
//            }
//
//        }
    }

    public void deleteCustomer(int id){
        customerRepository.delete(id);
//        MySQLAccess dao = new MySQLAccess();
//
//        try {
//            dao.connectToDatabase();
//            dao.updateSQLStatement(this.getDeleteStatement(id));
//
//        }catch (Exception e) {
//            // do nothing
//        }finally {
//            try {
//                dao.closeConnectionToDatabase();
//            } catch (Exception e) {
//                // do nothing
//            }
//
//        }
    }
}
