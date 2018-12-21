package com.chenHui.model;

public class User {
    private Integer user_id;
    private String user_phone;//手机号
    private String user_pass;//登录密码

    public User() {
    }

    public User(String user_phone, String user_pass) {
        this.user_phone = user_phone;
        this.user_pass = user_pass;
    }

    public Integer getuser_id() {
        return user_id;
    }

    public void setuser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getuser_phone() {
        return user_phone;
    }

    public void setuser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getuser_pass() {
        return user_pass;
    }

    public void setuser_pass(String user_pass) {
        this.user_pass = user_pass;
    }



    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_phone='" + user_phone + '\'' +
                ", user_pass='" + user_pass + '\'' +
                '}';
    }
}
