package com.main;

import com.service.UserService;

public class Main {

    public static void main(String[] args) {

        Integer a = 1;
        int b = 1;
        String c = "1";

        System.out.println(a + b + Integer.parseInt(c));

        new UserService().fun();

        System.out.println("本地提交一次 2021-04-09 10：40");

    }

}
