package Package;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/productServlet")
public class productServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		ProductClass product=new ProductClass();
		ArrayList dataList=product.getData(session);
		request.setAttribute("dataList", dataList);
		RequestDispatcher rd = request.getRequestDispatcher("ShowData.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String cost=request.getParameter("cost");
		HttpSession session=request.getSession(false);
		ProductClass product=new ProductClass();
		product.setData(name, cost,session);
		response.setContentType("text/html");
		out.println("product added succesfully !");
		//out.println("<a href='/addProduct.jsp'>1.Add New Employee</a>");
		out.println("<a href='" + getServletContext().getContextPath() + "/addproduct.jsp'>Add New Product</a>");
		//out.println("<a href='" + getServletContext().getContextPath() + "/ShowData.jsp'>Preview added Product</a>");
		out.close();
		
		
//		out.println("name : "+name+"\n"+"cost"+cost);
//		HttpSession session = request.getSession();
//		session.setAttribute("name", name);
		
	}

}