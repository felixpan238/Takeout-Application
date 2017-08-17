package can.felix.learning.application.takeout.orderdetails;

import can.felix.learning.application.takeout.menu.MenuItem;
import can.felix.learning.application.takeout.order.Order;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;

@Entity
@Table(name = "order_details")
public class OrderDetail {
    // - Variables for an OrderDetail ----------------------------------------------------------------------------------
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @JoinColumn(name = "order_id",referencedColumnName="id", nullable = false, insertable=false, updatable= false)
    private Order order;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(name = "order_id", nullable = false)
    private int orderId;

    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @JoinColumn(name = "menu_item_id",referencedColumnName="id", nullable = false, insertable=false, updatable= false)
    private MenuItem menuItem;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(name = "menu_item_id", nullable = false)
    private int menuItemId;

    // -Constructors ---------------------------------------------------------------------------------------------------
    public OrderDetail (){}

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

    // -Override default method ----------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return " ID: " + this.getId() +
                " | Order ID: " + this.getOrderId() +
                " | Menu Item Id: " + this.getMenuItemId();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderDetail that = (OrderDetail) o;

        if (id != that.id) return false;
        if (orderId != that.orderId) return false;
        if (menuItemId != that.menuItemId) return false;
        if (order != null ? !order.equals(that.order) : that.order != null) return false;
        return menuItem != null ? menuItem.equals(that.menuItem) : that.menuItem == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (order != null ? order.hashCode() : 0);
        result = 31 * result + orderId;
        result = 31 * result + (menuItem != null ? menuItem.hashCode() : 0);
        result = 31 * result + menuItemId;
        return result;
    }
}
