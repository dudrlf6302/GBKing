<!DOCTYPE html>
<!--[if IE 7 ]><html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]><html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]><html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]> <!-->
<html lang="en" class="no-js" xmlns="http://www.w3.org/1999/xhtml">
<!--<![endif]-->

<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@page import="com.hanbat.menu.dao.*"%>
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
	function goSave() {
		var frm = document.form;

		if (frm.menu_name.value == "") {
			alert("상품명을 입력하세요");
			frm.title.focus();
			return false;
		}
		if (frm.menu_mod_radio.value == "") {
			alert("상품구분을 선택하세요");
			frm.title.focus();
			return false;
		}
		if (frm.price.value == "") {
			alert("가격을 입력하세요");
			frm.title.focus();
			return false;
		}
		if (frm.contents.value == "") {
			alert("상품설명을 입력하세요");
			frm.contents.focus();
			return false;
		}

		frm.action = "/GBKing/menu/save.do";
		frm.submit();
	}

	function goList() {
		location.href = "/GBKing/menu/list_drink.do";
	}
</script>

<%
	String mode = (String) request.getAttribute("mode");
	String seq = (String) request.getAttribute("seq");
	String userid = (String) session.getAttribute("userid");

	if (mode == null) {
		mode = "ins";
	}

	if (mode.equals("mod")) {
		MenuDto dto = (MenuDto) request.getAttribute("dto");
	}
%>

<body id="menu_write">
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
			String leftMenu = "write";
			int menuMode = 0;
		%>
		<div id=left>
			<%@include file="../../common/menu_left.jsp"%>
		</div>

		<section id="main">
		</br>
		<h3><font size="5">상품 등록</font></h3>
		</br>
			<!-- quickArea S -->
			<div id="quickArea">
				<!-- contentArea S -->
				<div id="contentArea">
					<!-- bbs search S -->

					<form name="form" method="post" enctype="multipart/form-data">
						<input type="hidden" name="mode" value="<c:out value="${mode}"/>">
						<input type="hidden" name="seq" value="<c:out value="${seq}"/>">

						<table border="1" cellspacing="0" cellpading="0" class="bdl">
							<tr>
								<td align="left" width="30%"><b><font size="2" color="#e41f1f">상품구분 : </font></b></td>
								<td align="left"><input type="radio" name="menu_mod_radio" value="drink"><b><font size="2" >음료</font></b>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="menu_mod_radio" value="food"><b><font size="2" >디저트</font></b>
								</td>
							</tr>

							<tr>
								<td align="left" width="30%"><b><font size="2" color="#e41f1f">상품명 : </font></b></td>
								<td align="left"><input name="menu_name" size="60" maxlength="300"
									value="<c:out value="${dto.menu_name}"/>"></td>
							</tr>

							<tr>
								<td align="left" width="30%"><b><font size="2" color="#e41f1f">가격 : </font></b></td>
								<td align="left"><input name="price" size="10" maxlength="40"
									value="<c:out value="${dto.price}"/>">원</td>
							</tr>

							<tr>
								<td align="left" width="30%"><b><font size="2" color="#e41f1f">상품 설명 : </font></b></td>
								<td align="left"><textarea rows="10" cols="10" name="contents" >
										<c:out value="${dto.contents}" />
									</textarea></td>
							</tr>

							<tr>
								<td align="left" width="30%"><b><font size="2" color="#e41f1f">image : </font></b></td>
								<td align="left"><input type="file" name="image" id="image" /></td>
							</tr>

							<tr align="right">
								<td colspan="2"><input type="button" name="save" value="등록"
									onclick="goSave()" />&nbsp;&nbsp; <input type="button"
									name="cancle" value="취소" onclick="goList()" />&nbsp;&nbsp;</td>
							</tr>
						</table>
					</form>
				</div>
			</div>
		</section>
	</div>
	
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

