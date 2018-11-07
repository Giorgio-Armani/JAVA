package fr.afang.usersDetails;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.afang.bean.Personne;

/**
 * Servlet implementation class UsersDetailsServlet
 */
@WebServlet("/UsersDetailsSessionServlet")
public class UsersDetailsSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsersDetailsSessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		ArrayList<Personne> pers = (ArrayList<Personne>) session.getAttribute("personnes");
		
		Integer id = Integer.valueOf(request.getParameter("id"));
		
		Personne personne = pers.get(id);
		
		request.setAttribute("personne", personne);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/usersDetailsSession.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
