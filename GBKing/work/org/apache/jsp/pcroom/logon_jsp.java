package org.apache.jsp.pcroom;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class logon_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("function goWrite(bunho)\r\n");
      out.write("{\r\n");
      out.write("\tvar frm = document.form;\t\r\n");
      out.write("\tfrm.action=\"list.jsp?bunho=\"+bunho;\r\n");
      out.write("\tfrm.submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");

	String on_off;
	on_off = request.getParameter("on_off");
	String bunho = request.getParameter("bunho");
	if(on_off==null ||on_off.equals(""))
	{
		on_off="0";
	}
	if(bunho==null ||bunho.equals(""))
	{
		bunho="1";
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
      out.write("<table>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t");

			for(int i=1;i<=20;i++)
			{
			rs.next();
			int check_bunho = rs.getInt(1);
			int check_on_off = rs.getInt(2);					
			
			if(check_bunho==i && check_on_off==0) {	
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<a href=\"#none\" onclick=\"goWrite(");
      out.print(i);
      out.write(')');
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t");
}	else if(check_bunho==i && check_on_off==1){ 
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<a href=\"#none\" onclick=\"goWrite(");
      out.print(i);
      out.write(")\"><font color=\"#cf0ff1\"face=\"궁서체\">");
      out.print(i);
      out.write("</a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t");
}	//else if 종료	
				if(i%5==0)
				{
					
      out.write("\r\n");
      out.write("\t\t\t\t\t</br></br>\r\n");
      out.write("\t\t\t\t");
 	
				}
			}//for문 종료 
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");


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
