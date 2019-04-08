package com.amine.controllers;


import com.amine.data.models.AppUsers;
import com.amine.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Controller
public class HomeController {


@Autowired
UserService userService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    @ResponseBody
    public String Hello()
    {
        userService.init();
        return " Hello amine";
    }
}
