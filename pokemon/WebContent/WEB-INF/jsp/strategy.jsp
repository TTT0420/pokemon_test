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
	<title>Table V02</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
	<link rel="stylesheet" type="text/css" href="Table_Responsive_v2/vendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="Table_Responsive_v2/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="Table_Responsive_v2/vendor/animate/animate.css">
	<link rel="stylesheet" type="text/css" href="Table_Responsive_v2/vendor/select2/select2.min.css">
	<link rel="stylesheet" type="text/css" href="Table_Responsive_v2/vendor/perfect-scrollbar/perfect-scrollbar.css">
	<link rel="stylesheet" type="text/css" href="Table_Responsive_v2/css/util.css">
	<link rel="stylesheet" type="text/css" href="Table_Responsive_v2/css/main.css">
</head>
<body>

	<script src="Table_Responsive_v2/vendor/jquery/jquery-3.2.1.min.js"></script>
	<script src="Table_Responsive_v2/vendor/bootstrap/js/popper.js"></script>
	<script src="Table_Responsive_v2/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="Table_Responsive_v2/vendor/select2/select2.min.js"></script>
	<script src="Table_Responsive_v2/js/main.js"></script>
</body>
</html>