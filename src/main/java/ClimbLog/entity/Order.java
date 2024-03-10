package ClimbLog.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

/**
 * Represents an order entity.
 *
 * This class maps to the "orders" table in the database.
 */
@Entity(name = "Climb")
@Table(name = "climb_info")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    private String description;

    @ManyToOne
    private User user;

    /**
     * Default constructor for the Order class.
     */
    public Order() {
    }

    /**
     * Constructs an Order object with the specified description and user.
     *
     * @param description The description of the order.
     * @param user        The user associated with the order.
     */
    public Order(String description, User user) {
        this.description = description;
        this.user = user;
    }

    /**
     * Gets the ID of the order.
     *
     * @return The ID of the order.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the order.
     *
     * @param id The ID of the order.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the description of the order.
     *
     * @return The description of the order.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the order.
     *
     * @param description The description of the order.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the user associated with the order.
     *
     * @return The user associated with the order.
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the user associated with the order.
     *
     * @param user The user associated with the order.
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Returns a string representation of the Order object.
     *
     * @return A string representation of the Order object.
     */
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", user=" + user +
                '}';
    }
}
