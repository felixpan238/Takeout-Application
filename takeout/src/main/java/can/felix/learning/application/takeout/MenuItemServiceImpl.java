package can.felix.learning.application.takeout;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MenuItemServiceImpl implements MenuItemService {

    public String getInsertStatement(MenuItem menuItem){
        return ("INSERT INTO menu_items VALUES(null,'" + menuItem.getDisplayName() + "','" + menuItem.getCategory() + "','" + menuItem.getDescription() + "','"+ menuItem.getPrice() + "');");
    }

    public String getUpdateStatement(MenuItem menuItem){
        return ("UPDATE menu_items SET " +
                "display_name = '" + menuItem.getDisplayName() +
                "', category = '" + menuItem.getCategory() +
                "', description = '" + menuItem.getDescription() +
                "', price = " + menuItem.getPrice() +
                " WHERE id = " + menuItem.getId() + ";");
    }

    public String getDeleteStatement(int id){
        return ("DELETE FROM menu_items WHERE id = " + id + ";");
    }

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
