package in.pwskills.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/home")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   static {
	   System.out.println("servlet loading .....");
   }
    public MyServlet() {
    System.out.println("Servlet instantiation .....");   
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet initialization ....");
	}

	
	public void destroy() {
		System.out.println("Server Deinstantiation");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Request Processing Phase ......");
	}

}
