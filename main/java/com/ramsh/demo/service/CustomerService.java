package com.ramsh.demo.service;

import com.ramsh.demo.beans.Transaction;
import com.ramsh.demo.beans.UserInfo;

public interface CustomerService {

    public UserInfo checkCustomerCredentials(String email, String password);

    public void saveTransaction(Transaction transaction);
}
