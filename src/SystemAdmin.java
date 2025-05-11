import java.util.Scanner;

public  class SystemAdmin extends User {
    private String adminId;
    private int securityLevel;

    public SystemAdmin(String userId, String username, String password, String name, String email, String contactInfo, int securityLevel, String adminId) {
        super(userId, username, password, name, email, contactInfo);
        setAdminId(adminId);
        setSecurityLevel(securityLevel);
    }

    public void displayUserMenu() {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        while (choice != 6) {
            System.out.println("\n=== System Administrator Menu ===");
            System.out.println("1. Create New User Account");
            System.out.println("2.  Modify System Settings");
            System.out.println("3. Backup Data");
            System.out.println("4. Manage Permissions");
            System.out.println("5. View All Users");
            System.out.println("6. Logout");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    createUser();
                    break;
                case 2:
                    modifySystemSettings();
                    break;
                case 3:
                    backupData();
                    break;
                case 4:
                    managePermissions();
                    break;
                case 5:
                    //view all users
                    break;
                case 6:
                    logout();
                    break;
                default:
                    System.out.println(" Invalid choice! ");


            }
        }}

        public void createUser (User u){
            // lesa mad4rod fe el file wla el database
        }

        public void backupData () {
            // de bardo
        }

        public void managePermissions (User u, String permission){
            // de lesa nshofa b3den
        }

        public void modifySystemSettings (String setting, String value){
            // de bardo
        }

        public void setAdminId (String adminId){
            this.adminId = adminId;
        }

        public void setSecurityLevel ( int securityLevel){
            this.securityLevel = securityLevel;
        }

        public String getAdminId () {
            return adminId;
        }

        public int getSecurityLevel () {
            return securityLevel;
        }
    }