package com.sise.StrutsTypeConvert.conventer;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.sise.StrutsTypeConvert.domain.User;

public class UserConverter extends StrutsTypeConverter{

    @Override
    public Object convertFromString(Map context, String[] values, Class toClass) {
        User user=new User();
        String[] userValues=values[0].split(",");
        user.setUsername(userValues[0]);
        user.setPassword(userValues[1]);
        return user;
    }

    @Override
    public String convertToString(Map context, Object obj) {
        User user=(User)obj;
        return "<"+user.getUsername()+","+user.getPassword()+">";
    }

}
