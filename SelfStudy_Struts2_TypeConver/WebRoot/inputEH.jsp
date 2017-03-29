<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'inputEH.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <s:fielderror/>
<h3>类型转换的错误处理</h3>
<p><b>输入的用户名、密码以逗号（,）隔开</b></p>
<s:form action="loginEH">
	<s:textfield name="user" label="用户"/>
	<tr>
		<td colspan="2"><s:submit value="转换" theme="simple"/>
		<s:reset value="重填" theme="simple"/></td>
	</tr>
</s:form>
  </body>
</html>
