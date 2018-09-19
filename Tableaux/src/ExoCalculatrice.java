import java.util.Scanner;

public class ExoCalculatrice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre1: ") ;
		float nombre1  = sc.nextFloat();

		System.out.println("Veuillez choisir l'operation ") ;
		String operation = sc.next();

		System.out.println("Veuillez saisir un nombre2: ") ;
		float nombre2  = sc.nextFloat();
		
		float resultataddition = nombre1 + nombre2;
		float resultatmulti = nombre1 * nombre2;
		float resultatsoustraction = nombre1 - nombre2;
		float resultatdivision = nombre1 / nombre2;

		if(operation.equals("+")){
			System.out.println("Le resultat addition = " + resultataddition); 
		}else if(operation.equals("*")){
			System.out.println("Le resulta multi = " + resultatmulti );
		}else if(operation.equals("-")){
			System.out.println("Le resultat soustraction = " + resultatsoustraction );
		}else if(operation.equals("/")){
			System.out.println("Le resultat division = " + resultatdivision );
		}







	}

}
