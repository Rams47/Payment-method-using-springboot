package com.ramsh.demo.beans;

import jakarta.persistence.*;

@Entity
@Table(name = "Transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int senderReference;

    @Column
    private String orderingCustomer;

    @Column
    private String sendingInstitution;

    @Column
    private String accountWithInstitution ;

    @Column
    private String beneficiaryCustomer ;

    @Column
    private String date ;

    @Column
    private Double amount ;

    @Column
    private String Status ;

    public Transaction(int senderReference, String orderingCustomer, String sendingInstitution, String accountWithInstitution, String beneficiaryCustomer, String date, Double amount, String status) {
        super();
        this.senderReference = senderReference;
        this.orderingCustomer = orderingCustomer;
        this.sendingInstitution = sendingInstitution;
        this.accountWithInstitution = accountWithInstitution;
        this.beneficiaryCustomer = beneficiaryCustomer;
        this.date = date;
        this.amount = amount;
        Status = status;
    }

    public Transaction() {
    }

    public int getSenderReference() {
        return senderReference;
    }

    public void setSenderReference(int senderReference) {
        this.senderReference = senderReference;
    }

    public String getOrderingCustomer() {
        return orderingCustomer;
    }

    public void setOrderingCustomer(String orderingCustomer) {
        this.orderingCustomer = orderingCustomer;
    }

    public String getSendingInstitution() {
        return sendingInstitution;
    }

    public void setSendingInstitution(String sendingInstitution) {
        this.sendingInstitution = sendingInstitution;
    }

    public String getAccountWithInstitution() {
        return accountWithInstitution;
    }

    public void setAccountWithInstitution(String accountWithInstitution) {
        this.accountWithInstitution = accountWithInstitution;
    }

    public String getBeneficiaryCustomer() {
        return beneficiaryCustomer;
    }

    public void setBeneficiaryCustomer(String beneficiaryCustomer) {
        this.beneficiaryCustomer = beneficiaryCustomer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
