/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.40
 * Generated at: 2019-10-30 07:55:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.skwyverns;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class skwyverns_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/E:/스마트미디어/1029/test/10.css편집/house/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/skwyverns/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1571897266000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!-- taglib 지시어  -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"skwyverns_list.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"skwyverns_list.js\"></script>\r\n");
      out.write("<title>자유게시판</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header id=\"main_header\">\r\n");
      out.write("    \t<nav id=\"main_gnb\">\r\n");
      out.write("         \t<ul>\r\n");
      out.write("            \t<li><a href=\"#\">로그인</a></li>\r\n");
      out.write("                <li><a href=\"#\">회원가입</a></li>\r\n");
      out.write("                <li><a href=\"http://www.ticketlink.co.kr/sports/baseball/56#reservation\">장애인예매</a></li>\r\n");
      out.write("                <li><a href=\"#\">english</a></li>\r\n");
      out.write("                <li><a href=\"#\">검색어입력</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("         </nav>\r\n");
      out.write("    <nav id=\"main_logo\">\r\n");
      out.write("    <ul>\r\n");
      out.write("    <li><a href=\"main.html\"> <img src=\"../img/logo_wyverns.png\"></a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("<div id=\"main_lnb\">\r\n");
      out.write("    <ul>\r\n");
      out.write("\t<li class = \"menu\">\r\n");
      out.write("\t\t<a class=\"under\" href=\"sub_02.html\">소개</a>\r\n");
      out.write("        <div class=\"article\">\r\n");
      out.write("          <a href=\"sub_02.html\">SK Wyverns 역사</a>\r\n");
      out.write("          <a href=\"#\">엠블럼</a>\r\n");
      out.write("          <a href=\"#\">응원단</a>\r\n");
      out.write("          <a href=\"#\">후원사</a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class = \"menu\">\r\n");
      out.write("\t\t<a class=\"under\" href=\"sub_03.html\">경기정보</a>\r\n");
      out.write("        <div class=\"article\">\r\n");
      out.write("          <a href=\"sub_03.html\">경기일정</a>\r\n");
      out.write("          <a href=\"sub_05.html\">경기결과</a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class = \"menu\">\r\n");
      out.write("\t\t<a href=\"#\">기록실</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class = \"menu\">\r\n");
      out.write("\t\t<a class=\"under\" href=\"#\">선수단</a>\r\n");
      out.write("        <div class=\"article\">\r\n");
      out.write("          <a href=\"#\">투수</a>\r\n");
      out.write("          <a href=\"#\">포수</a>\r\n");
      out.write("          <a href=\"#\">내야수</a>\r\n");
      out.write("          <a href=\"#\">외야수</a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class = \"menu\">\r\n");
      out.write("\t\t<a href=\"#\">이벤트</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class = \"menu\">\r\n");
      out.write("\t\t<a class=\"under\" href=\"sub_01.html\">팬</a>\r\n");
      out.write("        <div class=\"article\">\r\n");
      out.write("          <a href=\"skwyverns_list.jsp\">자유게시판</a>\r\n");
      out.write("          <a href=\"#\">To.SKwyverns</a>\r\n");
      out.write("          <a href=\"#\">From.SKwyverns</a>\r\n");
      out.write("          <a href=\"../skwyverns_qa/skwyverns_Q&A_list.jsp\">Q & A</a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class = \"menu\">\r\n");
      out.write("\t\t<a href=\"https://www.youtube.com/user/Wyvernsstory\">미디어</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class = \"menu\">\r\n");
      out.write("\t\t<a href=\"http://www.ticketlink.co.kr/sports/baseball/56#reservation\">티켓</a>\r\n");
      out.write("        </li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    </header>\r\n");
      out.write("    \t<div id=\"content\">\r\n");
      out.write("    \t<section id=\"main_section\">\r\n");
      out.write("        \t<article class=\"main_article\">\r\n");
      out.write("        \t  <h1>자유게시판 </h1>\r\n");
      out.write("        \t  <hr style=\"height: 2px; background-color: #cf232e\"><br>\r\n");
      out.write("\t\t<form name=\"form1\" method=\"post\" action=\"SkwyvernsController\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"action\" value=\"list\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"id\" value=0>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<table border=1>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=7 align=right>\r\n");
      out.write("    \t\t\t\t<input type=\"text\" align=\"left \" name=\"searchName\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${skwyvernsDTO.searchName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("    \t\t\t\t\t\t<input type=\"button\" id=\"list\" align=right value=\"조회\" onClick=\"retrivalcheck()\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>ID</th>\r\n");
      out.write("\t\t\t\t<th>제목</th>\r\n");
      out.write("\t\t\t\t<th>작성자</th>\r\n");
      out.write("\t\t\t\t<th>내용</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("         \t<div class=\"botton\">\r\n");
      out.write(" \t\t\t<input type=\"button\" align=right value=\"글쓰기\" onClick=\"addcheck()\">\r\n");
      out.write("          \t</div>\r\n");
      out.write("            </article>\r\n");
      out.write("         </section>\r\n");
      out.write("         \r\n");
      out.write("         \t<aside id=\"main_aside\">\r\n");
      out.write("            <h3>팬</h3><hr><br>\r\n");
      out.write("\t\t\t\t<small><a href=\"skwyverns_list.jsp\">자유게시판</a></small><br><hr><br>\r\n");
      out.write("\t\t\t\t<small><a href=\"#\">To.SKwyverns</a></small><br><hr><br>\r\n");
      out.write("\t\t\t\t<small><a href=\"#\">From.SKwyverns</a></small><br><hr><br>\r\n");
      out.write("\t\t\t\t<small><a href=\"../skwyverns_qa/skwyverns_Q&A_list.jsp\">Q & A</a></small><br><hr><br>\r\n");
      out.write("            </aside>\r\n");
      out.write("    </div>\r\n");
      out.write("<footer id=\"main_footer\">\r\n");
      out.write("    <h6>| 개인정보 처리방침 | 이용약관 | 이메일주소무단수집거부 | 개인정보 수집 및 이용 |</h6>\r\n");
      out.write("    <address> (22234) 인천광역시 남구 매소홀로 618(문학동), 주경기장 2층</address>\r\n");
      out.write("    </footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /skwyverns/skwyverns_list.jsp(107,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("i");
      // /skwyverns/skwyverns_list.jsp(107,3) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${skwyvernsList}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t<td><a href=\"javascript:editcheck(");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(')');
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</a></td>\r\n");
            out.write("\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.memo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t</tr>\r\n");
            out.write("\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
