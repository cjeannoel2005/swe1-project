import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
public class userClass {  // Kept as camelCase per request

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(name = "is_admin")
    private boolean isAdmin;

    // No-arg constructor (required by JPA)
    public userClass() {
    }

    // All-args constructor
    public userClass(int customerId, String username,
                     String email, String password, boolean isAdmin) {
        this.customerId = customerId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    // Getters
    public int getCustomerId() { return customerId; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public boolean isAdmin() { return isAdmin; }

    // Setters
    public void setCustomerId(int customerId) { this.customerId = customerId; }
    public void setUsername(String username) { this.username = username; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setIsAdmin(boolean isAdmin) { this.isAdmin = isAdmin; }
}