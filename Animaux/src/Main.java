
public class Main {

	public static void main(String[] args) {
		System.out.println("Début du programme : ");
		Chien popy = new Chien();
		popy.nom = "Popy";
		popy.taille= 5;
		popy.poids = 15;
		popy.couleur = "noir";
		popy.race = "bull";
	System.out.println("------------------------------------");
		
		System.out.println("Nom : " + popy.nom);
		System.out.println("taille : " + popy.taille);
		System.out.println("poids : " + popy.poids);
		System.out.println("couleur : " + popy.couleur);
		System.out.println("race : " + popy.race);
		
		popy.manger();
		popy.dormir ();
		popy.jouer();
		popy.aboyer();
		popy.mordre();
		
				
	}

}
