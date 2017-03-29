package com.sise.StrutsTypeConvert.action;

import com.opensymphony.xwork2.Action;
import com.sise.StrutsTypeConvert.domain.User;

public class LoginSTCAction implements Action{

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
            setTip("��½�ɹ�");
            return SUCCESS;
        }else {
            setTip("��½ʧ��");
            return ERROR;
        }
    }

}
