package com.sise.struts2train.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sise.struts2train.dao.AdminDao;
import com.sise.struts2train.entity.Admin;

/**
 * Created by Administrator on 2017/4/5.
 */
public class AdminLoginAction extends ActionSupport {
    private Admin admin;
    private String tip;

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String adminLogin() throws Exception{
        Admin admin=new Admin();
        admin.setAdminname(admin.getAdminname());
        admin.setAdminpassword(admin.getAdminpassword());
        AdminDao adminDao=new AdminDao();
        boolean flag=adminDao.login(admin);
        if(flag){
            ActionContext.getContext().getSession().put("qx",admin.getQx());
            ActionContext.getContext().getSession().put("Adminname",admin.getAdminname());
            return SUCCESS;
        }else{
            this.setTip(this.getText("登陆失败！"));
            return INPUT;
        }
    }
}
