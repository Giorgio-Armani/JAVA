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
 * Servlet implementation class DetailsClient
 */
@WebServlet("/detailsclient")
public class DetailsClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IClientBusiness detailsbusiness = new ClientBusinessImpl();   
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailsClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));
		
		Client client = detailsbusiness.findByid(id);
		
		request.setAttribute("client", client);
		
        		
		this.getServletContext().getRequestDispatcher("/WEB-INF/client/detailsclient.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
