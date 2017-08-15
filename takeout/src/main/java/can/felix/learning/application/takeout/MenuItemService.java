package can.felix.learning.application.takeout;

import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public interface MenuItemService {
    public List<MenuItem> getAllMenuItems();
    public MenuItem getMenuItemById(String id);
    public void insertMenuItem(MenuItem menuItem);
    public void updateMenuItem(MenuItem menuItem);
    public void deleteMenuItem(int id);

}
