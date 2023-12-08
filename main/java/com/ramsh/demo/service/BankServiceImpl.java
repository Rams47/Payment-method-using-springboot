package com.ramsh.demo.service;

import com.ramsh.demo.beans.Transaction;
import com.ramsh.demo.dao.BankDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService{

    private BankDao bankDao;

    public BankServiceImpl(BankDao bankDao) {
        this.bankDao=bankDao;
    }

    @Override
    public boolean checkBankCredentials(String bic, String password) {
        return bankDao.checkBankCredentials(bic, password);
    }

    @Override
    public List<Transaction> getPendingTransaction(String bic, String status) {
        return bankDao.getPendingTransaction(bic, status);
    }
}
