
public class ExoTableauExercise {

	public static void main(String[] args) {
		 /*
		  * Afficher et parcourir les elements du tableau
		  */
		String cours [] = {"Java" , "Html", "CSS", "Javascript", "PHP", "C++","NodeJS", "NET", "Typescript", "Golang", "Scala", "Kotlin"};
		for (int i = 0; i < cours.length; i++) {
			System.out.println("Mati�re : " + cours[i]);
			System.out.println("Mati�re : " + cours[i] + ",");
 	
 			
        }
        /*
         * Afficher les elements sur la meme ligne separ�s par ","
         */
		for (int i = 0; i < cours.length; i++) {
			System.out.print(cours[i] + ", " ); 	
			
		}
		for (int i = 0; i < cours.length; i++) {
			System.out.println("Mati�re : " + cours[i] + "=" + "10");
		} 
		
		for (int i = 0; i < cours.length; i++) {
			System.out.print("Mati�re : " + cours[i] + "=" + "10" + ", ");
		} 
		
		
		
		
		
	}

}
