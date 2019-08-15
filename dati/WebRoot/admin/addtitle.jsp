<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addtitle.jsp' starting page</title>
    
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
    <form action="idx!add.action" method="post">
    	<table>
    		<tr>
    			<td>题目：&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="ibean.title"></td> 		
    		</tr>
	    	<tr>
	    		<td>答案 1：<input type="text" name="list">&nbsp;&nbsp;<input type="radio" name="ibean.select" value="1"> </td>
	    	</tr>
	    	<tr>
	    		<td>答案 2：<input type="text" name="list">&nbsp;&nbsp;<input type="radio" name="ibean.select" value="2"> </td>
	    	</tr>
	    	<tr>
	    		<td>答案 3：<input type="text" name="list">&nbsp;&nbsp;<input type="radio" name="ibean.select" value="3"> </td>
	    	</tr>
	    	<tr>
	    		<td>答案 4：<input type="text" name="list">&nbsp;&nbsp;<input type="radio" name="ibean.select" value="4"> </td>
	    	</tr>
    	</table>
    	<input type="submit" value="添加">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"> 
    </form>
  </body>
</html>
