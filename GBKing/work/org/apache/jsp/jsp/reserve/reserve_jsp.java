package org.apache.jsp.jsp.reserve;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.hanbat.reserve.dto.*;
import java.util.*;
import com.utility.*;

public final class reserve_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

public boolean isDate(int m, int d, int y) // This method is used to check for a VALID date
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
	}
public String getDateName(int monthNumber) // This method is used to quickly return the proper name of a month
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
	}
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/jsp/reserve/../../common/header.jsp");
    _jspx_dependants.add("/jsp/reserve/../../common/login.jsp");
    _jspx_dependants.add("/jsp/reserve/../../common/reserve_left.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<!--[if IE 7 ]><html lang=\"en\" class=\"no-js ie7\"> <![endif]-->\r\n");
      out.write("<!--[if IE 8 ]><html lang=\"en\" class=\"no-js ie8\"> <![endif]-->\r\n");
      out.write("<!--[if IE 9 ]><html lang=\"en\" class=\"no-js ie9\"> <![endif]-->\r\n");
      out.write("<!--[if (gt IE 9)|!(IE)]> <!-->\r\n");
      out.write("<html lang=\"en\" class=\"no-js\" xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<!--<![endif]-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<title>GBKing</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/GBKing/css/style.css\" />\r\n");
      out.write("<script src=\"/GBKing/js/modernizr-1.6.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction goLeft() {\r\n");
      out.write("\t\tvar frm = document.form;\r\n");
      out.write("\t\tfrm.mode.value = 1;\r\n");
      out.write("\t\tfrm.action = \"/GBKing/reserve/reserve.do\";\r\n");
      out.write("\t\tfrm.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction goRight() {\r\n");
      out.write("\t\tvar frm = document.form;\r\n");
      out.write("\t\tfrm.mode.value = 0;\r\n");
      out.write("\t\tfrm.action = \"/GBKing/reserve/reserve.do\";\r\n");
      out.write("\t\tfrm.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction roomView(dispDay) {\r\n");
      out.write("\t\tvar frm = document.form;\r\n");
      out.write("\t\tfrm.mode.value = 2;\r\n");
      out.write("\t\tfrm.currDay.value = dispDay;\r\n");
      out.write("\t\tfrm.action = \"/GBKing/reserve/reserve.do\";\r\n");
      out.write("\t\tfrm.submit();\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction timeView(roomNum) {\r\n");
      out.write("\t\tvar frm = document.form;\r\n");
      out.write("\t\tfrm.mode.value = 3;\r\n");
      out.write("\t\tfrm.roomNum.value = roomNum;\r\n");
      out.write("\t\tfrm.action = \"/GBKing/reserve/reserve.do\";\r\n");
      out.write("\t\tfrm.submit();\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction timeReserve(time) {\r\n");
      out.write("\t\tvar frm = document.form;\r\n");
      out.write("\t\tfrm.mode.value = 4;\r\n");
      out.write("\t\tfrm.currTime.value = time;\r\n");
      out.write("\t\tfrm.action = \"/GBKing/reserve/reserve.do\";\r\n");
      out.write("\t\tfrm.submit();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");

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

      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form name=\"form\" method=\"post\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"mode\"> <input type=\"hidden\"\r\n");
      out.write("\t\tname=\"currYear\" value=\"");
      out.print(currYear);
      out.write("\"> <input type=\"hidden\"\r\n");
      out.write("\t\tname=\"currMonth\" value=\"");
      out.print(currMonth);
      out.write("\"> <input type=\"hidden\"\r\n");
      out.write("\t\tname=\"currDay\" value=\"");
      out.print(currDay);
      out.write("\"> <input type=\"hidden\"\r\n");
      out.write("\t\tname=\"roomNum\" value=\"");
      out.print(roomNum);
      out.write("\"> <input type=\"hidden\"\r\n");
      out.write("\t\tname=\"currTime\"> <input type=\"hidden\" name=\"ID\"\r\n");
      out.write("\t\tvalue=\"");
      out.print(userid);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body id=\"reserve\" bgcolor='white'>\r\n");
      out.write("\r\n");
      out.write("\t<header>\r\n");
      out.write("\t");
 
	String headerMenu = "Reservation";
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("\t<h1>\r\n");
      out.write("\t\t<a href=\"/GBKing/board/main.do\" title=\"Go back to the homepage\"\r\n");
      out.write("\t\t\tclass=\"img\">Keith Homemade Cakes</a>\r\n");
      out.write("\t</h1>\r\n");
      out.write("\r\n");
      out.write("\t<nav>\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li id=\"m-home\"><a href=\"/GBKing/board/main.do\" \r\n");
      out.write("\t\t\t\t\t\t\t");
