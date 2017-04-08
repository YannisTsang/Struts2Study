<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/2
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>Regist page.</title>
</head>
<body>
<h3>恭喜你，注册成功</h3>
  <s:form>
      <s:property value="user.username"/><br/>
      <s:property value="user.password"/><br/>
  </s:form>
</body>
</html>
