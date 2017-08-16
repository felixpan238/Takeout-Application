package can.felix.learning.application.takeout;

import javax.persistence.*;

@Entity
@Table(name = "order_details")
public class OrderDetail {
    // - Variables for an OrderDetail ----------------------------------------------------------------------------------
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "order_id",referencedColumnName="id", nullable = false, insertable=false, updatable= false)
    private Order order;

    @Column(name = "order_id", nullable = false)
    private int orderId;

    @ManyToOne
    @JoinColumn(name = "menu_item_id",referencedColumnName="id", nullable = false, insertable=false, updatable= false)
    private MenuItem menuItem;

    @Column(name = "menu_item_id", nullable = false)
    private int menuItemId;

    // -Constructors ---------------------------------------------------------------------------------------------------
    public OrderDetail (){}

    public OrderDetail(int id, int orderId, int menuItemId) {
        this.setId(id);
        this.setOrderId(orderId);
        this.setMenuItemId(menuItemId);
    }

    public OrderDetail(int orderId, int menuItemId) {
        this.setOrderId(orderId);
        this.setMenuItemId(menuItemId);
    }

    // -Override toString method ---------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return " ID: " + this.getId() +
                " | Order ID: " + this.getOrderId() +
                " | Menu Item Id: " + this.getMenuItemId();
    }

    // -Getters and Setters for variables ------------------------------------------------------------------------------
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order getOrder() {
        return this.order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getOrderId() {
        return this.orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public MenuItem getMenuItem() {
        return this.menuItem;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public int getMenuItemId() {
        return this.menuItemId;
    }

    public void setMenuItemId(int menuItemId) {
        this.menuItemId = menuItemId;
    }
}
