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

<head>
<meta charset="utf-8" />
<title>GBKing</title>
<link rel="stylesheet" href="/GBKing/css/style.css" />
<script src="/GBKing/js/modernizr-1.6.min.js"></script>
</head>

<script>
	function goLeft() {
		var frm = document.form;
		frm.mode.value = 1;
		frm.action = "/GBKing/reserve/reserve.do";
		frm.submit();
	}
	function goRight() {
		var frm = document.form;
		frm.mode.value = 0;
		frm.action = "/GBKing/reserve/reserve.do";
		frm.submit();
	}
	function roomView(dispDay) {
		var frm = document.form;
		frm.mode.value = 2;
		frm.currDay.value = dispDay;
		frm.action = "/GBKing/reserve/reserve.do";
		frm.submit();

	}
	function timeView(roomNum) {
		var frm = document.form;
		frm.mode.value = 3;
		frm.roomNum.value = roomNum;
		frm.action = "/GBKing/reserve/reserve.do";
		frm.submit();

	}
	function timeReserve(time) {
		var frm = document.form;
		frm.mode.value = 4;
		frm.currTime.value = time;
		frm.action = "/GBKing/reserve/reserve.do";
		frm.submit();
	}
</script>

<%
	ArrayList<reserveDto> list = (ArrayList<reserveDto>)request.getAttribute("list");
	
	int currYear = (Integer) (request.getAttribute("currYear")); // if it is not retrieved from incoming URL (month=) then it is set to current year
	int currMonth = (Integer) (request.getAttribute("currMonth")); // same as year
	int currDay = (Integer) (request.getAttribute("currDay"));
	int roomNum = (Integer) (request.getAttribute("roomNum"));
	
	String userid = (String)session.getAttribute("userid");
	
	String boxSize = "70"; // how big to make the box for the calendar

	//build 2 calendars

	Calendar c = (Calendar) (request.getAttribute("c"));
	Calendar cal = (Calendar) (request.getAttribute("cal"));
%>

<%!public boolean isDate(int m, int d, int y) // This method is used to check for a VALID date
	{
		m -= 1;
		Calendar c = Calendar.getInstance();
		c.setLenient(false);

		try {
			c.set(y, m, d);
			Date dt = c.getTime();
		} catch (IllegalArgumentException e) {
			return false;

		}
		return true;
	}%>
<%!public String getDateName(int monthNumber) // This method is used to quickly return the proper name of a month
	{
		String strReturn = "";
		switch (monthNumber) {
			case 0 :
				strReturn = "January";
				break;
			case 1 :
				strReturn = "February";
				break;
			case 2 :
				strReturn = "March";
				break;
			case 3 :
				strReturn = "April";
				break;
			case 4 :
				strReturn = "May";
				break;
			case 5 :
				strReturn = "June";
				break;
			case 6 :
				strReturn = "July";
				break;
			case 7 :
				strReturn = "August";
				break;
			case 8 :
				strReturn = "September";
				break;
			case 9 :
				strReturn = "October";
				break;
			case 10 :
				strReturn = "November";
				break;
			case 11 :
				strReturn = "December";
				break;
		}
		return strReturn;
	}%>

