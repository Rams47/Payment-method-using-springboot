package com.ramsh.demo.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BankInfo")
public class BankInfo {

    @Id
    @Column(name = "BIC",unique = true,columnDefinition = "VARCHAR(64)")
    private String bic;
    private String bankName;
    private String bankAddress;
    private String passWord;
    private String country;

    public BankInfo(String bic, String bankName, String bankAddress, String passWord, String country) {
        super();
        this.bic = bic;
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        this.passWord = passWord;
        this.country = country;
    }

    public BankInfo() {
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
