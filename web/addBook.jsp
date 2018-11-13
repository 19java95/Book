<%@ page import="java.util.List" %>
<%@ page import="com.imooc.main.CatalogueBook" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<base href="">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>图书添加</title>
</head>
<body>
<%
	String url = request.getScheme()+"://"+request.getServerName()+":"
				+request.getServerPort()+request.getContextPath();
	List<CatalogueBook> lists = (List<CatalogueBook>)application.getAttribute("catagorylists");

%>
	<center>
		<h1>图书添加</h1>
		<form action="<%=url%>/BookAddServlet" method="post">
			<table width="400px" cellspacing="0px" cellpadding="0px" border="1px">
				<tr>
					<td>图书ID</td>
					<td><input type="text" name="bookid" placeholder="请输入数字" pattern="\d+" required="required"></td>
				</tr>
				<tr>
					<td>图书名</td>
					<td><input type="text" name="bookName"></td>
				</tr>
				<tr>
					<td>图书分类</td>
					<td>
						<select name="catgoryName1">
							<%
								for(CatalogueBook list :lists){
							%>
										<option value="<%=list.getCatalogueBookname()%>"><%=list.getCatalogueBookname()%></option>
							<%
						}

							%>
						</select>
					</td>
				</tr>
				<tr>
					<td>价格</td>
					<td><input type="text" name="price"  pattern="^(0|[1-9][0-9]{0,9})(\.[0-9]{1,2})?$" placeholder="请输入价格" ></td>
				</tr>
				<tr>
					<td>描述</td>
					<td><input type="text" name="bdescription"  placeholder="请输入描述信息"></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align:center">
						<input type="submit" value="添加">
						<input type="reset" value="重置">
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
<%String subFlag =  request.getParameter("flag");%>
<script type="text/javascript">
	var subFlag = <%=subFlag%>;
	if ('2'== subFlag){
		alert("图书添加成功");
	}
</script>
</html>