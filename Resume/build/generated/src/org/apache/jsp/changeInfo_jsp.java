package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changeInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("<div class=\"container\" style=\"padding-top: 60px;\">\n");
      out.write("    <h1 class=\"page-header\">Edit Profile</h1>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <!-- left column -->\n");
      out.write("        <div class=\"col-md-4 col-sm-6 col-xs-12\">\n");
      out.write("            <div class=\"text-center\">\n");
      out.write("                <img src=\"\" class=\"avatar img-circle img-thumbnail\" alt=\"avatar\">\n");
      out.write("                <h6>Upload a different photo...</h6>\n");
      out.write("                <input type=\"file\" class=\"text-center center-block well well-sm\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- edit form column -->\n");
      out.write("        <div class=\"col-md-8 col-sm-6 col-xs-12 personal-info\">\n");
      out.write("          \n");
      out.write("            <h3>Personal info</h3>\n");
      out.write("            <form class=\"form-horizontal\" role=\"form\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-lg-3 control-label\">First name:</label>\n");
      out.write("                    <div class=\"col-lg-8\">\n");
      out.write("                        <input class=\"form-control\" value=\"\" name =\"acctFirst\" type=\"text\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-lg-3 control-label\">Last name:</label>\n");
      out.write("                    <div class=\"col-lg-8\">\n");
      out.write("                        <input class=\"form-control\" value=\"\" name =\"acctLast\" type=\"text\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("         \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-lg-3 control-label\">Email:</label>\n");
      out.write("                    <div class=\"col-lg-8\">\n");
      out.write("                        <input class=\"form-control\" value=\"\" name =\"acctEmail\" type=\"text\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-md-3 control-label\">Username:</label>\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("                        <input class=\"form-control\" value=\"\" name =\"acctUser\" type=\"text\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-md-3 control-label\">Password:</label>\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("                        <input class=\"form-control\" value=\"\" name =\"acctPass\" type=\"password\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-md-3 control-label\">Confirm password:</label>\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("                        <input class=\"form-control\" value=\"\" name =\"acctConfirm\" type=\"password\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-md-3 control-label\"></label>\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("                        <input class=\"btn btn-primary\" value=\"Save Changes\" type=\"button\">\n");
      out.write("                        <span></span>\n");
      out.write("                        <input class=\"btn btn-default\" value=\"Cancel\" type=\"reset\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
