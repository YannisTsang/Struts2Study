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
    
    <title>My JSP 'inputEH2.jsp' starting page</title>
    
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
    <s:fielderror/>
    <h2>类型转换的错误处理</h2>
    <p><b>请输入用户信息</b></p>
    <s:form action="loginEH2">
      <s:textfield name="user.username" label="用户名"/>
      <s:textfield name="user.jj" label="jj"/>
      <s:textfield name="user.age" label="年龄"/>
      <s:textfield name="user.birth" label="生日"/>
       <tr>
        <td colspan="2"><s:submit value="转换" theme="simple"/>
		<s:reset value="重填" theme="simple"/></td>
       </tr>
    </s:form>
  </body>
</html>
