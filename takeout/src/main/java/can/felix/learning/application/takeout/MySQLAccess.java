package can.felix.learning.application.takeout;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

@Component
public class MySQLAccess {
    private Connection connect = null;
    private Statement statement = null;
    private ResultSet resultSet = null;

    public void connectToDatabase()throws Exception{

        // This will load the MySQL driver, each DB has its own driver
        Class.forName("com.mysql.jdbc.Driver");

        // Setup the connection with the DB
        connect = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/takeout_database?autoReconnect=true&useSSL=false"
                        , "root", "root");
        statement = connect.createStatement();
    }

    public void closeConnectionToDatabase()throws Exception{

        // If connection is not null, close connection
        if (connect != null) {
            connect.close();
        }
    }

    public void updateSQLStatement(String updateStatement) throws Exception {
        // Runs an insert statement
        statement.executeUpdate(updateStatement);
    }

    public ResultSet querySQLStatement(String queryStatement) throws Exception {
        // Runs a query statement
        resultSet = statement.executeQuery(queryStatement);
        return resultSet;
    }

    public void readDataBase() throws Exception {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");

            // Setup the connection with the DB
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/takeout_database?autoReconnect=true&useSSL=false"
                            , "root", "root");
            statement = connect.createStatement();

            // Runs an insert query
//            statement.executeUpdate("INSERT INTO customers VALUES(null, 'Fred', 'Fedder', '1234567890', 'fred@email.com', '123 Freds St', 'North York', 'ON', 'A1B2C3');");
//            statement.executeUpdate("INSERT INTO menu_items VALUES(null, 'Apple Juice', 'DRINK', 'Apple juice Description.', 1.99);");

            // Runs a delete query
//            statement.executeUpdate("DELETE FROM customers WHERE id = 6;");
//            statement.executeUpdate("DELETE FROM menu_items WHERE id = 13;");

            // Runs a update query
//            statement.executeUpdate("UPDATE customers SET phone = 4165555555 WHERE id = 1;");
//            statement.executeUpdate("UPDATE menu_items SET price = 4.99 WHERE id = 1;");

            // Runs a select query
//            resultSet = statement.executeQuery("SELECT * FROM customers;");
//            writeCustomerResult(resultSet);
//            System.out.println("");
//            resultSet = statement.executeQuery("SELECT * FROM menu_items;");
//            writeMenuItemsResult(resultSet);

        } catch (Exception e) {
            throw e;
        } finally {
            close();
        }

    }

    // Method that will run a execute update
    private void updateStatement(String script) {
        try {
        statement.executeUpdate(script);
        } catch (Exception e) {

        }
    }

    // Method that will run a execute query
    private void executeQuery(String script) {
        try {
            statement.executeQuery(script);
        } catch (Exception e) {

        }
    }

    private void writeCustomerResult(ResultSet resultSet) throws SQLException {
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

    private void writeMenuItemsResult(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            System.out.println(
                    " ID: " + resultSet.getString("id") +
                            " | Menu Item: " + resultSet.getString("display_name") +
                            " | Category" + resultSet.getString("category") +
                            " | Description" + resultSet.getString("description") +
                            " | Price" + resultSet.getString("price")
            );
        }
    }

    // Method to close the SQL connection
    private void close() {
        try {
            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }
    }

}