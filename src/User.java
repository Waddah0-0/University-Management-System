import javax.swing.*; // imported java swing  for testing purposes

public abstract class User {
    private String userId;
    private String username;
    private String password;
    private String name;
    private String email;
    private String contactInfo;
    private JTable table1; /* testing java swing, but didnt know how to do it, so i just put it here
    private JPanel panel1; */

    public User(String userId, String username, String password,
                String name, String email, String contactInfo) {
        setUserId(userId);
        setUsername(username);
        setPassword(password);
        setName(name);
        setEmail(email);
        setContactInfo(contactInfo);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password); // ma mot2kd sa7 wla2 la
    }

    public void updateProfile(String name, String email, String contactInfo) {
        setName(name);
        setEmail(email);
        setContactInfo(contactInfo);
    }
}
