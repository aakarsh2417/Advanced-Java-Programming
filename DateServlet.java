import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
* Servlet implementation class Datetime
*/
@WebServlet("/Datetime")
public class Datetime extends HttpServlet {
private static final long serialVersionUID = 1L; 
 /**
 * @see HttpServlet#HttpServlet()
 */
 public Datetime() {
 super();
 // TODO Auto-generated constructor stub
 }
/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse 
response)
*/
23
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws 
ServletException, IOException {
res.setContentType("html");
PrintWriter out= res.getWriter();
java.util.Date date = new java.util.Date();
out.println("<HTML>"+"<BODY><H1> TODAY DATE IS: </H1>");
out.println("<B>"+date+"</B></BODY></HTML>");
}
}
