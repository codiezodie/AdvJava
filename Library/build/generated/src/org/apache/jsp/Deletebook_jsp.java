package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Deletebook_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>Zpadd - Delete Book</title>\n");
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
      out.write("      background: linear-gradient(135deg, #FFE5E5, #FFF1C1);\n");
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
      out.write("      color: #FF4C4C;\n");
      out.write("      text-decoration: underline;\n");
      out.write("      text-decoration-style: wavy;\n");
      out.write("      margin-bottom: 20px;\n");
      out.write("      text-align: center;\n");
      out.write("      width: 100%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* Delete Book Form Container */\n");
      out.write("    .delete-book-container {\n");
      out.write("      background-color: #fff;\n");
      out.write("      padding: 20px;\n");
      out.write("      border-radius: 8px;\n");
      out.write("      box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("      width: 100%;\n");
      out.write("      max-width: 500px;\n");
      out.write("      margin: 0 auto;\n");
      out.write("      text-align: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* Warning Message */\n");
      out.write("    .warning-message {\n");
      out.write("      color: #FF4C4C;\n");
      out.write("      font-weight: bold;\n");
      out.write("      margin-bottom: 15px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* Form Group Styling */\n");
      out.write("    .form-group {\n");
      out.write("      margin-bottom: 15px;\n");
      out.write("      text-align: left;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    label {\n");
      out.write("      display: block;\n");
      out.write("      font-weight: bold;\n");
      out.write("      margin-bottom: 5px;\n");
      out.write("      color: #333;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    select {\n");
      out.write("      width: 100%;\n");
      out.write("      padding: 10px;\n");
      out.write("      font-size: 1rem;\n");
      out.write("      border-radius: 4px;\n");
      out.write("      border: 1px solid #ddd;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* Delete Button */\n");
      out.write("    .delete-btn {\n");
      out.write("      width: 100%;\n");
      out.write("      padding: 10px;\n");
      out.write("      font-size: 1rem;\n");
      out.write("      font-weight: bold;\n");
      out.write("      color: #fff;\n");
      out.write("      background-color: #FF4C4C;\n");
      out.write("      border: none;\n");
      out.write("      border-radius: 4px;\n");
      out.write("      cursor: pointer;\n");
      out.write("      transition: background-color 0.3s ease;\n");
      out.write("      margin-top: 20px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .delete-btn:hover {\n");
      out.write("      background-color: #FF0000;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <!-- Header for App Name -->\n");
      out.write("  <h1>Zpadd - Delete Book</h1>\n");
      out.write("\n");
      out.write("  <!-- Delete Book Form Container -->\n");
      out.write("  <div class=\"delete-book-container\">\n");
      out.write("    <!-- Warning Message -->\n");
      out.write("    <p class=\"warning-message\">⚠️ Warning: Deleting a book cannot be undone.</p>\n");
      out.write("\n");
      out.write("    <form method=\"POST\" action=\"Deletebook\">\n");
      out.write("      <!-- Dropdown for Selecting Book to Delete -->\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"bookSelect\">Select Book to Delete</label>\n");
      out.write("        <select id=\"bookSelect\" name=\"bookSelect\" required>\n");
      out.write("    <option value=\"\" disabled selected>Select a book</option>\n");
      out.write("\n");
      out.write("    <!-- Static Book Options -->\n");
      out.write("    <option value=\"100\">The Great Gatsby by F. Scott Fitzgerald - Romance/Drama</option>\n");
      out.write("    <option value=\"101\">To Kill a Mockingbird by Harper Lee - Thriller</option>\n");
      out.write("    <option value=\"102\">1984 by George Orwell - Horror</option>\n");
      out.write("    <option value=\"103\">Pride and Prejudice by Jane Austen - Novel of manners</option>\n");
      out.write("    <option value=\"104\">The Catcher in the Rye by J.D. Salinger - Novel</option>\n");
      out.write("</select>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <!-- Delete Button -->\n");
      out.write("      <button type=\"submit\" class=\"delete-btn\">Delete Book</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
