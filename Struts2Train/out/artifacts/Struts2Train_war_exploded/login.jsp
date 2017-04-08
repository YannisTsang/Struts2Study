<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/2
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>Login page.</title>
    <s:head/>
</head>
<body>
<s:fielderror/>
${tip}
  <s:form action="loginPro">
      <s:textfield name="user.username" label="用户名"/>
      <s:textfield name="user.password" label="密码"/>
      <s:textfield name="user.permission" label="角色"/>
      <tr><td colspan="2">
          <s:submit value="注册" theme="simple" onclick="this.form.action='registPro';"/>
          <s:submit value="登陆" theme="simple" onclick="this.form.action='welcomePro';"/>
      </td></tr>
  </s:form>
</body>
</html>
