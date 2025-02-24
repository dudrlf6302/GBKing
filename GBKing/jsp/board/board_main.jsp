<!DOCTYPE html>

<!--[if IE 7 ]><html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]><html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]><html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--><html lang="en" class="no-js" xmlns="http://www.w3.org/1999/xhtml"><!--<![endif]-->

<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@page import="java.util.*"%>
<%@page import="com.utility.*" %>
<%@page session="true"%>

<head>
<meta charset="utf-8" />
<title>PCRoom</title>
<link rel="stylesheet" href="/GBKing/css/style.css" />
<script src="/GBKing/js/modernizr-1.6.min.js"></script>
</head>
<script type="text/javascript">
function goBoard()
{
	var frm = document.log_form;
	
	var userid = '<%=session.getAttribute("userid")%>';
	
	if(userid=='null')
	{
		alert("로그인 해주세요.");
		frm.userid.focus();
		return false;
	}
	
	location.href="/GBKing/board/list.do";
}
function goReservation()
{
	var frm = document.log_form;
	
	var userid = '<%=session.getAttribute("userid")%>';
	
	if(userid=='null')
	{
		alert("로그인 해주세요.");
		frm.userid.focus();
		return false;
	}

	location.href="/GBKing/pcroom/pcroom.jsp";
}
function goOrder()
{
	var frm = document.log_form;
	
	var userid = '<%=session.getAttribute("userid")%>';
	
	if(userid=='null')
	{
		alert("로그인 해주세요.");
		frm.userid.focus();
		return false;
	}
	
	location.href="/GBKing/menu/list_drink.do";
}
function goQnA()
{
	var frm = document.log_form;
	
	var userid = '<%=session.getAttribute("userid")%>';
	
	if(userid=='null')
	{
		alert("로그인 해주세요.");
		frm.userid.focus();
		return false;
	}
	
	location.href="/GBKing/qna/qna.do";
}

</script>



<form name ="form" method = "post" >
	<input type="hidden" name="type">
</form>	


