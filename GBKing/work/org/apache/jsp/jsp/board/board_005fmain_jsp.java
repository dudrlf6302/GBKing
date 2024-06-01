package org.apache.jsp.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.utility.*;
import com.utility.*;

public final class board_005fmain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/jsp/board/../../common/login.jsp");
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
      out.write("<!--[if (gt IE 9)|!(IE)]><!--><html lang=\"en\" class=\"no-js\" xmlns=\"http://www.w3.org/1999/xhtml\"><!--<![endif]-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<title>PCRoom</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/GBKing/css/style.css\" />\r\n");
      out.write("<script src=\"/GBKing/js/modernizr-1.6.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function goBoard()\r\n");
      out.write("{\r\n");
      out.write("\tvar frm = document.log_form;\r\n");
      out.write("\t\r\n");
      out.write("\tvar userid = '");
      out.print(session.getAttribute("userid"));
      out.write("';\r\n");
      out.write("\t\r\n");
      out.write("\tif(userid=='null')\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"로그인 해주세요.\");\r\n");
      out.write("\t\tfrm.userid.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tlocation.href=\"/GBKing/board/list.do\";\r\n");
      out.write("}\r\n");
      out.write("function goReservation()\r\n");
      out.write("{\r\n");
      out.write("\tvar frm = document.log_form;\r\n");
      out.write("\t\r\n");
      out.write("\tvar userid = '");
      out.print(session.getAttribute("userid"));
      out.write("';\r\n");
      out.write("\t\r\n");
      out.write("\tif(userid=='null')\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"로그인 해주세요.\");\r\n");
      out.write("\t\tfrm.userid.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tlocation.href=\"/GBKing/pcroom/pcroom.jsp\";\r\n");
      out.write("}\r\n");
      out.write("function goOrder()\r\n");
      out.write("{\r\n");
      out.write("\tvar frm = document.log_form;\r\n");
      out.write("\t\r\n");
      out.write("\tvar userid = '");
      out.print(session.getAttribute("userid"));
      out.write("';\r\n");
      out.write("\t\r\n");
      out.write("\tif(userid=='null')\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"로그인 해주세요.\");\r\n");
      out.write("\t\tfrm.userid.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tlocation.href=\"/GBKing/menu/list_drink.do\";\r\n");
      out.write("}\r\n");
      out.write("function goQnA()\r\n");
      out.write("{\r\n");
      out.write("\tvar frm = document.log_form;\r\n");
      out.write("\t\r\n");
      out.write("\tvar userid = '");
      out.print(session.getAttribute("userid"));
      out.write("';\r\n");
      out.write("\t\r\n");
      out.write("\tif(userid=='null')\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"로그인 해주세요.\");\r\n");
      out.write("\t\tfrm.userid.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tlocation.href=\"/GBKing/qna/qna.do\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form name =\"form\" method = \"post\" >\r\n");
      out.write("\t<input type=\"hidden\" name=\"type\">\r\n");
      out.write("</form>\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body id=\"home\">\r\n");
      out.write("\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<div class=\"wrapper\">\r\n");
      out.write("\t\t<h1><a href=\"/GBKing/board/main.do\" title=\"Go back to the homepage\" class=\"img\">GBKing</a></h1>\r\n");
      out.write("\t\t<nav>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li id=\"m-home\"><a href=\"/GBKing/board/main.do\" class=\"img active\">Home</a></li>\t\t\r\n");
      out.write("\t\t\t\t<li id=\"m-about\"><a href=\"#none\" onclick=\"goBoard()\" class=\"img\">Board</a></li>\r\n");
      out.write("\t\t\t\t<li id=\"m-range\"><a href=\"#none\" onclick=\"goReservation()\" class=\"img\">Seat</a></li>\r\n");
      out.write("\t\t\t\t<li id=\"m-catering\"><a href=\"#none\" onclick=\"goOrder()\" class=\"img\">Order</a></li>\r\n");
      out.write("\t\t\t\t<li id=\"m-contact\"><a href=\"#none\" onclick=\"goQnA()\" class=\"img\">Q&A</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"wrapper content\">\r\n");
      out.write("\t\t\t\t<section id=\"hilite\" class=\"hilite-extra\" style=\"background-image: url(/GBKing/images/main.gif);\">\r\n");
      out.write("\t\t\t\t</section>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /.wrapper -->\r\n");
      out.write("\t<p id=right_login>\r\n");
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
      out.write("\t</p>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"wrapper scr\">\r\n");
      out.write("\t\t<section id=\"scrollers\">\r\n");
      out.write("\t\t\t<ul class=\"NanumPen\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"celebration\" href=\"#none\">커피</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"childrens\" href=\"#none\">바닐라라떼</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"dessert\" href=\"#none\">케이크</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"savouries\" href=\"#none\">와플</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"health-cakes\" href=\"#none\">컵케이크</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"cupcakes\" href=\"#none\">미니케이크</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"treats\" href=\"#none\">스무디</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"catering\" href=\"#none\">샌드위치</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<section id=\"intro\">\r\n");
      out.write("\t\t\t<div id=\"history\">\r\n");
      out.write("\t\t\t\t<h3 class=\"alt\"><font size=\"3\">PCRoom에 오신걸 환영합니다.</font></h3>\r\n");
      out.write("\t\t\t\t<p>인터넷 카페 PCRoom에 오신걸 환영합니다.</br> PCRoom에는 최신 게임, 화려한 그래픽, 고사양 PC로 손님들을 맞이 하고 있습니다. 또한 커피와 함께 디저트도 준비되어 있습니다. \r\n");
      out.write("\t\t\t\t   현재 웹 사이트에서 음료,디저트 주문 뿐 아니라 PC방 자리가 있는지 볼 수 있습니다.  <b>회원가입 후 이용해보세요.</b>\r\n");
      out.write("\t\t\t\t  <a href=\"#none\" class=\"NanumPen\"><span>&#62;</span> PCRoom 추천해주세요!&#8230;</a></p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<a href=\"#none\">\r\n");
      out.write("\t\t\t\t<div id=\"catering\" class=\"r\">\r\n");
      out.write("\t\t\t\t\t<h4 class=\"alt\"><font size=\"4\"><b>오늘의 추천메뉴!</b></font></h4>\r\n");
      out.write("\t\t\t\t\t<p>[웰빙 샌드위치] </br> 고소한 페이스트리빵에 타르타르 소스와 햄, 양상추, 토마토, 피클 등이 어우러져 감칠맛나는 인기만점 샌드위치 입니다.</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t</div><!-- /.wrapper -->\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<footer class=\"home\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"wrapper separator\">\r\n");
      out.write("\r\n");
      out.write("\t\t<h3>PCRoom 이용안내</h3>\r\n");
      out.write("\t\t<p>open시간 및 PCRoom 상세주소 안내</p></br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<section id=\"hours\">\r\n");
      out.write("\r\n");
      out.write("\t\t<h4 class=\"NanumPen\">Open&#8230;</h4>\r\n");
      out.write("\r\n");
      out.write("\t\t<ul class=\"vevent\">\r\n");
      out.write("\t\t\t<li><abbr title=\"Opening hours for Monday\" class=\"summary\">Mon:</abbr> <time class=\"dtstart\" title=\"2013-10-28T06:00:00\" datetime=\"2013-10-28T06:00:00\">6:00am</time> &#8211; <time class=\"dtend\" title=\"2013-10-28T17:30:00\" datetime=\"2013-10-28T17:30:00\">24:00pm</time></li>\r\n");
      out.write("\t\t\t<li><abbr title=\"Opening hours for Tuesday\" class=\"summary\">Tue:</abbr> <time class=\"dtstart\" title=\"2013-10-29T06:00:00\" datetime=\"2013-10-29T06:00:00\">6:00am</time> &#8211; <time class=\"dtend\" title=\"2013-10-29T17:30:00\" datetime=\"2013-10-29T17:30:00\">24:00pm</time></li>\r\n");
      out.write("\t\t\t<li><abbr title=\"Opening hours for Wednesday\" class=\"summary\">Wed:</abbr> <time class=\"dtstart\" title=\"2013-10-30T06:00:00\" datetime=\"2013-10-30T06:00:00\">6:00am</time> &#8211; <time class=\"dtend\" title=\"2013-10-30T17:30:00\" datetime=\"2013-10-30T17:30:00\">24:00pm</time></li>\r\n");
      out.write("\t\t\t<li><abbr title=\"Opening hours for Thursday\" class=\"summary\">Thu:</abbr> <time class=\"dtstart\" title=\"2013-10-31T06:00:00\" datetime=\"2013-10-31T06:00:00\">6:00am</time> &#8211; <time class=\"dtend\" title=\"2013-10-31T17:30:00\" datetime=\"2013-10-31T17:30:00\">24:00pm</time></li>\r\n");
      out.write("\t\t\t<li><abbr title=\"Opening hours for Friday\" class=\"summary\">Fri:</abbr> <time class=\"dtstart\" title=\"2013-10-25T06:00:00\" datetime=\"2013-10-25T06:00:00\">6:00am</time> &#8211; <time class=\"dtend\" title=\"2013-10-25T17:30:00\" datetime=\"2013-10-25T17:30:00\">24:00pm</time></li>\r\n");
      out.write("\t\t\t<li><abbr title=\"Opening hours for Saturday\" class=\"summary\">Sat:</abbr> <time class=\"dtstart\" title=\"2013-10-26T06:00:00\" datetime=\"2013-10-26T06:00:00\">6:00am</time> &#8211; <time class=\"dtend\" title=\"2013-10-26T14:30:00\" datetime=\"2013-10-26T14:30:00\">24:00pm</time></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"vcard\">\r\n");
      out.write("\t\t\t<h4 class=\"NanumPen\"><a>Contact <span class=\"fn org\">PCRoom</span></a></h4>\r\n");
      out.write("\t\t\t<p class=\"tel\">010-1111-2222</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"adr\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<span class=\"street-address\">대전 광역시 유성구</span><br />\r\n");
      out.write("\t\t\t\t\t<span class=\"locality\"> 덕명동</span> <span class=\"region\">16-1</span> <span class=\"postal-code\">한밭대학교</span>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<p><span class=\"tel\"><span class=\"type\">P<span class=\"d\">ax</span></span>: <span class=\"value\">(042) 123 - 4567</span></span></p>\r\n");
      out.write("\t\t\t<p2 class=\"e\">E<span class=\"d\">mail</span>: <span class=\"value\">hanbat@hanbat.ac.kr</span></p2>\r\n");
      out.write("\t\t</div><!-- /.vcard -->\r\n");
      out.write("\r\n");
      out.write("\t</div><!-- /.wrapper.separator -->\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<section id=\"copyright\">\r\n");
      out.write("\t\t<div class=\"wrapper\">\r\n");
      out.write("\t\t\t<p>&#169; Copyright 2013 GBKing</p>\r\n");
      out.write("\t\t\t<p id=\"koodoz\"><a href=\"http://www.koodoz.com.au\" title=\"Web design Melbourne\"><strong>Web Design <span>Melbourne</span></strong></a> &amp; <a href=\"http://www.koodoz.com.au/services/internet-marketing/\" title=\"SEO Melbourne\"><strong>SEO <span>Melbourne</span></strong></a> by Koodoz Design</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\r\n");
      out.write("\t</footer>\r\n");
      out.write("\r\n");
      out.write("<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.js\"></script>\r\n");
      out.write("<script src=\"http://maps.google.com/maps/api/js?sensor=false\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("//<![CDATA[\r\n");
      out.write("!window.jQuery && document.write(unescape('%3Cscript src=\"js/libs/jquery-1.4.2.min.js\"%3E%3C/script%3E'));\r\n");
      out.write("//]]>\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>SROOTPATH = '/GBKing/'</script>\r\n");
      out.write("<script src=\"/GBKing/js/plugins.js\"></script>\r\n");
      out.write("<script src=\"/GBKing/js/init.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
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
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\t\r\n");
      out.write("</html>\r\n");
      out.write("\t\t");
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
