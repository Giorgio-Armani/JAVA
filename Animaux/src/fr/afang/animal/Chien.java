package fr.afang.animal;

public class Chien extends Animal{
	
	
	public Chien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Chien(String nom, int taille, int poids, String couleur, String race) {
		super(nom, taille, poids, couleur, race);
		// TODO Auto-generated constructor stub
	}
	public void aboyer() {
		System.out.println(nom + " aboie");
	}
	public void mordre() {
		System.out.println(nom + " mord");
	}
			
		
}
