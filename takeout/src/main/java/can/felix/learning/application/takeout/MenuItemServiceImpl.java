package can.felix.learning.application.takeout;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class MenuItemServiceImpl implements MenuItemService {

    private String getInsertStatement(MenuItem menuItem){
        return ("INSERT INTO menu_items VALUES(null,'" + menuItem.getDisplayName() + "','" + menuItem.getCategory() + "','" + menuItem.getDescription() + "','"+ menuItem.getPrice() + "');");
    }

    private String getUpdateStatement(MenuItem menuItem){
        return ("UPDATE menu_items SET " +
                "display_name = '" + menuItem.getDisplayName() +
                "', category = '" + menuItem.getCategory() +
                "', description = '" + menuItem.getDescription() +
                "', price = " + menuItem.getPrice() +
                " WHERE id = " + menuItem.getId() + ";");
    }

    private String getDeleteStatement(int id){
        return ("DELETE FROM menu_items WHERE id = " + id + ";");
    }

    private String getSelectAllMenuItemsQueryStatement(){
        return ("SELECT * FROM menu_items;");
    }

    private String getMenuItemByIdQueryStatement(String id) {
        return ("SELECT * FROM menu_items WHERE id = " + id + ";");
    }

    public List<MenuItem> getAllMenuItems(){
        List<MenuItem> fullList = new ArrayList<>();
        MySQLAccess dao = new MySQLAccess();

        try {
            dao.connectToDatabase();

            // Selects full table of menu items
            ResultSet resultSet = dao.querySQLStatement(this.getSelectAllMenuItemsQueryStatement());
            while (resultSet.next()) {
                fullList.add(new MenuItem(
                        resultSet.getInt("id"),
                        resultSet.getString("display_name"),
                        MenuItem.MenuCategory.valueOf(resultSet.getString("category")),
                        resultSet.getString("description"),
                        resultSet.getBigDecimal("price")
                ));
            }

        }catch (Exception e) {
            // do nothing
        }finally {
            try {
                dao.closeConnectionToDatabase();
            } catch (Exception e) {
                // do nothing
            }

        }
        return fullList;
    }

    public MenuItem getMenuItemById(String id){
        MenuItem menuItem = null;
        MySQLAccess dao = new MySQLAccess();

        try {
            dao.connectToDatabase();

            // Selects full table of menu items
            ResultSet resultSet = dao.querySQLStatement(this.getMenuItemByIdQueryStatement(id));
            if (resultSet.next()) {
                menuItem = new MenuItem(
                        resultSet.getInt("id"),
                        resultSet.getString("display_name"),
                        MenuItem.MenuCategory.valueOf(resultSet.getString("category")),
                        resultSet.getString("description"),
                        resultSet.getBigDecimal("price")
                );
            }

        }catch (Exception e) {
            // do nothing
        }finally {
            try {
                dao.closeConnectionToDatabase();
            } catch (Exception e) {
                // do nothing
            }

        }

        return menuItem;
    }

    public void insertMenuItem(MenuItem menuItem){
        MySQLAccess dao = new MySQLAccess();

        try {
            dao.connectToDatabase();
            dao.updateSQLStatement(this.getInsertStatement(menuItem));

        }catch (Exception e) {
            // do nothing
        }finally {
            try {
                dao.closeConnectionToDatabase();
            } catch (Exception e) {
                // do nothing
            }

        }
    }

    public void updateMenuItem(MenuItem menuItem){
        MySQLAccess dao = new MySQLAccess();

        try {
            dao.connectToDatabase();
          dao.updateSQLStatement(this.getUpdateStatement(menuItem));

        }catch (Exception e) {
            // do nothing
        }finally {
            try {
                dao.closeConnectionToDatabase();
            } catch (Exception e) {
                // do nothing
            }

        }
    }

    public void deleteMenuItem(int id){
        MySQLAccess dao = new MySQLAccess();

        try {
            dao.connectToDatabase();
            dao.updateSQLStatement(this.getDeleteStatement(id));

        }catch (Exception e) {
            // do nothing
        }finally {
            try {
                dao.closeConnectionToDatabase();
            } catch (Exception e) {
                // do nothing
            }

        }
    }
}
