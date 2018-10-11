package fr.afang.vehicule;

public class Voiture extends Vehicule{
	
	private int nombreDePortes;

	public int getNombreDePortes() {
		return nombreDePortes;
	}

	public void setNombreDePortes(int nombreDePortes) {
		this.nombreDePortes = nombreDePortes;
	}

	public Voiture() {
		super();
		
	}

	public Voiture(String marqueV, String couleurV, int vitesseV, int puissanceV, int prixV, int kilometrageV) {
		super(marqueV, couleurV, vitesseV, puissanceV, prixV, kilometrageV);
		
	}
	
	

	
	
	
	

}
