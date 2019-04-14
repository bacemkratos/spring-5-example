package com.amine.services;

import com.amine.data.models.AppUsers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Service
public class UserServiceImpl implements  UserService {

    @PersistenceContext
    EntityManager entityManager;

    public void init(){
        //create user
        AppUsers user = new AppUsers();
        user.setName("amine");
        user.setEmail("amine");
        user.setPassword("amine");
        entityManager.persist(user);
    }

    @Override
    public boolean CheckUser(AppUsers user) {
        List<AppUsers> tmp_user = (List<AppUsers>) entityManager.createQuery("SELECT t FROM AppUsers t where t.email = :value1")
                .setParameter("value1", user.getEmail()).getResultList();
        if (!tmp_user.isEmpty())
            return tmp_user.get(0).getPassword().equals(user.getPassword());
       else return false;

    }

}
