
public class ExoConditionIfElseifElse {

	public static void main(String[] args) {
		double noteJava = 14;
		double noteHtml = 13;
		double noteJavascript = 9;
		double noteCss = 7.5f ;

		int coefJava = 3 ;
		int coefHtml = 2 ;
		int coefJavascript = 3;
		int coefCss = 1 ;
		int coefSum = coefJava + coefJavascript + coefHtml + coefCss ; 
		double moyenne = (coefJava *noteJava + coefJavascript * noteJavascript + coefHtml * noteHtml + coefCss * noteCss) / coefSum;
		
		System.out.println("La moyenne = " + moyenne);
		if(moyenne >18) {
			System.out.println("Tr�s bien");
		}else if(moyenne > 15) {
			System.out.println("Bien");
		}else if(moyenne > 12 ) {
			System.out.println("Assez bien");
		}else if(moyenne > 10 ) {
			System.out.println("Moyen");
		}else if(moyenne > 8) {
			System.out.println("Il peut faire mieux");
		}else if(moyenne > 5) {
			System.out.println("Il faut plus de travail");
		}else {
			System.out.println("A l'ann�e prochaine,meme heure,meme endroit");
		}

	}

}