<body id="home">

	<header>
		<div class="wrapper">
		<h1><a href="/GBKing/board/main.do" title="Go back to the homepage" class="img">GBKing</a></h1>
		<nav>
			<ul>
				<li id="m-home"><a href="/GBKing/board/main.do" class="img active">Home</a></li>		
				<li id="m-about"><a href="#none" onclick="goBoard()" class="img">Board</a></li>
				<li id="m-range"><a href="#none" onclick="goReservation()" class="img">Seat</a></li>
				<li id="m-catering"><a href="#none" onclick="goOrder()" class="img">Order</a></li>
				<li id="m-contact"><a href="#none" onclick="goQnA()" class="img">Q&A</a></li>
			</ul>
		</nav>
		</div>
	</header>

	<div class="wrapper content">
				<section id="hilite" class="hilite-extra" style="background-image: url(/GBKing/images/main.gif);">
				</section>
	</div>
	<!-- /.wrapper -->
	<p id=right_login>
			<%@include file="../../common/login.jsp"%>
	</p>
	
	
	<div class="wrapper scr">
		<section id="scrollers">
			<ul class="NanumPen">
								<li><a class="celebration" href="#none">커피</a></li>
								<li><a class="childrens" href="#none">바닐라라떼</a></li>
								<li><a class="dessert" href="#none">케이크</a></li>
								<li><a class="savouries" href="#none">와플</a></li>
								<li><a class="health-cakes" href="#none">컵케이크</a></li>
								<li><a class="cupcakes" href="#none">미니케이크</a></li>
								<li><a class="treats" href="#none">스무디</a></li>
								<li><a class="catering" href="#none">샌드위치</a></li>
							</ul>
		</section>
		
		<section id="intro">
			<div id="history">
				<h3 class="alt"><font size="3">PCRoom에 오신걸 환영합니다.</font></h3>
				<p>인터넷 카페 PCRoom에 오신걸 환영합니다.</br> PCRoom에는 최신 게임, 화려한 그래픽, 고사양 PC로 손님들을 맞이 하고 있습니다. 또한 커피와 함께 디저트도 준비되어 있습니다. 
				   현재 웹 사이트에서 음료,디저트 주문 뿐 아니라 PC방 자리가 있는지 볼 수 있습니다.  <b>회원가입 후 이용해보세요.</b>
				  <a href="#none" class="NanumPen"><span>&#62;</span> PCRoom 추천해주세요!&#8230;</a></p>
			</div>
			
			<a href="#none">
				<div id="catering" class="r">
					<h4 class="alt"><font size="4"><b>오늘의 추천메뉴!</b></font></h4>
					<p>[웰빙 샌드위치] </br> 고소한 페이스트리빵에 타르타르 소스와 햄, 양상추, 토마토, 피클 등이 어우러져 감칠맛나는 인기만점 샌드위치 입니다.</p>
				</div>
			</a>
			
		</section>

	</div><!-- /.wrapper -->
	


	<footer class="home">

		<div class="wrapper separator">

		<h3>PCRoom 이용안내</h3>
		<p>open시간 및 PCRoom 상세주소 안내</p></br>
		
		<section id="hours">

		<h4 class="NanumPen">Open&#8230;</h4>

		<ul class="vevent">
			<li><abbr title="Opening hours for Monday" class="summary">Mon:</abbr> <time class="dtstart" title="2013-10-28T06:00:00" datetime="2013-10-28T06:00:00">6:00am</time> &#8211; <time class="dtend" title="2013-10-28T17:30:00" datetime="2013-10-28T17:30:00">24:00pm</time></li>
			<li><abbr title="Opening hours for Tuesday" class="summary">Tue:</abbr> <time class="dtstart" title="2013-10-29T06:00:00" datetime="2013-10-29T06:00:00">6:00am</time> &#8211; <time class="dtend" title="2013-10-29T17:30:00" datetime="2013-10-29T17:30:00">24:00pm</time></li>
			<li><abbr title="Opening hours for Wednesday" class="summary">Wed:</abbr> <time class="dtstart" title="2013-10-30T06:00:00" datetime="2013-10-30T06:00:00">6:00am</time> &#8211; <time class="dtend" title="2013-10-30T17:30:00" datetime="2013-10-30T17:30:00">24:00pm</time></li>
			<li><abbr title="Opening hours for Thursday" class="summary">Thu:</abbr> <time class="dtstart" title="2013-10-31T06:00:00" datetime="2013-10-31T06:00:00">6:00am</time> &#8211; <time class="dtend" title="2013-10-31T17:30:00" datetime="2013-10-31T17:30:00">24:00pm</time></li>
			<li><abbr title="Opening hours for Friday" class="summary">Fri:</abbr> <time class="dtstart" title="2013-10-25T06:00:00" datetime="2013-10-25T06:00:00">6:00am</time> &#8211; <time class="dtend" title="2013-10-25T17:30:00" datetime="2013-10-25T17:30:00">24:00pm</time></li>
			<li><abbr title="Opening hours for Saturday" class="summary">Sat:</abbr> <time class="dtstart" title="2013-10-26T06:00:00" datetime="2013-10-26T06:00:00">6:00am</time> &#8211; <time class="dtend" title="2013-10-26T14:30:00" datetime="2013-10-26T14:30:00">24:00pm</time></li>
		</ul>
		
		
		</section>


		<div class="vcard">
			<h4 class="NanumPen"><a>Contact <span class="fn org">PCRoom</span></a></h4>
			<p class="tel">010-1111-2222</p>
			

			<div class="adr">
				<p>
					<span class="street-address">대전 광역시 유성구</span><br />
					<span class="locality"> 덕명동</span> <span class="region">16-1</span> <span class="postal-code">한밭대학교</span>
				</p>
			</div>

			<p><span class="tel"><span class="type">P<span class="d">ax</span></span>: <span class="value">(042) 123 - 4567</span></span></p>
			<p2 class="e">E<span class="d">mail</span>: <span class="value">hanbat@hanbat.ac.kr</span></p2>
		</div><!-- /.vcard -->

	</div><!-- /.wrapper.separator -->
	
	
	<section id="copyright">
		<div class="wrapper">
			<p>&#169; Copyright 2013 GBKing</p>
			<p id="koodoz"><a href="http://www.koodoz.com.au" title="Web design Melbourne"><strong>Web Design <span>Melbourne</span></strong></a> &amp; <a href="http://www.koodoz.com.au/services/internet-marketing/" title="SEO Melbourne"><strong>SEO <span>Melbourne</span></strong></a> by Koodoz Design</p>
		</div>
	</section>

	</footer>

<script src="//ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.js"></script>
<script src="http://maps.google.com/maps/api/js?sensor=false"></script>

<script>
//<![CDATA[
!window.jQuery && document.write(unescape('%3Cscript src="js/libs/jquery-1.4.2.min.js"%3E%3C/script%3E'));
//]]>
</script>




<script>SROOTPATH = '/GBKing/'</script>
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
		