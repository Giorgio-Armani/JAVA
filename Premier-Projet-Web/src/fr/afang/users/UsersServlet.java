package fr.afang.users;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.afang.bean.Personne;

/**
 * Servlet implementation class UsersServlet
 */
@WebServlet("/users")
public class UsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	Personne Obama = new Personne("Obama","Barack","01/10/1960","1122334455","10 rue jean peur","Ohio","barackobama@yahoo.com","Ressources/Images/Barack Obama.jpg");
	Personne Bush = new Personne("Bush","George","02/11/1955","2233445566","5 miles street","Denver","bushgeorge@yahoo.com","Ressources/Images/George Bush jr.jpg");
	Personne Springsteen= new Personne("Springsteen","Bruce","03/9/1960","1122334455","1 downing street","L.A","springsteen@yahoo.com","Ressources/Images/bruce-springsteen.jpg");
	Personne Malcolm = new Personne("Malcolm","X","04/8/1950","1122334455","5 rue malcom","Paris","malcolm@yahoo.com","Ressources/Images/malcom X.jpg");
	Personne Gaye = new Personne("Gaye","Marvin","05/7/1970","1122334455","7 ave belge","Lyon","marvingaye@yahoo.com","Ressources/Images/Marvin Gaye.jpg");
	Personne Michelle = new Personne("Obama","Michelle","06/5/1965","1122334455","5 rue petit jean","NYC","michelleobama@yahoo.com","Ressources/Images/michelle obama-.jpg");
	Personne Collins = new Personne("Phil","Collins","08/2/1952","1122334455","8 downing street","Londres","philcollins@yahoo.com","Ressources/Images/phil collins.jpg");
	Personne Twain = new Personne("Twain","Shania","22/6/1972","1122334455","10 boulevard carnot","Lille","shaniatwain@yahoo.com","Ressources/Images/Shania twain.jpg");
	Personne Turner = new Personne("Turner","Tina","10/11/1954","1122334455","10 rue dela justice","Bordeaux","tinaturner@yahoo.com","Ressources/Images/Tina Turner.jpg");
	
	ArrayList<Personne> p = new ArrayList<Personne>();
	p.add(Obama);
	p.add(Bush);
	p.add(Springsteen);
	p.add(Malcolm);
	p.add(Gaye);
	p.add(Michelle);
	p.add(Collins);
	p.add(Twain);
	p.add(Turner);
	
	request.setAttribute("p", p);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/users.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
