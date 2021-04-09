package com.entity;

import java.util.List;

public class User {

    private String name;
    private String age;
    private String sex;
    private List<String> habit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<String> getHabit() {
        return habit;
    }

    public void setHabit(List<String> habit) {
        this.habit = habit;
    }

    public User(String name, String age, String sex, List<String> habit) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.habit = habit;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", habit=" + habit +
                '}';
    }
}
