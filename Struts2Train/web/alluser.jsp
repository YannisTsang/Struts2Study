<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/5
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>所有用户</title>
</head>
<body>
 <table width="200" border="1" align="right">
     <tr><td width="300" nowrap="nowrap">
     <script language="JavaScript">
         <!--
           var now=new Date();
           hour=now.getHours()
         {
               document.write(now.toLocaleString())
         }
         -->
     </script>
         &nbsp;
     </td>
     </tr>
 </table>
 <center>输出所有用户</center>
  <br/><br/><br/>
 <ul style="width:1200px">
     <li style="width:300px;float:left;">用户名</li>
     <li style="width:300px;float:left;">密码</li>
 </ul>
 <br/>

 <table border="2">
 <s:iterator value="list" var="li" >
     <tr><td>
         <s:property value="username"/></td>

         <td><s:property value="password"/></td>
     </tr>
 </s:iterator>
 </table>
</body>
</html>
