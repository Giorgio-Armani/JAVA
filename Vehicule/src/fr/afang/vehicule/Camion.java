package fr.afang.vehicule;

public class Camion extends Vehicule {
	
	private int capacite ;

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public Camion() {
		super();
		
	}

	public Camion(String marqueV, String couleurV, int vitesseV, int puissanceV, int prixV, int kilometrageV, int capaciteV) {
		super(marqueV, couleurV, vitesseV, puissanceV, prixV, kilometrageV);
		this.capacite=capaciteV;
		
	}
	
	

}
