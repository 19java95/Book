<%@ page import="java.util.List" %>
<%@ page import="com.imooc.main.Book" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<script type="text/javascript" src="resources\js\jquery-1.4.2.js">

</script>
<head>
	<%
		String url = request.getScheme()+"://"+request.getServerName()+":"
				+request.getServerPort()+request.getContextPath();
	%>
<base href="<%=url%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>图书查询</title>
<script type="text/javascript" src="resources/js/jquery-1.4.2.js"></script>
</head>
<body>
	<center>
		<h1>图书查询</h1>
		<span class="tip"></span>
		<p>
			图书ID：<input type="text" name="bookID" id="bookID">
			图书名：<input type="text" name="bookName" id="bookName">
			分类：<input type="text" name="catgoryName2" id="catgoryName2">
			<input type="button" value="查询"  id="search">
		</p>
		<hr>
		<table width="800px" cellspacing="0px" cellpadding="0px" border="1px">
			<thead>
				<tr>
					<th>图书ID</th>
					<th>书名</th>
					<th>分类</th>
					<th>价格</th>
					<th>描述</th>
				</tr>
			</thead>


			<c:choose>
				<c:when test="${bookID==null&&bookName==null&&catgoryName2==null}">
					<c:forEach items="${books1}" var="book">
						<tr>
							<td>${book.bookId}</td>
							<td>${book.bookName}</td>
							<td>${book.catgoryName1}</td>
							<td>${book.bookPrice}</td>
							<td>${book.bookDescribe}</td>
						</tr>
					</c:forEach>
				</c:when>
				<c:when test="${bookID||null&&bookName||null&&catgoryName2||null}">
			<tbody id="cont">
			</tbody>
				</c:when>
			</c:choose>

		</table>
	</center>
	
</body>
<script type="text/javascript">
	$(document).ready(function(){
	$("#search").click(function(){
		//单击登录按钮的时候触发ajax事件
		$.ajax({
			url:"<%=url%>/ShowBooksServlet",
			type:"post",
			data:{
				bookID:$('#bookID').val(),
				bookName:$('#bookName').val(),
				catgoryName2:$('#catgoryName2').val()
			},
			dataType:"json",
			success:function(res){
				console.log(res);
				//将数据显示在页面上
				var str = "";
				//遍历数据
				$.each(res,function(index,element){

					str +="<tr>" +
							"<td>"+element['bookId']+"</td>" +
							"<td>" +element['bookName']+"</td>" +
							"<td>" +element['catgoryName1']+"</td>" +
							"<td>" +element['bookPrice']+"</td>"+
							"<td>"+element['bookDescribe']+"</td>"+
							"</tr>";
				})
//遍历完成之后
				str +="</tbody></table>";
//将表格添加到body中
				$('tbody').append(str);
			}
		});
	  });
	});
</script>

</html>