package by.tms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class HelloWorld extends HttpServlet {
    @Override // GET localhost:8080
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("<HEAD><TITLE>Hello World!</TITLE></HEAD>");
        resp.getWriter().print("<BODY><H1>Hello World!</H1>");
        resp.getWriter().println("<img src=\"https://www.freecodecamp.org/news/content/images/2022/06/helloWorld.png\""
                + "alt=\"Hello, World!\" width=\"1048\" height=\"640\"></BODY>");
    }
}
