
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<%
		String url = request.getScheme()+"://"+request.getServerName()+":"
	+request.getServerPort()+request.getContextPath();
	%>
<base href="<%=url%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>图书后台管理</title>
</head>
<body>
	<p><a href="/catgory.jsp" target="main">分类添加</a></p>
	<p><a href="/addBook.jsp" target="main">图书添加</a></p>
	<p><a href="/showBooks.jsp" target="main">图书查询</a></p>
</body>
</html>