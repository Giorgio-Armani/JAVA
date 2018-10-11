package fr.afang;

import fr.afang.oiseaux.Aigle;
import fr.afang.oiseaux.Autruche;
import fr.afang.oiseaux.Canard;
import fr.afang.oiseaux.Manchot;
import fr.afang.oiseaux.Oiseau;
import fr.afang.oiseaux.Perruche;
import fr.afang.oiseaux.Pigeon;

public class MainOiseaux {

	public static void main(String[] args) {
		System.out.println("Début du programme : ");
		System.out.println("---------------Autruche---------------------");
		Autruche autruche = new Autruche();
		autruche.setNom("autruche"); 
		autruche.setTaille(15);
		autruche.setPoids(100);
		autruche.setRace("race");
		autruche.setPlumes(true);

		System.out.println("Nom : " + autruche.getNom());
		System.out.println("taille : " + autruche.getTaille());
		System.out.println("poids : " + autruche.getPoids());
		System.out.println("race : " + autruche.getRace());
		System.out.println("plumes : " + autruche.isPlumes());

		autruche.manger();
		autruche.boire();
		autruche.voler();
		autruche.jouer();
		autruche.courrir();
		autruche.sauter ();
		
		System.out.println("-------------Manchot---------------------");
		Manchot manchot = new Manchot ();
		manchot.setNom("manchot"); 
		manchot.setTaille(8);
		manchot.setPoids(20);
		manchot.setRace("race");
		manchot.setPlumes(false);

		System.out.println("Nom : " + manchot.getNom());
		System.out.println("taille : " + manchot.getTaille());
		System.out.println("poids : " + manchot.getPoids());
		System.out.println("race : " + manchot.getRace());
		System.out.println("plumes : " + manchot.isPlumes());

		manchot.manger();
		manchot.boire();
		manchot.voler();
		manchot.jouer();
		manchot.courrir();
		manchot.sauter();
		manchot.nager();
		
		System.out.println("-------------Pigeon---------------------");
		
		Pigeon pigeon = new Pigeon();
		pigeon.setNom("Pigeon"); 
		pigeon.setTaille(5);
		pigeon.setPoids(15);
		pigeon.setRace("race");
		pigeon.setPlumes(true);

		System.out.println("Nom : " + pigeon.getNom());
		System.out.println("taille : " + pigeon.getTaille());
		System.out.println("poids : " + pigeon.getPoids());
		System.out.println("race : " + pigeon.getRace());
		System.out.println("plumes : " + pigeon.isPlumes());

		pigeon.manger();
		pigeon.boire();
		pigeon.voler();
		pigeon.jouer();
		pigeon.courrir();
		pigeon.sauter ();
		
		System.out.println("-------------Aigle---------------------");
		Aigle aigle = new Aigle ();
		aigle.setNom("Aigle"); 
		aigle.setTaille(5);
		aigle.setPoids(15);
		aigle.setRace("race");
		aigle.setPlumes(true);

		System.out.println("Nom : " + aigle.getNom());
		System.out.println("taille : " + aigle.getTaille());
		System.out.println("poids : " + aigle.getPoids());
		System.out.println("race : " + aigle.getRace());
		System.out.println("plumes : " + aigle.isPlumes());

		aigle.manger();
		aigle.boire();
		aigle.voler();
		aigle.jouer();
		aigle.courrir();
		aigle.sauter ();
		aigle.chasser();
		
		System.out.println("-------------Perruche---------------------");
		Perruche perruche = new Perruche ();
		perruche.setNom("Perruche"); 
		perruche.setTaille(5);
		perruche.setPoids(15);
		perruche.setRace("race");
		perruche.setPlumes(true);

		System.out.println("Nom : " + perruche.getNom());
		System.out.println("taille : " + perruche.getTaille());
		System.out.println("poids : " + perruche.getPoids());
		System.out.println("race : " + perruche.getRace());
		System.out.println("plumes : " + perruche.isPlumes());

		perruche.manger();
		perruche.boire();
		perruche.voler();
		perruche.jouer();
		perruche.courrir();
		perruche.sauter ();
		
		Oiseau autruche1 = new Autruche("Autruche",15,100,"race",true);
	    System.out.println("La taille d' " + autruche.getNom() + " est :" + autruche.getTaille())	; 
	    
	    System.out.println("-------------Canard---------------------");
	    Canard yumi = new Canard();
	    yumi.setNom("Perruche"); 
	    yumi.setTaille(5);
	    yumi.setPoids(15);
	    yumi.setRace("race");
	    yumi.setPlumes(true);

		System.out.println("Nom : " + yumi.getNom());
		System.out.println("taille : " + yumi.getTaille());
		System.out.println("poids : " + yumi.getPoids());
		System.out.println("race : " + yumi.getRace());
		System.out.println("plumes : " + yumi.isPlumes());

		yumi.manger();
		yumi.boire();
		yumi.voler();
		yumi.jouer();
		yumi.courrir();
		yumi.sauter ();
		yumi.nager();;
	    
	    
		






	}

}