<form name="form" method="post">
	<input type="hidden" name="mode"> <input type="hidden"
		name="currYear" value="<%=currYear%>"> <input type="hidden"
		name="currMonth" value="<%=currMonth%>"> <input type="hidden"
		name="currDay" value="<%=currDay%>"> <input type="hidden"
		name="roomNum" value="<%=roomNum%>"> <input type="hidden"
		name="currTime"> <input type="hidden" name="ID"
		value="<%=userid%>">

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
		<%@include file="../../common/reserve_left.jsp"%>
		</div>

		<section id="main">
		</br>
		<h3><font size="5">예약 하기</font></h3>
		</br>
			<div id="wrap" style="width: 930px; margin: auto;">
				<div id="header" style="hight: 50px;"></div>

				<div id="main" style="margin-top: 10px;">

					<div id=left_main
						" style="width: 520px; background: gray; margin-right: 10px; float: left;">

						<table border='1' width='519' celpadding='0' cellspacing='0'>
							<tr>
								<td width='150' align='right' valign='middle'><a
									href="#none" onclick="goRight()"><font size="1">Previous
											Month</font></a></td>
								<td width='260' align='center' valign='middle'><b><%=getDateName(cal.get(cal.MONTH)) + " " + cal.get(cal.YEAR)%></b></td>
								<td width='173' align='left' valign='middle'><a
									href="#none" onclick="goLeft()"><font size="1">Next
											Month</font></a></td>
							</tr>
						</table>
						<table border="0" width="520" bordercolorlight="#C0C0C0"
							bordercolordark="#808080" style="border-collapse: collapse"
							bordercolor="#111111" cellpadding="0" cellspacing="0">
							<td width="100%">
								<table border="2" width="519" bordercolorlight="#C0C0C0"
									bordercolordark="#000000" style="border-collapse: collapse"
									bordercolor="#000000" cellpadding="0" cellspacing="0"
									bgcolor="#DFDCD8">
									<tr>
										<td width="<%=boxSize%>" align="center" nowrap
											bordercolor="#666666" bgcolor="#666666"><font
											color="#FFFFFF"><b>Sun</b></font></td>
										<td width="<%=boxSize%>" align="center" nowrap
											bordercolor="#666666" bgcolor="#666666"><font
											color="#FFFFFF"><b>Mon</b></font></td>
										<td width="<%=boxSize%>" align="center" nowrap
											bordercolor="#666666" bgcolor="#666666"><font
											color="#FFFFFF"><b>Tues</b></font></td>
										<td width="<%=boxSize%>" align="center" nowrap
											bordercolor="#666666" bgcolor="#666666"><font
											color="#FFFFFF"><b>Wed</b></font></td>
										<td width="<%=boxSize%>" align="center" nowrap
											bordercolor="#666666" bgcolor="#666666"><font
											color="#FFFFFF"><b>Thurs</b></font></td>
										<td width="<%=boxSize%>" align="center" nowrap
											bordercolor="#666666" bgcolor="#666666"><font
											color="#FFFFFF"><b>Fri</b></font></td>
										<td width="<%=boxSize%>" align="center" nowrap
											bordercolor="#666666" bgcolor="#666666"><font
											color="#FFFFFF"><b>Sat</b></font></td>
									</tr>
									<%
										//'Calendar loop

															String todayColor;
															int count = 1;
															int dispDay = 1;
															
															for (int w = 1; w < 7; w++) {
									%>
									<tr>
										<%
											for (int d = 1; d < 8; d++) {
																			if (!(count >= cal.get(c.DAY_OF_WEEK))) {
										%>
										<td width="<%=boxSize%>" height="<%=boxSize%>" valign="top"
											align="left">&nbsp;</td>
										<%
											count += 1;
																			} else {

																				if (isDate(currMonth + 1, dispDay, currYear)) // use the isDate method
																				{

																					if (dispDay == c.get(c.DAY_OF_MONTH)
																							&& c.get(c.MONTH) == cal.get(cal.MONTH)
																							&& c.get(c.YEAR) == cal.get(cal.YEAR)) // Here we check to see if the current day is today
																					{
																						todayColor = "#6C7EAA";
																					} else {
																						todayColor = "#ffffff";
																					}
										%>
										<td bgcolor="<%=todayColor%>" width="<%=boxSize%>"
											align="left" height="<%=boxSize%>" valign="top">
											<%
												if (((10000*cal.get(cal.YEAR)+100*cal.get(cal.MONTH)+dispDay)-
																			(10000*c.get(c.YEAR)+100*c.get(c.MONTH)+c.get(c.DAY_OF_MONTH)))>=0) // Here we check to see if the current day is today
																		{
											%> <a href="#none" onclick="roomView('<%=dispDay%>')"><%=dispDay%><br>
										</td>
										<%
											} else {
										%>
										<%=dispDay%><br>
										</td>
										<%
											}
										%>

										<%
											count += 1;
																	dispDay += 1;

																				} else {
										%>


										<td width="<%=boxSize%>" align="left" height="<%=boxSize%>"
											valign="top">&nbsp;</td>
										<%
											}
																			}

																		}
										%>
									</tr>
									<%
										}
									%>

								</table>
							</td>
							<tr>
								<td>
						</table>
					</div>


					<div id=right_main style="width: 400px; float: left;">


						<%
							if ((Integer) (request.getAttribute("viewMode")) == 1 || (Integer) (request.getAttribute("viewMode")) == 2) {
						%>
						<%=currYear%>년
						<%=currMonth+1%>월
						<%=currDay%>일 </br>
						</br>방을 선택 하시오.

						<div style="width: 400px; background: #6C7EAA;">
							<table>
								<tr>
									</br>
									<td><a href="#none" onclick="timeView('1')">1번방&nbsp&nbsp</td>
									<td><a href="#none" onclick="timeView('2')">2번방&nbsp&nbsp</td>
									<td><a href="#none" onclick="timeView('3')">3번방&nbsp&nbsp</td>
									<td><a href="#none" onclick="timeView('4')">4번방&nbsp&nbsp</td>
									<td><a href="#none" onclick="timeView('5')">5번방&nbsp&nbsp</td>



								</tr>
							</table>

						</div>
						<%
							}
									if ((Integer) (request.getAttribute("viewMode")) == 2) {
						%>
						</br>
						<a class="m" href="/GBKing/images/roomNum<%=roomNum%>.jpg">
						<img src="/GBKing/images/roomNum<%=roomNum%>.jpg" width="300" height="150"/>
						</a>
						</br>시간을 선택 하시오.
						<div style="width: 400px; margin-top: 10px; background: #6C7EAA;">
							<table>
								<tr>
									<br>
									
									<%
										int[] a =new int[6];
															
															for (int i = 0; i < list.size(); i++) {
																reserveDto dto = list.get(i);
																		
																int roomNumCheck = dto.getRoomNum();
																String currDDayCheck = dto.getCurrDDay();
																String currTimeCheck = dto.getCurrTime();
																		
																String currDDay= Integer.toString(currYear)+" "+Integer.toString(currMonth+1)+" "+Integer.toString(currDay);		
																												
																for(int j=0;j<6;j++)
																	if(roomNumCheck==roomNum && currDDayCheck.equals(currDDay) && currTimeCheck.equals(""+(9+j*2)+":00"))				
																	{
																		a[j] =1;
																	}
																								
															}

															for(int k=0;k<6;k++)
																if(a[k]!=1)	{
									%>

									<td><a href="#none"
										onclick="timeReserve(''+<%=9+k*2%>+':00')"><%=9+k*2%>:00&nbsp&nbsp</td>

									<%
										}
															
														
															if(a[0]==1 && a[1]==1 && a[2]==1 && a[3]==1 && a[4]==1 && a[5]==1)
															{
									%>

									<td>예약 가능한 시간이 없습니다.</td>

									<%
										}
									%>

								</tr>

							</table>

						</div>
						<%
							}
						%>

					</div>
				</div>

				<div style="clear: both;"></div>
				<div id="flooter" style="hight: 50px; margin-top: 10px;"></div>
			</div>
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