<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试页面</title>
</head>
<body>
	<h1>Success test001</h1>
	<h2>${success }</h2>
	<div align="center">
		<table>
			<tr>
				<td>Id</td>
				<td>姓名</td>
				<td>性格</td>
				<td>年龄</td>
			</tr>
			<tbody>
				<s:iterator value="userList">
					<tr>
						<td>${id }</td>
						<td>${name }</td>
						<td>${sex }</td>
						<td>${age }</td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
	</div>
</body>
</html>