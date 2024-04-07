package climblog.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

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

    private String name;

    private String state;

    private int difficulty;

    private String type;

    @ManyToOne
    @JoinColumn(name = "user_id") // Assuming there's a foreign key column in the climb table referencing the user
    private User user;

    /**
     * Default constructor for the Climb class.
     */
    public Climb() {
    }

    /**
     * Constructs a Climb object with the specified name and user.
     *
     * @param name The name of the climb.
     * @param user The user associated with the climb.
     */
    public Climb(String name, User user) {
        this.name = name;
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
     * Gets the name of the climb.
     *
     * @return The name of the climb.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the climb.
     *
     * @param name The name of the climb.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the state of the climb.
     *
     * @return The state of the climb.
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the state of the climb.
     *
     * @param state The state of the climb.
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets the difficulty of the climb.
     *
     * @return The difficulty of the climb.
     */
    public int getDifficulty() {
        return difficulty;
    }

    /**
     * Sets the difficulty of the climb.
     *
     * @param difficulty The difficulty of the climb.
     */
    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * Gets the type of the climb.
     *
     * @return The type of the climb.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the climb.
     *
     * @param type The type of the climb.
     */
    public void setType(String type) {
        this.type = type;
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
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", difficulty=" + difficulty +
                ", type='" + type + '\'' +
                ", user=" + user +
                '}';
    }
}
