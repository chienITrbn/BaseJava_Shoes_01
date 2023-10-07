package Model;

public class Account {

    private int id;
    private String password;
    private String phone_number;
    private int role;
    private boolean active;
    private String email;

    public Account() {
    }

    public Account(int id, String password, String phone_number, int role, boolean active, String email) {
        this.id = id;
        this.password = password;
        this.phone_number = phone_number;
        this.role = role;
        this.active = active;
        this.email = email;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
