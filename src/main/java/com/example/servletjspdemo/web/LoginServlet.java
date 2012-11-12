package com.example.servletjspdemo.web;

import java.io.*;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns = "/session3")
public class LoginServlet extends HttpServlet {
	ServletConfig config;
    /**
	 * 
	 */

	public void init(ServletConfig config) throws ServletException{
		this.config = config;
		super.init(config);

	}
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {

        HttpSession session = req.getSession();
        //ServletContext context = req.getServletContext();
        session.setMaxInactiveInterval(5);
        Boolean loggedIn = (Boolean) session.getAttribute("loggedIn");
        //Boolean loggedIn = (Boolean) context.getAttribute("loggedIn");
        if (loggedIn == null) {
            loggedIn = new Boolean(false);
        }
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Date lastVisit;
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<head><title>Login Page</title></head>");
        if (loggedIn.booleanValue() == true) {
            // user is already logged in
            username = (String) session.getAttribute("username");
            password = (String) session.getAttribute("password");
            lastVisit = (Date) session.getAttribute("lastVisit");
        	//username = (String) context.getAttribute("username");
            //password = (String) context.getAttribute("password");
            //lastVisit = (Date) context.getAttribute("lastVisit");
        	out.println("<p>Welcome back, " + username);
            out.println("<p>You last visited on " + lastVisit);
            lastVisit = new Date();
            session.setAttribute("lastVisit", lastVisit); 
            //context.setAttribute("lastVisit", lastVisit);
        } else {
            if (username == null) {
                // user has not submitted the form required to log in
                out.println("<h1>Log In</h1>");
                out.println("<form action=\"session3\" " +
                    "method=\"GET\">");
                out.println("<p>Username:");
                out.println("<input type=\"text\" name=\"username\" " +
                    "value=\"\" SIZE=30>");
                out.println("<p>Password:");
                out.println("<input type=\"password\" name=\"password\" " +
                    "value=\"\" SIZE=30>");
                out.println("<p><input type=\"submit\" value=\"log in\">");
                out.println("</form>");
            } else {
                // user has submitted the log in form
                out.println("Logging in " + username);
                session.setAttribute("username", username);
                session.setAttribute("password", password);
                session.setAttribute("loggedIn", new Boolean(true));
                session.setAttribute("lastVisit", new Date());
                //context.setAttribute("username", username);
                //context.setAttribute("password", password);
                //context.setAttribute("loggedIn", new Boolean(true));
                //context.setAttribute("lastVisit", new Date());
                out.println("<a href=\"session3\">Reload Page</a>");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }
}