package can.felix.learning.application.takeout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
    public class MenuItemController {

    @Autowired
    private MenuItemService menuItemService;

    @RequestMapping("/menu/full")
    public List<MenuItem> getAllMenuItems() {
        return menuItemService.getAllMenuItems();
    }

    @RequestMapping("/menu/{id}")
    public MenuItem getMenuItem(@PathVariable String id) {
        return menuItemService.getMenuItemById(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/menu/menuitem")
    public void addMenuItem(@RequestBody MenuItem menuItem) {
        menuItemService.insertMenuItem(menuItem);
    }

    @RequestMapping(method= RequestMethod.PUT, value="/menu/menuitem")
    public void updateMenuItem(@RequestBody MenuItem menuItem) {
        menuItemService.updateMenuItem(menuItem);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/menu/{id}")
    public void deleteMenuItem(@PathVariable int id) {
        menuItemService.deleteMenuItem(id);
    }

}
