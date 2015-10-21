package org.exemple;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MaServlet2
 */
@WebServlet("/MaServlet2")
public class MaServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*response.getWriter().println("bonjour page 2");
		response.setContentType("text/html");*/
		
		PrintWriter out = response.getWriter();
		String nom = request.getParameter("MonNom");
		String prenom = request.getParameter("MonPrenom");
		/*out.println(nom);
		response.getWriter().println();
		response.getWriter().println("<a href='MaServlet1'> Lien vers servlet1</a>");*/
		
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>MaServlet2</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>bonjour :o)</h1>");
		out.println(nom);
		out.println(prenom);
		out.println("<br>");
		out.println("<a href='MaServlet1'> Lien vers page précédente</a>");
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
