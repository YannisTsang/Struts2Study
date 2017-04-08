<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/2
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>View page</title>
</head>
<body>
<h3>您的密码是：${user.password},知道了吗</h3><br/>
这是第二次的：<s:property value="user.password"/>，看到了吗？

</body>
</html>
