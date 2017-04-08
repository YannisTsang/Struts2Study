<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/5
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>管理员登陆</title>
</head>
<body>
<h1>管理员大大登陆</h1>
<s:property value="tip"/>
<s:form action="adminLogin" method="POST">
    <s:textfield name="admin.adminname" label="用户名"/>
    <s:textfield name="admin.adminpassword" label="密码"/>
    <s:submit value="登陆"/>
</s:form>
</body>
</html>
