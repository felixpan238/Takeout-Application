package can.felix.learning.application.takeout;

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

    public Customer (int id, String firstName, String lastName, String phone, String email, String street, String city,
                          String province, String postalCode){
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPhone(phone);
        this.setEmail(email);
        this.setStreet(street);
        this.setCity(city);
        this.setProvince(province);
        this.setPostalCode(postalCode);
    }

    public Customer (String firstName, String lastName, String phone, String email, String street, String city,
                     String province, String postalCode){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPhone(phone);
        this.setEmail(email);
        this.setStreet(street);
        this.setCity(city);
        this.setProvince(province);
        this.setPostalCode(postalCode);
    }

    // -Override toString method ---------------------------------------------------------------------------------------
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
}
