package fr.afang.inscriptionOk;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class inscriptionOkServlet
 */
@WebServlet("/inscriptionOkServlet")
public class inscriptionOkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inscriptionOkServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gender = request.getParameter("gender");
		String nom =request.getParameter("nom");
		String prenom =request.getParameter("prenom");
		String dateNaissance =request.getParameter("date-de-naissance");
		String ville=request.getParameter("ville");
		String telephone=request.getParameter("telephone");
		String rue =request.getParameter("rue");
		String departement = request.getParameter("departement");
		String email = request.getParameter("email");
		
		request.setAttribute("gender", gender);
		request.setAttribute("nom", nom);
		request.setAttribute("prenom", prenom);
		request.setAttribute("dateNaissance", dateNaissance);
		request.setAttribute("ville", ville);
		request.setAttribute("telephone", telephone);
		request.setAttribute("rue", rue);
		request.setAttribute("departement", departement);
		request.setAttribute("email", email);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/inscriptionOk.jsp").forward(request,response);
	}

}
