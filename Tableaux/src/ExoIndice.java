import java.util.Scanner;

public class ExoIndice {

	public static void main(String[] args) {
		
		String cours [] = {"Java" , "Html", "CSS", "Javascript", "PHP", "C++","NodeJS", "NET", "Typescript", "Golang", "Scala", "Kotlin"};
		System.out.println("Veuillez saisir un nom : ") ;
		Scanner sc = new Scanner(System.in);
		String matiere = sc.next();
		int indice = 0;
		boolean existe = false;	
		for (int i = 0; i < cours.length; i++) {
			if(cours[i].equals(matiere)) {
				existe = true;
				indice =i;
		}
		}
		if(existe) {	 	
		System.out.println("La matiere " + matiere + " existe dans le tableau : " + indice);
		}else {
	        	System.out.println("La matiere " + matiere + " n'existe Pas dans le tableau" );
			}
	}
			
}




