package can.felix.learning.application.takeout;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

@Component
public class MySQLAccess {
    private Connection connect = null;
    private Statement statement = null;
    private ResultSet resultSet = null;

    // Setup the connection with the DB
    public void connectToDatabase()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        connect = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/takeout_database?autoReconnect=true&useSSL=false"
                        , "root", "root");
        statement = connect.createStatement();
    }

    // If connection is not null, close connection
    public void closeConnectionToDatabase()throws Exception{
        if (connect != null) {
            connect.close();
        }
    }

    // Runs an insert statement
    public void updateSQLStatement(String updateStatement) throws Exception {
        statement.executeUpdate(updateStatement);
    }

    // Runs a query statement
    public ResultSet querySQLStatement(String queryStatement) throws Exception {
        resultSet = statement.executeQuery(queryStatement);
        return resultSet;
    }

}