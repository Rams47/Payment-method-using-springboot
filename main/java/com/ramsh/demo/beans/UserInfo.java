package com.ramsh.demo.beans;

import jakarta.persistence.*;

@Entity
@Table(name = "UserInfo")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId ;

    @Column(name="Name")
    private String name;

    @Column(name="address")
    private String address;

    @Column(name="mobile_number")
    private String mobileNumber;

    @Column(name="Email")
    private String email;

    @Column(name="Password")
    private String password ;

    @Column(name="BIC")
    private String bic ;

    @Column(name="Account_number")
    private String accountNumber ;

    @Column(name="Amount")
    private double amount ;

    public UserInfo(int userId, String name, String address, String mobileNumber, String email, String password, String bic, String accountNumber, double amount) {
        super();
        this.userId = userId;
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.password = password;
        this.bic = bic;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public UserInfo() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
