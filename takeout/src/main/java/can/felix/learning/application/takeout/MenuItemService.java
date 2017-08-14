package can.felix.learning.application.takeout;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface MenuItemService {

    public String getSelectAllMenuItemsQueryStatement();
    public void printAllMenuItemsFromResultSet(ResultSet resultSet) throws SQLException;

}
