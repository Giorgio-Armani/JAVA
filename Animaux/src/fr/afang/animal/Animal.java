package fr.afang.animal;

public class Animal {
	
	public String nom;
	public int taille;
	public int poids;
	public String couleur;
	public String race;
	
	public Animal() {}
	
	public Animal(String nom,int taille , int poids, String couleur , String race) {
		nom = nom;
		taille = taille;
		poids = poids;
		couleur = couleur;
		race = race;
	}
	public void manger(){

		System.out.println("miam, miam , miam , c'est bon " );
	}
	public void dormir(){

		System.out.println("................................" );
	}
    public void jouer(){

		System.out.println("Bien fait pour toi" );
		
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

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}
    
}
