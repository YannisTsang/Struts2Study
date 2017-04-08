<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/4
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 <form action="login" method="post">
     <s:textfield name="user.username" label="用户名"/>
     <s:textfield name="user.password" label="密码"/>
     <tr><td colspan="2">
     <s:submit label="登陆" theme="simple"/>
     </td></tr>
 </form>
</body>
</html>
