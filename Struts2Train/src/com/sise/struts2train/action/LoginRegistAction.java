package com.sise.struts2train.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


import java.util.Map;

/**
 * Created by Administrator on 2017/4/2.
 */
public class LoginRegistAction extends ActionSupport{




    public String welcome() throws Exception{
       ActionContext ctx=ActionContext.getContext();
       Map session=ctx.getSession();

            return SUCCESS;
    }


    public String regist() throws Exception{
        return SUCCESS;
    }
}
