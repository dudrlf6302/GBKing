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
<link rel="stylesheet" href="/GBKing/css/contact.css" />
<script src="/GBKing/js/modernizr-1.6.min.js"></script>
</head>


<script>
	function goEmail() {	
			alert("전송되었습니다");
			return false;

	}
</script>

<body id="contact">
	<header>
	<% 
	String headerMenu = "QnA";
	%>
	
	<%@include file="../../common/header.jsp"%>
	</header>
	
		<!-- /.wrapper -->
		<p id=right_login>
			<%@include file="../../common/login.jsp"%>
		</p>
		
<div class="wrapper content">
	<section id="sidebar" class="bifide">
		<form action="/contact/" method="post" id="contact-form">
			<p id="p-name">
				<label for="name">성함을 입력해주세요. </label> <input type="text" name="name"
					id="name" />
			</p>

			<p id="p-email">
				<label for="email">이메일을 입력해주세요.</label> <input type="text"
					name="email" id="email" />
			</p>

			<p id="p-phone">
				<label for="phone">전화번호를 입력해주세요.</label> <input type="text"
					name="phone" id="phone" />
			</p>

			<p id="p-enquiry">
				<label for="enquiry">Q&A / 건의사항을 써주세요.</label>
				<textarea rows="8" cols="35" name="enquiry" id="enquiry"></textarea>
			</p>

			<p class="buttonholder">
				
				<input type="button"  onclick="goEmail()" value="보내기"></input>
			
			</p>
		</form>


	</section>
	
	<section id="main" class="bifide">
		<section id="card" class="b">
			<h3><b><font size="4">PCRoom</font></b></h3>
			<p id="qr">
				<img src="/GBKing/images/ddddd.png" width="147" height="147" />
			</p>
			<p class="tel">042 1111 2222</p>
			<p class="theaddr">
				대전광역시 유성구 덕명동 한밭대학교<br />
				<span>P</span>: 042 1111 2222<br />
			</p>
			<div id="map">
			</div>
			</br></br>
		</section>
	</section>
</div>
	<!-- /.wrapper -->	
	</br>

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