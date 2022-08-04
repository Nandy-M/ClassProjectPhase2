package com.servlets.example;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginChecker")
public class LoginChecker extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LoginChecker() {
        super();
        // TODO Auto-generated constructor stub
    }	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("textUsername");
		String password=request.getParameter("textPassword");
		PrintWriter out=response.getWriter();
		if(username.equalsIgnoreCase("Nandhini") && password.equals("123")){
			out.println("You are Welcomed");
		}
		else
			out.println("Invalid Username or Password");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username=request.getParameter("textUsername");
		String password=request.getParameter("textPassword");
		
		PrintWriter out=response.getWriter();
		//RequestDispatcher- an interface to include content on same page or different pages
		RequestDispatcher rd;
		if(username.equalsIgnoreCase("Nandhini") && password.equals("123")){
			//session object is created by web container and generate session id
			HttpSession session=request.getSession(true);//create a new object and store its reference in session object
			session.setAttribute("username", username);
			
			rd=request.getRequestDispatcher("Welcome");// request will send to welcome servlet using request dispatcher
			rd.forward(request, response);
		}
		else {
			out.println("Invalid Username or Password");
			rd=request.getRequestDispatcher("LoginForm.html");
			rd.include(request, response);
		}
	}
}