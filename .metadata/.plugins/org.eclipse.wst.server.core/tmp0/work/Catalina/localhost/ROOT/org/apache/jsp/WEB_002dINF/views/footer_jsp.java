/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.5
 * Generated at: 2020-12-24 06:53:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <script defer src=\"https://use.fontawesome.com/releases/v5.5.0/js/all.js\" integrity=\"sha384-GqVMZRt5Gn7tB9D9q7ONtcp4gtHIUEW/yG7h98J7IpE3kpi+srfFyyB/04OV6pG0\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <title>Insert title here</title>\r\n");
      out.write("    <style>\r\n");
      out.write("      body {\r\n");
      out.write("         margin: 0;\r\n");
      out.write("         padding: 0;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      .inner-footer {\r\n");
      out.write("         margin: 0;\r\n");
      out.write("         padding: 0;\r\n");
      out.write("         background-color: #000;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      .social-links {\r\n");
      out.write("         display: flex;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      .social-links ul {\r\n");
      out.write("          padding: 10px;\r\n");
      out.write("         display: flex;\r\n");
      out.write("         width: 280px;\r\n");
      out.write("         height: 30px;\r\n");
      out.write("         margin: auto;\r\n");
      out.write("           margin-bottom: 20px;\r\n");
      out.write("\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      .socal-items {\r\n");
      out.write("         list-style: none;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      .social-items a {\r\n");
      out.write("         padding: 10px 20px;\r\n");
      out.write("         font-size: 35px;\r\n");
      out.write("         color: #fff;\r\n");
      out.write("         transition: all .25s;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      .social-items a:hover{\r\n");
      out.write("          color: #6cccc6;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      .quick-links {\r\n");
      out.write("         display: flex;\r\n");
      out.write("         width: 465px;\r\n");
      out.write("         height: 70px;\r\n");
      out.write("         margin: auto;\r\n");
      out.write("         \r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      .quick-links ul {\r\n");
      out.write("         display: flex;\r\n");
      out.write("         margin-top: 20px;\r\n");
      out.write("         \r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      .quick-items {\r\n");
      out.write("         list-style: none;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      .quick-items a {\r\n");
      out.write("         text-decoration: none;\r\n");
      out.write("         padding: 0px 15px;\r\n");
      out.write("         font-size: 18px;\r\n");
      out.write("         color: #fff;\r\n");
      out.write("         transition: all .25s;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      .quick-items a:hover{\r\n");
      out.write("          color: #6cccc6;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      .outer-footer {\r\n");
      out.write("         padding: 10px;\r\n");
      out.write("         text-align: center;\r\n");
      out.write("         color: #fff;\r\n");
      out.write("         font-size: 18px;\r\n");
      out.write("         background-color: #000;\r\n");
      out.write("      }\r\n");
      out.write("   </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <footer class=\"footer\" style=\"margin-top:150px\">\r\n");
      out.write("       <div class=\"inner-footer\">\r\n");
      out.write("           <div class=\"social-links\"> \r\n");
      out.write("              <ul>\r\n");
      out.write("                    <li class=\"social-items\"><a href=\"https://www.facebook.com/groups/193679545790819/\"><i class=\"fab fa-facebook-square\"></i></a></li>\r\n");
      out.write("                    <li class=\"social-items\"><a href=\"https://twitter.com/20_OTTAE?s=09\"><i class=\"fab fa-twitter\"></i></a></li>\r\n");
      out.write("                    <li class=\"social-items\"><a href=\"https://www.instagram.com/20_ottae/\"><i class=\"fab fa-instagram\"></i></a></li>\r\n");
      out.write("                    <li class=\"social-items\"><a href=\"#\"><i class=\"fab fa-tumblr-square\"></i></a></li>\r\n");
      out.write("               </ul>\r\n");
      out.write("              </div>             \r\n");
      out.write("         <div class=\"quick-links\">\r\n");
      out.write("                  <ul>\r\n");
      out.write("               <li class=\"quick-items\"><a href=\"/\">home</a></li>\r\n");
      out.write("                      <li class=\"quick-items\"><a href=\"schedule\">일정</a></li>\r\n");
      out.write("                      <li class=\"quick-items\"><a href=\"QnA\">Q&A</a></li>\r\n");
      out.write("                      <li class=\"quick-items\"><a href=\"notice\">공지사항</a></li>\r\n");
      out.write("                      <li class=\"quick-items\"><a href=\"myPage_userUpdate\">회원정보 수정</a></li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("           \r\n");
      out.write("              <div class=\"outer-footer\">\r\n");
      out.write("                  Copyright &copy; dksehdgus18@naver.com ACAI@\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      </footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
