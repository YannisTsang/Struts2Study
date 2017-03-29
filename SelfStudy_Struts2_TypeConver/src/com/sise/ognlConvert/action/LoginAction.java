package com.sise.ognlConvert.action;
import com.opensymphony.xwork2.Action;
import com.sise.ognlConvert.domain.User;

public class LoginAction implements Action{

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

    @Override
    public String execute() throws Exception {
        if(getUser().getUsername().equals("zyz")&&getUser().getPassword().equals("123")) {
            setTip("µÇÂ½³É¹¦");
            return SUCCESS;
        }else {
            setTip("µÇÂ½Ê§°Ü");
            return ERROR;
        }
    }

}
