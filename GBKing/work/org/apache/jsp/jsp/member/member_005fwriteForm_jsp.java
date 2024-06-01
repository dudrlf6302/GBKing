package org.apache.jsp.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hanbat.board.dto.*;
import java.util.*;
import com.utility.*;

public final class member_005fwriteForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta content=\"text/html; charset=utf-8\" http-equiv=\"content-type\" />\r\n");
      out.write("<title>GBKing 회원가입</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/GBKing/css/style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/GBKing/css/list_style.css\" />\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"../../ckeditor/_samples/sample.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"/GBKing/ckeditor/ckeditor.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/GBKing/ckfinder/ckfinder.js\"></script>\r\n");
      out.write("<script src=\"/GBKing/js/modernizr-1.6.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("function goIDCheck()\r\n");
      out.write("{\r\n");
      out.write("\tvar frm = document.form;\r\n");
      out.write("\tif(frm.user_id.value==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"아이디를 입력 해주세요.\");\r\n");
      out.write("\t\tfrm.user_id.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tdocument.getElementById(\"idcheck\").value=\"N\";\r\n");
      out.write("\t//window.open(\"idcheck.jsp\", \"제목\", \"height=300, width=400, top=200, left=200, scrollbars=no\");\r\n");
      out.write("\t\r\n");
      out.write("\t//post 방식으로 넘기기\r\n");
      out.write("\tvar post = window.open(\"\", \"popwindow\", \"height=300, width=400, top=200, left=200, scrollbars=no\");\r\n");
      out.write("\t\r\n");
      out.write("\tfrm.action=\"/");
      out.print(CommonUtil.commonURL);
      out.write("/member/idcheck.do\";\r\n");
      out.write("\tfrm.method=\"post\";\r\n");
      out.write("\tfrm.target = \"popwindow\";\r\n");
      out.write("\tfrm.submit();\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tfunction goWrite()\r\n");
      out.write("\t{\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar frm = document.form;\r\n");
      out.write("\t\tif(frm.user_id.value==\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"아이디를 입력 해주세요.\");\r\n");
      out.write("\t\t\tfrm.user_id.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(frm.idcheck.value==\"N\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"사용가능한 아이디로 중복체크를 해주세요.\");\r\n");
      out.write("\t\t\tfrm.user_id.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(frm.password.value==\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"패스워드를 입력 해주세요.\");\r\n");
      out.write("\t\t\tfrm.password.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(frm.password.value!=frm.password2.value)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"패스워드를 확인해 주세요.\");\r\n");
      out.write("\t\t\tfrm.password.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(frm.address1.value==\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"우편번호를 검색 해주세요.\");\r\n");
      out.write("\t\t\tfrm.address1.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(frm.address2.value==\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"상세주소를 입력 해주세요.\");\r\n");
      out.write("\t\t\tfrm.address2.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(frm.user_name.value==\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"이름 입력 해주세요.\");\r\n");
      out.write("\t\t\tfrm.user_name.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfrm.action=\"/");
      out.print(CommonUtil.commonURL);
      out.write("/member/save.do\";\r\n");
      out.write("\t\tfrm.target=\"_self\";//내창으로\r\n");
      out.write("\t\tfrm.submit();\r\n");
      out.write("\t\talert(\"회원가입이 완료 되었습니다.\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tself.close();\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction goZipcode()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar frm = document.form;\r\n");
      out.write("\t\twindow.open(\"\",\"zipcode\",\"width=400, height=400,left=300,top=300\");\r\n");
      out.write("\t\tfrm.target = \"zipcode\";//타켓을 변경\r\n");
      out.write("\t\tfrm.action=\"/");
      out.print(CommonUtil.commonURL);
      out.write("/member/zipcode.do\";\r\n");
      out.write("\t\tfrm.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</br></br><h2><font size=\"5\"><b>회원가입</b></font></h2>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form name=\"form\" method=\"post\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"idcheck\" id=\"idcheck\" value=\"N\">\r\n");
      out.write("\t\t<table width=\"80%\" border=\"1\" class=\"bdw\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th scope=\"row\" class=\"first\">아이디</th>\r\n");
      out.write("\t\t\t\t<td width=\"20%\"><input type=\"text\" size=\"10\" name=\"user_id\" id=\"user_id\"></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"button\" value=\"중복체크\" onclick=\"goIDCheck()\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th scope=\"row\" class=\"first\">패스워드</th>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\"><input type=\"password\" name=\"password\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th scope=\"row\" class=\"first\">패스워드 확인</th>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\"><input type=\"password\" name=\"password2\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th scope=\"row\" class=\"first\">주소</th>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\">우편번호 : <input type=\"text\" name=\"zipcode\" id=\"zipcode\"\r\n");
      out.write("\t\t\t\t\treadonly> &nbsp;&nbsp; <input type=\"button\" value=\"우편번호검색\"\r\n");
      out.write("\t\t\t\t\tonclick=\"goZipcode()\"> <br /> 기본주소 : <input type=\"text\"\r\n");
      out.write("\t\t\t\t\tname=\"address1\" id=\"address1\" readonly> <br /> 상세주소 : <input\r\n");
      out.write("\t\t\t\t\ttype=\"text\" name=\"address2\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th scope=\"row\" class=\"first\">이름</th>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\"><input type=\"text\" name=\"user_name\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th scope=\"row\" class=\"first\">완료</th>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\"><input type=\"button\" value=\"회원가입\" onclick=\"return goWrite()\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
}
