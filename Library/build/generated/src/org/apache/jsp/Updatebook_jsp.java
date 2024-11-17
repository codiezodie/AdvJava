package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Updatebook_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <title>Zpadd - Update Book</title>\n");
      out.write("  <style>\n");
      out.write("    /* General Reset */\n");
      out.write("    * {\n");
      out.write("      margin: 0;\n");
      out.write("      padding: 0;\n");
      out.write("      box-sizing: border-box;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* Body Styling with Gradient Background */\n");
      out.write("    body {\n");
      out.write("      font-family: Arial, sans-serif;\n");
      out.write("      background: linear-gradient(135deg, #E6E6FA, #FFDDC1);\n");
      out.write("      color: #333;\n");
      out.write("      display: flex;\n");
      out.write("      justify-content: center;\n");
      out.write("      align-items: flex-start;\n");
      out.write("      flex-direction: column;\n");
      out.write("      min-height: 100vh;\n");
      out.write("      padding: 40px;\n");
      out.write("      background: linear-gradient(135deg, rgba(230, 230, 250, 0.8), rgba(255, 221, 193, 0.8)), \n");
      out.write("                  url('https://st.depositphotos.com/2397583/2655/v/600/depositphotos_26558067-stock-illustration-pattern-for-girls-with-books.jpg');\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* Header Styling */\n");
      out.write("    h1 {\n");
      out.write("      font-size: 2rem;\n");
      out.write("      color: #FF0080;\n");
      out.write("      text-decoration: underline;\n");
      out.write("      text-decoration-style: wavy;\n");
      out.write("      margin-bottom: 20px;\n");
      out.write("      text-align: center;\n");
      out.write("      width: 100%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* Update Book Form Container */\n");
      out.write("    .update-book-container {\n");
      out.write("      background-color: #fff;\n");
      out.write("      padding: 20px;\n");
      out.write("      border-radius: 8px;\n");
      out.write("      box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("      width: 100%;\n");
      out.write("      max-width: 500px;\n");
      out.write("      margin: 0 auto;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* Form Group Styling */\n");
      out.write("    .form-group {\n");
      out.write("      margin-bottom: 15px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    label {\n");
      out.write("      display: block;\n");
      out.write("      font-weight: bold;\n");
      out.write("      margin-bottom: 5px;\n");
      out.write("      color: #333;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    select,\n");
      out.write("    input[type=\"text\"],\n");
      out.write("    input[type=\"date\"] {\n");
      out.write("      width: 100%;\n");
      out.write("      padding: 10px;\n");
      out.write("      font-size: 1rem;\n");
      out.write("      border-radius: 4px;\n");
      out.write("      border: 1px solid #ddd;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* Submit Button */\n");
      out.write("    .submit-btn {\n");
      out.write("      width: 100%;\n");
      out.write("      padding: 10px;\n");
      out.write("      font-size: 1rem;\n");
      out.write("      font-weight: bold;\n");
      out.write("      color: #fff;\n");
      out.write("      background-color: #FF0080;\n");
      out.write("      border: none;\n");
      out.write("      border-radius: 4px;\n");
      out.write("      cursor: pointer;\n");
      out.write("      transition: background-color 0.3s ease;\n");
      out.write("      margin-top: 20px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .submit-btn:hover {\n");
      out.write("      background-color: #FF4C8B;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <h1>Zpadd - Update Book</h1>\n");
      out.write("\n");
      out.write("  <!-- Display Success or Error Message -->\n");
      out.write("  <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty successMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("    <div class=\"success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${successMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("  </c:if>\n");
      out.write("  <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("    <div class=\"error\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("  </c:if>\n");
      out.write("\n");
      out.write("  <div class=\"update-book-container\">\n");
      out.write("    <h2>Update Book Information</h2>\n");
      out.write("\n");
      out.write("    <form method=\"POST\" action=\"Updatebook\">\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"bookSelect\">Select Book</label>\n");
      out.write("        <select id=\"bookSelect\" name=\"bookSelect\" required>\n");
      out.write("          <option value=\"\" disabled selected>Select a book</option>\n");
      out.write("          ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bookOptions}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <!-- Dynamically generated book options will appear here -->\n");
      out.write("        </select>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"publisherName\">New Publisher Name</label>\n");
      out.write("        <input type=\"text\" id=\"publisherName\" name=\"publisherName\" required>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"category\">Category</label>\n");
      out.write("        <input type=\"text\" id=\"category\" name=\"category\" required>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <button type=\"submit\" class=\"submit-btn\">Update Book</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("</body>\n");
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
}
