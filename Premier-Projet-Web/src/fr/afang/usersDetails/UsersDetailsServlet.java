package fr.afang.usersDetails;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UsersDetailsServlet
 */
@WebServlet("/UsersDetailsServlet")
public class UsersDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsersDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url=request.getParameter("url");
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String dateNaissance=request.getParameter("dateNaissance");
		String telephone=request.getParameter("telephone");
		String ville=request.getParameter("ville");
		String numeroEtRue=request.getParameter("numeroEtRue");
		String email=request.getParameter("email");
		
		request.setAttribute("url", url);
		request.setAttribute("nom", nom);
		request.setAttribute("prenom", prenom);
		request.setAttribute("dateNaissance", dateNaissance);
		request.setAttribute("telephone",telephone);
		request.setAttribute("ville", ville);
		request.setAttribute("numeroEtRue", numeroEtRue);
		request.setAttribute("email", email);		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/usersDetails.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
