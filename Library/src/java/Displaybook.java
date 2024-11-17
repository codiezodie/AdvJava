import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList;
import java.util.List;

// Book model class to hold book details
class Book {
    private final int bookId;
    private final String bookName;
    private final String authorName;
    private final String category;

    // Constructor, getters, and setters
    public Book(int bookId, String bookName, String authorName, String category) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.category = category;
    }

    public int getBookId() { return bookId; }
    public String getBookName() { return bookName; }
    public String getAuthorName() { return authorName; }
    public String getCategory() { return category; }
}

public class Displaybook extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> books = new ArrayList<>();
        
        // Database connection
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", ""); // replace with actual password
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM books");

            // Collect books from database
            while (rs.next()) {
                books.add(new Book(rs.getInt("BookId"), rs.getString("BookName"), rs.getString("AuthorName"), rs.getString("Category")));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Set the books as a request attribute and forward to JSP
        request.setAttribute("books", books);
        RequestDispatcher rd = request.getRequestDispatcher("Displaybook.jsp");
        rd.forward(request, response);
    }
}
