<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
<base href=/index.jsp">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册界面</title>
</head>
<body>
	<center>
		<h1>用户注册</h1>
		<%
			String url = request.getScheme()+"://"+request.getServerName()+":"
				+request.getServerPort()+request.getContextPath();

			String msg = "";
			if (request.getAttribute("msg")!=null){
				msg = (String)request.getAttribute("msg");
			}
		%>
		<h3 align="center"><font color="red"><%=msg%></font></h3>
		<form action="<%=url%>/RegistServlet" method="post">
			<table width="400px" cellspacing="0px" cellpadding="0px" border="1px">
				<tr>
					<td>用户名</td>
					<td><input type="text" name="username" pattern="[0-9a-zA-Z_]{3,12}" required="required" placeholder="用户名为3-12位字母数字或下划线组合" ></td>
				</tr>
				<tr>
					<td>密&nbsp;码</td>
					<td><input type="password" id="password" name="password" pattern="\d{6,12}" required="required" placeholder="密码长度为6-12位的纯数字"  ></td>
				</tr>
				<tr>
					<td>确认密码</td>
					<td><input type="password" id="checkPWD" name="checkPWD"  pattern="[0-9]{6,12}" required="required" placeholder="密码长度为6-12位的纯数字"  onkeyup="validate()"><span id="tishi"></span></td>
				</tr>
				<tr>
					<td>手机号码</td>
					<td><input type="text" name="phone"pattern="1[3578]\d{9}" required="required" placeholder="请输入正确的手机号码格式" ></td>
				</tr>
				<tr>
					<td>邮箱</td>
					<td><input type="email" name="email" placeholder="请输入正确邮箱格式" required="required"></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align:center">
						<input type="submit" onclick="validate()"  value="注册">
						<input type="reset" value="重置">
					</td>
				</tr>
			</table>
		</form>
	</center>

</body>
<script>
	function validate() {
		var pwd1 = document.getElementById("password").value;
		var pwd2 = document.getElementById("checkPWD").value;

		<!-- 对比两次输入的密码 -->
		if(pwd1 == pwd2)
		{
			document.getElementById("tishi").innerHTML="<font color='green'>两次密码相同</font>";
			document.getElementById("button").disabled = false;
		}
		else {
			document.getElementById("tishi").innerHTML="<font color='red'>两次密码不相同</font>";
			document.getElementById("button").disabled = true;
		}
	}
</script>

</html>