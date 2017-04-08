package com.sise.struts2train.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sise.struts2train.dao.UserDao;
import com.sise.struts2train.entity.User;

/**
 * Created by Administrator on 2017/4/5.
 */
public class UpdateAction extends ActionSupport{
    private String username;
    private String password;
    private String tip;

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

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

    public String update() throws Exception{
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);

        UserDao userdao=new UserDao();
        int i=userdao.update(user);

        if(i>0) {
            return SUCCESS;
        }else{
            this.setTip("更新失败");
            return INPUT;
        }
    }
}
