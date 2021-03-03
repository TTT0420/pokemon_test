<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="model.UserBean" %>
    <%
    ArrayList<UserBean> beanList = (ArrayList<UserBean>)request.getAttribute("beanList");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>表示</title>
</head>
<body>
	<table border ="1">
		<tbody>
			<tr>
				<th>ID</th>
				<th>名前</th>
				<th>属性</th>
				<th>生息地</th>
			</tr>
			<% for(UserBean bean:beanList){%>
			<tr>
				<td><%= bean.getId() %></td>
				<td><%= bean.getName() %></td>
				<td><%= bean.getType() %></td>
				<td><%= bean.getLive() %></td>
			</tr>
			<% } //endfor %>
		</tbody>
	</table>

</body>
</html>