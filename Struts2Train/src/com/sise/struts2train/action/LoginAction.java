package com.sise.struts2train.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sise.struts2train.dao.UserDao;
import com.sise.struts2train.dao.jdbcUtil;
import com.sise.struts2train.entity.User;


import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;

/**
 * Created by Administrator on 2017/4/4.
 */
public class LoginAction extends ActionSupport {
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

    public String login() throws Exception{
        User user=new User();
        user.setUsername(getUser().getUsername());
        user.setPassword(getUser().getPassword());

        //调用连接数据库的方法验证
        UserDao userdao=new UserDao();
        boolean flag=userdao.login(user);

        if(flag){
            ActionContext.getContext().getSession().put("username",user.getUsername());
            return SUCCESS;
        }else{
            this.setTip(this.getText("登陆失败！"));
            return INPUT;
        }
    }
}