if(headerMenu.equals("Home")){
							
      out.write("class=\"img active\"\t\r\n");
      out.write("\t\t\t\t\t\t\t");
}
							else{
							
      out.write("class=\"img\"");

							}
      out.write(">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t<li id=\"m-about\"><a href=\"/GBKing/board/list.do\"\r\n");
      out.write("\t\t\t\t\t\t\t");
if(headerMenu.equals("Board")){
							
      out.write("class=\"img active\"\t\r\n");
      out.write("\t\t\t\t\t\t\t");
}
							else{
							
      out.write("class=\"img\"");

							}
      out.write(">Board</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t<li id=\"m-range\"><a href=\"/GBKing/reserve/reserve.do\"\r\n");
      out.write("\t\t\t\t\t\t\t");
if(headerMenu.equals("Reservation")){
							
      out.write("class=\"img active\"\t\r\n");
      out.write("\t\t\t\t\t\t\t");
}
							else{
							
      out.write("class=\"img\"");

							}
      out.write(">Reservation</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t<li id=\"m-catering\"><a href=\"/GBKing/menu/list_drink.do\" \r\n");
      out.write("\t\t\t\t\t\t\t");
if(headerMenu.equals("Order")){
							
      out.write("class=\"img active\"\t\r\n");
      out.write("\t\t\t\t\t\t\t");
}
							else{
							
      out.write("class=\"img\"");

							}
      out.write(">Order</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<li id=\"m-contact\"><a href=\"/GBKing/qna/qna.do\"\r\n");
      out.write("\t\t\t\t\t\t\t");
