
public class ExoTableau1D {

	public static void main(String[] args) {
		int [] entiersPremiers = {2,3,5,7,11,13,17,19,23} ;
		
		int recherche = 17;
		boolean existe = false;
		for (int i = 0; i < entiersPremiers.length; i++) {
			if(recherche == entiersPremiers[i]) {
				System.out.println("Le nombre " + recherche +" Existe dans le tableau");
				existe = true;
				
			}
		}
		System.out.println(existe);
		/*
		 * recherche = 14
		 * la valeur de existe = false;
		 */
		
		/*
		 * recherche = 11
		 * la valeur de existe = true;
		 */
		
		/*
		 * Si la valeur n'existe pas dans le tableau
		 * j'affiche le message le nombre n'existe pas
		 */
        if(existe) {
        	System.out.println("Le nombre " + recherche + " existe dans le tableau");
        }else {
        	System.out.println("Le nombre "+ recherche + " n'existePas dans le tableau");
        }
        
	}
}
