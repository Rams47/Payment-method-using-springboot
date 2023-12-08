package com.ramsh.demo.dao;

import com.ramsh.demo.beans.Transaction;
import com.ramsh.demo.beans.UserInfo;

public interface CustomerDao {

    public UserInfo checkCustomerCredentials(String email,String password);

    public void saveTransaction(Transaction transaction);
}
