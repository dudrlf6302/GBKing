package org.apache.jsp.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hanbat.board.*;
import com.hanbat.base.util.*;
import java.util.*;
import com.utility.*;
import com.utility.*;

public final class board_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/jsp/board/../../common/header.jsp");
    _jspx_dependants.add("/jsp/board/../../common/login.jsp");
    _jspx_dependants.add("/jsp/board/../../common/board_left.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<title>GBKing</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/GBKing/css/style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/GBKing/css/list_style.css\" />\r\n");
      out.write("<script src=\"/GBKing/js/modernizr-1.6.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function goView(seq)\r\n");
      out.write("{\t\r\n");
      out.write("\t\r\n");
      out.write("\tvar frm = document.form;\r\n");
      out.write("\tfrm.action=\"/");
      out.print(CommonUtil.commonURL);
      out.write("/board/view.do\";\r\n");
      out.write("\tfrm.seq.value=seq;\r\n");
      out.write("\tfrm.type.value=\"");
      out.print(type);
      out.write("\";\r\n");
      out.write("\tfrm.target=\"_self\"; //내창으로 \r\n");
      out.write("\tfrm.submit();\r\n");
      out.write("}\r\n");
      out.write("function goSearch()\r\n");
      out.write("{\t\r\n");
      out.write("\tvar frm = document.form;\r\n");
      out.write("\tfrm.action=\"/");
      out.print(CommonUtil.commonURL);
      out.write("/board/list.do\";\r\n");
      out.write("\tfrm.target=\"_self\"; //내창으로 \r\n");
      out.write("\tfrm.submit();\r\n");
      out.write("}\r\n");
      out.write("function goWrite()\r\n");
      out.write("{\r\n");
      out.write("\tvar frm = document.form;\r\n");
      out.write("\tfrm.action=\"/");
      out.print(CommonUtil.commonURL);
      out.write("/board/write.do\";\r\n");
      out.write("\tfrm.mode.value=\"insert\";\r\n");
      out.write("\tfrm.type.value=\"");
      out.print(type);
      out.write("\";\r\n");
      out.write("\tfrm.target=\"_self\"; //내창으로 \r\n");
      out.write("\tfrm.submit();\r\n");
      out.write("}\r\n");
      out.write("function goBoard(type)\r\n");
      out.write("{\r\n");
      out.write("\tvar frm = document.form;\r\n");
      out.write("\tfrm.action=\"/");
      out.print(CommonUtil.commonURL);
      out.write("/board/list.do\";\r\n");
      out.write("\tfrm.type.value=type;\r\n");
      out.write("\tfrm.target=\"_self\"; \t//내창으로 \r\n");
      out.write("\tfrm.submit();\r\n");
      out.write("}\r\n");
      out.write("function goPage(pg)\r\n");
      out.write("{\r\n");
      out.write("\tvar frm = document.form;\r\n");
      out.write("\tfrm.action=\"/");
      out.print(CommonUtil.commonURL);
      out.write("/board/list.do\";\r\n");
      out.write("\tfrm.pg.value = pg;\r\n");
      out.write("\tfrm.target = \"_self\"; //내창으로 \r\n");
      out.write("\tfrm.submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body id=\"board\">\r\n");
      out.write("\r\n");
      out.write("\t<header>\r\n");
      out.write("\t");
 
	String headerMenu = "Board";
	
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
      out.write("\t\t\t<li id=\"m-range\"><a href=\"/GBKing/pcroom/pcroom.jsp\";\r\n");
      out.write("\t\t\t\t\t\t\t");
if(headerMenu.equals("Reservation")){
							
      out.write("class=\"img active\"\t\r\n");
      out.write("\t\t\t\t\t\t\t");
}
							else{
							
      out.write("class=\"img\"");

							}
      out.write(">Seat</a></li>\r\n");
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
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<!-- /.wrapper -->\r\n");
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
      out.write("\r\n");
      out.write("\t<div class=\"wrapper content\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=left>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<section id=\"sidebar\" class=\"parented\">\r\n");
      out.write("\t\t\t<p class=\"intro\" align=\"justify\">GBKing에 오신걸 환영합니다.\r\n");
      out.write("\t\t\t</br>일반 회원님들은 자유게시판 , 리뷰게시판에서 글 작성이 가능합니다. 다양한 이벤트와 공지는 공지사항 게시판을 참고해주세요.\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<nav>\r\n");
      out.write("\t\t\t\t<ul id=\"sidenav\" class=\"NanumPen\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#none\" onclick=\"return goBoard('0')\"\r\n");
      out.write("\t\t\t\t\t\t\t");
