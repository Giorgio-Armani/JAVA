package fr.afang.animal;

public class Lapin extends Animal{
	
	public String nom ;
	public int taille;
	public int poids;
	public String couleur ;
	public String race;
	
	//Constructeur sans Params
	public Lapin () {}

	//constructeur avec params
	public Lapin(String nomP, int tailleP, int poidsP, String couleurP, String raceP) {
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
	public void couine() {
		System.out.println(nom + " couiné");
	}
		

}
