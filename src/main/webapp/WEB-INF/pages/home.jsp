<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="zh-CN">
	<head>
		<title>登录</title>
		<base href="<%=basePath %>" />
		<meta content="text/html; charset=UTF-8" http-equiv="Content-Type" />
		
	</head>
	
	<shiro:principal></shiro:principal>

	<body>
		<h2>登出</h2>
		<span style="colro:red;">${msg}</span>
		
		<form action="dologout" method="post">
			<button type="submit">登出</button>
		</form>
	</body>
</html>