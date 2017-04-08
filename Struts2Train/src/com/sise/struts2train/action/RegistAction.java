package com.sise.struts2train.action;


import com.opensymphony.xwork2.ActionSupport;
import com.sise.struts2train.dao.UserDao;
import com.sise.struts2train.entity.User;

/**
 * Created by Administrator on 2017/4/5.
 */
public class RegistAction extends ActionSupport{
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

    public String regist() throws Exception{
        UserDao userdao=new UserDao();
        boolean flag=userdao.findUser(getUser().getUsername());

        if(flag){
            this.setTip("username.exist");
            return INPUT;
        }

        User user=new User();
        user.setUsername(getUser().getUsername());
        user.setPassword(getUser().getPassword());

        int i=userdao.save(user);//将user对象传入保存起来
        if(i>0){//i>0说明注册成功
            return SUCCESS;
        }else{
            this.setTip(this.getText("register.failed"));
            return INPUT;
        }
    }
}
