<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/5
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<h3>用户注册页面</h3>
<s:form action="regist" method="POST">
    <s:textfield name="user.username" label="用户名"/>
    <s:textfield name="user.password" label="密码"/>
    <s:submit value="注册"/>
</s:form>
</body>
</html>
