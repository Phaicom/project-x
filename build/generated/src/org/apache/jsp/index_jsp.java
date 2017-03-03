package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Project X</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <script src=\"jquery-2.1.4.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Optional theme -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"mystyleIndex.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"animate.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $(\"li\").hover(function() {\n");
      out.write("                    var itemwidth = $(this).width(); /* Getting the LI width */\n");
      out.write("                    $(this).prepend(\"<div class='hover'></div>\"); /* Inserting a blank div into within li above the <a> tag*/\n");
      out.write("                    $(this).find(\"div\").fadeIn('10000').css({'width': itemwidth}); /* Using the itemwidth for the div to display properly*/\n");
      out.write("                    $(this).find(\"ul\").fadeIn('1000').slideDown('10000').css(\"display\", \"block\");\n");
      out.write("                }, function() {\n");
      out.write("\n");
      out.write("                    $(this).find(\"div\").slideUp('1000').fadeOut('1000');/* sliding up and fading out the hover div */\n");
      out.write("                    $(this).find(\"div\").remove();/* removing the <div> code from html at every mouseout event*/\n");
      out.write("                    $(this).find(\"ul\").fadeOut('1000'); /* fading out the sub menu */\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!------nav bar head1-------->    \n");
      out.write("        <nav class=\"navbar navbar-default1\" >\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\" align=\"center\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.jsp\">PROJECT X</a>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div><!---header--->          \n");
      out.write("            </div><!--container--->\n");
      out.write("        </nav><!---nav bar--->\n");
      out.write("\n");
      out.write("        <div class=\"modal fade\" id=\"basicModal\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                            <span class=\"sr-only\">Close</span>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                        <h2>Log in</h2>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <form role=\"form\" action=\"login\" method=\"post\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"user\">User </label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"userid\" \n");
      out.write("                                       placeholder=\"Enter user id\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"password\">Password</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" \n");
      out.write("                                       name=\"password\" placeholder=\"Password\">\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-default\" > Log in </button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"modal fade\" id=\"basicModal\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                            <span class=\"sr-only\">Close</span>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                        <h2>Sign in</h2>\n");
      out.write("                    </div><!---madal head---->\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <form role=\"form\" action=\"#\" method=\"post\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"user\">User </label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"userid\" placeholder=\"Enter user id\">\n");
      out.write("                            </div><!----form group--->\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"password\">Password</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" \n");
      out.write("                                       id=\"password\" placeholder=\"Password\">\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-default\" > Log in </button>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div><!---madal content-->\n");
      out.write("            </div><!-----modal-dailog -->\n");
      out.write("        </div><!--madal fade--->\n");
      out.write("\n");
      out.write("        <!----end-->                              \n");
      out.write("\n");
      out.write("\n");
      out.write("        <!------nav head2------>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-default2\" >\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <ul>\n");
      out.write("                        <div class=\"hover\" style=\"display:block; width:120px;\"></div>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Food </span></a>\n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                <a href=\"http://localhost:8080/ProjectX/categoryServ?cat_id=3\">Dessert</a>\n");
      out.write("                                <a href=\"http://localhost:8080/ProjectX/categoryServ?cat_id=2\">Drink</a>\n");
      out.write("                                <a href=\"http://localhost:8080/ProjectX/categoryServ?cat_id=1\">Food</a>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Fashion</a>\n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                <a href=\"#\">Cloths</a>\n");
      out.write("                                <a href=\"bag.html\">Bag</a>\n");
      out.write("                                <a href=\"shoes.html\">Shoes</a>\n");
      out.write("                                <a href=\"decorations.html\">Accessories</a>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Health & Beauty</a>\n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                <a href=\"cosmetics.html\">Cosmetics</a>\n");
      out.write("                                <a href=\"perfume.html\">Perfume</a>\n");
      out.write("                                <a href=\"skincare.html\">Skin Care</a>\n");
      out.write("                                <a href=\"cleanser.html\">Cleanser</a>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Home & garden</a>\n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                <a href=\"furniture.html\">Furniture</a>\n");
      out.write("                                <a href=\"tools.html\">Tools & Material</a> \n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Mother & Baby </a>\n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                <a href=\"mom.html\">Mother Products</a>\n");
      out.write("                                <a href=\"baby.html\">Baby Products</a>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Technology </a>\n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                <a href=\"comp.html\">Computer & Notebook</a></li>\n");
      out.write("                        <a href=\"smartphone.html\">Phone & Tablet</a>\n");
      out.write("                        <a href=\"elec.html\">Electronic</a>\n");
      out.write("                    </ul>\n");
      out.write("                    </li>               \n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\" role=\"button\" class=\"otherA\"  aria-expanded=\"false\">Other</a>\n");
      out.write("                    </li>   \n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div><!---header--->          \n");
      out.write("            </div><!--container--->\n");
      out.write("        </nav><!---nav bar--->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!----------end nav2----------->\n");
      out.write("\n");
      out.write("        <!-------slide------>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row clearfix\">\n");
      out.write("                <div class=\"col-md-12 column\">\n");
      out.write("                    <div class=\"carousel slide\" id=\"carousel-40732\">\n");
      out.write("                        <ol class=\"carousel-indicators\">\n");
      out.write("                            <li class=\"active\" data-slide-to=\"0\" data-target=\"#carousel-40732\">\n");
      out.write("                            </li>\n");
      out.write("                            <li data-slide-to=\"1\" data-target=\"#carousel-40732\">\n");
      out.write("                            </li>\n");
      out.write("                            <li data-slide-to=\"2\" data-target=\"#carousel-40732\">\n");
      out.write("                            </li>\n");
      out.write("                        </ol>\n");
      out.write("                        <div class=\"carousel-inner\">\n");
      out.write("                            <div class=\"item active\">\n");
      out.write("                                <img alt=\"\" src=\"images/head/head03.png\">\n");
      out.write("                                <div class=\"carousel-caption\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <img alt=\"\" src=\"images/head/head02.png\">\n");
      out.write("                                <div class=\"carousel-caption\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <img alt=\"\" src=\"images/head/head01.png\">\n");
      out.write("                                <div class=\"carousel-caption\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div> \n");
      out.write("                        <a class=\"left carousel-control\" href=\"#carousel-40732\" data-slide=\"prev\">\n");
      out.write("                            <span class=\"glyphicon glyphicon-chevron-left\"></span></a> \n");
      out.write("                        <a class=\"right carousel-control\" href=\"#carousel-40732\" data-slide=\"next\">\n");
      out.write("                            <span class=\"glyphicon glyphicon-chevron-right\"></span></a>\n");
      out.write("                    </div><!----console slide--->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!--------end slide-------->\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4\"><br>\n");
      out.write("                            <div class=\"thumbnail\"><br>\n");
      out.write("                                <img alt=\"300x200\" src=\"images/head/shaow2.jpg\">\n");
      out.write("                                <div class=\"caption\">\n");
      out.write("                                    <h3>สินค้า1</h3>\n");
      out.write("                                    <p>\n");
      out.write("                                        เนื้อหา\n");
      out.write("                                    </p>\n");
      out.write("                                    <p><a class=\"btn\" href=\"#\">View details »</a></p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"thumbnail\"><br>\n");
      out.write("                                <img alt=\"300x200\" src=\"images/head/shaow2.jpg\">\n");
      out.write("                                <div class=\"caption\">\n");
      out.write("                                    <h3>สินค้า1</h3>\n");
      out.write("                                    <p>\n");
      out.write("                                        เนื้อหา\n");
      out.write("                                    </p>\n");
      out.write("                                    <p><a class=\"btn\" href=\"#\">View details »</a></p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4\"><br>\n");
      out.write("                            <div class=\"thumbnail\"><br>\n");
      out.write("                                <img alt=\"300x200\" src=\"images/head/shaow1.jpg\">\n");
      out.write("                                <div class=\"caption\">\n");
      out.write("                                    <h3>\n");
      out.write("                                        สินค้า2\n");
      out.write("                                    </h3>\n");
      out.write("                                    <p>\n");
      out.write("                                        เนื้อหา\n");
      out.write("                                    </p>\n");
      out.write("                                    <p>\n");
      out.write("                                        <a class=\"btn\" href=\"#\">View details »</a>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            ><br>\n");
      out.write("                            <div class=\"thumbnail\"><br>\n");
      out.write("                                <img alt=\"300x200\" src=\"images/head/shaow1.jpg\">\n");
      out.write("                                <div class=\"caption\">\n");
      out.write("                                    <h3>\n");
      out.write("                                        สินค้า2\n");
      out.write("                                    </h3>\n");
      out.write("                                    <p>\n");
      out.write("                                        เนื้อหา\n");
      out.write("                                    </p>\n");
      out.write("                                    <p>\n");
      out.write("                                        <a class=\"btn\" href=\"#\">View details »</a>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4\"><br>\n");
      out.write("                            <div class=\"thumbnail\"><br>\n");
      out.write("                                <img alt=\"300x200\" src=\"images/head/sahow3.jpg\">\n");
      out.write("                                <div class=\"caption\">\n");
      out.write("                                    <h3>\n");
      out.write("                                        สินค้า3\n");
      out.write("                                    </h3>\n");
      out.write("                                    <p>\n");
      out.write("                                        เนื้อหา\n");
      out.write("                                    </p>\n");
      out.write("                                    <p>\n");
      out.write("                                        <a class=\"btn\" href=\"#\">View details »</a>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"thumbnail\"><br>\n");
      out.write("                                <img alt=\"300x200\" src=\"images/head/shaow2.jpg\">\n");
      out.write("                                <div class=\"caption\">\n");
      out.write("                                    <h3>นค้า1</h3>\n");
      out.write("                                    <p>\n");
      out.write("                                        เนื้อหา\n");
      out.write("                                    </p>\n");
      out.write("                                    <p><a class=\"btn\" href=\"#\">View details »</a></p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-------------->                \n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"clearfix\"> </div>\n");
      out.write("\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <hr>\n");
      out.write("            <center>\n");
      out.write("                <p >© SIT KMUTT 2015 | Designed by Project X </p>\n");
      out.write("                <a href=\"#\">About Us</a> &emsp; &emsp;\n");
      out.write("                <a href=\"#\">Contact Us</a> &emsp; &emsp;\n");
      out.write("                <a href=\"#\">Privacy Policy</a> &emsp; &emsp;\n");
      out.write("                <a href=\"#\">Terms & Condition</a>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${! empty user && user.getStatus()==1||user.getStatus()==2||user.getStatus()==3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <!-- window.location.replace(); -->\n");
        out.write("                            ");
        if (_jspx_meth_c_choose_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                              \n");
        out.write("                                <li><a href=\"http://localhost:8080/ProjectX/editProfile.jsp\">Edit Profile</a></li>\n");
        out.write("                                <li><a href=\"http://localhost:8080/ProjectX/History2\">History</a></li>\n");
        out.write("                                <li><a href=\"http://localhost:8080/ProjectX/logout\">Log out</a></li>\n");
        out.write("                                        \n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getStatus()==2||user.getStatus()==3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <li><a href=\"http://localhost:8080/ProjectX/selectShop.jsp\">Shop</a></li>\n");
        out.write("\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li >\n");
        out.write("                                    <a href=\"#\" class=\"login\" data-toggle=\"modal\" data-target=\"#basicModal\" >Log in</a>\n");
        out.write("                                </li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
