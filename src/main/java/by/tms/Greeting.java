package by.tms;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/greeting")
public class Greeting extends HttpServlet {
    @Override // GET localhost:8080/greeting?name=Test
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");

        resp.setContentType("text/html");
        resp.getWriter().println("<HEAD><TITLE>Greeting by name!</TITLE></HEAD>");
        resp.getWriter().print("<BODY><H1 style=\"color:red;\">Hello " + name + "!</H1>");
        resp.getWriter().println("<img src=\"https://www.creativefabrica.com/wp-content/uploads/2017/03/Hello.jpg\""
                + "alt=\"Hello!\"></BODY>");
    }
}
