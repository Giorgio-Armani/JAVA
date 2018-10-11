package fr.afang.vehicule;

public class Car extends Vehicule {
	
	private int NombreDePlaces;

	public int getNombreDePlaces() {
		return NombreDePlaces;
	}

	public void setNombreDePlaces(int nombreDePlaces) {
		NombreDePlaces = nombreDePlaces;
	}

	public Car() {
		super();
		
	}

	public Car(String marqueV, String couleurV, int vitesseV, int puissanceV, int prixV, int kilometrageV,int nombreDePlacesV) {
		super(marqueV, couleurV, vitesseV, puissanceV, prixV, kilometrageV);
		this.NombreDePlaces=nombreDePlacesV;
	}
	
	

	
	
	
	

}
