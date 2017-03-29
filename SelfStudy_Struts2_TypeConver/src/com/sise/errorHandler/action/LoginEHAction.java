package com.sise.errorHandler.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sise.errorHandler.domain.User;

public class LoginEHAction extends ActionSupport{

    private User user;
    private String tip;
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String getTip() {
        return tip;
    }
    public void setTip(String tip) {
        this.tip = tip;
    }
    public String execute() throws Exception{
        if(getUser().getUsername().equals("zyz")&&getUser().getPassword().equals("1233")) {
            setTip("µÇÂ½³É¹¦");
            return SUCCESS;
        }else {
            setTip("µÇÂ½Ê§°Ü");
            return ERROR;
        }
    }
}