if(headerMenu.equals("Q&A")){
							
      out.write("class=\"img active\"\t\r\n");
      out.write("\t\t\t\t\t\t\t");
}
							else{
							
      out.write("class=\"img\"");

							}
      out.write(">Q&A</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</header>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!-- /.wrapper -->\r\n");
      out.write("\t\t<p id=right_login>\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 
	if (session.getAttribute("userid") == null || session.getAttribute("userid").equals("") ||
		session.getAttribute("check") == null || session.getAttribute("check").equals("") || request.getAttribute("logout")=="out"){
		session.removeAttribute("userid");
		session.removeAttribute("check");
		session.setAttribute("userid", request.getAttribute("session_id"));
	    session.setAttribute("check", request.getAttribute("session_check"));
	
	} else {
		session.setAttribute("userid", session.getAttribute("userid"));
	    session.setAttribute("check", session.getAttribute("check"));
	} 


      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction goLogin() {\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif (document.getElementById(\"userid\").value == \"\") {\r\n");
      out.write("\t\t\talert(\"ID를 입력해주세요\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"userid\").focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif (document.getElementById(\"pw\").value == \"\") {\r\n");
      out.write("\t\t\talert(\"Password를 입력해주세요\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"pw\").focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar frm = document.log_form;\r\n");
      out.write("\t\tfrm.action = \"/");
      out.print(CommonUtil.commonURL);
      out.write("/board/login.do\";\r\n");
      out.write("\t\tfrm.submit();\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction goLogout() {\r\n");
      out.write("\r\n");
      out.write("\t\tvar frm = document.log_form2;\r\n");
      out.write("\t\tfrm.action = \"/");
      out.print(CommonUtil.commonURL);
      out.write("/board/logout.do\";\r\n");
      out.write("\t\tfrm.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction goRegister(){\r\n");
      out.write("\r\n");
      out.write("\t//\tvar frm = document.form;\r\n");
      out.write("\t//\twindow.open(\"\",\"listinfo\",\"width=700, height=250,top=250,left=250\");\r\n");
      out.write("\t//\tfrm.target = \"listinfo\";//타켓을 변경\r\n");
      out.write("\t//\tfrm.action=\"/");
      out.print(CommonUtil.commonURL);
      out.write("/member/write.do\";\r\n");
      out.write("\t//\tfrm.submit();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar frm = document.form;\r\n");
      out.write("\t\twindow.open(\"\",\"register\",\"width=1000, height=500,left=250,top=250, scrollbars=yes\");\r\n");
      out.write("\t\tfrm.target = \"register\";//타켓을 변경\r\n");
      out.write("\t\tfrm.action=\"/");
      out.print(CommonUtil.commonURL);
      out.write("/member/write.do\";\r\n");
      out.write("\t\tfrm.submit();\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");

		String check = "";
		if (session.getAttribute("check") == null || session.getAttribute("check").equals("")) {
			check = "0";
		} else {
			check = session.getAttribute("check").toString();
		}
		
		
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("  <!-- Login Set  -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");

	System.out.println("check " + session.getAttribute("check"));
	System.out.println("ID : " + session.getAttribute("userid"));
	System.out.println("request ID : " + request.getAttribute("userid"));
	System.out.println("request PW : " + request.getAttribute("password"));
		if (check.equals("0")) { 
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<form name=\"log_form\" method=\"post\">\r\n");
      out.write("\t\t<table style=\"border:2px dashed red\" align=\"center\" class=\"bdl\">\r\n");
      out.write("\t\t<td></br></td>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><b><font size=\"3\">&nbsp;&nbsp;ID : </font></b><input type=\"text\" style=\"width: 70px\" style=\"height:20px\" name=\"userid\" id=\"userid\" value=\"\"></input></td>\r\n");
      out.write("\t\t\t\t<td><b><font size=\"3\">&nbsp;&nbsp;Pass : </font></b><input type=\"password\" style=\"width: 70px\" style=\"height:15px\" name=\"pw\" id=\"pw\" value=\"\"></input></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<td></br></td>\r\n");
      out.write("\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t\t<td><input type=\"image\" src = \"/GBKing/images/btn_login.gif\"  onclick=\"goLogin()\"></input></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"image\" src=\"/GBKing/images/btn_join.gif\" onclick=\"goRegister()\"></input></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t<td></br></td>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t");

		} else if (check.equals("1")) {  
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<form name=\"log_form2\" method=\"post\">\r\n");
      out.write("\t\t<table style=\"border:2px dashed red\" align=\"center\">\r\n");
      out.write("\t\t<td></br></td>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><b><font size=\"3\">&nbsp;&nbsp;msg : </font></b><input type=\"text\" style=\"width: 150px\" style=\"height:20px\" name=\"userid\" id=\"userid\" \r\n");
      out.write("\t\t\t\tvalue=\"");
      out.print((String)session.getAttribute("userid") );
      out.write("님 환영합니다.\" readonly></input></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t\t<td><input type=\"image\" src = \"/GBKing/images/btn_logout.gif\"  onclick=\"goLogout()\"></input></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t<td></br></td>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
      out.write("\t");

		}
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");

		String loginConfirm=(String)request.getAttribute("loginConfirm");
		
		if(loginConfirm==null)
		{
			loginConfirm="";
		}
		
		if(loginConfirm=="fail")
		{

		
      out.write("\r\n");
      out.write("\t\t\t   <script>\r\n");
      out.write("                  alert('아이디 또는 비밀번호를 다시 확인하세요. 등록되지 않은 아이디이거나, 아이디 또는 비밀번호를 잘못 입력하셨습니다.');\r\n");
      out.write("               </script>\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t");

		}
		
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t<div class=\"wrapper content\">\r\n");
      out.write("\t\t<div id=left>\r\n");
      out.write("\t\t");
 
		String leftMenu = "예약하기";
		
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<section id=\"sidebar\" class=\"parented\">\r\n");
      out.write("\t\t\t<p class=\"intro\" align=\"justify\">GBKing에 오신걸 환영합니다.\r\n");
      out.write("\t\t\t</br>원하시는 날짜, 시간, 방번호를 선택하시면 예약이 완료 됩니다. 예약 후 예약확인에서 예약목록을 확인할 수 있습니다.\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<nav>\r\n");
      out.write("\t\t\t\t<ul id=\"sidenav\" class=\"NanumPen\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/GBKing/reserve/reserve.do\" \r\n");
      out.write("\t\t\t\t\t\t\t");
if(leftMenu.equals("예약하기")){
							
      out.write("class=\"active\"\t\r\n");
      out.write("\t\t\t\t\t\t\t");
}
							
      out.write(">예약하기</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/GBKing/reserve/reserveConfirm.do\"\r\n");
      out.write("\t\t\t\t\t\t\t");
if(leftMenu.equals("예약확인")){
							
      out.write("class=\"active\"\t\r\n");
      out.write("\t\t\t\t\t\t\t");
}
							
      out.write(">예약확인</a></li>\r\n");
      out.write("\t\t\t\t\t");
