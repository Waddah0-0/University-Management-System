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

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password); // ma mot2kd sa7 wla2 la
    }

    public void updateProfile(String name, String email, String contactInfo) {
        setName(name);
        setEmail(email);
        setContactInfo(contactInfo);
    }
    public abstract void displayUserMenu();
    public void logout(){
        System.out.println("Logging out, Goodbye! ");
    }
    public void resetPassword(String newPassword) {
        setPassword(newPassword);
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
       if (password.length() >= 6) {
            this.password = password;
            System.out.println("Password updated successfully.");
        } else {
            System.out.println("Error: Password must be at least 6 characters long.");
        }
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

    /* public void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt", true))) {
            writer.write(userId + "," + username + "," + password + "," + name + "," + email + "," + contactInfo);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error: Unable to save user data.");
        }
    }

     public static User loadFromFile(String userId, String username, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(userId) && parts[1].equals(username) && parts[2].equals(password)) {
                    return new Faculty(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], "Unknown");
                }
            }
        } catch (IOException e) {
            System.out.println("Error: Unable to load user data.");
        }
        return null;
    }
    */  //7 n7ta8hm ba3den
}
