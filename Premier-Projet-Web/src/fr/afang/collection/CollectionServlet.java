package fr.afang.collection;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CollecttionServlet
 */
@WebServlet("/CollectionServlet")
public class CollectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CollectionServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<String>tabCollection= new ArrayList<String>();
		tabCollection.add("Lait");
		tabCollection.add("Pain");
		tabCollection.add("Eau");
		tabCollection.add("Yaourt");
		tabCollection.add("Fromage");
		tabCollection.add("Poisson");
		tabCollection.add("Pates");
		tabCollection.add("Pizza");
		tabCollection.add("Riz");
		tabCollection.add("Baguette");
		tabCollection.add("Céréales");
		tabCollection.add(0, "chocolat");
		tabCollection.remove(0);
		tabCollection.remove("Fromage");
		
		
		request.setAttribute("tabCollection", tabCollection);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/collection.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
