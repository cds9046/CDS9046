/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.5
 * Generated at: 2020-12-28 07:00:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class master_005fuserManage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1605611870166L));
    _jspx_dependants.put("jar:file:/D:/Spring%20WorkSpace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/FP/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/myPageAD.css\" />\r\n");
      out.write("<title>관리자 마이페이지_회원관리</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("</div>\r\n");
      out.write("\t<!-- 전체 페이지 시작  -->\r\n");
      out.write("\t<div class=\"mainpages\">\r\n");
      out.write("\t<div id=\"div_contents\" class=\"contents\">\r\n");
      out.write("\t\t<!-- 공지영역&목록 영역 전체 -->\r\n");
      out.write("\t\t<div class=\"board_wrap01\">\r\n");
      out.write("\t\t\t<!-- 왼쪽 메뉴 -->\r\n");
      out.write("\t\t\t<div class=\"board_ty_list\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"master_userManage\">회원 관리</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"master_clubManage\">동아리 관리</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"master_groupManage\">모임 관리</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- 왼쪽 메뉴 끝 -->\r\n");
      out.write("\t\t\t<!-- 오른쪽 회원검색 역역  -->\r\n");
      out.write("\t\t\t<div class=\"sub_sps_sch\">\r\n");
      out.write("\t\t\t\t<div class=\"search_box\"> \r\n");
      out.write("\t\t\t\t\t<select name=\"searchType\" id=\"sfl\" class=\"select-cus\">\r\n");
      out.write("\t\t\t\t\t\t<option id=\"id\" value=\"id\">ID</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"name\">이름</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"birthday\">생년월일</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"email\">Email</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"gender\">성별</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"u_keyword\">키워드</option>\r\n");
      out.write("\t\t\t\t\t</select> \r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"stx\" class=\"frm_input required\" style=\"width: 50%;\" size=\"15\" maxlength=\"20\" >\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"검색하기\" class=\"btn_submit\" id=\"btnSearch\" style=\"width: 70px;\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<button class=\"del_all\" id=\"del_all\">선택삭제</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- 전체유저수:<span id=\"total\"></span> -->\r\n");
      out.write("\t\t\t<table class=\"clupMain\" id=\"clupMain\"> </table>\r\n");
      out.write("\t\t\t<table id=\"result\" class=\"resultUser\" ></table>\r\n");
      out.write("\t\t\t<script id=\"temp\" type=\"text/x-handlebars-template\">\r\n");
      out.write("\t\t\t\t<thead>                                       \r\n");
      out.write("\t            \t<tr style=\"margin-bottom: 15px;\">\r\n");
      out.write("\t                \t<th class=\"u_select\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"checkAll\">\r\n");
      out.write("\t\t\t\t\t\t</th>\r\n");
      out.write("\t                  \t<th class=\"u_id\">아이디</th>\r\n");
      out.write("\t                  \t<th class=\"u_name\">이름</th>\r\n");
      out.write("\t                  \t<th class=\"u_birthday\">생년월일</th>\r\n");
      out.write("\t                  \t<th class=\"u_email\">이메일</th>\r\n");
      out.write("\t                  \t<th class=\"u_gender\">성별</th>\r\n");
      out.write("\t                  \t<th class=\"u_keyword\">키워드</th>\r\n");
      out.write("\t            \t</tr>\r\n");
      out.write("\t            </thead>\r\n");
      out.write("\t       \r\n");
      out.write("            {{#each mulist}}\r\n");
      out.write("\t\t\t\t<tr class=row uid=\"{{id}}\">\r\n");
      out.write("            \t\t<td class=\"chk\"><input class=\"check\"  type=\"checkbox\"></td>\r\n");
      out.write("                \t<td>{{id}}</td>\r\n");
      out.write("                \t<td>{{name}}</td>\r\n");
      out.write("                \t<td>{{birthday}}</td>\r\n");
      out.write("                \t<td>{{email}}</td>\r\n");
      out.write("                \t<td>{{gender}}</td>\r\n");
      out.write("                \t<td>{{u_keyword}}</td>\r\n");
      out.write("            \t</tr>\r\n");
      out.write("            \t<hr>\r\n");
      out.write("            {{/each}}\r\n");
      out.write("            </script>\r\n");
      out.write("\t\t\t<!-- 오른쪽 회원검색 끝  -->\r\n");
      out.write("\t\t\t<!-- 오른쪽 동아리검색 역역  -->\r\n");
      out.write("\t\t\t<!-- 오른쪽 모임검색 끝  -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"page_wrap\">\r\n");
      out.write("\t\t\t<div class=\"page_nation\" id=\"page_nation\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- 하단영역 끝 -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 전체 페이지 끝  -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("\tvar page = 1;\r\n");
      out.write("\tvar keyword = $(\"#stx\").val();\r\n");
      out.write("\tvar searchType = $(\"#sfl\").val();\r\n");
      out.write("\t\r\n");
      out.write("\tgetList();\r\n");
      out.write("\t\r\n");
      out.write("\t//페이지네이션\r\n");
      out.write("\t$(\"#page_nation\").on(\"click\", \"a\", function(e) {\r\n");
      out.write("\t\te.preventDefault();\r\n");
      out.write("\t\tpage = $(this).attr(\"href\");\r\n");
      out.write("\t\tgetList();\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t//검색\r\n");
      out.write("\t$(\"#btnSearch\").on(\"click\",function(){\r\n");
      out.write("\t\tgetList();\r\n");
      out.write("\t});\r\n");
      out.write("\t$(\"#stx\").keydown(function(key){\r\n");
      out.write("\t\tif(key.keyCode==13){\r\n");
      out.write("\t\t\tgetList();\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t//체크박스선택삭제\r\n");
      out.write(" \t$(\"#del_all\").on(\"click\", function() {\r\n");
      out.write(" \t\tif (!confirm(\"선택한 사용자를 삭제하시겠습니까?\")) return;\r\n");
      out.write(" \t\t$(\"#clupMain .row .check:checked\").each(function() {\r\n");
      out.write(" \t\t\tif ($(this).is(\":checked\")) {\r\n");
      out.write(" \t\t\t\tvar row =$(this).parent().parent();\r\n");
      out.write(" \t\t\t\tvar uid =row.attr(\"uid\");\r\n");
      out.write(" \t\t\t\t$.ajax({\r\n");
      out.write(" \t \t\t\t\ttype : \"post\",\r\n");
      out.write(" \t \t\t\t\turl : \"user_sel_delete\",\r\n");
      out.write(" \t \t\t\t\tdata : { \"id\" : uid },\r\n");
      out.write(" \t \t\t\t\tsuccess : function() { }\r\n");
      out.write(" \t \t\t\t});\r\n");
      out.write("\t\t\t}\t\t\r\n");
      out.write(" \t\t});\r\n");
      out.write("\t\talert(\"삭제를 완료하였습니다\");\t\r\n");
      out.write(" \t\tgetList();\r\n");
      out.write(" \t});\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\tfunction getList() {\r\n");
      out.write("\t\tkeyword = $(\"#stx\").val();\r\n");
      out.write("\t\tsearchType = $(\"#sfl\").val();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype : \"get\",\r\n");
      out.write("\t\t\turl : \"mulist\",\r\n");
      out.write("\t\t\tdata : {\"page\":page,\"keyword\":keyword,\"searchType\":searchType},\r\n");
      out.write("\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\tvar temp = Handlebars.compile($(\"#temp\").html());\r\n");
      out.write("\t\t\t\t$(\"#clupMain\").html(temp(data));\r\n");
      out.write("\t\t\t\t$(\"#total\").html(data.pm.totalCount);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(data.pm.totalCount=='0'){\r\n");
      out.write("\t\t        \t$(\"#result\").html(\"검색결과가 없습니다\");\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t           \tvar str=\"\";\r\n");
      out.write("\t           \tvar endPage=0;\r\n");
      out.write("\t           \tif(data.pm.prev){\r\n");
      out.write("\t           \t\tstr += \"<a  class='arrow pprev' href='1'></a>\";\r\n");
      out.write("\t                str += \"<a  class='arrow prev' href='\"+ (data.pm.startPage-1) +\"'></a>\"\r\n");
      out.write("\t\t        }       \r\n");
      out.write("\t           \tfor(var i=data.pm.startPage; i<=data.pm.endPage; i++){\r\n");
      out.write("\t                 if(page==i){\r\n");
      out.write("\t                    str += \"<a href='\"+ i +\"' class='active'>\" + i +\"</a>\";\r\n");
      out.write("\t                    endpage=i;\r\n");
      out.write("\t                 }else{\r\n");
      out.write("\t                    str += \"<a href='\"+ i +\"'>\" + i +\"</a>\";\r\n");
      out.write("\t                    endpage=i;\r\n");
      out.write("\t                 }\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t       \t\tif(data.pm.next){\r\n");
      out.write("\t       \t\t\tstr += \"<a  class='arrow pprev' href='\"+endpage+\"'></a>\";\r\n");
      out.write("\t                str += \"<a  class='arrow next' href='\"+(data.pm.endPage+1)+\"'></a>\";\r\n");
      out.write("\t            }\r\n");
      out.write("\t       \t\t$(\"#page_nation\").html(str);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t       \t\t\r\n");
      out.write("\t\t\t\t//전체체크\r\n");
      out.write("\t\t\t\t$(\"#checkAll\").on(\"change\", function(){\r\n");
      out.write("\t\t\t\t\t$(\"#clupMain .check\").prop('checked', $(this).prop('checked'));\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t//삭제버튼삭제(핸들바안에있어서 ajax안에 넣어줌)\r\n");
      out.write("\t\t\t\t$(\"#clupMain\").on(\"click\",\".row button\", function(){\r\n");
      out.write("\t\t\t\t\tvar row =$(this).parent().parent();\r\n");
      out.write("\t\t\t\t\tvar uid =row.attr(\"uid\");\r\n");
      out.write("\t\t\t\t\tif(!confirm(uid+\"을(를) 삭제하시겠습니까?\")) return;\r\n");
      out.write("\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\t\t\t\turl:\"user_sel_delete\",\r\n");
      out.write("\t\t\t\t\t\tdata:{\"id\":uid},\r\n");
      out.write("\t\t\t\t\t\tsuccess:function(){\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#btnSearch\").click();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
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
