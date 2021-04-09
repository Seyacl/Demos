package com.dao;

import com.entity.User;

import java.security.spec.PSSParameterSpec;
import java.util.ArrayList;
import java.util.List;

public class UserMapper {

    public List<User> gotUser(){
        List<User> li = new ArrayList<User>();

        User user = new User();
        user.setName("sss");
        user.setAge("123");
        user.setSex("1");
        li.add(user);

        return li;
    }


}
