package fr.afang.vehicule;

public class Vehicule {
	
	protected String marque ; 
	protected String  couleur ;
	protected int	 vitesse ;
	protected int	 puissance ;
	protected int	prix ;
	protected int	kilometrage ;
	
	
	public Vehicule() {
		super();
		
	}
	public Vehicule (String marqueV,String couleurV, int vitesseV,int puissanceV,int prixV,int kilometrageV) {
	
	marque=marqueV;
	couleur=couleurV;
	vitesse=vitesseV;
	puissance=puissanceV;
	prix=prixV;
	kilometrage=kilometrageV;
	
	}	
		public void demarrer() {
			System.out.println(marque + " demarre bien");
		}
		public void accelerer() {
			System.out.println(marque + " accelère au top");
		}
		
		public void freiner() {
			System.out.println(marque + " freine");
		}
		public void rouler() {
			System.out.println(marque + " roule sans difficulté");
		}
		public void garer() {
			System.out.println(marque + " je me gare");	
		}
			
		public String getMarque() {
			return marque;
		}
		public void setMarque(String marque) {
			this.marque = marque;
		}
		public String getCouleur() {
			return couleur;
		}
		public void setCouleur(String couleur) {
			this.couleur = couleur;
		}
		public int getVitesse() {
			return vitesse;
		}
		public void setVitesse(int vitesse) {
			this.vitesse = vitesse;
		}
		public int getPuissance() {
			return puissance;
		}
		public void setPuissance(int puissance) {
			this.puissance = puissance;
		}
		public int getPrix() {
			return prix;
		}
		public void setPrix(int prix) {
			this.prix = prix;
		}
		public int getKilometrage() {
			return kilometrage;
		}
		public void setKilometrage(int kilometrage) {
			this.kilometrage = kilometrage;
		}
			
	 
}
