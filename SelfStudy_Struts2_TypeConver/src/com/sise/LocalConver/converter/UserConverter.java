package com.sise.LocalConver.converter;

import java.util.Map;

import com.sise.LocalConver.domain.User;

import ognl.DefaultTypeConverter;

public class UserConverter extends DefaultTypeConverter{

    public Object convertValue(Map context,Object value,Class toType) {
        if(toType==User.class) {
            String[] params=(String[])value;
            User user=new User();
            String[] userValues=params[0].split(",");
            user.setUsername(userValues[0]);
            user.setPassword(userValues[1]);
            return user;
        }else if(toType==String.class){
            User user=new User();
            return "<" + user.getUsername() + "," +user.getPassword() + ">";
        }
        return null;
    }
}
