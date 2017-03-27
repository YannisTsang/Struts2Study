package com.sise.struts2.I18N.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class loginAction extends ActionSupport{

    private String username;
    private String password;
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
    public String execute() throws Exception{
        ActionContext ctx=ActionContext.getContext();
        if("admin".equals(username.trim())&&"sise".equals(password.trim())) {
            ctx.getSession().put("username", getUsername());
            //跟住key取出国际化消息，并为占位符指定值
            ctx.put("tip", getText("succTip",new String[] {getUsername(),getPassword()}));
            return SUCCESS;
        }else {
            ctx.put("tip", getText("failTip",new String[] {getUsername()}));
            return ERROR;
        }
        
    }
}
