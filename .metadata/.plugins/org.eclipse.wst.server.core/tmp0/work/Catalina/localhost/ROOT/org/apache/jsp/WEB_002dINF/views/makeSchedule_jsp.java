/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.5
 * Generated at: 2020-11-30 11:21:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class makeSchedule_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js\"></script>\r\n");
      out.write("<title>[일정만들기]</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form name=\"frm\" action=\"makeCal\" method=\"get\">\r\n");
      out.write("\t\t<table border=1>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>시간</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t시작날짜<input type=\"date\" name='cal_sdate' value=\"2020-01-01\" />\r\n");
      out.write("\t\t\t\t\t시작시간:<input type='time' name='cal_stime' />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t종료날짜<input type='date' name='cal_edate' value=\"2020-01-01\" min=\"2020-01-01\" /> \r\n");
      out.write("\t\t\t\t\t종료시간:<input type='time' name='cal_etime' />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>일정이름:</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"cal_title\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>일정분류:</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<select id=\"joinedGroup\"></select> \r\n");
      out.write("\t\t\t\t\t<script id=\"temp\" type=\"text/x-handlebars-template\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"0\">개인일정</option>\r\n");
      out.write("\t\t\t\t\t\t{{#each .}}\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"{{g_code}}\">{{g_name}}</option>\r\n");
      out.write("                  \t\t{{/each}}\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>함께할 사람:</td>\r\n");
      out.write("\t\t\t\t<td id=\"joinedMember\"></td>\r\n");
      out.write("\t\t\t\t<script id=\"temp1\" type=\"text/x-handlebars-template\">\r\n");
      out.write("            \t\t{{#each .}}\r\n");
      out.write("              \t\t\t<input type=\"checkbox\" value=\"{{id}}\">{{name}}\r\n");
      out.write("           \t\t\t{{/each}}\r\n");
      out.write("            \t</script>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>컨텐츠:</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"cal_content\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>일정위치</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"cal_place\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>일정공유여부:</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\ty:<input type=\"radio\" name=\"cal_schk\" value=\"y\"> \r\n");
      out.write("\t\t\t\t\tn:<input type=\"radio\" name=\"cal_schk\" value=\"n\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=2>\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"완료\" /> \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"cal_sdchk\" value=\"0\"> \r\n");
      out.write("\t</form>\r\n");
      out.write("\t<button onClick=\"location.href='/'\">돌아가기</button>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("\tchkSdchk();\r\n");
      out.write("\r\n");
      out.write("\tfunction chkSdchk(){\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype :\"get\",\r\n");
      out.write("\t\t\turl : \"myGroup\",\r\n");
      out.write("\t       \tdataType : \"json\",\r\n");
      out.write("\t       \tsuccess : function(data){\r\n");
      out.write("\t        \tvar temp = Handlebars.compile($(\"#temp\").html());\r\n");
      out.write("\t            $(\"#joinedGroup\").html(temp(data));\r\n");
      out.write("\t            $(\"#joinedMember\").html(\"개인일정입니다. \");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t//서밋했을때\r\n");
      out.write("\t$(frm).submit(function(e) {\r\n");
      out.write("\t\te.preventDefault();\r\n");
      out.write("\t\tvar selectG_code = $(\"#joinedGroup\").val();\r\n");
      out.write("\t\tvar cal_sdchk = selectG_code;\r\n");
      out.write("\t\tif(selectG_code == \"0\"){\r\n");
      out.write("\t\t\tcal_sdchk = \"no\";\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t$(frm.cal_sdchk).val(cal_sdchk);\r\n");
      out.write("\t\tfrm.submit();\r\n");
      out.write("\t})\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t$(\"#joinedGroup\").on(\"change\",function(){\r\n");
      out.write("\t\tvar selectG_code = $(\"#joinedGroup\").val();\r\n");
      out.write("\t    if(selectG_code != \"0\"){\r\n");
      out.write("\t    \t$.ajax({\r\n");
      out.write("\t        \ttype :\"get\",\r\n");
      out.write("\t          \turl : \"guget\",\r\n");
      out.write("\t          \tdataType : \"json\",\r\n");
      out.write("\t          \tdata : {\"g_code\" : selectG_code},\r\n");
      out.write("\t          \tsuccess : function(data){\r\n");
      out.write("\t            \tvar temp = Handlebars.compile($(\"#temp1\").html());\r\n");
      out.write("\t               \t$(\"#joinedMember\").html(temp(data));\r\n");
      out.write("\t          \t}\r\n");
      out.write("\t      \t});\r\n");
      out.write("\t   \t}else{\r\n");
      out.write("\t    \tvar str=\"개인 일정입니다.\"\r\n");
      out.write("\t        $(\"#joinedMember\").html(str);\r\n");
      out.write("\t   \t}\r\n");
      out.write("\t})\r\n");
      out.write("</script>\r\n");
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
