import java.util.Scanner;

public class ExoMethodes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre1: ") ;
		float nombre1  = sc.nextFloat();
		
		System.out.println("Veuillez choisir l'operation: ") ;
		String operation = sc.next();
		
		System.out.println("Veuillez saisir un nombre2: ") ;
		float nombre2 = sc.nextFloat();
		
		
		float resultat1 = addition (nombre1 , nombre2);
		System.out.println("resultat addition :" + resultat1);
		
		float resultat2 = soustraction (nombre1 , nombre2);		
		System.out.println("resultat soustraction : "+ resultat2);
		
	
	
		
	}
		
		
		
	    /*
		 * Declaration de la methode addition
		 */
		public static float addition(float nombre1, float nombre2) {
			float resultat = nombre1 + nombre2;
			return resultat;
		}
		

		
		public static int soustraction(int nombre1, int nombre2) {
			int resultat = nombre1 - nombre2;
			return resultat;
	}   
		public static float soustraction(float nombre1, float nombre2) {
			float resultat = nombre1 - nombre2;
			return resultat;
		}   
		

	}


