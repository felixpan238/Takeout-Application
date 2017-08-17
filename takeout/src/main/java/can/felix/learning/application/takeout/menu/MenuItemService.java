package can.felix.learning.application.takeout.menu;

import java.util.List;

public interface MenuItemService{

    public List<MenuItem> getAllMenuItems();
    public MenuItem getMenuItemById(int id);
    public void insertMenuItem(MenuItem menuItem);
    public void updateMenuItem(MenuItem menuItem);
    public void deleteMenuItem(int id);
}
