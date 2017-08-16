package can.felix.learning.application.takeout;

import javax.persistence.*;

@Entity
@Table(name = "order_details")
public class OrderDetail {
    // Variables for an OrderDetail
    @Id
    @Column(name = "id", nullable = false)
    private int id;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "order_id",referencedColumnName="id", nullable = false)
    @Column(name = "order_id", nullable = false)
    private int orderId;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "menu_item_id", referencedColumnName="id", nullable = false)
    @Column(name = "menu_item_id", nullable = false)
    private int menuItemId;


    // Default constructor
    public OrderDetail (){

    }

    // Basic constructor populating all values
    public OrderDetail(int id, int orderId, int menuItemId) {
        this.setId(id);
        this.setOrderId(orderId);
        this.setMenuItemId(menuItemId);
    }
    // Constructor populating all values without id
    public OrderDetail(int orderId, int menuItemId) {
        this.setOrderId(orderId);
        this.setMenuItemId(menuItemId);
    }

    @Override
    public String toString() {
        return " ID: " + this.getId() +
                " | Order ID: " + this.getOrderId() +
                " | Menu Item Id: " + this.getMenuItemId();
    }

    // Getters and Setters for variables
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(int menuItemId) {
        this.menuItemId = menuItemId;
    }
}
