package com.sise.struts2train.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sise.struts2train.dao.UserDao;
import com.sise.struts2train.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2017/4/5.
 */
public class FindAllUserAction extends ActionSupport {

    private String type; //参数表示从那个页面提交过来
    private List<User> list;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public String findAllUser() throws Exception{
        UserDao userdao=new UserDao();
        list=userdao.findAllUser();

        ActionContext.getContext().put("list",list);
        if("admin".equals(type)){
            return this.INPUT;
        }else{
            return this.SUCCESS;
        }
    }
}
