package org.apache.jsp.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hanbat.board.dto.*;
import java.util.*;
import com.utility.*;

public final class board_005fwriteForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/jsp/board/../../common/header.jsp");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta content=\"text/html; charset=utf-8\" http-equiv=\"content-type\" />\r\n");
      out.write("<title>GBKing</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/GBKing/css/style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/GBKing/css/list_style.css\" />\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"../../ckeditor/_samples/sample.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"/GBKing/ckeditor/ckeditor.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/GBKing/ckfinder/ckfinder.js\"></script>\r\n");
      out.write("<script src=\"/GBKing/js/modernizr-1.6.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function goWrite()\r\n");
      out.write("{\r\n");
      out.write("\tvar frm = document.form;\r\n");
      out.write("\tif(frm.title.value==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"제목을 입력하세요\");\r\n");
      out.write("\t\tfrm.title.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(frm.writer.value==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"이름을 입력하세요\");\r\n");
      out.write("\t\tfrm.writer.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(frm.contents.value==null)\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"내용을 입력하세요\");\r\n");
      out.write("\t\tfrm.contents.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tfrm.action=\"/");
      out.print(CommonUtil.commonURL);
      out.write("/board/save.do\";\t\r\n");
      out.write("\tfrm.target=\"_self\"; //내창으로 \t\r\n");
      out.write("\tfrm.submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function goBoard(type)\r\n");
      out.write("{\r\n");
      out.write("\tvar frm = document.form;\r\n");
      out.write("\tfrm.action=\"/");
      out.print(CommonUtil.commonURL);
      out.write("/board/list.do\";\r\n");
      out.write("\tfrm.type.value = type;\r\n");
      out.write("\tfrm.target = \"_self\"; //내창으로 \r\n");
      out.write("\tfrm.submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");

	BoardDto dto = (BoardDto) request.getAttribute("dto");
	String mode = (String) request.getAttribute("mode");
	String seq = (String) request.getAttribute("seq");
	String type = (String) request.getAttribute("type");
	String board_list = (String) request.getAttribute("board_list");
	String writer = (String) session.getAttribute("userid");

      out.write('\r');
      out.write('\n');
      out.print(writer);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body class=\"board_wirte\">\r\n");
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
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"wrapper content\">\r\n");
      out.write("\t\t<div id=left>\r\n");
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
      out.write("\t\t\t\t<font size=\"5\">게시글 작성</font>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t</br>\r\n");
      out.write("\t\t\t<form name=\"form\" method=\"post\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=searchWord> <input type=\"hidden\"\r\n");
      out.write("\t\t\t\t\tname=\"searchKey\"> <input type=\"hidden\" name=\"seq\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.print(seq);
      out.write("\"> <input type=\"hidden\" name=\"mode\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.print(mode);
      out.write("\"> <input type=\"hidden\" name=\"type\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.print(type);
      out.write("\"> <input type=\"hidden\" name=\"board_list\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.print(board_list);
      out.write("\"> <input type=\"hidden\"\r\n");
      out.write("\t\t\t\t\tname=\"group_id\" value=\"");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("\"> <input\r\n");
      out.write("\t\t\t\t\ttype=\"hidden\" name=\"group_depth\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      if (_jspx_meth_c_005fout_005f1(_jspx_page_context))
        return;
      out.write("\"> <input\r\n");
      out.write("\t\t\t\t\ttype=\"hidden\" name=\"group_seq\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      if (_jspx_meth_c_005fout_005f2(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- quickArea S -->\r\n");
      out.write("\t\t\t\t<div id=\"quickArea\">\r\n");
      out.write("\t\t\t\t\t<!-- contentArea S -->\r\n");
      out.write("\t\t\t\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t\t\t\t<!-- bbs default write S -->\r\n");
      out.write("\t\t\t\t\t\t<table cellspacing=\"0\" class=\"bdw\">\r\n");
      out.write("\t\t\t\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t<col width=\"10\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<col width=\"10\" />\r\n");
      out.write("\t\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th scope=\"row\" class=\"first\"><label for=\"formname01\">제목</label></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"last\"><input name=\"title\" size=\"60\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tmaxlength=\"100\" value=\"");
      if (_jspx_meth_c_005fout_005f3(_jspx_page_context))
        return;
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th scope=\"row\" class=\"first\"><label for=\"formname02\">작성자</label></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"last\"><input name=\"writer\" readonly size=\"10\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tmaxlength=\"40\" value=\"");
      out.print(writer);
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th scope=\"row\" class=\"first\"><label for=\"memo\">내용</label></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"last\"><textarea rows=\"10\" cols=\"40\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"contents\" name=\"contents\"></textarea></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th scope=\"row\" class=\"first\"><label for=\"atchfile\">첨부파일</label></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"last\"><input type=\"file\" id=\"atchfile\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"atchfile\" size=\"50\" class=\"atchfile\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t\t\t// This is a check for the CKEditor class. If not defined, the paths must be checked.\r\n");
      out.write("\t\t\t\t\t\t\tif (typeof CKEDITOR == 'undefined') {\r\n");
      out.write("\t\t\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.write('<strong><span style=\"color: #ff0000\">Error</span>: CKEditor not found</strong>.'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t+ 'This sample assumes that CKEditor (not included with CKFinder) is installed in'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t+ 'the \"/ckeditor/\" path. If you have it installed in a different place, just edit'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t+ 'this file, changing the wrong paths in the &lt;head&gt; (line 5) and the \"BasePath\"'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t+ 'value (line 32).');\r\n");
      out.write("\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\tvar editor = CKEDITOR.replace('contents');\r\n");
      out.write("\t\t\t\t\t\t\t\teditor.setData('');\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t// Just call CKFinder.setupCKEditor and pass the CKEditor instance as the first argument.\r\n");
      out.write("\t\t\t\t\t\t\t\t// The second parameter (optional), is the path for the CKFinder installation (default = \"/ckfinder/\").\r\n");
      out.write("\t\t\t\t\t\t\t\tCKFinder.setupCKEditor(editor, '../ckfinder/');\r\n");
      out.write("\t\t\t\t\t\t\t\t//ckfinder 경로 잡기\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t// It is also possible to pass an object with selected CKFinder properties as a second argument.\r\n");
      out.write("\t\t\t\t\t\t\t\t// CKFinder.setupCKEditor( editor, { basePath : '../', skin : 'v1' } ) ;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t<!-- bbs default write E -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- bbs footer S -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"bft\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bb\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"inputBtn\"><a href=\"#none\" onclick=\"goWrite()\">등록</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\" onclick=\"goBoard('");
      out.print(type);
      out.write("')\">취소</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- bbs footer E -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- content E -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- quickArea E -->\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<section id=\"copyright\">\r\n");
      out.write("\t\t<div class=\"wrapper\">\r\n");
      out.write("\t\t\t<p>&#169; Copyright 2013 Keith Homemade Cakes</p>\r\n");
      out.write("\t\t\t<p id=\"koodoz\"><a title=\"Web design Melbourne\"><strong>Web Design <span>Melbourne</span></strong></a></p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.js\"></script>\r\n");
      out.write("<script src=\"http://maps.google.com/maps/api/js?sensor=false\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t//<![CDATA[\r\n");
      out.write("\t!window.jQuery\r\n");
      out.write("\t\t\t&& document\r\n");
      out.write("\t\t\t\t\t.write(unescape('%3Cscript src=\"js/libs/jquery-1.4.2.min.js\"%3E%3C/script%3E'));\r\n");
      out.write("\t//]]>\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tSROOTPATH = '/'\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"/GBKing/js/plugins.js\"></script>\r\n");
      out.write("<script src=\"/GBKing/js/init.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t//<![CDATA[\r\n");
      out.write("\tvar _gaq = [ [ '_setAccount', 'UA-3019794-38' ], [ '_trackPageview' ] ];\r\n");
      out.write("\t(function(d, t) {\r\n");
      out.write("\t\tvar g = d.createElement(t), s = d.getElementsByTagName(t)[0];\r\n");
      out.write("\t\tg.async = true;\r\n");
      out.write("\t\tg.src = ('https:' == location.protocol ? 'https://ssl' : 'http://www')\r\n");
      out.write("\t\t\t\t+ '.google-analytics.com/ga.js';\r\n");
      out.write("\t\ts.parentNode.insertBefore(g, s);\r\n");
      out.write("\t})(document, 'script');\r\n");
      out.write("\t//]]>\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fout_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent(null);
    // /jsp/board/board_writeForm.jsp(108,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.group_id}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /jsp/board/board_writeForm.jsp(110,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.group_depth}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /jsp/board/board_writeForm.jsp(112,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.group_seq}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /jsp/board/board_writeForm.jsp(128,33) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.title}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
    if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
    return false;
  }
}
