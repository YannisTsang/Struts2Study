package com.sise.errorHandler.converter;

import java.util.Map;

import com.sise.errorHandler.domain.User;

import ognl.DefaultTypeConverter;

public class UserConverter extends DefaultTypeConverter{
    public Object convertValue(Map context
            , Object value, Class toType)
        {
            //当需要将字符串向User类型转换时
            if (toType == User.class )
            {
                //系统的请求参数是一个字符串数组
                String[] params = (String[])value;
                //创建一个User实例
                User user = new User();
                //只处理请求参数数组第一个数组元素，
                //并将该字符串以英文逗号分割成两个字符串
                String[] userValues = params[0].split(",");
                //为User实例赋值
                user.setUsername(userValues[0]);
                user.setPassword(userValues[1]);
                //返回转换来的User实例
                return user;
            }
            else if (toType == String.class )
            {
                //将需要转换的值强制类型转换为User实例
                User user = (User) value;
                return "<" + user.getUsername() + ","
                    + user.getPassword() + ">";
            } 
            return null ;
        } 
}
