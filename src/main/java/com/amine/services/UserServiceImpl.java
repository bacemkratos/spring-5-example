package com.amine.services;

import com.amine.data.models.AppUsers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional
@Service
public class UserServiceImpl implements  UserService {

    @PersistenceContext
    EntityManager entityManager;

    public void init(){
        AppUsers user = new AppUsers();
        user.setName("amine");
        entityManager.persist(user);
    }

}
