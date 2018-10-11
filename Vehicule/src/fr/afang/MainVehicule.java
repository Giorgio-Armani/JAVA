package fr.afang;

import fr.afang.vehicule.Camion;
import fr.afang.vehicule.Voiture;

public class MainVehicule {

	public static void main(String[] args) {



		System.out.println("---------------Voiture---------------------");
		Voiture c3 = new Voiture();
		c3.setMarque("c3");
		c3.setCouleur("rouge");
		c3.setVitesse(230);
		c3.setPuissance(6);
		c3.setPrix(15);
		c3.setNombreDePortes(5);

		System.out.println("marque: " + c3.getMarque());
		System.out.println("couleur : " + c3.getCouleur());
		System.out.println("vitesse: " + c3.getVitesse());
		System.out.println("puissance : " + c3.getPuissance());
		System.out.println("prix: " + c3.getPrix());
		System.out.println("NombreDePortes : " + c3.getNombreDePortes());

		c3.demarrer();
		c3.accelerer();
		c3.rouler();
		c3.garer();


		System.out.println("Je roule depuis 1h j’ai besoin d'une pause") ;
		c3.freiner();
		System.out.println("Je me gare") ;

		System.out.println("---------------Camion---------------------");
		Camion volvoFh = new Camion();
		volvoFh.setMarque("volvoFh");
		volvoFh.setCouleur("vert");
		volvoFh.setPuissance(24);
		volvoFh.setPrix(100000);	
		volvoFh.setKilometrage(5000);
		volvoFh.setVitesse(180);
		volvoFh.setCapacite(20);

		System.out.println("marque: " + volvoFh.getMarque());
		System.out.println("couleur : " + volvoFh.getCouleur());
		System.out.println("vitesse: " + volvoFh.getVitesse());
		System.out.println("puissance : " + volvoFh.getPuissance());
		System.out.println("prix: " + volvoFh.getPrix());
		System.out.println("capacite: " + volvoFh.getCapacite());
		System.out.println("kilometrage: " + volvoFh.getKilometrage());

		Camion mercedes = null;
		if (volvoFh.getCapacite () < 25) {
			mercedes = new Camion();
			mercedes.setMarque("mercedes");
			mercedes.setCouleur("Blanc");
			mercedes.setPuissance(75);
			mercedes.setPrix(150000);
			mercedes.setKilometrage(0);
			mercedes.setVitesse(200);
			mercedes.setCapacite(30);
			System.out.println("je roule avec mercedes");
			
		}
		
		try {
			mercedes.demarrer();
			mercedes.accelerer();
			mercedes.rouler();
		} catch (Exception e) {
			System.out.println("je roule avec volvo");
			volvoFh.demarrer();
			volvoFh.accelerer();
			volvoFh.rouler(); 
        }
	}	
		
}


