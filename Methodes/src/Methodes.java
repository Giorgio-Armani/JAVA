
public class Methodes {
// public static typeDeRetour nomDeMethode(args....){
// }	
	public static void main(String[] args) {
		System.out.println("resultat addition :" );
		int resultat = addition(12,15);
		System.out.println(resultat);
		System.out.println(addition(15,16));
		System.out.println(addition(15,16));
		
		
		
		System.out.println("resultat soustraction :");
		int resultat1 = soustraction(12,15);
		System.out.println(resultat1);
		System.out.println(soustraction(15,10));
		System.out.println(soustraction(17,9));
	}
	
	
	
	/*
	 * Declaration de la methode addition
	 */
	public static int addition(int nombre1, int nombre2) {
		int resultat = nombre1 + nombre2;
		return resultat;
	}
	

	
	public static int soustraction(int nombre1, int nombre2) {
		int resultat = nombre1 - nombre2;
		return resultat;
}   
	
	
}