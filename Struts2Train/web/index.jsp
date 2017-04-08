<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/2
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>登陆页面</title>
  </head>
  <body>
  <h3>用户登录</h3>
  <s:property value="tip"/>
  <s:form action="login" method="POST">
    <s:textfield name="user.username" label="用户名"/>
    <s:textfield name="user.password" label="密码"/>
    <s:submit value="登陆"/>
  </s:form>
  <s:a href="register.jsp" ><s:submit value="注册"/></s:a>
  </body>
</html>
