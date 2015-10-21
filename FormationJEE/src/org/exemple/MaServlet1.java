package org.exemple;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MaServlet1
 */
@WebServlet("/MaServlet1")
public class MaServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*response.getWriter().println("Bonjour page 1");
		response.setContentType("text/html");
		response.getWriter().print("<a href='MaServlet2'> Lien vers servlet2</a>");*/
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>MaServlet1</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Bonjour!</h1>");
		out.println("<form action='MaServlet2' method ='POST'>");
		out.println("nom :<br>");
		out.println("<input type='text' name='MonNom'/>");
		out.println("<br>");
		out.println("prenom :<br>");
		out.println("<input type='text' name='MonPrenom'/>");
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
