<!DOCTYPE html>

<!--[if IE 7 ]><html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]><html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]><html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]> <!-->
<html lang="en" class="no-js" xmlns="http://www.w3.org/1999/xhtml">
<!--<![endif]-->

<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@page import="com.hanbat.board.*"%>
<%@page import="com.hanbat.base.util.*"%>
<%@page import="java.util.*"%>
<%@page import="com.utility.*"%>
<%@page session="true"%>

<head>
<meta charset="utf-8" />
<title>GBKing</title>
<link rel="stylesheet" href="/GBKing/css/style.css" />
<link rel="stylesheet" href="/GBKing/css/list_style.css" />
<script src="/GBKing/js/modernizr-1.6.min.js"></script>
</head>

<%
	String type = (String) request.getAttribute("type");
	String searchKey = (String) request.getAttribute("searchKey");
	String searchWord = (String) request.getAttribute("searchWord");
	String pg = (String) request.getAttribute("pg");
	String userid = (String) session.getAttribute("userid");
	
	if (pg == null || pg.equals(""))
		pg = "0";

	if (searchKey == null)
		searchKey = "";
	if (searchWord == null)
		searchWord = "";
%>

<script>
function goView(seq)
{	
	
	var frm = document.form;
	frm.action="/<%=CommonUtil.commonURL%>/board/view.do";
	frm.seq.value=seq;
	frm.type.value="<%=type%>";
	frm.target="_self"; //내창으로 
	frm.submit();
}
function goSearch()
{	
	var frm = document.form;
	frm.action="/<%=CommonUtil.commonURL%>/board/list.do";
	frm.target="_self"; //내창으로 
	frm.submit();
}
function goWrite()
{
	var frm = document.form;
	frm.action="/<%=CommonUtil.commonURL%>/board/write.do";
	frm.mode.value="insert";
	frm.type.value="<%=type%>";
	frm.target="_self"; //내창으로 
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
function goPage(pg)
{
	var frm = document.form;
	frm.action="/<%=CommonUtil.commonURL%>/board/list.do";
	frm.pg.value = pg;
	frm.target = "_self"; //내창으로 
	frm.submit();
}
</script>


<body id="board">

	<header>
	<% 
	String headerMenu = "Board";
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
				<font size="5">게시판</font>
			</h3>
			</br>
			<form name="form" method="post">
				<input type="hidden" name="mode"> <input type="hidden"
					name="seq"> <input type="hidden" name="type"
					value="<%=type%>"> <input type="hidden" name="pg">

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
										<option value="1" <%if (searchKey.equals("1")) {%> selected
											<%}%>>제목</option>
										<option value="2" <%if (searchKey.equals("2")) {%> selected
											<%}%>>본문</option>
										<option value="3" <%if (searchKey.equals("3")) {%> selected
											<%}%>>제목+본문</option>
										<option value="4" <%if (searchKey.equals("4")) {%> selected
											<%}%>>작성자</option>
									</select> <label for="keyword" class="desc">Keyword</label> <input
										type="text" name="searchWord" value="<%=searchWord%>"
										class="keyword" size="30" /> <span class="inbtn inputBtn"><input
										type="button" value="검색" onclick="goSearch()" /></span>
								</p>
							</fieldset>
						</div>
						<!-- bbs search E -->

						<!-- bbs header S -->
						<div class="bhd">
							<p class="fl">
								<strong><c:out value="${totalCount}" /> 건</strong> 의 게시물이 있습니다.
							</p>
						</div>
						<!-- bbs header E -->

						<!-- location S -->


						<!-- location E -->
						<table cellspacing="0" class="bdl">
							<colgroup>
								<col width="7%" />
								<col width="*" />
								<col width="15%" />
								<col width="15%" />
								<col width="12%" />
							</colgroup>
							<thead>
								<tr>
									<th scope="col" class="first">번호</th>
									<th scope="col">제목</th>
									<th scope="col">작성자</th>
									<th scope="col">작성일</th>
									<th scope="col" class="last">조회</th>
								</tr>
							</thead>

							<tbody>
								<c:forEach var="item" items="${list}">
									<tr>
										<td class="first"><c:out
												value="${totalCount - item.num+1}" /></td>
										<td class="list"><script>
											var v = "<c:out value="${item.group_depth}"/>";
											for (i = 1; i <= v; i++)
												document
														.write("&nbsp;&nbsp; re:");
										</script> <a href="#none"
											onclick="goView('<c:out value="${item.seq}"/>')"> <c:out
													value="${item.title}" />
										</a></td>
										<td><c:out value="${item.writer}" /></td>
										<td><c:out value="${item.wdate}" /></td>
										<td class="last"><c:out value="${item.hit}" /></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>

						<!-- pagination S -->
						<div class="pg">
							<%
								int totalCount = (Integer) request.getAttribute("totalCount");
							%>
							<%=Pager.makeTag(request, 10, totalCount)%>
						</div>
						<!-- pagination E -->

						<%if(type.equals("1") ||type.equals("2") || userid.equals("master"))
							{
							
						%>
						<div class="bb">
							<ul>
								<li><a href="#none" onclick="return goWrite()">글쓰기</a></li>
							</ul>
						</div>
					</div>
					<%} %>

					<!-- contentArea E -->
				</div>
				<!-- quickArea E -->
			</form>
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
		</script>
</body>
</html>

