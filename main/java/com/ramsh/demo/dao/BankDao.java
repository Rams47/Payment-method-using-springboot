package com.ramsh.demo.dao;

import com.ramsh.demo.beans.Transaction;

import java.util.List;

public interface BankDao {

    public boolean checkBankCredentials(String bic,String password);

    public List<Transaction> getPendingTransaction(String bic,String status);
}
