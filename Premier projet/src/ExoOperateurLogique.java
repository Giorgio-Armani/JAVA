public class ExoOperateurLogique {

	public static void main(String[] args) {
		
		
		double noteJava = 14 ;                  
		double noteHtml = 14  ;                
		double noteJavascript = 9;                  
		double noteCss = 14 ; 
		double moyenne = (noteJava + noteHtml +noteJavascript + noteCss) / 4;
		int coefJava = 3;
		int coefHtml = 2 ;
		int coefCss = 1;
	    int coefJavascript = 3; 
	    int coefTotal = coefJava + coefJavascript + coefHtml + coefCss; 
	    double moyenneGenerale = moyenne / coefTotal;
		
		System.out.println("moyenneGenerale= " + moyenneGenerale );
		if(moyenne > 10 || moyenneGenerale > 10) {
			System.out.println("Vous avez la moyenne");
		}if(moyenne > 10 && noteJava > 10) {
			System.out.println("Vous avez eu la moyenne et une bonne note en java");
		}if(noteCss > 10 || noteHtml > 10 || noteJavascript > 10) {
			System.out.println("Vous avez eu une bonne note en html or Css ou javascript");
		}if(noteCss > 10 && noteHtml > 10 && noteJavascript < 10) {
			System.out.println("Vous avez eu une bonne note en html,Css et javascript");
		}if(noteJava > 15 && noteJavascript > 15) {
			System.out.println("Vous avez eu une tres bonne note en javascript");
		}if(moyenne < 10 || moyenneGenerale < 10) {
			System.out.println("Vous n'avez pas eu la moyenne");
		}if(noteJava < 5 || noteHtml < 5 || noteJavascript < 5 || noteCss < 5) {
			System.out.println("Vous devez travailler serieusement une des quatres matieres");
		
		
		}
	}

}
