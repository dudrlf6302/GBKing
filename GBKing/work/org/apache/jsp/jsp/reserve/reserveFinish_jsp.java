package org.apache.jsp.jsp.reserve;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.hanbat.reserve.dto.*;

public final class reserveFinish_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/jsp/reserve/../common/reserveLeft.jsp");
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<title>프로그램 입력</title>\r\n");
      out.write("<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\" />\r\n");
      out.write("<meta http-equiv=\"Content-Style-Type\" content=\"text/css\" />\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("<link href=\"/GBKing/css/admin.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");

	String currDDay = (String)request.getAttribute("currDDay");
	String currTime = (String)(request.getAttribute("currTime"));
	int roomNum = (Integer) (request.getAttribute("roomNum"));

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<body bgcolor='white'>\r\n");
      out.write("\t");
 
	String leftMenu = "reserveFinish";

	
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<!-- aside S -->\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"aside\" style=\" background: glay; \">\r\n");
      out.write("\t\t<br/>\r\n");
      out.write("\t\t<font size=\"3\" color=\"#0000ff\" face=\"돋움체\">예약메뉴</font><br/>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li ");
if(leftMenu.equals("reserve")){
							
      out.write("class=\"on\"\t\r\n");
      out.write("\t\t\t\t\t\t\t");
}
							else{
							
      out.write("class=\"off\"");

							}
      out.write("\r\n");
      out.write("\t\t\t><a href=\"/GBKing/reserve/reserve.do\">예약하기</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li ");
if(leftMenu.equals("reserveConfirm")){
							
      out.write("class=\"on\"\t\r\n");
      out.write("\t\t\t\t\t\t\t");
}
							else{
							
      out.write("class=\"off\"");

							}
      out.write("\r\n");
      out.write("\t\t\t><a href=\"/GBKing/reserve/reserveConfirm.do\">예약확인</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li ");
if(leftMenu.equals("reserveList")){
							
      out.write("class=\"on\"\t\r\n");
      out.write("\t\t\t\t\t\t\t");
}
							else{
							
      out.write("class=\"off\"");

							}
      out.write("\r\n");
      out.write("\t\t\t><a href=\"/GBKing/reserve/reserveList.do\">예약관리자</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- aside E -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"wrap\" style=\"width: 930px; margin: auto;\">\r\n");
      out.write("\t\t<div id=\"header\" style=\"hight: 50px; background: black;\">-</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"main\" style=\"margin-top: 10px;\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t<font size=\"3\" color=\"#0000ff\" face=\"돋움체\">예약이 완료 되었습니다.</font><br/>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t<table border=\"1\" cellspacing=\"0\" cellpadding=\"0\" width=\"930px\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"8%\">방번호</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"*%\">예약날짜</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"10%%\">예약시간</td>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(roomNum);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(currDDay);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(currTime);
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t\t<div id=\"flooter\"\r\n");
      out.write("\t\t\tstyle=\"hight: 50px; margin-top: 10px; background: black;\">-</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
}
