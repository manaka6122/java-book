package Chapter18.code18_6;
import java.io.*;
import java.util.Date;
import java.servlet.http.*;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
  protected void doGet(HttpServletRequest req, HttpServletResponsse res) throws IOException {
    Date d = new Date();
    PrintWriter w = res.getWriter();
    res.setContentType("text/html");
    w.write("<html><body>");
    w.write("Tokyo is" + d.toString());
    w.write("</body></html>");
  }
}
