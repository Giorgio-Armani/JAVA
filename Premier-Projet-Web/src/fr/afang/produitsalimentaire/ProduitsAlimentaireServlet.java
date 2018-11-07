package fr.afang.produitsalimentaire;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.afang.bean.Produits;

/**
 * Servlet implementation class ProduitsAlimentaireServlet
 */
@WebServlet("/ProduitsAlimentaire")
public class ProduitsAlimentaireServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProduitsAlimentaireServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Produits abricotP = new Produits("abricot", 10.0, "Ressources/Images/abricot.jpg");
		Produits avocatP = new Produits("avocat", 15.0, "Ressources/Images/avocat.jpg");
		Produits fromageP =  new Produits("fromage", 12.00, "Ressources/Images/fromage.jpg");
		Produits gigotAgneauP = new Produits("gigotAgneau", 100.0, " Ressources/Images/gigot-agneau.jpg");
	    Produits bonbonP = new Produits("bonbon", 10.0, " Ressources/Images/bar-a-bonbons-600x531.jpg");	
	    Produits lentilleP = new Produits("lentille", 16.0, "Ressources/Images/lentille-corail-vrac-bio.jpg ");
	    Produits levureChimiqueP = new Produits("levureChimique", 8.0, "Ressources/Images/Levure-Chimique-X-10.jpg");
		
	    ArrayList<Produits>tabProduitsAlimentaire= new ArrayList<Produits>();
	    tabProduitsAlimentaire.add(abricotP);
	    tabProduitsAlimentaire.add(avocatP);
	    tabProduitsAlimentaire.add(fromageP);
	    tabProduitsAlimentaire.add(gigotAgneauP);
	    tabProduitsAlimentaire.add(bonbonP);
	    tabProduitsAlimentaire.add(lentilleP);
	    tabProduitsAlimentaire.add(levureChimiqueP);
		
	    request.setAttribute("tabProduitsAlimentaires", tabProduitsAlimentaire);
		
				
		this.getServletContext().getRequestDispatcher("/WEB-INF/produitsAlimentaire.jsp").forward(request,response);
//		String abricot = "fruit";
//		String avocat = "fruits";
//		String fromage = "laitier";
//		String gigotAgneau = "animal";
//		String bonbon = "sucrerie";
//		String lentille = "haricot";
//		String levureChimique = "epicerie";
//		
//		
//		request.setAttribute("monabricot",abricot);
//		request.setAttribute("monavocat", avocat);
//		request.setAttribute("monfromage", fromage);
//		request.setAttribute("monagneau", gigotAgneau);
//		request.setAttribute("mesbonbons", bonbon);
//		request.setAttribute("meslentilles", lentille);
//		request.setAttribute("chimique", levureChimique);
//		
//		Double prixabricot = 10.0;
//		Double prixavocat = 15.0;
//		Double prixfromage = 12.0;
//		Double prixgigotAgneau = 100.0;
//		Double prixbonbon = 10.0;
//		Double prixlentille = 16.0;
//		Double prixlevureChimique = 8.0;
//		
//		request.setAttribute("abricot", prixabricot);
//		request.setAttribute("avocat", prixavocat);
//		request.setAttribute("fromage", prixfromage);
//		request.setAttribute("gigotAgneau", prixgigotAgneau);
//		request.setAttribute("bonbon", prixbonbon);
//		request.setAttribute("lentille", prixlentille);
//		request.setAttribute("levureChimique", prixlevureChimique);
//		
//		String imgabricot="Ressources/Images/abricot.jpg";
//		String imgavocat ="Ressources/Images/avocat.jpg";
//		String imgfromage ="Ressources/Images/fromage.jpg";
//		String imgbonbon =" Ressources/Images/bar-a-bonbons-600x531.jpg";			
//		String imggigotAgneau =" Ressources/Images/gigot-agneau.jpg";
//		String imglentille ="Ressources/Images/lentille-corail-vrac-bio.jpg ";
//		String imglevureChimique ="Ressources/Images/Levure-Chimique-X-10.jpg ";
//		
//		request.setAttribute("abricotImg", imgabricot);
//		request.setAttribute("avocatImg", imgavocat);
//		request.setAttribute("fromageImg", imgfromage);
//		request.setAttribute("bonbonImg", imgbonbon);
//		request.setAttribute("agneauImg", imggigotAgneau);
//		request.setAttribute("lentilleImg", imglentille);
//		request.setAttribute("levureImg", imglevureChimique);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
