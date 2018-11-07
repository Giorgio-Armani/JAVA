package fr.afang.client.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.afang.client.business.IClientBusiness;
import fr.afang.client.business.impl.ClientBusinessImpl;
import fr.afang.client.domain.Client;

/**
 * Servlet implementation class ClientsServlet
 */
@WebServlet("/client")
public class ClientsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IClientBusiness clientBusiness = new ClientBusinessImpl();
    
    
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Client> clients = clientBusiness.findAll();
		
		request.setAttribute("client", clients);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/client/client.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
