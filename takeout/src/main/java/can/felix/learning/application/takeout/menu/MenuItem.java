package can.felix.learning.application.takeout.menu;

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
        return (price == null || price == BigDecimal.ZERO) ? BigDecimal.ZERO : this.price.setScale(2, RoundingMode.HALF_EVEN);
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    // -Override default method ----------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return " ID: " + this.getId() +
                " | Menu Item: " + this.getDisplayName() +
                " | Category: " + this.getCategory() +
                " | Description: " + this.getDescription() +
                " | Price: $" + this.getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuItem menuItem = (MenuItem) o;

        if (id != menuItem.id) return false;
        if (displayName != null ? !displayName.equals(menuItem.displayName) : menuItem.displayName != null)
            return false;
        if (category != menuItem.category) return false;
        if (description != null ? !description.equals(menuItem.description) : menuItem.description != null)
            return false;
        return price != null ? price.equals(menuItem.price) : menuItem.price == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
