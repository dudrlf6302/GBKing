package org.apache.jsp.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.utility.*;
import com.utility.*;

public final class board_005fqnalist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/jsp/board/../../common/header.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<script>\r\n");
      out.write("function goView(seq)\r\n");
      out.write("{\t\r\n");
      out.write("\t\r\n");
      out.write("\tlocation.href=\"/");
      out.print(CommonUtil.commonURL);
      out.write("/board/view.do?seq=\"+seq;\r\n");
      out.write("}\r\n");
      out.write("function goWrite()\r\n");
      out.write("{\r\n");
      out.write("\tvar frm = document.form;\r\n");
      out.write("\tfrm.action=\"/");
      out.print(CommonUtil.commonURL);
      out.write("/board/write.do\";\r\n");
      out.write("\tfrm.mode.value=\"insert\";\r\n");
      out.write("\tfrm.type.value=\"1\";\r\n");
      out.write("\tfrm.board_list.value=\"qnalist\";\r\n");
      out.write("\tfrm.target=\"_self\"; //내창으로 \r\n");
      out.write("\tfrm.submit();\r\n");
      out.write("}\r\n");
      out.write("function goBoard(type, board_list)\r\n");
      out.write("{\r\n");
      out.write("\tvar frm = document.form;\r\n");
      out.write("\tfrm.action=\"/");
      out.print(CommonUtil.commonURL);
      out.write("/board/list.do\";\r\n");
      out.write("\tfrm.type.value=type;\r\n");
      out.write("\tfrm.board_list.value=board_list;\r\n");
      out.write("\tfrm.target=\"_self\"; \t//내창으로 \r\n");
      out.write("\tfrm.submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>스프링웹</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body class=\"main\">\r\n");
      out.write("\t<form name=\"form\" method=\"post\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"mode\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"type\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"board_list\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
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
      out.write("\tfrm.target=\"_self\"; \t//내창으로 \r\n");
      out.write("\tfrm.submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\t\t\t<li><a href=\"#\" onclick=\"goCal()\"><font color=\"#33aaff\" size='4'>예약</font></a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"topsearch\">\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t<fieldset>\r\n");
      out.write("\t\t\t<label for=\"id\"><img src=\"../images/common/log_text01.gif\" alt=\"ID\" /></label>\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"id\" class=\"Keyword\" value=\"\" />\r\n");
      out.write("\t\t\t<label for=\"password\"><img src=\"../images/common/log_text02.gif\" alt=\"PW\" /></label>\r\n");
      out.write("\t\t\t<input type=\"password\" id=\"password\" class=\"Keyword\" value=\"\" />\r\n");
      out.write("\t\t\t<input type=\"image\" src=\"../images/common/btn_login.gif\" class=\"submit\" alt=\"로그인\" />\r\n");
      out.write("\t\t\t<a href=\"#\"><img src=\"../images/common/btn_join.gif\" alt=\"회원가입\" /></a>\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t<!--\r\n");
      out.write("\t\t<!--로그인 후 S --\r\n");
      out.write("\t\t\t안녕하세요! <b class=\"name\">오나경</b> 님 [콩 보유개수 : <b class=\"soy\">1209</b>개]&nbsp;\r\n");
      out.write("\t\t\t<a href=\"#\"><img src=\"../images/common/btn_logout.gif\" alt=\"로그아웃\" /></a>\t\t\t\r\n");
      out.write("\t\t\t<a href=\"#\"><img src=\"../images/common/btn_modify.gif\" alt=\"정보수정\" /></a>\r\n");
      out.write("\t\t<!--로그인후 E --\r\n");
      out.write("\t\t-->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- nav E -->\r\n");
      out.write("\r\n");
      out.write("\t<hr />\r\n");
      out.write("</html>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t<!-- quickArea S -->\r\n");
      out.write("\t<div id=\"quickArea\">\r\n");
      out.write("\t\t<!-- contentArea S -->\r\n");
      out.write("\t\t<div id=\"contentArea\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- location S -->\r\n");
      out.write("\t\t\t<div id=\"location\"><a href=\"/\">HOME</a> >  <b>Q&A</b></div>\r\n");
      out.write("\t\t\t<!-- location E -->\r\n");
      out.write("\t\t<table cellspacing=\"0\" summary=\"[게시판명 프로그램입력]의 게시물 목록 입니다.\" class=\"bdl\">\r\n");
      out.write("\t\t\t\t\t<caption class=\"desc\">[게시판명 프로그램입력] 목록</caption>\r\n");
      out.write("\t\t\t\t\t<colgroup><col width=\"80px\" span=\"2\" /><col width=\"*\" /><col width=\"100px\" span=\"2\"/><col width=\"80px\" /></colgroup>\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"col\" class=\"first\">번호</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"col\">제목</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"col\">작성자</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"col\">작성일</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"col\" class=\"last\">조회</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t<div class=\"bb\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#none\" onclick=\"return goWrite()\">글쓰기</a></li>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t<!-- contentArea E -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- quickArea E -->\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /jsp/board/board_qnalist.jsp(68,6) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /jsp/board/board_qnalist.jsp(68,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("item");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td><a href=\"#none\"\tonclick=\"goView('");
          if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("')\"> \r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_005fout_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</a></td>\r\n");
          out.write("\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\t\t\t\t\r\n");
          out.write("\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.writer}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t<td>");
          if (_jspx_meth_c_005fout_005f2(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>\r\n");
          out.write("\t\t\t\t<td class=\"last\">");
          if (_jspx_meth_c_005fout_005f3(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /jsp/board/board_qnalist.jsp(70,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.seq}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /jsp/board/board_qnalist.jsp(71,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.seq}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /jsp/board/board_qnalist.jsp(74,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.wdate}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /jsp/board/board_qnalist.jsp(75,21) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.hit}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
    if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
    return false;
  }
}
