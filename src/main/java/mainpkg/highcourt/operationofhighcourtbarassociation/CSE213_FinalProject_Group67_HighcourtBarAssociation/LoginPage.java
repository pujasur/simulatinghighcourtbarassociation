package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

public class LoginPage {
    private String userId;
    private String password;
    private String role;

    public LoginPage(String userId, String password, String role) {
        this.userId = userId;
        this.password = password;
        this.role = role;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}