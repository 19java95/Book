<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<% String username = (String)request.getSession().getAttribute("username");%>
	<center>
		<h1>
			图书后台管理系统<span style="font-size:12px">您好，<%=username%> </span>
		</h1>
	</center>
</body>
</html>
