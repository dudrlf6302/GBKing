<!DOCTYPE html>

<!--[if IE 7 ]><html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]><html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]><html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]> <!-->
<html lang="en" class="no-js" xmlns="http://www.w3.org/1999/xhtml">
<!--<![endif]-->

<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@page import="com.utility.*"%>
<%@page import="com.hanbat.board.dto.*"%>
<%@page session="true"%>

<head>
<meta charset="utf-8" />
<title>GBKing</title>
<link rel="stylesheet" href="/GBKing/css/style.css" />
<link rel="stylesheet" href="/GBKing/css/list_style.css" />
<script src="/GBKing/js/modernizr-1.6.min.js"></script>
</head>


<%
	BoardDto dto = (BoardDto) request.getAttribute("dto");
	String seq = (String) request.getAttribute("seq");
	String type = (String) request.getAttribute("type");

	String writer = (String) session.getAttribute("userid");
%>

<script>
function goWrite()
{
	var frm = document.form;
	frm.action="/<%=CommonUtil.commonURL%>/board/write.do";
	frm.mode.value="modify";	
	frm.type.value="<%=dto.getType()%>";
	frm.target="_self"; //내창으로 
	frm.submit();
}
function goDelete()
{
	var frm = document.form;	
	frm.action="/<%=CommonUtil.commonURL%>/board/del.do";
	
	frm.submit();
}
function goBoard(type)
{
	var frm = document.form;
	frm.action="/<%=CommonUtil.commonURL%>/board/list.do";
	frm.type.value=type;
	frm.target="_self"; 	//내창으로 
	frm.submit();
}
function goReply()
{
	var frm = document.form;
	frm.action="/<%=CommonUtil.commonURL%>/board/reply.do";
	frm.mode.value="reply";	
	frm.type.value="<%=dto.getType()%>";
	frm.target = "_self"; //내창으로 
	frm.submit();
}
</script>


<body id="board">

	<header>
		<%
			String headerMenu ="Board";
		%>

		<%@include file="../../common/header.jsp"%>

	</header>

		<!-- /.wrapper -->
		<p id=right_login>
			<%@include file="../../common/login.jsp"%>
		</p>
		
	<div class="wrapper content">
		<div id=left>

			<%@include file="../../common/board_left.jsp"%>
		</div>
		


		<section id="main">
			</br>
			<h3>
				<font size="5">게시글 보기</font>
			</h3>
			</br>
			<form name="form" method="post">
				<input type="hidden" name=searchWord> <input type="hidden"
					name="searchKey"> <input type="hidden" name="seq"
					value="<%=seq%>"> <input type="hidden" name="mode">
				<input type="hidden" name="type" value="<%=dto.getType()%>">
				<input type="hidden" name="group_id" value="<%=dto.getGroup_id()%>">
				<input type="hidden" name="group_depth"
					value="<%=dto.getGroup_depth()%>"> <input type="hidden"
					name="group_seq" value="<%=dto.getGroup_seq()%>">
			</form>

			<!-- quickArea S -->
			<div id="quickArea">
				<hr />
				<!-- contentArea S -->
				<div id="contentArea">
					<hr />
					<!-- content S -->
					<div id="content" class="CTdef">
						<div class="bvhd dbline">
							<dl>
								<dt class="subject">제목</dt>
								<dd class="subject">
									<c:out value="${dto.title}" />
								</dd>
								<dt class="date">작성일</dt>
								<dd class="date">
									<c:out value="${dto.wdate}" />
								</dd>
								<dt class="country">작성자</dt>
								<dd class="country">
									<c:out value="${dto.writer}" />
								</dd>
								<dt class="hits">조회</dt>
								<dd class="hits">
									<c:out value="${dto.hit}" />
								</dd>
							</dl>
						</div>

						<div class="bvc">
							<p>
								<%
									out.println(dto.getContents());
								%>
							</p>

						</div>
						<!-- bbs view content E -->

						<!-- bbs footer S -->
						<div class="bftv">

							<div class="bb">
								<ul class="sbb">
									<li><a href="#" onclick="goBoard('<%=dto.getType()%>')">목록</a></li>
									<%
										if (type.equals("1") || type.equals("2")	) {
									%>
									<li><a href="#none" onclick="goReply()">답글</a></li>
									<%
										}
									%>
									<%
										if (writer.equals(dto.getWriter()) || writer.equals("master")	) {
									%>
									<li><a href="#none" onclick="return goWrite()">수정</a></li>
									<li><a href="#none" onclick="return goDelete()">삭제</a></li>
									<%
										}
									%>
								</ul>
							</div>
						</div>


						<!-- slide_top S -->
						<div id="slide_top">
							<script type="text/javascript">
								imgRollover('slide_top');
							</script>
						</div>
						<!-- slide_top E -->
					</div>
					<!-- quickArea E -->
		</section>

		<section id="copyright">
			<div class="wrapper">
				<p>&#169; Copyright 2013 Keith Homemade Cakes</p>
				<p id="koodoz">
					<a title="Web design Melbourne"><strong>Web Design <span>Melbourne</span></strong></a>
				</p>
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
		</script></html>
