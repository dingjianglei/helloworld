package com.djl.demo.service.impl;

import java.util.logging.Logger;

import com.djl.demo.service.UserService;

public class UserServiceImpl implements UserService {
    Logger log = Logger.getLogger(UserServiceImpl.class.getName());

    public void login(String name, String pwd) {
        log.info("login name=" + name + " pwd=" + pwd);
    }

}
