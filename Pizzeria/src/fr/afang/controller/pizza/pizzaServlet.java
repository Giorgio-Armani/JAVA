package fr.afang.controller.pizza;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.afang.bean.pizza;
import fr.afang.business.pizza.pizzaBusiness;

/**
 * Servlet implementation class pizzaServlet
 */
@WebServlet("/pizzas")
public class pizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private pizzaBusiness pizzabz = new pizzaBusiness(); 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pizzaServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<pizza> listepizza = pizzabz.getpizzas();
		request.setAttribute("listepizza", listepizza);
		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pizza/pizzas.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
