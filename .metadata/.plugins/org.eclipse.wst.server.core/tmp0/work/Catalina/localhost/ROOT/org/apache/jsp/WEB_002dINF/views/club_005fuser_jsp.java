/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.5
 * Generated at: 2020-12-28 04:56:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class club_005fuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1605611870166L));
    _jspx_dependants.put("jar:file:/D:/Spring%20WorkSpace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/FP/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/Spring%20WorkSpace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/FP/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js\"></script>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/resources/css/mainClup.css\">\r\n");
      out.write("<title>동아리 페이지</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("      <div>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("</div>\r\n");
      out.write("      <input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${clubMaster}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"clubMaster\">\r\n");
      out.write("      <div class=\"all_page2\">\r\n");
      out.write("         <div>\r\n");
      out.write("            <img id=\"mainImge\" class=\"mainImg\" src=\"display?fileName=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cvo.c_pic}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("       </div>\r\n");
      out.write("      <div class=\"up_left_page\">\r\n");
      out.write("         <p class=\"mainTitle\">동아리정보</p>\r\n");
      out.write("            <table class=\"c_Information\">\r\n");
      out.write("               <tr>\r\n");
      out.write("                  <td class=\"c_master\"><i class=\"fas fa-crown\" style=\"font-size: 25px; color: yellow;\"></i></td>\r\n");
      out.write("                  <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cvo.c_pid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr>\r\n");
      out.write("                  <td class=\"c_people\"><i class=\"fas fa-male\"\r\n");
      out.write("                     style=\"font-size: 35px; margin-left: 8px; margin-right: 13px;\"></i></td>\r\n");
      out.write("                  <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${maincount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr>\r\n");
      out.write("                  <td class=\"c_Area\"><i class=\"fas fa-map-marker-alt\"\r\n");
      out.write("                     style=\"font-size: 25px; margin-left: 5px; margin-right: 5px;\"></i></td>\r\n");
      out.write("                  <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cvo.c_spot}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <div id=\"btnJoin\"></div>\r\n");
      out.write("         </div>\r\n");
      out.write("      <div class = \"right_page\">\r\n");
      out.write("         <h2 class = \"right_title\">회원관리</h2>         \r\n");
      out.write("           <!-- 회원 리스트 -->\r\n");
      out.write("           <div class=\"board_content\">      \r\n");
      out.write("               <!-- 상단에 버튼 -->\r\n");
      out.write("               <div class=\"btn_all\"></div>   \r\n");
      out.write("               <!-- /상단에 버튼 -->\r\n");
      out.write("               <div>\r\n");
      out.write("                     <table class=\"my_list\">\r\n");
      out.write("                        <tr class=\"my_list_title2\">\r\n");
      out.write("                           <td>ID</td>\r\n");
      out.write("                             <td>즐겨찾기</td>\r\n");
      out.write("                             <td>개인정보 동의</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <!--리스트 5개 12-21 -->\r\n");
      out.write("                        <tr>\r\n");
      out.write("                             <td class=\"my_id\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                             <td class=\"my_Mark\">\r\n");
      out.write("                               <div class=\"switch-field\" style=\"margin-left: 70px; margin-top: 10px; margin-bottom: 10px;\">\r\n");
      out.write("                                 <input type=\"radio\" id=\"radio-one\" name=\"cu_pchk\" value=\"y\" checked/>\r\n");
      out.write("                                 <label for=\"radio-one\">Yes</label>\r\n");
      out.write("                               <input type=\"radio\" id=\"radio-two\" name=\"cu_pchk\" value=\"n\" />\r\n");
      out.write("                               <label for=\"radio-two\">No</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                          </td>\r\n");
      out.write("                             <td class=\"my_Information\">\r\n");
      out.write("                               <div class=\"switch-field\" style=\"margin-left: 70px; margin-top: 10px; margin-bottom: 10px;\">\r\n");
      out.write("                               <input type=\"radio\" id=\"radio-three\" name=\"cu_fchk\" value=\"y\" checked/>\r\n");
      out.write("                               <label for=\"radio-three\">Yes</label>\r\n");
      out.write("                               <input type=\"radio\" id=\"radio-five\" name=\"cu_fchk\" value=\"n\" />\r\n");
      out.write("                               <label for=\"radio-five\">No</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                             </td>\r\n");
      out.write("                             <td style=\"width: 60px;\"><button class=\"my_up\">수정</button></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <!--/리스트 5개 12-21 -->\r\n");
      out.write("                  </table>\r\n");
      out.write("                </div>\r\n");
      out.write("               <div id=\"clubMasterOnly1\">\r\n");
      out.write("                     <table class=\"listUser\" id=\"listUser\"></table>\r\n");
      out.write("                     <script id=\"temp\" type=\"text/x-handlebars-template\">\r\n");
      out.write("                        <tr class=\"list_title2\">\r\n");
      out.write("                           <td><input class=\"all_check\" type=\"checkbox\" id=\"checkAll\"></td>\r\n");
      out.write("                           <td>ID</td>\r\n");
      out.write("                             <td>이름</td>\r\n");
      out.write("                             <td>회원상태</td>\r\n");
      out.write("                             <td>개인정보 동의</td>\r\n");
      out.write("                             <td ><button class=\"btn_all_del\">선택삭제</button></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                  {{#each allCulist}}\r\n");
      out.write("                        <tr class=\"row\" uid=\"{{id}}\">\r\n");
      out.write("                           <td><input class=\"check2\" type=\"checkbox\"></td>\r\n");
      out.write("                           <td class=\"id\">{{id}}</td>\r\n");
      out.write("                             <td class=\"tel\">{{name}}</td>\r\n");
      out.write("                             <td class=\"State\">{{cu_schk}}</td>\r\n");
      out.write("                             <td class=\"Information\">{{cu_pchk}}</td>\r\n");
      out.write("                             <td><button class=\"del_one\" id=\"del_one\">삭제</button></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                  {{/each}}\r\n");
      out.write("               </script>                     \r\n");
      out.write("                 </div>\r\n");
      out.write("               <div class=\"page_wrap\" id=\"clubMasterOnly2\">\r\n");
      out.write("                  <div class=\"page_nation\" id=\"page_nation\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("           </div>             \r\n");
      out.write("           <!-- /회원 리스트  -->\r\n");
      out.write("         </div>\r\n");
      out.write("         \r\n");
      out.write("       <div class=\"down_left_page\">\r\n");
      out.write("         <p class=\"mainTitle\">메뉴</p>\r\n");
      out.write("         <ul class=\"Kategorie\">\r\n");
      out.write("            <li>\r\n");
      out.write("               <button onClick=\"location.href='club_first?c_code=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c_code}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'\" class=\"c_notice\">동아리 메인</button>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("               <button onClick=\"location.href='club_notice?c_code=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c_code}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'\" class=\"c_notice\">공지사항</button>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("               <button onClick=\"location.href='club_board?c_code=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c_code}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'\" class=\"c_free\">자유게시판</button>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("               <button onClick=\"location.href='club_user'\" class=\"c_notice\">회원관리</button>\r\n");
      out.write("            </li>\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("         </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("   </div>                  \r\n");
      out.write("   <div>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("var page = 1;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("//동아리 관리자만 회원명단 확인할 수 있도록 한다.\r\n");
      out.write("$(\"#clubMasterOnly1\").hide();\r\n");
      out.write("$(\"#clubMasterOnly2\").hide();\r\n");
      out.write("\r\n");
      out.write("if($(\"#clubMaster\").val()==1){\r\n");
      out.write("   getList();\r\n");
      out.write("   $(\"#clubMasterOnly1\").show();\r\n");
      out.write("   $(\"#clubMasterOnly2\").show();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("// 페이지네이션\r\n");
      out.write("$(\"#page_nation\").on(\"click\", \"a\", function(e) {\r\n");
      out.write("   e.preventDefault();\r\n");
      out.write("   page = $(this).attr(\"href\");\r\n");
      out.write("   getList();\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("// 회원 명단을 가져온다\r\n");
      out.write("function getList() {\r\n");
      out.write("   $.ajax({\r\n");
      out.write("      type : \"get\",\r\n");
      out.write("      url : \"getClupUser\",\r\n");
      out.write("      data : {\"page\":page},\r\n");
      out.write("      dataType : \"json\",\r\n");
      out.write("      success : function(data) {\r\n");
      out.write("         var temp = Handlebars.compile($(\"#temp\").html());\r\n");
      out.write("         $(\"#listUser\").html(temp(data));\r\n");
      out.write("                     \r\n");
      out.write("              var str=\"\";\r\n");
      out.write("              var endPage=0;\r\n");
      out.write("              if(data.pm.prev){\r\n");
      out.write("                 str += \"<a  class='arrow pprev' href='1'></a>\";\r\n");
      out.write("                str += \"<a  class='arrow prev' href='\"+ (data.pm.startPage-1) +\"'></a>\"\r\n");
      out.write("           }       \r\n");
      out.write("              for(var i=data.pm.startPage; i<=data.pm.endPage; i++){\r\n");
      out.write("                 if(page==i){\r\n");
      out.write("                    str += \"<a href='\"+ i +\"' class='active'>\" + i +\"</a>\";\r\n");
      out.write("                    endpage=i;\r\n");
      out.write("                 }else{\r\n");
      out.write("                    str += \"<a href='\"+ i +\"'>\" + i +\"</a>\";\r\n");
      out.write("                    endpage=i;\r\n");
      out.write("                 }\r\n");
      out.write("         }\r\n");
      out.write("             if(data.pm.next){\r\n");
      out.write("                str += \"<a  class='arrow pprev' href='\"+endpage+\"'></a>\";\r\n");
      out.write("                str += \"<a  class='arrow next' href='\"+(data.pm.endPage+1)+\"'></a>\";\r\n");
      out.write("            }\r\n");
      out.write("             $(\"#page_nation\").html(str);\r\n");
      out.write("         \r\n");
      out.write("             \r\n");
      out.write("         //전체체크\r\n");
      out.write("         $(\"#checkAll\").on(\"change\", function(){\r\n");
      out.write("            $(\"#listUser .check2\").prop('checked', $(this).prop('checked'));\r\n");
      out.write("         });\r\n");
      out.write("            \r\n");
      out.write("         //삭제버튼삭제(핸들바안에있어서 ajax안에 넣어줌)\r\n");
      out.write("         $(\"#listUser\").on(\"click\",\".row button\", function(){\r\n");
      out.write("            var row =$(this).parent().parent();\r\n");
      out.write("            var uid =row.attr(\"uid\");\r\n");
      out.write("            if(!confirm(uid+\"을(를) 삭제하시겠습니까?\")) return;\r\n");
      out.write("            $.ajax({\r\n");
      out.write("               type:\"get\",\r\n");
      out.write("               url:\"deleteCu\",\r\n");
      out.write("               data:{\"id\":uid},\r\n");
      out.write("               success:function(){\r\n");
      out.write("                  alert(\"삭제가 완료되었습니다.\");\r\n");
      out.write("                  location.reload();\r\n");
      out.write("               }\r\n");
      out.write("            });\r\n");
      out.write("         });\r\n");
      out.write("      }\r\n");
      out.write("   });\r\n");
      out.write("}\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/views/club_user.jsp(124,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${clubMaster == 1}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("               <li>\r\n");
        out.write("                  <button onClick=\"location.href='updateClub'\" class=\"c_free\">동아리관리</button>\r\n");
        out.write("               </li>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}