<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/5
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>主页面</title>
</head>
<body>
<div align="center">欢迎您， <s:property value="#session.username"/></div>
<p align="center"><a href="findalluser.action">查看所有用户</a></p>
<p align="center"><a href="selectinfo.action?username=<%=session.getAttribute("username")%>&type=user">查看个人信息</a></p>
</body>
</html>
