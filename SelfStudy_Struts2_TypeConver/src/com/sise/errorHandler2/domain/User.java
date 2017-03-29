package com.sise.errorHandler2.domain;

import java.util.Date;

public class User {

    private String username;
    private Integer jj;
    private Integer age;
    private Date birth;
    
    public Integer getJj() {
        return jj;
    }
    public void setJj(Integer jj) {
        this.jj = jj;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Date getBirth() {
        return birth;
    }
    public void setBirth(Date birth) {
        this.birth = birth;
    }
    
}
