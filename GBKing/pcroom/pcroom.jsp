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
function goWrite(bunho)
{
	var frm = document.form;	
	frm.action="pccheck.jsp?bunho="+bunho;
	frm.submit();
}
</script>

<%
	String on_off;
	on_off = request.getParameter("on_off");
	String bunho = request.getParameter("bunho");
	if(on_off==null ||on_off.equals(""))
	{
		on_off="0";
	}
	if(bunho==null ||bunho.equals(""))
	{
		bunho="21";
	}
%>

<%
	request.setCharacterEncoding("UTF-8");
	String msg="";

	//db불러오기 
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");

	} catch (Exception e) {
		System.out.println("드라이버파일 없음");
	}

	//2.db와 연결하기 
	String url="jdbc:oracle:thin:@192.168.0.9:1521:XE";
	String id="hr";
	String pwd="hr1234";

	try {
		Connection conn = DriverManager.getConnection(url, id, pwd);
		//out.println("연결성공");
		Statement statement = conn.createStatement();	
		String sql;
		sql = "update pcroom set " + "on_off ='" + on_off + "' where bunho='" + bunho + "' ";
		msg = "수정되었습니다";
		System.out.println(sql);
		statement.execute(sql); //db에 등록
			
		sql = "select bunho,on_off from pcroom ORDER by bunho";
		ResultSet rs = statement.executeQuery(sql);
%>

<form name="form" method="post">
	<input type="hidden" name="on_off" value="<%=on_off %>">
	<input type="hidden" name="bunho">
</form>


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
		<h3><font size="5">자리 확인</font></h3>
		</br>
			<div id="wrap" style="width: 930px; margin: auto;">
				<table>
	<tr>
		<td>
			<%
			for(int i=1;i<=20;i++)
			{
			rs.next();
			int check_bunho = rs.getInt(1);
			int check_on_off = rs.getInt(2);					
			
			if (session.getAttribute("userid").equals("master")) {
		
				if(check_bunho==i && check_on_off==0) {	%>
			
				<a href="#none" onclick="goWrite(<%=i%>)"><%=i%></a>&nbsp;&nbsp;&nbsp;
				<%}	else if(check_bunho==i && check_on_off==1){ %>
			
				<a href="#none" onclick="goWrite(<%=i%>)"><font color="#cf0ff1"face="궁서체"><%=i%></a>&nbsp;&nbsp;&nbsp;
					<%}	//else if 종료	
					if(i%5==0)
					{
					%>
					</br></br>
				<% 	
					}
				} //master if문
				else
				{
					if(check_bunho==i && check_on_off==0) {%>
					<a href="#none"><%=i%></a>&nbsp;&nbsp;&nbsp;
					<%}	else if(check_bunho==i && check_on_off==1){ %>
					<a href="#none"><font color="#cf0ff1"face="궁서체"><%=i%></a>&nbsp;&nbsp;&nbsp;
					<%}	//else if 종료	
					if(i%5==0)
					{
					%>
					</br></br>
					<%
					}
					
				}
			}//for문 종료 %>
		</td>
	</tr>
</table>
			</div>
			<%

		sql = "update pcroom set " + "on_off ='" + on_off + "' where bunho='" + bunho + "' ";
		
		System.out.println(sql);
		statement.execute(sql); //db에 등록
	
		rs.close();
		statement.close();
		conn.close();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
%>
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