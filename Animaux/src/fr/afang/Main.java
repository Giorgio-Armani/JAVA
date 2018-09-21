package fr.afang;

import fr.afang.animal.Chat;
import fr.afang.animal.Chien;
import fr.afang.animal.Lapin;
import fr.afang.animal.Loup;
import fr.afang.animal.cheval;
import fr.afang.animal.vache;

public class Main {

	public static void main(String[] args) {
		System.out.println("Début du programme : ");
		Chien popy = new Chien();
		popy.nom = "popy";
		popy.taille= 5;
		popy.poids = 15;
		popy.couleur = "noir";
		popy.race = "bull";
	System.out.println("---------------chien---------------------");
		
		System.out.println("Nom : " + popy.nom);
		System.out.println("taille : " + popy.taille);
		System.out.println("poids : " + popy.poids);
		System.out.println("couleur : " + popy.couleur);
		System.out.println("race : " + popy.race);
		
		popy.manger();
		popy.dormir ();
		popy.jouer();
		popy.aboyer();
		popy.mordre();
		
   System.out.println("-------------- chat -------------------------");
       System.out.println("Début du programme : ");
	   Chat suzi = new Chat();
	   suzi.nom = "suzi";
	   suzi.taille= 15;
	   suzi.poids = 100;
	   suzi.couleur = "blanc";
	   suzi.race = "tigre";
	
	   System.out.println("Nom : " + suzi.nom);
	   System.out.println("taille : " + suzi.taille);
	   System.out.println("poids : " + suzi.poids);
	   System.out.println("couleur : " + suzi.couleur);
	   System.out.println("race : " + suzi.race);
	  
	   suzi.manger();
	   suzi.dormir ();
	   suzi.jouer();
	   suzi.miauler();
	   suzi.griffer();
	   
  System.out.println("-------------- cheval -------------------------");
       System.out.println("Début du programme : ");
       cheval amy = new cheval();
       amy.nom = "amy";
       amy.taille= 25;
       amy.poids = 300;
       amy.couleur = "blanc";
       amy.race = "ghost";

       System.out.println("Nom : " + amy.nom);
       System.out.println("taille : " + amy.taille);
       System.out.println("poids : " + amy.poids);
       System.out.println("couleur : " + amy.couleur);
       System.out.println("race : " + amy.race);
       
       amy.manger();
       amy.dormir ();
       amy.jouer();
       amy.hennir();
       amy.frapper(); 
       
  System.out.println("-------------- vache -------------------------");
       System.out.println("Début du programme : ");
       vache cattle= new vache();
       cattle.nom= "Cattle";
       cattle.taille= 50;
       cattle.poids = 400;
       cattle.couleur = "blanc";
       cattle.race = "laitier";

       System.out.println("Nom : " + cattle.nom);
       System.out.println("taille : " + cattle.taille);
       System.out.println("poids : " + cattle.poids);
       System.out.println("couleur : " + cattle.couleur);
       System.out.println("race : " + cattle.race);
       
       cattle.manger();
       cattle.dormir ();
       cattle.jouer();
       cattle.beugler();
         
  System.out.println("-------------- loup -------------------------");
       System.out.println("Début du programme : ");
       Loup garou = new Loup();
       garou.nom="garou";
       garou.taille= 10;
       garou.poids = 35;
       garou.couleur = "blanc";
       garou.race = "race";

       System.out.println("Nom : " + garou.nom);
       System.out.println("taille : " + garou.taille);
       System.out.println("poids : " + garou.poids);
       System.out.println("couleur : " + garou.couleur);
       System.out.println("race : " + garou.race);
       garou.manger();
       garou.dormir ();
       garou.jouer();
       garou.hurler();
       garou.mordre();
       
    System.out.println("-------------- Lapin -------------------------");
       System.out.println("Début du programme : ");
       Lapin rabbit = new Lapin();
       rabbit.nom = "rabbit";
       rabbit.taille= 9;
       rabbit.poids = 15;
       rabbit.couleur = "blanc";
       rabbit.race = "race";

       System.out.println("Nom : " + rabbit.nom);
       System.out.println("taille : " + rabbit.taille);
       System.out.println("poids : " + rabbit.poids);
       System.out.println("couleur : " + rabbit.couleur);
       System.out.println("race : " + rabbit.race);
       
       rabbit.manger();
       rabbit.dormir ();
       rabbit.jouer();
       rabbit.couine();
       
       Chien Popy = new Chien("popy",5,15,"noir","bull");
       System.out.println("La couleur du chien " + popy.nom + " est le :" + popy.couleur)	;  
       Chat Suzi = new Chat("suzi",15,100,"blanc","tigre");
       System.out.println("la race du chat " + suzi.nom + " est le : " + suzi.race);
       Lapin Rabbit = new Lapin("rabbit",9,15,"blanc","race");
       System.out.println("La taille, poids du lapin " + rabbit.nom + " est le : " + rabbit.taille + " " +rabbit.poids);
	}

	
	

}
