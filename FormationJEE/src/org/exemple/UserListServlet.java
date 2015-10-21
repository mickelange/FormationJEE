package org.exemple;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.exemple.entities.User;
import org.exemple.entities.UserManager;

/**
 * Servlet implementation class UserListServlet
 */
@WebServlet({"/user/list"})
public class UserListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		displayView(request,response,UserManager.getInstance().getAll());	
	}
	
	
	
	private void displayView(HttpServletRequest request, HttpServletResponse response, List<User> users) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter out =  response.getWriter();
		
		out.println("<html><body><h1>User list</h1><table>");
		for(User u :users){
			
			out.println("<tr>");
			out.println("<td>#" + u.getId()  +"</td>" );
			out.println("<td>" + u.getPrenom()  +"</td>" );
			out.println("<td>" + u.getNom() +"</td>" );
			out.println("<td>" + u.getAdresse()  +"</td>" );
			out.println("<td><a href='detail?id=" + u.getId() +"'>Détails</a></td>" );
			out.println("</tr>");	
		}
		out.println("</table></body></html>");	
	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
