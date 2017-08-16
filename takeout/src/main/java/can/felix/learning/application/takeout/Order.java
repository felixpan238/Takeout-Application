package can.felix.learning.application.takeout;

import javax.persistence.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {
    // -Variables for an order -----------------------------------------------------------------------------------------
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "customer_id",referencedColumnName="id", nullable = false, insertable = false, updatable = false)
    private Customer customer;

    @Column(name = "customer_id", nullable = false)
    private int customerId;

    @Column(name = "date_time", nullable = false)
    private Timestamp dateTime;

    @Column(name = "paid_status", nullable = false)
    private boolean paidStatus;

    @Column(name = "pickup_status", nullable = false)
    private boolean pickupStatus;

    // -Constructors ---------------------------------------------------------------------------------------------------
    public Order (){}

    public Order (int id, int customerId, Timestamp dateTime, boolean paidStatus, boolean pickupStatus){
        this.setId(id);
        this.setCustomerId(customerId);
        this.setDateTime(dateTime);
        this.setPaidStatus(paidStatus);
        this.setPickupStatus(pickupStatus);
    }

    public Order (int customerId, Timestamp dateTime, boolean paidStatus, boolean pickupStatus){
        this.setCustomerId(customerId);
        this.setDateTime(dateTime);
        this.setPaidStatus(paidStatus);
        this.setPickupStatus(pickupStatus);
    }

    // -Override toString method ---------------------------------------------------------------------------------------
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return " ID: " + this.getId() +
                " | Customer ID: " + this.getCustomerId() +
                " | Date/Time: " + this.getDateTime() +
                " | Paid Status: " + this.isPaidStatus() +
                " | Pickup Status: " + this.isPickupStatus();
    }

    // -Getters and Setters for variables ------------------------------------------------------------------------------
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Date getDateTime() {
        return this.dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public boolean isPaidStatus() {
        return paidStatus;
    }

    public void setPaidStatus(boolean paidStatus) {
        this.paidStatus = paidStatus;
    }

    public boolean isPickupStatus() {
        return pickupStatus;
    }

    public void setPickupStatus(boolean pickupStatus) {
        this.pickupStatus = pickupStatus;
    }
}
