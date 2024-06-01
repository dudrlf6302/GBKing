<!DOCTYPE html>

<!--[if IE 7 ]><html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]><html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]><html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]> <!-->
<html lang="en" class="no-js" xmlns="http://www.w3.org/1999/xhtml">
<!--<![endif]-->

<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@page import="com.hanbat.reserve.dto.*"%>
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
function goCancel(seq)
{
	alert("취소되었습니다.");
	var frm = document.form;
	frm.seq.value = seq;
	frm.action = "/GBKing/reserve/listCancel.do";
	frm.submit();
}

function goSearch()
{
	var frm = document.form;
	frm.action = "/GBKing/reserve/reserveList.do";
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
	ArrayList<reserveDto> list = (ArrayList<reserveDto>) request.getAttribute("list");
%>


<body id="reserve_List">

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
		String leftMenu = "예약관리자";
		%>
		<%@include file="../../common/reserve_left.jsp"%>
		
		</div>

		<section id="main">
		</br>
		<h3><font size="5">예약 관리자</font></h3>
		</br>

			<form name="form" method="post">
				<input type="hidden" name="seq"> <input type="hidden"
					name="ID" value="<%=userid%>">

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
										<option value="" <%if(searchKey.equals("")){%> selected <%}%>>전체</option>
										<option value="1" <%if(searchKey.equals("1")){%> selected
											<%}%>>방번호</option>
										<option value="2" <%if(searchKey.equals("2")){%> selected
											<%}%>>작성자아이디</option>
										<option value="3" <%if(searchKey.equals("3")){%> selected
											<%}%>>예약날짜+예약시간</option>
										<option value="4" <%if(searchKey.equals("4")){%> selected
											<%}%>>예약날짜</option>
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
								<td width="10%">방번호</td>
								<td width="20%">작성자아이디</td>
								<td width="*%">예약날짜</td>
								<td width="15%">예약시간</td>
								<td width="10%">작성일</td>
								<td width="15%">예약취소</td>
							</tr>

							<%
								if (list.size() > 0) {
											for (int i = 0; i < list.size(); i++) {
												reserveDto dto = list.get(i);

												int seq = dto.getSeq();
												int roomNum = dto.getRoomNum();
												String ID = dto.getID();
												String currDDay = dto.getCurrDDay();
												String currTime = dto.getCurrTime();
												String wdate = dto.getWdate();
							%>
							<tr>
								<td><%=seq%></td>
								<td><%=roomNum%></td>
								<td><%=ID%></td>
								<td><%=currDDay%></td>
								<td><%=currTime%></td>
								<td><%=wdate%></td>
								<td><a href="#none" onclick="goCancel(<%=seq%>)">취소하기</a></td>
							</tr>
							<%
								}
										} else {
							%>
							<tr>
								<td colspan="5">데이타가 없습니다.</td>
							</tr>
							<%
								}
							%>
						</table>

					</div>
				</div>
			</form>
		</section>
		</div>
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





