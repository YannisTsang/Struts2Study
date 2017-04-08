package com.sise.struts2train.entity;

/**
 * Created by Administrator on 2017/4/4.
 */
public class Admin {
    private String adminname;
    private String adminpassword;
    private int qx;

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword;
    }

    public int getQx() {
        return qx;
    }

    public void setQx(int qx) {
        this.qx = qx;
    }
}
