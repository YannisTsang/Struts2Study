package com.sise.struts2train.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sise.struts2train.dao.UserDao;
import com.sise.struts2train.entity.User;

/**
 * Created by Administrator on 2017/4/5.
 */
public class SelectInfoAction extends ActionSupport {
    private String type;
    private User user;
    private String username;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String selectInfo() throws Exception{
        UserDao userdao=new UserDao();
        User user=userdao.selectInfo(username);
        ActionContext.getContext().getSession().put("username",user);
        if("user".equals(type)) {
            return SUCCESS;
        }else{
            return INPUT;
        }

    }
}
