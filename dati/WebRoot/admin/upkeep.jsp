<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'upkeep.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
	function turnPage(obj) {
		window.location.href = "idx!get.action?ibean.page=" + obj;
	}
</script>
</head>

<body>
	<h2 align="center">维护题目</h2>
	<form action="" method="post">
		<table border="1" cellpadding="1" cellspacing="1" align="center">
			<tr>
				<td>题目</td>
				<td>操作</td>
			</tr>

			<c:forEach var="answer" items="${ items}">
				<tr>
					<td>${answer.question}</td>
					<td><a href="idx_del.action?ibean.id=${answer.id}">删除</a></td>
				</tr>
			</c:forEach>
		</table>
		<div align="center">
			<input type="button" value="上一页" id="btn1" onclick="turnPage(${ibean.page-1});">&nbsp;&nbsp;&nbsp;&nbsp;<input
				type="button" id="btn2" value="下一页" onclick="turnPage(${ibean.page+1});">
		</div>
	</form>
</body>
</html>
