<!DOCTYPE html>

<!--[if IE 7 ]><html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]><html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]><html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]> <!-->
<html lang="en" class="no-js" xmlns="http://www.w3.org/1999/xhtml">
<!--<![endif]-->

<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@page session="true" import="java.util.*"%>
<%@page import="com.hanbat.menu.dto.*"%>
<%@page import="java.util.*"%>
<%@page session="true"%>

<head>
<meta charset="utf-8" />
<title>GBKing</title>
<link rel="stylesheet" href="/GBKing/css/style.css" />
<link rel="stylesheet" href="/GBKing/css/list_style.css" />
<script src="/GBKing/js/modernizr-1.6.min.js"></script>
</head>

<script>
function goCancel(order_num)
{
	alert("취소되었습니다.");
	var frm = document.form;
	frm.order_num.value = order_num;
	frm.action = "/GBKing/menu/menu_Cancel.do";
	frm.submit();
}

function goSearch()
{
	var frm = document.form;
	frm.action = "/GBKing/menu/menu_Confirm.do";
	frm.submit();
}
</script>

<%
	String searchKey = (String) request.getAttribute("searchKey");
	String searchWord = (String) request.getAttribute("searchWord");

	if (searchKey == null)
		searchKey = "";
	if (searchWord == null)
		searchWord = "";

	String userid = (String) session.getAttribute("userid");
	ArrayList<BuyDto> list = (ArrayList<BuyDto>) request.getAttribute("list");
%>


<body id="menu_Confirm">

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
		

	<div class="wrapper content">
	
	<% 
		String leftMenu = "Confirm";
		int menuMode = 0;
	%>
		
		<div id=left>
		<%@include file="../../common/menu_left.jsp"%>
		</div>

		<section id="main">
		</br>
		<h3><font size="5">주문 확인</font></h3>
		</br>
			<form name="form" method="post">
				<input type="hidden" name="order_num"> 
				<input type="hidden" name="ID" value="<%=userid%>">

				<!-- quickArea S -->
				<div id="quickArea">
					<!-- contentArea S -->
					<div id="contentArea">
						<!-- bbs search S -->
						<div class="bs">
							<fieldset>
								<p>
									<label for="target" class="desc">Target</label> <select
										name="searchKey">
										<option value="" <%if (searchKey.equals("")) {%> selected
											<%}%>>전체</option>
										<option value="1" <%if (searchKey.equals("1")) {%> selected
											<%}%>>주문 번호</option>
									</select> <label for="keyword" class="desc">Keyword</label> <input
										type="text" name="searchWord" value="<%=searchWord%>"
										class="keyword" size="30" /> <span class="inbtn inputBtn"><a
										href="#none" onclick="goSearch()">검색</a></span>
								</p>

							</fieldset>
						</div>

						<table border="1" cellspacing="0" cellpadding="0" class="bdl">
							<tr>
								<td width="8%">번호</td>
								<td width="10%">아이디</td>
								<td width="13%"><font color="#cc0d1c">주문번호</font></td>
								<td width="*%">메뉴 이름</td>
								<td width="8%">수량</td>
								<td width="10%">가격</td>
								<td width="10%">총 가격</td>
								<td width="15%">구매일</td>
								<td width="8%">취소</td>
							</tr>

							<%
								if (list.size() > 0) {
														for (int i = 0; i < list.size(); i++) {
															BuyDto dto = list.get(i);

															int seq = dto.getSeq();
															int order_num = dto.getOrder_num();
															int price = dto.getPrice();
															int total_pirce = dto.getTotal_price();
															int count = dto.getCount();
															String ID = dto.getUserid();
															String menu_name = dto.getMenu_name();
															String wdate = dto.getWdate();

															if (userid.equals(ID)) {
							%>
							<tr>
								<td><%=seq%></td>
								<td><%=ID%></td>
								<td><font color="#cc0d1c"><%=order_num%></font></td>
								<td><%=menu_name%></td>
								<td><%=count%></td>
								<td><%=price%></td>
								<td><%=total_pirce%></td>
								<td><%=wdate%></td>
								<td><a href="#none" onclick="goCancel(<%=order_num%>)">취소</a></td>
							</tr>
							<%
								}
														}
													} else {
							%>
							<tr>
								<td colspan="9">예약정보가 없습니다.</td>
							</tr>
							<%
								}
							%>
						</table>
			</form>
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

		<script>
			SROOTPATH = '/'
		</script>
		<script src="/GBKing/js/plugins.js"></script>
		<script src="/GBKing/js/init.js"></script>

		<script>
			//<![CDATA[
			var _gaq = [ [ '_setAccount', 'UA-3019794-38' ],
					[ '_trackPageview' ] ];
			(function(d, t) {
				var g = d.createElement(t), s = d.getElementsByTagName(t)[0];
				g.async = true;
				g.src = ('https:' == location.protocol ? 'https://ssl'
						: 'http://www')
						+ '.google-analytics.com/ga.js';
				s.parentNode.insertBefore(g, s);
			})(document, 'script');
			//]]>
		</script>
</body>
</html>
