package com.sise.errorHandler2.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sise.errorHandler2.domain.User;

public class LoginEH2Action extends ActionSupport{

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    //No execute() method but use the execute() method in ActionSupport.
}
