package can.felix.learning.application.takeout;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MenuItemServiceImpl implements MenuItemService {

    public String getSelectAllMenuItemsQueryStatement(){
        return ("SELECT * FROM menu_items;");
    }

    public void printAllMenuItemsFromResultSet(ResultSet resultSet)throws SQLException {
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
}
