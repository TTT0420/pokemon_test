<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="model.GymLeaderDto" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%
    ArrayList<GymLeaderDto> gd = (ArrayList<GymLeaderDto>)request.getAttribute("gd");
    %>
<!DOCTYPE html>
<html>
<head>
	<title>ジム攻略</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="CSS/humburger.css">
	<link rel="stylesheet" type="text/css" href="CSS/strategy.css">
    <link href='https://use.fontawesome.com/releases/v5.7.2/css/all.css' rel='stylesheet'>
    	<script src="https://code.jquery.com/jquery-2.2.4.js"></script>

</head>
<body oncontextmenu='return false' class='snippet-body'>
<header>
    <nav id="nav">
      <ul>
        <li><a href="SearchFirstGymLeader">ジム攻略</a></li>
        <li><a href="SearchPokemon">TOPへ戻る</a></li>
        <li><a href="#"></a></li>
      </ul>
    </nav>
    <div id="hamburger">
      <span class="inner_line" id="line1"></span>
      <span class="inner_line" id="line2"></span>
      <span class="inner_line" id="line3"></span>
    </div>
    <h1>ジム攻略</h1>
  </header>


  <div class="demo">
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-sm-6">
                <div class="pricingTable blue">
                    <div class="pricingTable-header">
                        <h3 class="title">ニビジム</h3>
                        <span class="sub-title">ジムリーダー：<c:out value="${firstGymLeader.name }"></c:out></span>
                    </div>
                    <div class="price-value">
                        <div class="value">
                            <span class="amount"><img src="img/takeshi.png"/></span>
                        </div>
                    </div>
                    <p></p>所持モンスター
                    <ul class="pricing-content">
                        <li>イシツブテ　<img src="img/ishitsubute%20.gif"/></li>
                        <li>イワーク　<img src="img/iwaku%20.gif"/></li>
                        <li>-----</li>
                        <li>-----</li>
                        <li>-----</li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
	<script src="Jquery/jquery-3.2.1.min.js"></script>
	<script src="JS/humburger.js"></script>
</body>
</html>