<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
	<%
		String url = request.getScheme()+"://"+request.getServerName()+":"
			+request.getServerPort()+request.getContextPath();
	%>
<base href=<%=url%>>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>图书后台管理登录界面</title>
</head>
<body>
	<center>
		<%String user= (String) request.getSession().getAttribute("username");%>
		<%String msg = "";
			if(request.getAttribute("msg")!=null){
				msg = (String)request.getAttribute("msg");
			}%>
		<%String flag = request.getParameter("flag");%>
		<h1>登录 | <a href="<%=url%>/regist.jsp">注册</a></h1>
		<form action="<%=url%>/LoginServlet" method="post">
			<table width="350px" cellspacing="0px" cellpadding="0px" border="1px">
				<tr>
					<h3><font color="red"><%=msg%></font></h3>
					<td>用户名</td>
					<td><input type="text" name="username" value="<%=user%>" placeholder="用户名为3-12位字母数字或下划线组合" ></td>
				</tr>
				<tr>
					<td>密&nbsp;码</td>
					<td><input type="password" name="password" placeholder="长度为6-12位的纯数字" ></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align:center">
						<input type="submit" value="登录">
						<input type="reset" value="取消">
					</td>
				</tr>
			</table>
		</form>
	</center>
	<script type="text/javascript">
		var flag = '<%=flag %>';
		if("1"==flag){
			alert("请登录系统！");
		}
	</script>
</body>
</html>