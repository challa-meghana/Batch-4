

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Addservlet extends HttpServlet {
	

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String a=request.getParameter("a");
		String b=request.getParameter("b");
		int sum=Integer.parseInt(a)+Integer.parseInt(b);
		out.print("the sum of two numbers is"+sum);

}
}