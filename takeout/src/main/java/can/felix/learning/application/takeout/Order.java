package can.felix.learning.application.takeout;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Order {
    // Variables for an order
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "customer_id", nullable = false)
    private int customerId;

    @Column(name = "date_time", nullable = false)
    private Timestamp dateTime;

    @Column(name = "paid_status", nullable = false)
    private boolean paidStatus;

    @Column(name = "pickup_status", nullable = false)
    private boolean pickupStatus;

    // Default constructor
    public Order (){

    }

    // Basic constructor populating all values
    public Order (int id, int customerId, Timestamp dateTime, boolean paidStatus, boolean pickupStatus){
        this.setId(id);
        this.setCustomerId(customerId);
        this.setDateTime(dateTime);
        this.setPaidStatus(paidStatus);
        this.setPickupStatus(pickupStatus);
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return " ID: " + this.getId() +
                " | Customer ID: " + this.getCustomerId() +
                " | Date/Time: " + this.getDateTime() +
                " | Paid Status: " + this.isPaidStatus() +
                " | Pickup Status: " + this.isPickupStatus();
    }

    // Getters and Setters for variables
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Date getDateTime() {
        return dateTime;
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
