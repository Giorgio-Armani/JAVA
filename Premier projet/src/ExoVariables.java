public class ExoVariables {

	public static void main(String[] args) {
		
        //Declaration et affectation
		// Type nomVariable = valeur ;
		int monCoef = 3 ;
		float maNote = 14.5f;
		float resultat = monCoef * maNote ;
		System.out.println("resultat = " + resultat);
		
		
		//affectation
		//nomVariable = valeur
		monCoef = 5 ;
		maNote = 12.3f;
		resultat = monCoef * maNote ;
		System.out.println("resultat = " + resultat);
		
		//Declaration et affectation
		//Type nomVariable =valeur
		float noteJava = 10.5f;
		float noteHtml = 13.2f;
		float noteJavascript = 11.3f;
		float noteCss   = 8.5f;
		float moyenne = (noteJava + noteHtml +noteJavascript + noteCss) / 4;
		System.out.println("moyenne = " + moyenne);
		
		
		//Declaration et affectation
		//Type nomVariable = valeur
		int coefJava = 3;
		int coefJavascript =3 ;
		int coefHtml = 2 ;
		int coefCss = 1 ; 
		int coefSum = coefJava + coefJavascript + coefHtml + coefCss; 
		moyenne = (coefJava *noteJava + coefJavascript * noteJavascript + coefHtml * noteHtml + coefCss * noteCss) / coefSum;
		System.out.println("moyenne= " + moyenne );
		
		
		// declaration
		// [type] [nomDeLaVariable];
		int quantite;
		// Affectation
		// [nomDeLaVariable] = [LaValeur];
		quantite = 100 ;
		
		// Declaration + Affectation
		//[ type] [nomDeLaVariable] = [LaValeur];
		int variable = 123;
	
	}

}
