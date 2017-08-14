package can.felix.learning.application.takeout;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.math.BigDecimal;
import java.sql.ResultSet;

@SpringBootApplication
@EntityScan( basePackages = {"can.felix.learning.application.takeout"} )
public class TakeoutApplication {

	public static void main(String[] args) {
		// Connects to mySQL database
		MySQLAccess dao = new MySQLAccess();
        MenuItemService menuItemService = new MenuItemServiceImpl();

        try {
            dao.connectToDatabase();

            // Inserts a new menu item into database
            MenuItem poutine = new MenuItem("Poutine", MenuItem.MenuCategory.APPETIZER, "Poutine description.", new BigDecimal(1.99));
            dao.updateSQLStatement(menuItemService.getInsertQuery(poutine));

            // Select in prints full table of menu items
            ResultSet resultSet = dao.querySQLStatement(menuItemService.getSelectAllMenuItemsQueryStatement());
            menuItemService.printAllMenuItemsFromResultSet(resultSet);


            //dao.readDataBase();
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
