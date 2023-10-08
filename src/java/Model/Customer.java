package Model;


public class Customer {

    private int customerId;
    private int account_id;
    private String full_Name;
    private String address;
    private int phoneNumber;

    public Customer() {
    }

    public Customer(int account_id, String full_Name, String address, int customerId, int phoneNumber) {
        this.account_id = account_id;
        this.full_Name = full_Name;
        this.address = address;
        this.customerId = customerId;
        this.phoneNumber = phoneNumber;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getFull_Name() {
        return full_Name;
    }

    public void setFull_Name(String full_Name) {
        this.full_Name = full_Name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
