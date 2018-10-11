package fr.afang.oiseaux;

public class Oiseau {
	
	protected String nom;
	protected  int taille ;
	protected  int poids ;
	protected  String race;
	protected  boolean plumes;

	//Constructeur sans Params
		public Oiseau() {}

		//constructeur avec params
		public Oiseau (String nomP, int tailleP, int poidsP, String raceP, boolean plumesP) {
			
			nom = nomP;
			taille= tailleP;
			poids= poidsP;
			plumes = plumesP;
			race = raceP;
		}	
		public void manger() {
			System.out.println(nom + " aime manger");
		}
		public void boire() {
			System.out.println(nom + " boit de l'eau");
		}
		
		public void jouer() {
			System.out.println(nom + " joue");
		}
		public void courrir() {
			System.out.println(nom + " cours");
		}
		public void sauter() {
			System.out.println(nom + " saute bien");
		}
			
		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public int getTaille() {
			return taille;
		}

		public void setTaille(int taille) {
			this.taille = taille;
		}

		public int getPoids() {
			return poids;
		}

		public void setPoids(int poids) {
			this.poids = poids;
		}

		public String getRace() {
			return race;
		}

		public void setRace(String race) {
			this.race = race;
		}

		public boolean isPlumes() {
			return plumes;
		}

		public void setPlumes(boolean plumes) {
			this.plumes = plumes;
		}
}

