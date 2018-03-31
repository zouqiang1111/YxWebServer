package com.zouqiang.entity;

import java.io.Serializable;

public class User2 implements Serializable {
    private String username;
    private String sex;
    private String age;
    private String password;

    public User2() {
        super();
    }

    public User2(String username, String sex, String age,String password) {
        super();
        this.username = username;
        this.sex = sex;
        this.age = age;
        this.password=password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
