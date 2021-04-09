package com.service;

import com.dao.UserMapper;
import com.entity.User;

import java.util.List;

public class UserService {

    UserMapper um = new UserMapper();

    public void fun(){

        List<User> li = um.gotUser();
        for (User uu : li) {
            System.out.println(uu);
        }

    }

}
