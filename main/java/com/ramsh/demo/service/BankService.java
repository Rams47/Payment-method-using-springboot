package com.ramsh.demo.service;

import com.ramsh.demo.beans.Transaction;

import java.util.List;

public interface BankService {

    public boolean checkBankCredentials(String bic,String password);

    public List<Transaction> getPendingTransaction(String bic, String status);
}
