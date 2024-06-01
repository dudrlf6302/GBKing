package org.apache.jsp.jsp.reserve;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.hanbat.reserve.dto.*;
import com.utility.*;

public final class reserveList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/../common/header.jsp");
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<script>\r\n");
      out.write("function goCancel(seq)\r\n");
      out.write("{\r\n");
      out.write("\talert(\"취소되었습니다.\");\r\n");
      out.write("\tvar frm = document.form;\r\n");
      out.write("\tfrm.seq.value = seq;\r\n");
      out.write("\tfrm.action = \"/GBKing/reserve/listCancel.do\";\r\n");
      out.write("\tfrm.submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function goSearch()\r\n");
      out.write("{\r\n");
      out.write("\tvar frm = document.form;\r\n");
      out.write("\tfrm.action = \"/GBKing/reserve/reserveList.do\";\r\n");
      out.write("\tfrm.submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String searchKey = (String) request.getAttribute("searchKey");
	String searchWord = (String) request.getAttribute("searchWord");

	if (searchKey == null)
		searchKey = "";
	if (searchWord == null)
		searchWord = "";

	String userid = (String) session.getAttribute("userid");
	ArrayList<reserveDto> list = (ArrayList<reserveDto>) request.getAttribute("list");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body bgcolor='white'>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("   <html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<title>GBKing</title>\r\n");
      out.write("<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\" />\r\n");
      out.write("<meta http-equiv=\"Content-Style-Type\" content=\"text/css\" />\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("<link href=\"../css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<script src=\"js/common_group.js\" language=\"Javascript\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<script>\r\n");
      out.write("function goView(seq)\r\n");
      out.write("{\t\r\n");
      out.write("\t\r\n");
      out.write("\tlocation.href=\"/");
      out.print(CommonUtil.commonURL);
      out.write("/board/view.do?seq=\"+seq;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function goBoard(type, board_list)\r\n");
      out.write("{\r\n");
      out.write("\tvar frm = document.form;\r\n");
      out.write("\tfrm.action=\"/");
      out.print(CommonUtil.commonURL);
      out.write("/board/list.do\";\r\n");
      out.write("\tfrm.type.value=type;\r\n");
      out.write("\tfrm.board_list.value=board_list;\r\n");
      out.write("\tfrm.searchWord.value=\"\";\r\n");
      out.write("\tfrm.searchKey.value=\"\";\r\n");
      out.write("\tfrm.target=\"_self\"; \t//내창으로 \r\n");
      out.write("\tfrm.submit();\r\n");
      out.write("}\r\n");
      out.write("function goReserve()\r\n");
      out.write("{\r\n");
      out.write("\tlocation.href=\"/");
      out.print(CommonUtil.commonURL);
      out.write("/reserve/reserve.do\";\r\n");
      out.write("}\r\n");
      out.write("function goMenu()\r\n");
      out.write("{\r\n");
      out.write("\t\r\n");
      out.write("\tvar frm = document.form;\r\n");
      out.write("\tfrm.mode.value=null;\r\n");
      out.write("\tfrm.action=\"/");
      out.print(CommonUtil.commonURL);
      out.write("/menu/list_drink.do\";\r\n");
      out.write("\tfrm.submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<form name=search method=\"post\">\r\n");
      out.write("<input type=\"hidden\" name=searchWord>\r\n");
      out.write("\t<input type=\"hidden\" name=\"searchKey\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- header S -->\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<h1><a href=\"/GBKing/board/main.do\" ><img src=\"../images/common/logo2.gif\" alt=\"GBKing\" /></a></h1>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<hr />\r\n");
      out.write("\r\n");
      out.write("\t<!-- navi S -->\r\n");
      out.write("\t<div id=\"nav\">\r\n");
      out.write("\r\n");
      out.write("\t\t<h2 class=\"desc\">사이트 메뉴</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"#\" onclick =\"goBoard('0', 'list')\"><font color=\"#33aaff\" size='4'>공지사항</font></a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\" onclick =\"goBoard('1', 'qnalist')\"><font color=\"#33aaff\" size='4'>Q&A</font></a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\" onclick =\"goBoard('2', 'reviewlist')\"><font color=\"#33aaff\" size='4'>후기</font></a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\" onclick =\"goReserve()\"><font color=\"#33aaff\" size='4'>예약</font></a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#none\" onclick=\"return goMenu()\"><font color=\"#33aaff\" size='4'>주문</font></a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- nav E -->\r\n");
      out.write("\r\n");
      out.write("\t<hr />\r\n");
      out.write("</html>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t<form name=\"form\" method=\"post\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"seq\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"ID\" value=\"");
      out.print(userid);
      out.write("\">\r\n");
      out.write("\t\r\n");
      out.write("\t");
 
	String leftMenu = "reserveList";

	
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
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"header\" style=\"hight: 50px;\">\r\n");
      out.write("\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t<legend class=\"desc\">Search</legend>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"../images/board/def/search_title.gif\" width=\"46\"\r\n");
      out.write("\t\t\t\t\t\t\t\theight=\"9\" alt=\"search\" />\r\n");
      out.write("\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"target\" class=\"desc\">Target</label> \r\n");
      out.write("\t\t\t\t\t\t\t  <select name=\"searchKey\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\" ");
if(searchKey.equals("")){
      out.write("selected");
}
      out.write(" >전체</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"1\" ");
if(searchKey.equals("1")){
      out.write("selected");
}
      out.write(">방번호</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"2\" ");
if(searchKey.equals("2")){
      out.write("selected");
}
      out.write(">작성자아이디</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"3\" ");
if(searchKey.equals("3")){
      out.write("selected");
}
      out.write(">예약날짜+예약시간</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"4\" ");
if(searchKey.equals("4")){
      out.write("selected");
}
      out.write(">예약날짜</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t <label for=\"keyword\" class=\"desc\">Keyword</label> \r\n");
      out.write("\t\t\t\t\t\t\t\t <input\ttype=\"text\" name=\"searchWord\" value=\"");
      out.print(searchWord);
      out.write("\" class=\"keyword\" size=\"30\" /> \r\n");
      out.write("\t\t\t\t\t\t\t\t <span class=\"inbtn inputBtn\"><a href=\"#none\" onclick=\"goSearch()\">검색</a></span>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"main\" style=\"margin-top: 10px;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<table border=\"1\" cellspacing=\"0\" cellpadding=\"0\" width=\"930px\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"8%\">번호</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"8%\">방번호</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"10%\">작성자아이디</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"*%\">예약날짜</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"10%%\">예약시간</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"8%\">작성일</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"10%\">예약취소</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");

					if (list.size() > 0) {
						for (int i = 0; i < list.size(); i++) {
							reserveDto dto = list.get(i);

							int seq = dto.getSeq();
							int roomNum = dto.getRoomNum();
							String ID = dto.getID();
							String currDDay = dto.getCurrDDay();
							String currTime = dto.getCurrTime();
							String wdate = dto.getWdate();
				
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(seq);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(roomNum);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(ID);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(currDDay);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(currTime);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(wdate);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td><a href=\"#none\" onclick=\"goCancel(");
      out.print(seq);
      out.write(")\">취소하기</a></td>\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");

					}
					} else {
				
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"5\">데이타가 없습니다.</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t\t<div id=\"flooter\"\r\n");
      out.write("\t\t\tstyle=\"hight: 50px; margin-top: 10px; background: black;\">-</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</form>\r\n");
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
