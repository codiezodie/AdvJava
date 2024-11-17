package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Displaybook_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <title>Zpadd - Library Management System</title>\r\n");
      out.write("  <style>\r\n");
      out.write("    /* General Reset */\r\n");
      out.write("    * {\r\n");
      out.write("      margin: 0;\r\n");
      out.write("      padding: 0;\r\n");
      out.write("      box-sizing: border-box;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* Main Container */\r\n");
      out.write("    body {\r\n");
      out.write("      font-family: Arial, sans-serif;\r\n");
      out.write("      background-color: #E6E6FA;\r\n");
      out.write("      color: #333;\r\n");
      out.write("      display: flex;\r\n");
      out.write("      flex-direction: column;\r\n");
      out.write("      align-items: center;\r\n");
      out.write("      min-height: 100vh;\r\n");
      out.write("      padding-top: 20px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* Header */\r\n");
      out.write("    h1 {\r\n");
      out.write("      font-size: 2rem;\r\n");
      out.write("      color: #FF0080;\r\n");
      out.write("      margin-bottom: 20px;\r\n");
      out.write("      text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.2);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .library-container {\r\n");
      out.write("      max-width: 1200px;\r\n");
      out.write("      margin: 20px;\r\n");
      out.write("      display: grid;\r\n");
      out.write("      gap: 20px;\r\n");
      out.write("      grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* Book Card Style with Outline Effect */\r\n");
      out.write("    .book-card {\r\n");
      out.write("      background-color: #fff;\r\n");
      out.write("      border-radius: 8px;\r\n");
      out.write("      box-shadow: 0px 8px 15px rgba(0, 0, 0, 0.15), \r\n");
      out.write("                  0px 4px 10px rgba(255, 0, 128, 0.1),\r\n");
      out.write("                  0px 10px 20px rgba(0, 0, 0, 0.1);\r\n");
      out.write("      overflow: hidden;\r\n");
      out.write("      transition: transform 0.3s ease, box-shadow 0.3s ease;\r\n");
      out.write("      cursor: pointer;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .book-card:hover {\r\n");
      out.write("      transform: translateY(-5px);\r\n");
      out.write("      box-shadow: 0px 12px 20px rgba(0, 0, 0, 0.2), \r\n");
      out.write("                  0px 8px 15px rgba(255, 0, 128, 0.15),\r\n");
      out.write("                  0px 14px 28px rgba(0, 0, 0, 0.15);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* Book Cover */\r\n");
      out.write("    .book-cover {\r\n");
      out.write("      width: 100%;\r\n");
      out.write("      height: 200px;\r\n");
      out.write("      background-color: #ddd;\r\n");
      out.write("      background-size: cover;\r\n");
      out.write("      background-position: center;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* Book Details */\r\n");
      out.write("    .book-details {\r\n");
      out.write("      padding: 15px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .book-title {\r\n");
      out.write("      font-size: 1.1rem;\r\n");
      out.write("      font-weight: bold;\r\n");
      out.write("      color: #333;\r\n");
      out.write("      margin-bottom: 5px;\r\n");
      out.write("      text-overflow: ellipsis;\r\n");
      out.write("      white-space: nowrap;\r\n");
      out.write("      overflow: hidden;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .book-author {\r\n");
      out.write("      font-size: 0.9rem;\r\n");
      out.write("      color: #777;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* Interactive Button */\r\n");
      out.write("    .view-btn {\r\n");
      out.write("      display: block;\r\n");
      out.write("      margin-top: 15px;\r\n");
      out.write("      text-align: center;\r\n");
      out.write("      padding: 10px 0;\r\n");
      out.write("      color: #fff;\r\n");
      out.write("      background-color: #FF0080;\r\n");
      out.write("      border-radius: 5px;\r\n");
      out.write("      font-weight: bold;\r\n");
      out.write("      text-transform: uppercase;\r\n");
      out.write("      text-decoration: none;\r\n");
      out.write("      transition: background-color 0.3s;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .view-btn:hover {\r\n");
      out.write("      background-color: #F4C2C2;\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <!-- Header -->\r\n");
      out.write("  <h1>Zpadd - Library Management System</h1>\r\n");
      out.write("\r\n");
      out.write("  <!-- Main Library Container -->\r\n");
      out.write("  <div class=\"library-container\" id=\"libraryContainer\">\r\n");
      out.write("    <!-- Books will be populated here -->\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <script>\r\n");
      out.write("    // Sample book data\r\n");
      out.write("    const books = [\r\n");
      out.write("      { title: \"The Great Gatsby\", author: \"F. Scott Fitzgerald\", cover: \"https://via.placeholder.com/200x200?text=Book+Cover\" },\r\n");
      out.write("      { title: \"To Kill a Mockingbird\", author: \"Harper Lee\", cover: \"https://via.placeholder.com/200x200?text=Book+Cover\" },\r\n");
      out.write("      { title: \"1984\", author: \"George Orwell\", cover: \"https://via.placeholder.com/200x200?text=Book+Cover\" },\r\n");
      out.write("      { title: \"Pride and Prejudice\", author: \"Jane Austen\", cover: \"https://via.placeholder.com/200x200?text=Book+Cover\" },\r\n");
      out.write("      { title: \"The Catcher in the Rye\", author: \"J.D. Salinger\", cover: \"https://via.placeholder.com/200x200?text=Book+Cover\" },\r\n");
      out.write("      // Add more books as needed\r\n");
      out.write("    ];\r\n");
      out.write("\r\n");
      out.write("    // Display books in the library container\r\n");
      out.write("    const libraryContainer = document.getElementById('libraryContainer');\r\n");
      out.write("\r\n");
      out.write("    books.forEach(book => {\r\n");
      out.write("      // Create book card elements\r\n");
      out.write("      const bookCard = document.createElement('div');\r\n");
      out.write("      bookCard.classList.add('book-card');\r\n");
      out.write("\r\n");
      out.write("      const bookCover = document.createElement('div');\r\n");
      out.write("      bookCover.classList.add('book-cover');\r\n");
      out.write("      bookCover.style.backgroundImage = `url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.cover}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(")`;\r\n");
      out.write("\r\n");
      out.write("      const bookDetails = document.createElement('div');\r\n");
      out.write("      bookDetails.classList.add('book-details');\r\n");
      out.write("\r\n");
      out.write("      const bookTitle = document.createElement('h3');\r\n");
      out.write("      bookTitle.classList.add('book-title');\r\n");
      out.write("      bookTitle.innerText = book.title;\r\n");
      out.write("\r\n");
      out.write("      const bookAuthor = document.createElement('p');\r\n");
      out.write("      bookAuthor.classList.add('book-author');\r\n");
      out.write("      bookAuthor.innerText = `by ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.author}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("`;\r\n");
      out.write("\r\n");
      out.write("      const viewBtn = document.createElement('a');\r\n");
      out.write("      viewBtn.classList.add('view-btn');\r\n");
      out.write("      viewBtn.href = \"#\";\r\n");
      out.write("      viewBtn.innerText = \"View Details\";\r\n");
      out.write("\r\n");
      out.write("      // Assemble book card\r\n");
      out.write("      bookDetails.appendChild(bookTitle);\r\n");
      out.write("      bookDetails.appendChild(bookAuthor);\r\n");
      out.write("      bookDetails.appendChild(viewBtn);\r\n");
      out.write("      bookCard.appendChild(bookCover);\r\n");
      out.write("      bookCard.appendChild(bookDetails);\r\n");
      out.write("\r\n");
      out.write("      // Append to library container\r\n");
      out.write("      libraryContainer.appendChild(bookCard);\r\n");
      out.write("    });\r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
