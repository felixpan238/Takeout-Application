package can.felix.learning.application.takeout.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
    public class MenuItemController {

    @Autowired
    private MenuItemService menuItemService;

    @RequestMapping(method= RequestMethod.GET, value="/menu/full")
    public ModelAndView  getAllMenuItems() {
    	List<MenuItem> list = menuItemService.getAllMenuItems();
    	ModelAndView model = new ModelAndView("menuList");
		model.addObject("lists", list);
		return model;
       
    }
    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public ModelAndView menuItem() {
       return new ModelAndView("addMenuItem", "command", new MenuItem());
    }
    

    @RequestMapping(method= RequestMethod.GET, value="/menu/{id}")
    public MenuItem getMenuItem(@PathVariable int id) {
        return menuItemService.getMenuItemById(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/menu/menuitem")
    public void addMenuItem(MenuItem menuItem) {
        menuItemService.insertMenuItem(menuItem);
    }

      
    @RequestMapping(method= RequestMethod.POST, value="/menu/new/menuitem")
    public void insertMenuItem(@ModelAttribute("menuItem")MenuItem menuItem) {
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
