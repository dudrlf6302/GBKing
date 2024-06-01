package org.apache.jsp.pcroom;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.hanbat.reserve.dto.*;
import java.util.*;
import java.sql.*;
import com.utility.*;

public final class pcroom_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/pcroom/../../common/header.jsp");
    _jspx_dependants.add("/pcroom/../../common/login.jsp");
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
      out.write("function goWrite(bunho)\r\n");
      out.write("{\r\n");
      out.write("\tvar frm = document.form;\t\r\n");
      out.write("\tfrm.action=\"pccheck.jsp?bunho=\"+bunho;\r\n");
      out.write("\tfrm.submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");

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

      out.write("\r\n");
      out.write("\r\n");

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<form name=\"form\" method=\"post\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"on_off\" value=\"");
      out.print(on_off );
      out.write("\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"bunho\">\r\n");
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
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<section id=\"main\">\r\n");
      out.write("\t\t</br>\r\n");
      out.write("\t\t<h3><font size=\"5\">자리 확인</font></h3>\r\n");
      out.write("\t\t</br>\r\n");
      out.write("\t\t\t<div id=\"wrap\" style=\"width: 930px; margin: auto;\">\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t");

			for(int i=1;i<=20;i++)
			{
			rs.next();
			int check_bunho = rs.getInt(1);
			int check_on_off = rs.getInt(2);					
			
			if (session.getAttribute("userid").equals("master")) {
		
				if(check_bunho==i && check_on_off==0) {	
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<a href=\"#none\" onclick=\"goWrite(");
      out.print(i);
      out.write(')');
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t");
}	else if(check_bunho==i && check_on_off==1){ 
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<a href=\"#none\" onclick=\"goWrite(");
      out.print(i);
      out.write(")\"><font color=\"#cf0ff1\"face=\"궁서체\">");
      out.print(i);
      out.write("</a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t");
}	//else if 종료	
					if(i%5==0)
					{
					
      out.write("\r\n");
      out.write("\t\t\t\t\t</br></br>\r\n");
      out.write("\t\t\t\t");
 	
					}
				} //master if문
				else
				{
					if(check_bunho==i && check_on_off==0) {
      out.write("\r\n");
      out.write("\t\t\t\t\t<a href=\"#none\">");
      out.print(i);
      out.write("</a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t");
}	else if(check_bunho==i && check_on_off==1){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<a href=\"#none\"><font color=\"#cf0ff1\"face=\"궁서체\">");
      out.print(i);
      out.write("</a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t");
}	//else if 종료	
					if(i%5==0)
					{
					
      out.write("\r\n");
      out.write("\t\t\t\t\t</br></br>\r\n");
      out.write("\t\t\t\t\t");

					}
					
				}
			}//for문 종료 
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");


		sql = "update pcroom set " + "on_off ='" + on_off + "' where bunho='" + bunho + "' ";
		
		System.out.println(sql);
		statement.execute(sql); //db에 등록
	
		rs.close();
		statement.close();
		conn.close();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}

      out.write("\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t\t\r\n");
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
