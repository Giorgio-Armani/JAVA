
public class Tableau1D {

	public static void main(String[] args) {
		
		int entiersPremiers[]= {2,3,5,7,11,13,17,19,23};
		
		int tailleTableau = entiersPremiers.length;
		
		System.out.println("La taille du tableau : " + tailleTableau);
		
		System.out.println("Le premier element du tableau : " + entiersPremiers[0]);
		System.out.println("Le 2�me element du tableau : " + entiersPremiers[1]);
		System.out.println("Le 3�me element du tableau : " + entiersPremiers[2]);
		System.out.println("Le 4�me element du tableau : " + entiersPremiers[3]);
		System.out.println("Le 5�me element du tableau : " + entiersPremiers[4]);
		System.out.println("Le 6�me element du tableau : " + entiersPremiers[5]);
		System.out.println("Le 7�me element du tableau : " + entiersPremiers[6]);
		System.out.println("Le 8�me element du tableau : " + entiersPremiers[7]);
		System.out.println("Le 9�me element du tableau : " + entiersPremiers[8]);
		
		for (int i = 0; i < entiersPremiers.length; i++) {
			System.out.println(entiersPremiers[i]);
		}
		int resultatMult = 1;
		for (int i = 0; i < entiersPremiers.length; i++) {
			resultatMult=resultatMult * entiersPremiers[i];
			System.out.println("resultat int = " + resultatMult);	
		}
		System.out.println("resultat final = " + resultatMult);

	
	int resultatadd = 0;
	for (int i = 0; i < entiersPremiers.length; i++) {
		resultatadd = resultatadd + entiersPremiers[i];
		System.out.println("resultat int = " + resultatadd);	
	}
	System.out.println("resultat final = " +resultatadd);
   
	
	int resultatsub = 0;
	for (int i = 0; i < entiersPremiers.length; i++) {
		resultatsub = resultatsub - entiersPremiers[i];
		System.out.println("resultat int = " + resultatsub);	
	}
	System.out.println("resultat final = " + resultatsub);
   
	
	int resultatdiv = 1;
	for (int i = 0; i < entiersPremiers.length; i++) {
		resultatdiv = resultatdiv / entiersPremiers[i];
		System.out.println("resultat double = " + resultatdiv);	
	}
	System.out.println("resultat final = " + resultatdiv);
	
	// Les indices
	String cours [] = {"Java" , "Html", "CSS", "Javascript", "PHP", "C++","NodeJS", "NET", "Typescript", "Golang", "Scala", "Kotlin"};
	
	System.out.println();
	for (int i = 0; i < cours.length; i++) {
		System.out.println(cours [i]+ " = 10.");
	}
	
	
	for (int i = 0; i < cours.length; i++) {
		if(cours[i].equals("PHP")) {
			System.out.println("PHP se trouve � l'indince " + i);
		}else {
			System.out.println("A l'indice " + i + " se trouve la valeur : " + cours[i]);
		}
		
	}
}
}