<!DOCTYPE html>

<!--[if IE 7 ]><html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]><html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]><html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="en" class="no-js" xmlns="http://www.w3.org/1999/xhtml">
<!--<![endif]-->

<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@page import="java.util.*"%>
<%@page import="com.hanbat.menu.dto.*"%>
<%@page session="true"%>

<head>
<meta charset="utf-8" />
<title>GBKing</title>
<link rel="stylesheet" href="/GBKing/css/style.css" />
<script src="/GBKing/js/modernizr-1.6.min.js"></script>
</head>

<script>
	function goView(seq) {
		var frm = document.form;
		frm.seq.value = seq;
		frm.action = "/GBKing/menu/view.do";
		frm.submit();
	}

	function goWrite(mode) {
		var frm = document.form;
		frm.mode.value = mode;
		frm.action = "/GBKing/menu/write.do";
		frm.submit();
	}

	function calc() {
		var price = document.getElementsByName("price");
		var count = document.getElementsByName("count");
		var order_menu_name = document.getElementsByName("order_menu_name");
		var result = 0;

		for ( var i = 0; i < price.length; i++) {
			if (order_menu_name[i].checked) {
				if (count[i].value == "") {
					count[i].value = 0;
				}
				var x = price[i].value;
				var y = count[i].value;
				result = eval(result) + (eval(x) * eval(y));
			}
		}
		document.getElementById("result").innerHTML = result;
	}

	function Buy() {
		var frm = document.form;
		frm.action = "/GBKing/menu/buy.do";
		frm.Total_price.value = document.getElementById("result").innerHTML;
		frm.submit();
		alert("구매완료 되었습니다.")
	}

	function getResult() {
		document.getElementById("result_temp").value = document
				.getElementById("result").innerHTML;
	}
</script>
123
<body id="products">
	<header>
	<% 
	String headerMenu = "Order";
	%>
	
	<%@include file="../../common/header.jsp"%>
	</header>
	
		<!-- /.wrapper -->
		<p id=right_login>
			<%@include file="../../common/login.jsp"%>
		</p>
		
				<%
				ArrayList<MenuDto> list = (ArrayList<MenuDto>)request.getAttribute("list");
				String userid = (String)session.getAttribute("userid");
				%>
	<div class="wrapper content">

		<% 
		String leftMenu = "list";
		int menuMode = list.get(0).getMenu_mod();
		%>
		<div id=left>
	
		<%@include file="../../common/menu_left.jsp"%>
		</div>

		<section id="main">
		</br>
		<h3>메뉴</h3>
		</br>
			<ul id="product-list">
				

				<form name="form" method="post">
						<input type="hidden" id="mode" name="mode">
						<input type="hidden" id="seq" name="seq">
						<input type="hidden" id="userid" name="userid" value="<%=userid%>">
						<%
							if(list.size()>0)
							{
								for(int i=0; i<list.size(); i++)
								{
							MenuDto dto = list.get(i);	
							int seq = dto.getSeq();
						%>
						
						<input type="hidden" name="menu_mod" value="<%=dto.getMenu_mod()%>">
						<input type="hidden" name="price" value="<%=dto.getPrice()%>">
						
						<li align="center">
								<a class="m" href="/GBKing/upload/<%=dto.getImage()%>">
									<img src="/GBKing/upload/<%=dto.getImage()%>" alt="<%=dto.getMenu_name()%>" width="200" height="200"/>					
									<h2 align="center"><font size=2><a href="#none" onclick="goView('<%=seq%>')"><%=dto.getMenu_name()%></a>&nbsp;&nbsp; <%=dto.getPrice()%>₩</font></h2>
									<h2 align="center"><font size=2>
									<input type="checkbox" name="order_menu_name" value="<%=dto.getMenu_name()%>" />
									<input type="text" value="0" name="count" style="width:10px" maxlength="2" onKeyUp="calc()" />&nbsp;EA
									</font></h2>
								</a>
						</li>
						<%
								}
							}
								
						%>


					<table align="center">
						<tr>
							
							<td><input type="hidden" name="Total_price">
								<h2><font size=3 color="#54301a">총 금액 : </font>
								<font size=3 color="#cc0d1c">
									<div id="result" value="0" style='display: inline';></div> &nbsp;₩&nbsp;&nbsp; 
									<input type="button" value="구매" style="width: 40px" style="height:30px" onclick="Buy()">
								</font></h2>
							</td>
						</tr>
					</table>
		
				</form>
			</ul>
		</section>
		



	<section id="copyright">
		<div class="wrapper">
			<p>&#169; Copyright 2013 Keith Homemade Cakes</p>
			<p id="koodoz"><a title="Web design Melbourne"><strong>Web Design <span>Melbourne</span></strong></a></p>
		</div>
	</section>


		<script src="//ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.js"></script>
		<script src="http://maps.google.com/maps/api/js?sensor=false"></script>

		<script>
			//<![CDATA[
			!window.jQuery
					&& document
							.write(unescape('%3Cscript src="js/libs/jquery-1.4.2.min.js"%3E%3C/script%3E'));
			//]]>
		</script>

		<script>SROOTPATH = '/'</script>
		<script src="/GBKing/js/plugins.js"></script>
		<script src="/GBKing/js/init.js"></script>
		

		<script>
//<![CDATA[
var _gaq = [['_setAccount', 'UA-3019794-38'], ['_trackPageview']];
(function(d, t) {
var g = d.createElement(t),
    s = d.getElementsByTagName(t)[0];
g.async = true;
g.src = ('https:' == location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
s.parentNode.insertBefore(g, s);
})(document, 'script');
//]]>
</script>
</body>
</html>