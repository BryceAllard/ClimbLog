package ClimbLog.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

/**
 * Represents a climb entity.
 *
 * This class maps to the "climb" table in the database.
 */
@Entity(name = "Climb")
@Table(name = "climb")
public class Climb {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    private String description;

    @ManyToOne
    private User user;

    /**
     * Default constructor for the Climb class.
     */
    public Climb() {
    }

    /**
     * Constructs an Climb object with the specified description and user.
     *
     * @param description The description of the climb.
     * @param user        The user associated with the climb.
     */
    public Climb(String description, User user) {
        this.description = description;
        this.user = user;
    }

    /**
     * Gets the ID of the climb.
     *
     * @return The ID of the climb.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the climb.
     *
     * @param id The ID of the climb.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the description of the climb.
     *
     * @return The description of the climb.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the climb.
     *
     * @param description The description of the climb.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the user associated with the climb.
     *
     * @return The user associated with the climb.
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the user associated with the climb.
     *
     * @param user The user associated with the climb.
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Returns a string representation of the Climb object.
     *
     * @return A string representation of the Climb object.
     */
    @Override
    public String toString() {
        return "Climb{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", user=" + user +
                '}';
    }
}
