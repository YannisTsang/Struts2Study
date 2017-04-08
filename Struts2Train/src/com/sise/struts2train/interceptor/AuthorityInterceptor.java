package com.sise.struts2train.interceptor;

import com.opensymphony.xwork2.*;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;

/**
 * Created by Administrator on 2017/4/2.
 */
public class AuthorityInterceptor extends AbstractInterceptor{
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        ActionContext ctx=invocation.getInvocationContext();
        Map session=ctx.getSession();
        String permission=(String)session.get("permission");
        if(permission!=null&&permission.equals("administrator")){
            return invocation.invoke();
        }
        ctx.put("tip","你没有权限。");
        return Action.LOGIN;
    }
}
