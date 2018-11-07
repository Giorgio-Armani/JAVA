package fr.afang.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.afang.bean.Personne;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = "besty";
		String Pass = "abcdefg";
		Personne mike = new Personne("Dubois","Mike","02/09/2000","0011223344","8 rue de la main","lille","mike.dubois@gmail.com","mr");
		int nombre1 = 10;
		int nombre2 = 5;
		
		request.setAttribute("michael", mike);
		request.setAttribute("Login", login);
		request.setAttribute("password", Pass);
		request.setAttribute("nombre1", nombre1);
		request.setAttribute("nombre2", nombre2);


	    this.getServletContext().getRequestDispatcher("/WEB-INF/Login.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
