package com.amine.services;

import com.amine.data.models.AppUsers;

public interface UserService {
    void init();

     boolean  CheckUser(AppUsers user) ;
}
