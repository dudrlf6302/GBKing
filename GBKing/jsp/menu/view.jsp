<!DOCTYPE html>
<!--[if IE 7 ]><html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]><html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]><html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]> <!-->
<html lang="en" class="no-js" xmlns="http://www.w3.org/1999/xhtml">
<!--<![endif]-->

<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.hanbat.menu.dto.*"%>
<%@page session="true"%>

<head>
<meta charset="utf-8" />
<title>GBKing</title>
<link rel="stylesheet" href="/GBKing/css/style.css" />
<link rel="stylesheet" href="/GBKing/css/list_style.css" />
<script src="/GBKing/js/modernizr-1.6.min.js"></script>
</head>

<script>
	function goList() {
		location.href = "/GBKing/menu/list_drink.do";
	}

	function goDelete(seq) {
		var frm = document.form;
		frm.seq.value = seq;
		frm.action = "/GBKing/menu/delete.do";
		frm.submit();
	}

	function goModify(mode) {
		var frm = document.form;
		frm.mode.value = mode;
		frm.action = "/GBKing/menu/write.do";
		frm.submit();
	}
</script>

<%
	String userid = (String) session.getAttribute("userid");
	String seq = (String) request.getAttribute("seq");
	String menu_mod = null;
	MenuDto dto = (MenuDto) request.getAttribute("dto");

	if (dto.getMenu_mod() == 1) {
		menu_mod = "음료";
	} else if (dto.getMenu_mod() == 2) {
		menu_mod = "식사";
	}
%>

<body id="menu_view">

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
			String leftMenu = "list";
			int menuMode = dto.getMenu_mod();
		%>
		<div id=left>
			<%@include file="../../common/menu_left.jsp"%>
		</div>
		
		
		<section id="main">
		</br>
		<h3><font size="5">상품 보기</font></h3>
		</br>
		<!-- quickArea S -->
		<div id="quickArea">
			<!-- contentArea S -->
			<div id="contentArea">
				<!-- bbs search S -->

					<form name="form" method="post">
						<input type="hidden" name="mode"> <input type="hidden"
							name="seq" value="<%=seq%>">
					</form>
					
					<table border="1" cellspacing="0" cellpadding="0" width="100%" class="bdl">
						<tr align="left">
							<td width="15%"><b><font size="2" color="#e41f1f">상품명 :</font></b></td>
							<td width="20%"><%=dto.getMenu_name()%></td>
							<td width="20%"><b><font size="2" color="#e41f1f">상품분류 :</font></b></td>
							<td width="20%"><%=menu_mod%></td>
						</tr>
						<tr align="left">
							<td width="15%"><b><font size="2" color="#e41f1f">가 격 :</font></b></td>
							<td width="20%"><%=dto.getPrice()%>원</td>
							<td width="20%"><b><font size="2" color="#e41f1f">적립포인트 :</font></b></td>
							<td width="20%"><%=dto.getPoint()%>점</td>
						</tr>
						<tr align="left">
							<td width="10%"><b><font size="2" color="#e41f1f">상품설명 : </font></b></td>
							<td colspan="4"><%=dto.getContents()%></td>
						</tr>
						<tr align="right">
							<td colspan="5">
								<input type="button" name="goList" value="목록" onclick="goList()" /> 
								<input type="button" name="goModify" value="수정" onclick="goModify('mod')" /> 
								<input type="button" name="goDelete" value="삭제" onclick="goDelete('<%=seq%>')" />
							</td>
						</tr>
					</table>
				</section>
			</div>
		</div>
	</div>


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
		var _gaq = [ [ '_setAccount', 'UA-3019794-38' ], [ '_trackPageview' ] ];
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



