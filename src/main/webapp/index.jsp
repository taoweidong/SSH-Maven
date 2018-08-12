<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>测试SSH整合</title>

</head>

<body>
	<form action="hello_test001">
		<button>增加10个用户信息</button>
	</form>
	<form action="hello_clear">
		<button>清空表中的数据</button>
	</form>
	<div>
		<form action="hello_test" method="post">
			姓名：<input type="text" name="name">
			<s:fielderror fieldName="name">
				<s:param>name</s:param>
			</s:fielderror>
			<br> 性别： <select name="sex" style="width: 150px">
				<option value="M">男</option>
				<option value="F">女</option>
			</select>
			<s:fielderror fieldName="sex"></s:fielderror>
			<br> 年龄：<input type="text" name="age">
			<s:fielderror></s:fielderror>
			<br> <input type="submit" value="提交" width="150px">
		</form>
	</div>

</body>
</html>
