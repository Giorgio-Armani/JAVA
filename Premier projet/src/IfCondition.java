public class IfCondition {

	public static void main(String[] args) {
		
		// = : Affectation
		// == : comparaison
		  
		int prix = 10;
		
		if(prix==10) {
			System.out.println("Le prix = 10"); 
		}
		
		int tva = 20;
		
		if(tva == 15) {
			System.out.println("La tva = 15");
		}
		
		boolean bool = true;
		
		if (bool== false) {
			System.out.println("La variable bool = false");
		}
		if (bool ==true) {
			System.out.println("La variable bool = true");
		}
		
		char car = 'a' ;
		// a != c la condition est fausse
		if(car =='c') {
			System.out.println("La variable car = 'c'");
		}
		//a == a la condition est vrai
		if(car == 'a') {
			System.out.println("La variable car ='a'");
		}
		String chaine = "bonjour";
		//bonjour ==bonjour la condition est vraie
		if(chaine == "bonjour") {
			System.out.println("La variable chaine = bonjour");
		}
		//bonjour !=Bonjour la condition est fausse
		if(chaine =="Bonjour") {
			System.out.println("La variablechaine = Bonjour avec B MAJ");
		}
		double decimal = 15.5;
		//(decimal ==15.5 la condition est vrai
		if(decimal==15.5) {
			System.out.println("La variable decimal = 15.5");
		}
		//15.5!= 10.65 la condition est fausse
		if(decimal ==10.65) {
			System.out.println("La variable decimal = 10.65");
		}
		int somme = 15;
		if(somme>11) {
			System.out.println("Le produit est trop cher");
		}
		if(somme <= 11) {
			System.out.println("La somme est parfaite");
		}
		if(somme != 13) {
			System.out.println("La variable est != de 13");
		}
			

	}

}
