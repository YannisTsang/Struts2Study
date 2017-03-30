<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Plz input ur regist information.</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <s:head/>
  </head>
  
  <body>
    <h2>请输入您的注册信息</h2>
    <s:fielderror/>
    <!-- Struts2中应用客户端校验只需要使用s标签并在表单元素中添加validate属性即可 -->
    <s:form action="regist" validate="true">
       <s:textfield name="username" label="用户名"/>
       <s:textfield name="password" label="密码"/>
       <s:textfield name="age" label="年龄"/>
       <s:textfield name="birth" label="生日"/>
       <s:submit value="注册"/>
    </s:form>
  </body>
</html>
