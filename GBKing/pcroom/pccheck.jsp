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
<%@page import="com.hanbat.reserve.dto.*"%>
<%@page import="java.util.*"%>
<%@page session="true"%>
<%@page import="java.sql.*"%>

<head>
<meta charset="utf-8" />
<title>GBKing</title>
<link rel="stylesheet" href="/GBKing/css/style.css" />
<script src="/GBKing/js/modernizr-1.6.min.js"></script>
</head>

<script>
function goOk(on_off)
{
	var frm = document.form;	
	frm.action="pcroom.jsp?on_off="+on_off;
	frm.submit();
}
</script>

<body id="reserve" bgcolor='white'>

	<header>
	<% 
	String headerMenu = "Reservation";
	%>
	
	<%@include file="../../common/header.jsp"%>

	</header>
	
		<!-- /.wrapper -->
		<p id=right_login>
			<%@include file="../../common/login.jsp"%>
		</p>
		
		
	<div class="wrapper content">
		<div id=left>
		<% 
		String leftMenu = "예약하기";
		%>
		
		</div>

		<section id="main">
		</br>
		<h3><font size="5">예약 하기</font></h3>
		</br>
			<div id="wrap" style="width: 930px; margin: auto;">
				<table>
	<tr>
		<td>
		<% 

	String bunho = request.getParameter("bunho");
	%>
<%=bunho %>
		</td>
	</tr>
	<form name="form" method="post">
	<input type="hidden" name="bunho"   value="<%=bunho%>">
</form>
</table>
			</div>
			
	<a href="#none" onclick="goOk(1)">확인</a>&nbsp;&nbsp;&nbsp;
			<a href="#none" onclick="goOk(0)">취소</a>&nbsp;&nbsp;&nbsp;
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
!window.jQuery && document.write(unescape('%3Cscript src="js/libs/jquery-1.4.2.min.js"%3E%3C/script%3E'));
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