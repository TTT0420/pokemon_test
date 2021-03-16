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
<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
	<link rel="stylesheet" type="text/css" href="Table_Responsive_v2/vendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="Table_Responsive_v2/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="Table_Responsive_v2/vendor/animate/animate.css">
	<link rel="stylesheet" type="text/css" href="Table_Responsive_v2/vendor/select2/select2.min.css">
	<link rel="stylesheet" type="text/css" href="Table_Responsive_v2/vendor/perfect-scrollbar/perfect-scrollbar.css">
	<link rel="stylesheet" type="text/css" href="Table_Responsive_v2/css/util.css">
	<link rel="stylesheet" type="text/css" href="Table_Responsive_v2/css/main.css">
	<script src="https://code.jquery.com/jquery-2.2.4.js"></script>
	<script src="Table_Responsive_v2/js/main.js"></script>
<title>ポケモン図鑑</title>
</head>
<body>
 <header>
    <nav id="nav">
      <ul>
        <li><a href="#"">SUMPLE1</a></li>
        <li><a href="#">SUMPLE2</a></li>
        <li><a href="#">SUMPLE3</a></li>
      </ul>
    </nav>
    <div id="hamburger">
      <span class="inner_line" id="line1"></span>
      <span class="inner_line" id="line2"></span>
      <span class="inner_line" id="line3"></span>
    </div>
    <h1>テスト</h1>
  </header>
	<div class="limiter">
		<div class="container-table100">
			<div class="wrap-table100">
					<div class="table">
						<div class="row header">
							<div class="cell">
								ID
							</div>
							<div class="cell">
								名前
							</div>
							<div class="cell">
								属性
							</div>
						</div>
						<% for(UserBean bean:beanList){%>
						<div class="row">
							<div class="cell" data-title="id">
								<%= bean.getId() %>
							</div>
							<div class="cell" data-title="name">
								<%= bean.getName() %>
							</div>
							<div class="cell" data-title="type">
								<%= bean.getType() %>
							</div>
						</div>
						<% } //endfor %>
					</div>
			</div>
		</div>
	</div>
	<script src="Table_Responsive_v2/vendor/jquery/jquery-3.2.1.min.js"></script>
	<script src="Table_Responsive_v2/vendor/bootstrap/js/popper.js"></script>
	<script src="Table_Responsive_v2/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="Table_Responsive_v2/vendor/select2/select2.min.js"></script>
	<script src="Table_Responsive_v2/js/main.js"></script>
</body>
</html>
