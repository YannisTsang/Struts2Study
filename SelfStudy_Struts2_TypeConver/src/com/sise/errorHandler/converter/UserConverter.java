package com.sise.errorHandler.converter;

import java.util.Map;

import com.sise.errorHandler.domain.User;

import ognl.DefaultTypeConverter;

public class UserConverter extends DefaultTypeConverter{
    public Object convertValue(Map context
            , Object value, Class toType)
        {
            //����Ҫ���ַ�����User����ת��ʱ
            if (toType == User.class )
            {
                //ϵͳ�����������һ���ַ�������
                String[] params = (String[])value;
                //����һ��Userʵ��
                User user = new User();
                //ֻ����������������һ������Ԫ�أ�
                //�������ַ�����Ӣ�Ķ��ŷָ�������ַ���
                String[] userValues = params[0].split(",");
                //ΪUserʵ����ֵ
                user.setUsername(userValues[0]);
                user.setPassword(userValues[1]);
                //����ת������Userʵ��
                return user;
            }
            else if (toType == String.class )
            {
                //����Ҫת����ֵǿ������ת��ΪUserʵ��
                User user = (User) value;
                return "<" + user.getUsername() + ","
                    + user.getPassword() + ">";
            } 
            return null ;
        } 
}
