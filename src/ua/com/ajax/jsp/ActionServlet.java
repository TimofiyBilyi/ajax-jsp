package ua.com.ajax.jsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ActionServlet() {

	} 

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name=null;
		  name = "Hello "+request.getParameter("user");
		  if(request.getParameter("user").toString().equals("")){
		   name="Hello User";
		  }
		  response.setContentType("text/plain");  
		  response.setCharacterEncoding("UTF-8"); 
		  response.getWriter().write(name); 
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//
	}
}
