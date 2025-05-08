public  class SystemAdmin extends User {
    private String adminId;
    private int securityLevel;

    public SystemAdmin(String userId, String username, String password, String name, String email, String contactInfo, int securityLevel, String adminId) {
        super(userId, username, password, name, email, contactInfo);
        setAdminId(adminId);
        setSecurityLevel(securityLevel);
    }

    public void createUser(User u) {
        // lesa mad4rod fe el file wla el database
    }

    public void backupData() {
        // de bardo
    }

    public void managePermissions(User u, String permission) {
        // de lesa nshofa b3den
    }

    public void modifySystemSettings(String setting, String value) {
        // de bardo
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public void setSecurityLevel(int securityLevel) {
        this.securityLevel = securityLevel;
    }

    public String getAdminId() {
        return adminId;
    }

    public int getSecurityLevel() {
        return securityLevel;
    }
}
