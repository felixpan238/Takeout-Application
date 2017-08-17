package can.felix.learning.application.takeout.order;

import can.felix.learning.application.takeout.customer.Customer;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @JoinColumn(name = "customer_id",referencedColumnName="id", nullable = false, insertable = false, updatable = false)
    private Customer customer;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
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

    // -Override default method ----------------------------------------------------------------------------------------
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return " ID: " + this.getId() +
                " | Customer ID: " + this.getCustomerId() +
                " | Date/Time: " + this.getDateTime() +
                " | Paid Status: " + this.isPaidStatus() +
                " | Pickup Status: " + this.isPickupStatus();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        if (customerId != order.customerId) return false;
        if (paidStatus != order.paidStatus) return false;
        if (pickupStatus != order.pickupStatus) return false;
        if (customer != null ? !customer.equals(order.customer) : order.customer != null) return false;
        return dateTime != null ? dateTime.equals(order.dateTime) : order.dateTime == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + customerId;
        result = 31 * result + (dateTime != null ? dateTime.hashCode() : 0);
        result = 31 * result + (paidStatus ? 1 : 0);
        result = 31 * result + (pickupStatus ? 1 : 0);
        return result;
    }
}
