package com.sise.basicValidate.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class RegistAction extends ActionSupport{

    private String username;
    private String password;
    private int age;
    private Date birth;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Date getBirth() {
        return birth;
    }
    public void setBirth(Date birth) {
        this.birth = birth;
    }
    public String equal() {
        return SUCCESS;
    }
    public String regist() {
        return SUCCESS;
    }
}
