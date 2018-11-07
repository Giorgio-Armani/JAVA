package fr.afang.controller.pizza;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.afang.business.pizza.pizzaBusiness;

/**
 * Servlet implementation class SupprimerPizzaServlet
 */
@WebServlet("/supprimer_pizza")
public class SupprimerPizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private pizzaBusiness pizzabz=new pizzaBusiness();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupprimerPizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.valueOf(request.getParameter("id"));
		
		pizzabz.supprimerPizza(id);
		
		response.sendRedirect("pizzas");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
