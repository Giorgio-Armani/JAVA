package fr.afang.animal;

public class cheval extends Animal{
	

	public String nom ;
	public int taille;
	public int poids;
	public String couleur ;
	public String race;
	
	//Constructeur sans Params
	public cheval() {}

	//constructeur avec params
	public cheval(String nomP, int tailleP, int poidsP, String couleurP, String raceP) {
		System.out.println("Constructeur avec params ");
		this.nom = nomP;
		taille= tailleP;
		poids= poidsP;
		couleur = couleurP;
		race = raceP;
	}	
	public void manger() {
		System.out.println(nom + " a bien mangé");
	}
	public void dormir() {
		System.out.println(nom + " dort bien");
	}
	public void jouer() {
		System.out.println(nom + " joue partout");
	}
	public void hennir() {
		System.out.println(nom + " miaule");
	}
	public void frapper() {
		System.out.println(nom + " griffe");
	}
}
