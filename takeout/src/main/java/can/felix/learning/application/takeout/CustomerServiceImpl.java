package can.felix.learning.application.takeout;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerServiceImpl implements CustomerService {

    public String getInsertStatement(Customer customer){
        return ("INSERT INTO customers VALUES(null,'" + customer.getFirstName() + "','" + customer.getLastName() +
                "','" + customer.getPhone() + "','"+ customer.getEmail() +
                "','" + customer.getStreet() + "','"+ customer.getCity() +
                "','" + customer.getProvince() + "','"+ customer.getPostalCode() +"');");
    }

    public String getUpdateStatement(Customer customer){
        return ("UPDATE customers SET " +
                "first_name = '" + customer.getFirstName() +
                "', last_name = '" + customer.getLastName() +
                "', phone = '" + customer.getPhone() +
                "', email = '" + customer.getEmail() +
                "', street = '" + customer.getStreet() +
                "', city = '" + customer.getCity() +
                "', province = '" + customer.getProvince() +
                "', postal_code = '" + customer.getPostalCode() +
                "' WHERE id = " + customer.getId() + ";");
    }

    public String getDeleteStatement(int id){
        return ("DELETE FROM customers WHERE id = " + id + ";");
    }

    public String getSelectAllMenuItemsQueryStatement(){
        return ("SELECT * FROM customers;");
    }

    public void printAllMenuItemsFromResultSet(ResultSet resultSet)throws SQLException {
        while (resultSet.next()) {
            System.out.println(
                    " ID: " + resultSet.getString("id") +
                            " | Name: " + resultSet.getString("first_name") +
                            " " + resultSet.getString("last_name") +
                            " | Phone # : " + resultSet.getString("phone") +
                            " | Email : " + resultSet.getString("email") +
                            " | Address : " + resultSet.getString("street") +
                            " " + resultSet.getString("city") +
                            " " + resultSet.getString("province") +
                            " " + resultSet.getString("postal_code")
            );
        }
    }
}