if(userid.equals("master"))
					{
					
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/GBKing/reserve/reserveList.do\"\r\n");
      out.write("\t\t\t\t\t\t\t");
if(leftMenu.equals("예약관리자")){
							
      out.write("class=\"active\"\t\r\n");
      out.write("\t\t\t\t\t\t\t");
}
							
      out.write(">예약관리자</a></li>\r\n");
      out.write("\t\t\t\t\t");

					}
					
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t</section>");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<section id=\"main\">\r\n");
      out.write("\t\t</br>\r\n");
      out.write("\t\t<h3><font size=\"5\">예약 하기</font></h3>\r\n");
      out.write("\t\t</br>\r\n");
      out.write("\t\t\t<div id=\"wrap\" style=\"width: 930px; margin: auto;\">\r\n");
      out.write("\t\t\t\t<div id=\"header\" style=\"hight: 50px;\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"main\" style=\"margin-top: 10px;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=left_main\r\n");
      out.write("\t\t\t\t\t\t\" style=\"width: 520px; background: gray; margin-right: 10px; float: left;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<table border='1' width='519' celpadding='0' cellspacing='0'>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width='150' align='right' valign='middle'><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"#none\" onclick=\"goRight()\"><font size=\"1\">Previous\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tMonth</font></a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width='260' align='center' valign='middle'><b>");
      out.print(getDateName(cal.get(cal.MONTH)) + " " + cal.get(cal.YEAR));
      out.write("</b></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width='173' align='left' valign='middle'><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"#none\" onclick=\"goLeft()\"><font size=\"1\">Next\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tMonth</font></a></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t<table border=\"0\" width=\"520\" bordercolorlight=\"#C0C0C0\"\r\n");
      out.write("\t\t\t\t\t\t\tbordercolordark=\"#808080\" style=\"border-collapse: collapse\"\r\n");
      out.write("\t\t\t\t\t\t\tbordercolor=\"#111111\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<table border=\"2\" width=\"519\" bordercolorlight=\"#C0C0C0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tbordercolordark=\"#000000\" style=\"border-collapse: collapse\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tbordercolor=\"#000000\" cellpadding=\"0\" cellspacing=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tbgcolor=\"#DFDCD8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"");
      out.print(boxSize);
      out.write("\" align=\"center\" nowrap\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tbordercolor=\"#666666\" bgcolor=\"#666666\"><font\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcolor=\"#FFFFFF\"><b>Sun</b></font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"");
      out.print(boxSize);
      out.write("\" align=\"center\" nowrap\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tbordercolor=\"#666666\" bgcolor=\"#666666\"><font\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcolor=\"#FFFFFF\"><b>Mon</b></font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"");
      out.print(boxSize);
      out.write("\" align=\"center\" nowrap\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tbordercolor=\"#666666\" bgcolor=\"#666666\"><font\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcolor=\"#FFFFFF\"><b>Tues</b></font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"");
      out.print(boxSize);
      out.write("\" align=\"center\" nowrap\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tbordercolor=\"#666666\" bgcolor=\"#666666\"><font\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcolor=\"#FFFFFF\"><b>Wed</b></font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"");
      out.print(boxSize);
      out.write("\" align=\"center\" nowrap\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tbordercolor=\"#666666\" bgcolor=\"#666666\"><font\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcolor=\"#FFFFFF\"><b>Thurs</b></font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"");
      out.print(boxSize);
      out.write("\" align=\"center\" nowrap\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tbordercolor=\"#666666\" bgcolor=\"#666666\"><font\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcolor=\"#FFFFFF\"><b>Fri</b></font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"");
      out.print(boxSize);
      out.write("\" align=\"center\" nowrap\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tbordercolor=\"#666666\" bgcolor=\"#666666\"><font\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcolor=\"#FFFFFF\"><b>Sat</b></font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										//'Calendar loop

															String todayColor;
															int count = 1;
															int dispDay = 1;
															
															for (int w = 1; w < 7; w++) {
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

											for (int d = 1; d < 8; d++) {
																			if (!(count >= cal.get(c.DAY_OF_WEEK))) {
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"");
      out.print(boxSize);
      out.write("\" height=\"");
      out.print(boxSize);
      out.write("\" valign=\"top\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\talign=\"left\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

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
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"");
      out.print(todayColor);
      out.write("\" width=\"");
      out.print(boxSize);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\talign=\"left\" height=\"");
      out.print(boxSize);
      out.write("\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");

												if (((10000*cal.get(cal.YEAR)+100*cal.get(cal.MONTH)+dispDay)-
																			(10000*c.get(c.YEAR)+100*c.get(c.MONTH)+c.get(c.DAY_OF_MONTH)))>=0) // Here we check to see if the current day is today
																		{
											
      out.write(" <a href=\"#none\" onclick=\"roomView('");
      out.print(dispDay);
      out.write("')\">");
      out.print(dispDay);
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

											} else {
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      out.print(dispDay);
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

											}
										
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

											count += 1;
																	dispDay += 1;

																				} else {
										
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"");
      out.print(boxSize);
      out.write("\" align=\"left\" height=\"");
      out.print(boxSize);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvalign=\"top\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

											}
																			}

																		}
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										}
									
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=right_main style=\"width: 400px; float: left;\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");

							if ((Integer) (request.getAttribute("viewMode")) == 1 || (Integer) (request.getAttribute("viewMode")) == 2) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(currYear);
      out.write("년\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(currMonth+1);
      out.write("월\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(currDay);
      out.write("일 </br>\r\n");
      out.write("\t\t\t\t\t\t</br>방을 선택 하시오.\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div style=\"width: 400px; background: #6C7EAA;\">\r\n");
      out.write("\t\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><a href=\"#none\" onclick=\"timeView('1')\">1번방&nbsp&nbsp</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><a href=\"#none\" onclick=\"timeView('2')\">2번방&nbsp&nbsp</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><a href=\"#none\" onclick=\"timeView('3')\">3번방&nbsp&nbsp</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><a href=\"#none\" onclick=\"timeView('4')\">4번방&nbsp&nbsp</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><a href=\"#none\" onclick=\"timeView('5')\">5번방&nbsp&nbsp</td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t");

							}
									if ((Integer) (request.getAttribute("viewMode")) == 2) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</br>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"m\" href=\"/GBKing/images/roomNum");
      out.print(roomNum);
      out.write(".jpg\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"/GBKing/images/roomNum");
      out.print(roomNum);
      out.write(".jpg\" width=\"300\" height=\"150\"/>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</br>시간을 선택 하시오.\r\n");
      out.write("\t\t\t\t\t\t<div style=\"width: 400px; margin-top: 10px; background: #6C7EAA;\">\r\n");
      out.write("\t\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

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
									
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><a href=\"#none\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"timeReserve(''+");
      out.print(9+k*2);
      out.write("+':00')\">");
      out.print(9+k*2);
      out.write(":00&nbsp&nbsp</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										}
															
														
															if(a[0]==1 && a[1]==1 && a[2]==1 && a[3]==1 && a[4]==1 && a[5]==1)
															{
									
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>예약 가능한 시간이 없습니다.</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										}
									
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t");

							}
						
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t\t\t\t<div id=\"flooter\" style=\"hight: 50px; margin-top: 10px;\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<section id=\"copyright\">\r\n");
      out.write("\t\t<div class=\"wrapper\">\r\n");
      out.write("\t\t\t<p>&#169; Copyright 2013 Keith Homemade Cakes</p>\r\n");
      out.write("\t\t\t<p id=\"koodoz\"><a title=\"Web design Melbourne\"><strong>Web Design <span>Melbourne</span></strong></a></p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.js\"></script>\r\n");
      out.write("\t\t<script src=\"http://maps.google.com/maps/api/js?sensor=false\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<script>\r\n");
      out.write("//<![CDATA[\r\n");
      out.write("!window.jQuery && document.write(unescape('%3Cscript src=\"js/libs/jquery-1.4.2.min.js\"%3E%3C/script%3E'));\r\n");
      out.write("//]]>\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\t\t<script>SROOTPATH = '/'</script>\r\n");
      out.write("\t\t<script src=\"/GBKing/js/plugins.js\"></script>\r\n");
      out.write("\t\t<script src=\"/GBKing/js/init.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<script>\r\n");
      out.write("//<![CDATA[\r\n");
      out.write("var _gaq = [['_setAccount', 'UA-3019794-38'], ['_trackPageview']];\r\n");
      out.write("(function(d, t) {\r\n");
      out.write("var g = d.createElement(t),\r\n");
      out.write("    s = d.getElementsByTagName(t)[0];\r\n");
      out.write("g.async = true;\r\n");
      out.write("g.src = ('https:' == location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\r\n");
      out.write("s.parentNode.insertBefore(g, s);\r\n");
      out.write("})(document, 'script');\r\n");
      out.write("//]]>\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
