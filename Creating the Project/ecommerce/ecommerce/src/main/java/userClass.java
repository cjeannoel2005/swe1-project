import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

public class userClass {
    public int customerId;
    public String username ;
    public String email;
    public String password ;
    public boolean isAdmin;



    public userClass(int customerId, String username,
                     String email, String password, boolean isAdmin) {
        this.customerId = customerId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;

    }
    // put the setters
      public int getCustomerId() {return customerId;}
     public String getUsername() {return username;}
      public String getEmail() {return email;}
    public String getPassword() {return password;}
     public boolean isAdmin(){return isAdmin;}

    // the getters here
    public int setCustomerId(int customerId) {this.customerId = customerId;}
    public int setUsername(String username) {this.username = username;}
    public int setEmail(String email) {this.email = email;}
    public int setPassword(String password) {this.password = password;}
    public boolean  setIsAdmin(boolean isAdmin) {this.isAdmin = isAdmin;}
    }


    // the getters in here



