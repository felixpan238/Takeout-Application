package can.felix.learning.application.takeout;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface CustomerService {
    public String getInsertStatement(Customer customer);
    public String getUpdateStatement(Customer customer);
    public String getDeleteStatement(int id);
    public String getSelectAllMenuItemsQueryStatement();
    public void printAllMenuItemsFromResultSet(ResultSet resultSet) throws SQLException;

}
