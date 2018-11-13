
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<%String url = request.getScheme()+"://"+request.getServerName()+":"
		+request.getServerPort()+request.getContextPath();
	%>
<base href="<%=url%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>图书后台管理系统</title>
</head>
<frameset rows="20%,*">
	<frame src="top.jsp"></frame>
	<frameset cols="10%,*">
		<frame src="left.jsp"></frame>
		<frame name="main"></frame>
	</frameset>
</frameset>
</html>