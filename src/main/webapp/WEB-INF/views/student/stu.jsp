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
		<th>性别</th>
	</tr>
	<c:forEach var="stu" items="student">
		<tr>
			<td>${student[0].stuId}</td>
			<td>${student[0].stuName}</td>
			<td>${student[0].stuSex}</td>
		</tr>
	</c:forEach>
	<tr>
		<th>出生日期</th>
		<th>电话号码</th>
		<th>入学时间</th>
	</tr>
	<c:forEach var="stu" items="student">
		<tr>
			<td>${student[0].stuBirthday}</td>
			<td>${student[0].stuTel}</td>
			<td>${student[0].stuInDate}</td>
		</tr>
	</c:forEach>
	<tr>
		<th>地址</th>
		<th>该生评价</th>
	</tr>
	<c:forEach var="stu" items="student">
		<tr>
			<td>${student[0].stuAddress}</td>
			<td>${student[0].stuMemo}</td>
		</tr>
	</c:forEach>
	
	</table>
</body>
</html>