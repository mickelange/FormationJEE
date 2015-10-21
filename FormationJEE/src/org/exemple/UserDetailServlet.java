package org.exemple;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.exemple.entities.User;
import org.exemple.entities.UserManager;

/**
 * Servlet implementation class UserDetailServlet
 */
@WebServlet("/user/detail")
public class UserDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("id");
		if(id != null && !id.isEmpty()){
			User u = UserManager.getInstance().getById((Integer.parseInt(id)));
			displayView(request,response,u);		
		}
	}

	private void displayView(HttpServletRequest request, HttpServletResponse response, User u) throws IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>détail de l'utilisateur</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>détail de l'utilisateur</h1>");
		out.println("<form action='update' method ='POST'>");
		out.println("ID :<br>");
		out.println("<input type='text' name ='id' value='"+u.getId()+"'/><br/>");
		out.println("<br>");
		out.println("Nom :<br>");
		out.println("<input type='text' name ='nom' value='"+u.getNom()+"'/>");
		out.println("<br>");
		out.println("prenom :<br>");
		out.println("<input type='text' name ='prenom' value='"+u.getPrenom() +"'/>");
		out.println("<br>");
		out.println("adresse :<br>");
		out.println("<input type='text' name ='adresse' value='"+u.getAdresse() +"'/>");
		out.println("<br>");
		out.println("<button> envoi </button>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html");	
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
