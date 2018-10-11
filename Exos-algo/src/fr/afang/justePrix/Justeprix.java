package fr.afang.justePrix;

import java.util.Random;
import java.util.Scanner;

public class Justeprix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int prixAleatoir = random.nextInt(101);
		System.out.println(prixAleatoir);
	    System.out.println("Veuillez saisir un nombre:");
	    int tentative = 1;
	    boolean faux = false;
	    
	    int prix ;
	do {     
	    prix = sc.nextInt();
	    
    if (prixAleatoir == prix) {

    	System.out.println("felicitations: vous avez trouvé le bon nombre");
    	System.out.println("Le nombre de tentative est " + tentative);
    	faux= true;
    }else if(prixAleatoir > prix) {
    	System.out.println("c'est plus");
    	faux = true;
    	tentative++;
    }
    else{
    	System.out.println("c'est moins");
    	faux = true;
    	tentative++;
    	
    }

 
	} while	(prix != prixAleatoir) ;
	
	}
	
}
