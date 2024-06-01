package org.apache.jsp.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.utility.*;
import com.hanbat.board.dto.*;
import com.utility.*;

public final class board_005fview_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
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
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<title>GBKing</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/GBKing/css/style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/GBKing/css/list_style.css\" />\r\n");
      out.write("<script src=\"/GBKing/js/modernizr-1.6.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");

	BoardDto dto = (BoardDto) request.getAttribute("dto");
	String seq = (String) request.getAttribute("seq");
	String type = (String) request.getAttribute("type");

	String writer = (String) session.getAttribute("userid");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function goWrite()\r\n");
      out.write("{\r\n");
      out.write("\tvar frm = document.form;\r\n");
      out.write("\tfrm.action=\"/");
      out.print(CommonUtil.commonURL);
      out.write("/board/write.do\";\r\n");
      out.write("\tfrm.mode.value=\"modify\";\t\r\n");
      out.write("\tfrm.type.value=\"");
      out.print(dto.getType());
      out.write("\";\r\n");
      out.write("\tfrm.target=\"_self\"; //내창으로 \r\n");
      out.write("\tfrm.submit();\r\n");
      out.write("}\r\n");
      out.write("function goDelete()\r\n");
      out.write("{\r\n");
      out.write("\tvar frm = document.form;\t\r\n");
      out.write("\tfrm.action=\"/");
      out.print(CommonUtil.commonURL);
      out.write("/board/del.do\";\r\n");
      out.write("\t\r\n");
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
      out.write("function goReply()\r\n");
      out.write("{\r\n");
      out.write("\tvar frm = document.form;\r\n");
      out.write("\tfrm.action=\"/");
      out.print(CommonUtil.commonURL);
      out.write("/board/reply.do\";\r\n");
      out.write("\tfrm.mode.value=\"reply\";\t\r\n");
      out.write("\tfrm.type.value=\"");
      out.print(dto.getType());
      out.write("\";\r\n");
      out.write("\tfrm.target = \"_self\"; //내창으로 \r\n");
      out.write("\tfrm.submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body id=\"board\">\r\n");
      out.write("\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t");

			String headerMenu ="Board";
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t");
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
      out.write("\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
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
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<section id=\"main\">\r\n");
      out.write("\t\t\t</br>\r\n");
      out.write("\t\t\t<h3>\r\n");
      out.write("\t\t\t\t<font size=\"5\">게시글 보기</font>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t</br>\r\n");
      out.write("\t\t\t<form name=\"form\" method=\"post\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=searchWord> <input type=\"hidden\"\r\n");
      out.write("\t\t\t\t\tname=\"searchKey\"> <input type=\"hidden\" name=\"seq\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.print(seq);
      out.write("\"> <input type=\"hidden\" name=\"mode\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"type\" value=\"");
      out.print(dto.getType());
      out.write("\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"group_id\" value=\"");
      out.print(dto.getGroup_id());
      out.write("\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"group_depth\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.print(dto.getGroup_depth());
      out.write("\"> <input type=\"hidden\"\r\n");
      out.write("\t\t\t\t\tname=\"group_seq\" value=\"");
      out.print(dto.getGroup_seq());
      out.write("\">\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- quickArea S -->\r\n");
      out.write("\t\t\t<div id=\"quickArea\">\r\n");
      out.write("\t\t\t\t<hr />\r\n");
      out.write("\t\t\t\t<!-- contentArea S -->\r\n");
      out.write("\t\t\t\t<div id=\"contentArea\">\r\n");
      out.write("\t\t\t\t\t<hr />\r\n");
      out.write("\t\t\t\t\t<!-- content S -->\r\n");
      out.write("\t\t\t\t\t<div id=\"content\" class=\"CTdef\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"bvhd dbline\">\r\n");
      out.write("\t\t\t\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t\t\t\t<dt class=\"subject\">제목</dt>\r\n");
      out.write("\t\t\t\t\t\t\t\t<dd class=\"subject\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t<dt class=\"date\">작성일</dt>\r\n");
      out.write("\t\t\t\t\t\t\t\t<dd class=\"date\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fout_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t<dt class=\"country\">작성자</dt>\r\n");
      out.write("\t\t\t\t\t\t\t\t<dd class=\"country\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fout_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t<dt class=\"hits\">조회</dt>\r\n");
      out.write("\t\t\t\t\t\t\t\t<dd class=\"hits\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fout_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"bvc\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									out.println(dto.getContents());
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- bbs view content E -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- bbs footer S -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"bftv\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bb\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"sbb\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\" onclick=\"goBoard('");
      out.print(dto.getType());
      out.write("')\">목록</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										if (type.equals("1") || type.equals("2")	) {
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#none\" onclick=\"goReply()\">답글</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										}
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										if (writer.equals(dto.getWriter()) || writer.equals("master")	) {
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#none\" onclick=\"return goWrite()\">수정</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#none\" onclick=\"return goDelete()\">삭제</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										}
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- slide_top S -->\r\n");
      out.write("\t\t\t\t\t\t<div id=\"slide_top\">\r\n");
      out.write("\t\t\t\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t\t\t\timgRollover('slide_top');\r\n");
      out.write("\t\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- slide_top E -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- quickArea E -->\r\n");
      out.write("\t\t</section>\r\n");
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
      out.write("\t\t</script></html>\r\n");
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
    // /jsp/board/board_view.jsp(123,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.title}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent(null);
    // /jsp/board/board_view.jsp(127,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.wdate}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f2.setParent(null);
    // /jsp/board/board_view.jsp(131,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.writer}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f3.setParent(null);
    // /jsp/board/board_view.jsp(135,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.hit}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
    if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
    return false;
  }
}
