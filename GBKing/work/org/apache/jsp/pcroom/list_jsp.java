package org.apache.jsp.pcroom;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function goOk(on_off)\r\n");
      out.write("{\r\n");
      out.write("\tvar frm = document.form;\t\r\n");
      out.write("\tfrm.action=\"logon.jsp?on_off=\"+on_off;\r\n");
      out.write("\tfrm.submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
 

	String bunho = request.getParameter("bunho");

      out.write('\r');
      out.write('\n');
      out.print(bunho );
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form name=\"form\" method=\"post\">\r\n");
      out.write("<input type=\"hidden\" name=\"bunho\"   value=\"");
      out.print(bunho);
      out.write("\">\r\n");
      out.write("<table>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<a href=\"#none\" onclick=\"goOk(1)\">확인</a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<a href=\"#none\" onclick=\"goOk(0)\">취소</a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
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
