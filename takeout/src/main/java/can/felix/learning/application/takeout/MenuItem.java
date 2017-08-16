package can.felix.learning.application.takeout;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.math.RoundingMode;

@Entity
@Table(name = "menu_items")
public class MenuItem {
    // -ENUM for menuItems categories ----------------------------------------------------------------------------------
    public enum MenuCategory {
        APPETIZER, MAIN, SIDE, DESSERT, DRINK
    }

    // -Variables for menuitem -----------------------------------------------------------------------------------------
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Size(max = 30)
    @Column(name = "display_name", nullable = false)
    private String displayName;

    @Enumerated(EnumType.STRING)
    @Column(name = "category", nullable = false,
            columnDefinition = "ENUM('APPETIZER', 'MAIN', 'SIDE', 'DESSERT', 'DRINK')")
    private MenuCategory category;

    @Size(max = 150)
    @Column(name = "description", nullable = false)
    private String description;

    @Digits(integer=6, fraction=2)
    @Column(name = "price", nullable = false)
    private BigDecimal price;

    // -Constructor ----------------------------------------------------------------------------------------------------
    public MenuItem (){}

    public MenuItem (int id, String displayName, MenuCategory category, String description, BigDecimal price){
        this.setId(id);
        this.setDisplayName(displayName);
        this.setCategory(category);
        this.setDescription(description);
        this.setPrice(price);
    }

    public MenuItem (String displayName, MenuCategory category, String description, BigDecimal price){
        this.setDisplayName(displayName);
        this.setCategory(category);
        this.setDescription(description);
        this.setPrice(price);
    }

    // -Override toString method ---------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return " ID: " + this.getId() +
                " | Menu Item: " + this.getDisplayName() +
                " | Category: " + this.getCategory() +
                " | Description: " + this.getDescription() +
                " | Price: $" + this.getPrice();
    }

    // -Getters and Setters for variables  -----------------------------------------------------------------------------
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public MenuCategory getCategory() {
        return category;
    }

    public void setCategory(MenuCategory category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return this.price.setScale(2, RoundingMode.HALF_EVEN);
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
