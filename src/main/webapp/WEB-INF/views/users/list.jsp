<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
<style type="text/css">
	.myhead{
		color:red;
	}
</style>
</head>
<body>
<h3 class="myhead">用户信息</h3>
<table class="table table-striped">
	<tr>
		<th>学号</th>
		<th>姓名</th>
		<th>电话</th>
		<th>操作</th>
	</tr>
	<c:forEach var="user" items="${users}">
		<tr>
			<td>${user.id }</td>
			<td>${user.name}</td>
			<td>${user.phone}</td>
			<td>
				<div class="btn-group">
					<a href="#" class="btn"><i class="icon icon-eye-open"></i> 查看</a> <a
						href="#" class="btn"><i class="icon icon-edit"></i> 编辑</a> <a
						href="#" class="btn btn-danger"><i class="icon icon-trash"></i>
						删除</a>
				</div>
			</td>
		</tr>
		
			
			
	</c:forEach>
	</table>
</body>
</html>