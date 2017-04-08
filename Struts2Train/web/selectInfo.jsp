<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/5
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri ="/struts-tags"%>
<html>
<head>
    <title>查看个人信息</title>
</head>
<body>
<h3>查看个人信息</h3>
<s:form action="update"  method="post">
    <s:textfield name="username" label="用户名" value="%{#session.username.username}" readonly="true"/>
    <s:textfield name="password" label="密码" value="%{#session.username.password}"/>
    <s:submit value="修改"/>
</s:form>
</body>
</html>
