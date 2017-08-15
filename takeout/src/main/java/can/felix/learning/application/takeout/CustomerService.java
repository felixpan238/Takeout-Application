package can.felix.learning.application.takeout;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface CustomerService {
    public String getInsertStatement(Customer customer);
    public String getUpdateStatement(Customer customer);
    public String getDeleteStatement(int id);
    public String getSelectAllMenuItemsQueryStatement();
    public void printAllCustomersFromResultSet(ResultSet resultSet) throws SQLException;

}
