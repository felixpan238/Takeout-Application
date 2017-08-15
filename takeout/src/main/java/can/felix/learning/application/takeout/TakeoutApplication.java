package can.felix.learning.application.takeout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.math.BigDecimal;
import java.sql.ResultSet;

@SpringBootApplication
@EntityScan( basePackages = {"can.felix.learning.application.takeout"} )
public class TakeoutApplication {

	public static void main(String[] args) {
        SpringApplication.run(TakeoutApplication.class, args);

        // Connects to mySQL database
//		MySQLAccess dao = new MySQLAccess();
//        MenuItemService menuItemService = new MenuItemServiceImpl();
//        CustomerService customerService = new CustomerServiceImpl();
//
//        try {
//            dao.connectToDatabase();

            // Inserts a new customer into database
//            Customer fred = new Customer("Fred", "Fedder", "1234567890", "fred@email.com", "123 Freds St", "North York", "ON", "A1B2C3");
//            dao.updateSQLStatement(customerService.getInsertStatement(fred));

            // Update a customer in the database
//            Customer fred1 = new Customer(6,"Fred1", "Fedder1", "9876543210", "fred1@email.com", "123 Freds New St", "North York", "ON", "A1B2C3");
//            dao.updateSQLStatement(customerService.getUpdateStatement(fred1));

            // Delete a customer from the database
//            dao.updateSQLStatement(customerService.getDeleteStatement(6));

            // Select in prints full table of customers
//            ResultSet resultSet = dao.querySQLStatement(customerService.getSelectAllMenuItemsQueryStatement());
//            customerService.printAllMenuItemsFromResultSet(resultSet);

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
