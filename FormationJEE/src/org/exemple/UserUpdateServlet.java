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
 * Servlet implementation class UserUpdateServlet
 */
@WebServlet("/user/update")
public class UserUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String id = request.getParameter("id");
		String nom =request.getParameter("nom");
		String prenom =request.getParameter("prenom");
		String adresse =request.getParameter("adresse");
		User u = new User();
		u.setId(Integer.parseInt(id));
		u.setNom(nom);
		u.setPrenom(prenom);
		u.setAdresse(adresse);
		UserManager.getInstance().update(u);
		
		
		// affichage
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Update de l'utilisateur</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>l'utilisateur a été mis a jour</h1>");
		out.println("<br>");
		out.println("<a href='list'> Lien vers la liste des utilisateurs</a>");
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
