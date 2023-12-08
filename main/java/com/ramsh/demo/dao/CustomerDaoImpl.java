package com.ramsh.demo.dao;

import com.ramsh.demo.beans.Transaction;
import com.ramsh.demo.beans.UserInfo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements CustomerDao{

    private EntityManager entityManager;

    @Autowired
    public CustomerDaoImpl(EntityManager entityManager) {
        this.entityManager=entityManager;
    }

    @Override
    public UserInfo checkCustomerCredentials(String email, String password) {
        Session session=entityManager.unwrap(Session.class);

        TypedQuery<UserInfo> query=session.createQuery("From UserInfo where email=:email and password=:password");
        query.setParameter("email", email);
        query.setParameter("password", password);

        UserInfo user=(UserInfo)query.getSingleResult();


        return user;
    }

    @Override
    public void saveTransaction(Transaction transaction) {
        Session session=entityManager.unwrap(Session.class);

        session.save(transaction);
    }
}
