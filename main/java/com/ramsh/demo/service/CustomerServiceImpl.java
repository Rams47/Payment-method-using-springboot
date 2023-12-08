package com.ramsh.demo.service;

import com.ramsh.demo.beans.Transaction;
import com.ramsh.demo.beans.UserInfo;
import com.ramsh.demo.dao.CustomerDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    private CustomerDao customerDao;


    public CustomerServiceImpl(CustomerDao customerDao) {
        this.customerDao=customerDao;
    }


    @Override
    public UserInfo checkCustomerCredentials(String email, String password) {
        return customerDao.checkCustomerCredentials(email, password);
    }

    @Override
    @Transactional
    public void saveTransaction(Transaction transaction) {
        customerDao.saveTransaction(transaction);
    }
}