if(type.equals("0")){
							
      out.write("class=\"active\"\t\r\n");
      out.write("\t\t\t\t\t\t\t");
}
							
      out.write(">공지사항</a></li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#none\" onclick=\"return goBoard('1')\"\r\n");
      out.write("\t\t\t\t\t\t\t");
if(type.equals("1")){
							
      out.write("class=\"active\"\t\r\n");
      out.write("\t\t\t\t\t\t\t");
}
							
      out.write(">자유게시판</a></li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#none\" onclick=\"return goBoard('2')\"\r\n");
      out.write("\t\t\t\t\t\t\t");
if(type.equals("2")){
							
      out.write("class=\"active\"\t\r\n");
      out.write("\t\t\t\t\t\t\t");
}
							
      out.write(">Review</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("</section>");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\t<section id=\"main\">\r\n");
      out.write("\t\t\t</br>\r\n");
      out.write("\t\t\t<h3>\r\n");
      out.write("\t\t\t\t<font size=\"5\">게시판</font>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t</br>\r\n");
      out.write("\t\t\t<form name=\"form\" method=\"post\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"mode\"> <input type=\"hidden\"\r\n");
      out.write("\t\t\t\t\tname=\"seq\"> <input type=\"hidden\" name=\"type\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.print(type);
      out.write("\"> <input type=\"hidden\" name=\"pg\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- quickArea S -->\r\n");
      out.write("\t\t\t\t<div id=\"quickArea\">\r\n");
      out.write("\t\t\t\t\t<!-- contentArea S -->\r\n");
      out.write("\t\t\t\t\t<div id=\"contentArea\">\r\n");
      out.write("\t\t\t\t\t\t<!-- bbs search S -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"bs\">\r\n");
      out.write("\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"target\" class=\"desc\">Target</label> <select\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"searchKey\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\" ");
if (searchKey.equals("1")) {
      out.write(" selected\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write(">제목</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\" ");
if (searchKey.equals("2")) {
      out.write(" selected\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write(">본문</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"3\" ");
if (searchKey.equals("3")) {
      out.write(" selected\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write(">제목+본문</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"4\" ");
if (searchKey.equals("4")) {
      out.write(" selected\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write(">작성자</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select> <label for=\"keyword\" class=\"desc\">Keyword</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"text\" name=\"searchWord\" value=\"");
      out.print(searchWord);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"keyword\" size=\"30\" /> <span class=\"inbtn inputBtn\"><input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"button\" value=\"검색\" onclick=\"goSearch()\" /></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- bbs search E -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- bbs header S -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"bhd\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"fl\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<strong>");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write(" 건</strong> 의 게시물이 있습니다.\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- bbs header E -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- location S -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- location E -->\r\n");
      out.write("\t\t\t\t\t\t<table cellspacing=\"0\" class=\"bdl\">\r\n");
      out.write("\t\t\t\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t<col width=\"7%\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<col width=\"*\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<col width=\"15%\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<col width=\"15%\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<col width=\"12%\" />\r\n");
      out.write("\t\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th scope=\"col\" class=\"first\">번호</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th scope=\"col\">제목</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th scope=\"col\">작성자</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th scope=\"col\">작성일</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th scope=\"col\" class=\"last\">조회</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- pagination S -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"pg\">\r\n");
      out.write("\t\t\t\t\t\t\t");

								int totalCount = (Integer) request.getAttribute("totalCount");
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(Pager.makeTag(request, 10, totalCount));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- pagination E -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
if(type.equals("1") ||type.equals("2") || userid.equals("master"))
							{
							
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"bb\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#none\" onclick=\"return goWrite()\">글쓰기</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- contentArea E -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- quickArea E -->\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<section id=\"copyright\">\r\n");
      out.write("\t\t\t<div class=\"wrapper\">\r\n");
      out.write("\t\t\t\t<p>&#169; Copyright 2013 Keith Homemade Cakes</p>\r\n");
      out.write("\t\t\t\t<p id=\"koodoz\">\r\n");
      out.write("\t\t\t\t\t<a title=\"Web design Melbourne\"><strong>Web Design <span>Melbourne</span></strong></a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.js\"></script>\r\n");
      out.write("\t\t<script src=\"http://maps.google.com/maps/api/js?sensor=false\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\t//<![CDATA[\r\n");
      out.write("\t\t\t!window.jQuery\r\n");
      out.write("\t\t\t\t\t&& document\r\n");
      out.write("\t\t\t\t\t\t\t.write(unescape('%3Cscript src=\"js/libs/jquery-1.4.2.min.js\"%3E%3C/script%3E'));\r\n");
      out.write("\t\t\t//]]>\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\tSROOTPATH = '/'\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<script src=\"/GBKing/js/plugins.js\"></script>\r\n");
      out.write("\t\t<script src=\"/GBKing/js/init.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\t//<![CDATA[\r\n");
      out.write("\t\t\tvar _gaq = [ [ '_setAccount', 'UA-3019794-38' ],\r\n");
      out.write("\t\t\t\t\t[ '_trackPageview' ] ];\r\n");
      out.write("\t\t\t(function(d, t) {\r\n");
      out.write("\t\t\t\tvar g = d.createElement(t), s = d.getElementsByTagName(t)[0];\r\n");
      out.write("\t\t\t\tg.async = true;\r\n");
      out.write("\t\t\t\tg.src = ('https:' == location.protocol ? 'https://ssl'\r\n");
      out.write("\t\t\t\t\t\t: 'http://www')\r\n");
      out.write("\t\t\t\t\t\t+ '.google-analytics.com/ga.js';\r\n");
      out.write("\t\t\t\ts.parentNode.insertBefore(g, s);\r\n");
      out.write("\t\t\t})(document, 'script');\r\n");
      out.write("\t\t\t//]]>\r\n");
      out.write("\t\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fout_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent(null);
    // /jsp/board/board_list.jsp(153,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totalCount}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /jsp/board/board_list.jsp(181,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("item");
    // /jsp/board/board_list.jsp(181,8) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td class=\"first\">");
          if (_jspx_meth_c_005fout_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td class=\"list\"><script>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tvar v = \"");
          if (_jspx_meth_c_005fout_005f2(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tfor (i = 1; i <= v; i++)\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\tdocument\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.write(\"&nbsp;&nbsp; re:\");\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</script> <a href=\"#none\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tonclick=\"goView('");
          if (_jspx_meth_c_005fout_005f3(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("')\"> ");
          if (_jspx_meth_c_005fout_005f4(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</a></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td>");
          if (_jspx_meth_c_005fout_005f5(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td>");
          if (_jspx_meth_c_005fout_005f6(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td class=\"last\">");
          if (_jspx_meth_c_005fout_005f7(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /jsp/board/board_list.jsp(183,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totalCount - item.num+1}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /jsp/board/board_list.jsp(186,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.group_depth}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /jsp/board/board_list.jsp(191,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.seq}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
    if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /jsp/board/board_list.jsp(191,61) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.title}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f4 = _jspx_th_c_005fout_005f4.doStartTag();
    if (_jspx_th_c_005fout_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /jsp/board/board_list.jsp(194,14) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.writer}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f5 = _jspx_th_c_005fout_005f5.doStartTag();
    if (_jspx_th_c_005fout_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /jsp/board/board_list.jsp(195,14) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.wdate}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f6 = _jspx_th_c_005fout_005f6.doStartTag();
    if (_jspx_th_c_005fout_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /jsp/board/board_list.jsp(196,27) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.hit}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f7 = _jspx_th_c_005fout_005f7.doStartTag();
    if (_jspx_th_c_005fout_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f7);
    return false;
  }
}
