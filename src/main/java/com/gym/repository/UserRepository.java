package com.gym.repository;

import com.gym.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Repository;


public class UserRepository {


    SessionFactory sessionFactory;

    public UserRepository() {
    }

    public void bla (){
        Session session = sessionFactory.openSession();
        session.save(new User("George"));



        session.close();
    }

    @Required
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
