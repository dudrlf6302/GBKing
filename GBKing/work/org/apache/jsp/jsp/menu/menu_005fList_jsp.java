package org.apache.jsp.jsp.menu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.hanbat.menu.dto.*;
import java.util.*;
import com.utility.*;

public final class menu_005fList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/jsp/menu/../../common/header.jsp");
    _jspx_dependants.add("/jsp/menu/../../common/login.jsp");
    _jspx_dependants.add("/jsp/menu/../../common/menu_left.jsp");
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
      out.write("<link rel=\"stylesheet\" href=\"/GBKing/css/list_style.css\" />\r\n");
      out.write("<script src=\"/GBKing/js/modernizr-1.6.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function goCancel(order_num)\r\n");
      out.write("{\r\n");
      out.write("\talert(\"취소되었습니다.\");\r\n");
      out.write("\tvar frm = document.form;\r\n");
      out.write("\tfrm.order_num.value = order_num;\r\n");
      out.write("\tfrm.action = \"/GBKing/menu/menu_Cancel.do\";\r\n");
      out.write("\tfrm.submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function goSearch()\r\n");
      out.write("{\r\n");
      out.write("\tvar frm = document.form;\r\n");
      out.write("\tfrm.action = \"/GBKing/menu/menu_Confirm.do\";\r\n");
      out.write("\tfrm.submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");

	String searchKey = (String) request.getAttribute("searchKey");
	String searchWord = (String) request.getAttribute("searchWord");

	if (searchKey == null)
		searchKey = "";
	if (searchWord == null)
		searchWord = "";

	String userid = (String) session.getAttribute("userid");
	ArrayList<BuyDto> list = (ArrayList<BuyDto>) request.getAttribute("list");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body id=\"menu_Confirm\">\r\n");
      out.write("\r\n");
      out.write("\t<header>\r\n");
      out.write("\t");
 
	String headerMenu = "Order";
	
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
      out.write("\t<div class=\"wrapper content\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
 
		String leftMenu = "alllist";
		int menuMode=0;
		
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=left>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<section id=\"sidebar\">\r\n");
      out.write("\t\t\t<p class=\"intro\" align=\"justify\">GBKing에 오신걸 환영합니다.\r\n");
      out.write("\t\t\t</br>원하시는 음료와 개수를 입력하시고 주문버튼을 클릭하시면 주문이 완료됩니다. </br>다양한 디저트도 준비되어 있으니 많은 이용 부탁드립니다.\r\n");
      out.write("\t\t\t주문 후 주문확인에서 확인을 꼭 해주세요.\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<nav>\r\n");
      out.write("\t\t\t\t<ul id=\"sidenav\" class=\"NanumPen\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/GBKing/menu/list_drink.do\" \r\n");
      out.write("\t\t\t\t\t\t\t");
if(leftMenu.equals("list") && menuMode==1){
							
      out.write("class=\"active\"\t\r\n");
      out.write("\t\t\t\t\t\t\t");
}
							
      out.write(">음료</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/GBKing/menu/list_food.do\" \r\n");
      out.write("\t\t\t\t\t\t\t");
if(leftMenu.equals("list") && menuMode==2){
							
      out.write("class=\"active\"\t\r\n");
      out.write("\t\t\t\t\t\t\t");
}
							
      out.write(">디저트</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/GBKing/menu/menu_Confirm.do\"\r\n");
      out.write("\t\t\t\t\t\t\t");
if(leftMenu.equals("Confirm")){
							
      out.write("class=\"active\"\r\n");
      out.write("\t\t\t\t\t\t\t");
}
							
      out.write(">주문확인</a></li>\r\n");
      out.write("\t\t\t\t\t");
if(userid.equals("master"))
					{
					
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/GBKing/menu/menu_List.do\"\r\n");
      out.write("\t\t\t\t\t\t\t");
if(leftMenu.equals("alllist")){
							
      out.write("class=\"active\"\r\n");
      out.write("\t\t\t\t\t\t\t");
}
							
      out.write(">주문관리자</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/GBKing/menu/write.do\"\r\n");
      out.write("\t\t\t\t\t\t\t");
if(leftMenu.equals("write")){
							
      out.write("class=\"active\"\r\n");
      out.write("\t\t\t\t\t\t\t");
}
							
      out.write(">상품등록</a></li>\r\n");
      out.write("\t\t\t\t\t");

					}
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"/GBKing/menu/list_food.do\" class=\"b\">\r\n");
      out.write("\t\t\t\t\t<h4 class=\"NanumPen\">추천메뉴</h4>\r\n");
      out.write("\t\t\t\t\t<p class=\"imgcat\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"/GBKing/images/catering-mini.png\" width=\"101\"\r\n");
      out.write("\t\t\t\t\t\t\theight=\"82\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t샌드위치 <br />맛있음\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t</section>");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t<section id=\"main\">\r\n");
      out.write("\t\t</br>\r\n");
      out.write("\t\t<h3><font size=\"5\">주문 관리자</font>&nbsp;&nbsp;&nbsp;환영합니다</h3>\r\n");
      out.write("\t\t</br>\r\n");
      out.write("\t\t\t<form name=\"form\" method=\"post\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"order_num\"> \r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"ID\" value=\"");
      out.print(userid);
      out.write("\">\r\n");
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
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\" ");
if (searchKey.equals("")) {
      out.write(" selected\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write(">전체</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\" ");
if (searchKey.equals("1")) {
      out.write(" selected\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write(">주문 번호</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select> <label for=\"keyword\" class=\"desc\">Keyword</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"text\" name=\"searchWord\" value=\"");
      out.print(searchWord);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"keyword\" size=\"30\" /> <span class=\"inbtn inputBtn\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"#none\" onclick=\"goSearch()\">검색</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<table border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"bdl\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"8%\">번호</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"10%\">아이디</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"13%\"><font color=\"#cc0d1c\">주문번호</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"*%\">메뉴 이름</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"8%\">수량</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"10%\">가격</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"10%\">총 가격</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"15%\">구매일</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"8%\">취소</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");

								if (list.size() > 0) {
														for (int i = 0; i < list.size(); i++) {
															BuyDto dto = list.get(i);

															int seq = dto.getSeq();
															int order_num = dto.getOrder_num();
															int price = dto.getPrice();
															int total_pirce = dto.getTotal_price();
															int count = dto.getCount();
															String ID = dto.getUserid();
															String menu_name = dto.getMenu_name();
															String wdate = dto.getWdate();

							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(seq);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(ID);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><font color=\"#cc0d1c\">");
      out.print(order_num);
      out.write("</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(menu_name);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(count);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(price);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(total_pirce);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(wdate);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><a href=\"#none\" onclick=\"goCancel(");
      out.print(order_num);
      out.write(")\">취소</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t");

								
												}
													} else {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"9\">예약정보가 없습니다.</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<section id=\"copyright\">\r\n");
      out.write("\t\t<div class=\"wrapper\">\r\n");
      out.write("\t\t\t<p>&#169; Copyright 2013 Keith Homemade Cakes</p>\r\n");
      out.write("\t\t\t<p id=\"koodoz\"><a title=\"Web design Melbourne\"><strong>Web Design <span>Melbourne</span></strong></a></p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t\t\r\n");
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
