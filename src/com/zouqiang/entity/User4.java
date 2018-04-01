package com.zouqiang.entity;

public class User4 {
    private String username;
    private String sex;
    private Integer age;
    private String password;

    public User4() {
        super();
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User4{" +
                "username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
