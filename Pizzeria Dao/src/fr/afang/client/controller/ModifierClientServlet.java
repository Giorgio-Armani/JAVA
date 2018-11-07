package fr.afang.client.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.afang.client.business.IClientBusiness;
import fr.afang.client.business.impl.ClientBusinessImpl;
import fr.afang.client.domain.Client;

/**
 * Servlet implementation class ModifierClientServlet
 */
@WebServlet("/modifier_client")
public class ModifierClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IClientBusiness modifierbusiness = new ClientBusinessImpl();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifierClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer id = Integer.valueOf(request.getParameter("id"));
		Client client = modifierbusiness.findByid(id);
		 request.setAttribute("client", client);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/client/modifier_client.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		String tel_fixe = request.getParameter("tel_fixe");
		String tel_portable = request.getParameter("tel_portable");
		Integer num_client = Integer.valueOf(request.getParameter("num_client"));
		String email = request.getParameter("email");
		String date_naissance = request.getParameter("date_naissance");
		Integer id = Integer.valueOf(request.getParameter("id"));
		
		
		modifierbusiness.modifierclient(nom,prenom,adresse,tel_fixe,tel_portable,num_client,email,date_naissance, id);
		
		response.sendRedirect("client");
	}

}
