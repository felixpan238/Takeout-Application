package can.felix.learning.application.takeout.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "customers")
public class Customer {
    // -Variables for customers ----------------------------------------------------------------------------------------
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Size(max = 30)
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Size(max = 30)
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Size(max = 10)
    @Column(name = "phone", nullable = false)
    private String phone;

    @Size(max = 30)
    @Column(name = "email", nullable = false)
    private String email;

    @Size(max = 30)
    @Column(name = "street", nullable = false)
    private String street;

    @Size(max = 30)
    @Column(name = "city", nullable = false)
    private String city;

    @Size(min = 2, max  = 2)
    @Column(name = "province", nullable = false)
    private String province;

    @Size(min = 6, max = 6)
    @Column(name = "postal_code", nullable = false)
    private String postalCode;

    // -Constructors ---------------------------------------------------------------------------------------------------
    public Customer(){}

    // -Getters and Setters for variables ------------------------------------------------------------------------------
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    // -Override default method ----------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return " ID: " + this.getId() +
                " | Name: " + this.getFirstName() +
                " " + this.getLastName() +
                " | Phone # : " + this.getPhone() +
                " | Email : " + this.getEmail() +
                " | Address : " + this.getStreet() +
                " " + this.getCity() +
                " " + this.getProvince() +
                " " + this.getPostalCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (id != customer.id) return false;
        if (firstName != null ? !firstName.equals(customer.firstName) : customer.firstName != null) return false;
        if (lastName != null ? !lastName.equals(customer.lastName) : customer.lastName != null) return false;
        if (phone != null ? !phone.equals(customer.phone) : customer.phone != null) return false;
        if (email != null ? !email.equals(customer.email) : customer.email != null) return false;
        if (street != null ? !street.equals(customer.street) : customer.street != null) return false;
        if (city != null ? !city.equals(customer.city) : customer.city != null) return false;
        if (province != null ? !province.equals(customer.province) : customer.province != null) return false;
        return postalCode != null ? postalCode.equals(customer.postalCode) : customer.postalCode == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        return result;
    }
}
