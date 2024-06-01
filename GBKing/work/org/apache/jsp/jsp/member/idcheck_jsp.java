package org.apache.jsp.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class idcheck_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>한밭대학교</title>\r\n");
      out.write("</head>\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction goSend() {\r\n");
      out.write("\t\topener.document.getElementById(\"idcheck\").value = \"Y\";\r\n");
      out.write("\t\topener.document.getElementById(\"user_id\").readOnly = true;\r\n");
      out.write("\t\tself.close();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction goExit() {\r\n");
      out.write("\t\topener.document.getElementById(\"idcheck\").value = \"N\";\r\n");
      out.write("\t\topener.document.getElementById(\"user_id\").readOnly = false;\r\n");
      out.write("\r\n");
      out.write("\t\tself.close();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");

	String userid = request.getAttribute("user_id").toString();
	int result = Integer.parseInt(request.getAttribute("idcheck").toString());
	if (result == 1){
		out.println(userid + "를 사용 하실수 없습니다. " + "중복됨");

      out.write("\r\n");
      out.write(" <input type=\"button\" value=\"닫기\" onclick=\"goExit()\">\r\n");

	}else if (result == 0) {
		out.println(userid + "를 사용 하실 수 있습니다. ");
		out.println("사용가능");

      out.write("\r\n");
      out.write("\t<input type=\"button\" value=\"사용하기\" onclick=\"goSend()\">\r\n");
      out.write("\t");
 
	}
	else
		out.println("중복체크 실패");
	
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
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
