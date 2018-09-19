
public class Moyenne {

	public static void main(String[] args) {

		
		float noteJava = 14f ; 
		float noteHtml = 13f ; 
		float noteJavascript = 9f ; 
		float noteCss = 8.5f ;


		int coefJava = 3 ; 
		int coefHtml = 2; 
		int coefJavascript = 3 ; 
		int coefCSs = 1;

		float moyenne = (noteJava * coefJava )+(noteHtml * coefHtml)+(noteJavascript * coefJavascript)+(noteCss * coefCSs);

		float coefGenerale = (coefJava + coefHtml + coefJavascript + coefCSs);
		float moyenneGenerale = moyenne / coefGenerale;



		System.out.println("La moyenne = " + moyenneGenerale);

		if(moyenneGenerale > 18) {
			System.out.println("Très bien");
		}else if(moyenneGenerale > 15) {
			System.out.println("Bien");
		}else if(moyenneGenerale > 12) {
			System.out.println("Assez bien");
		}else if(moyenneGenerale > 10) {
			System.out.println("Moyen");
		}else if(moyenneGenerale > 8) {
			System.out.println("Il peut faire mieux");
		}else if(moyenneGenerale > 5) {
			System.out.println("Il faut plus de travail");
		}else {
			System.out.println("A l’année prochaine, même heure, même endroit ;)");
		}
		if(moyenneGenerale < 15) {
			
		coefJava = 1 ; 
		coefHtml = 3; 
		coefJavascript = 2 ; 
		coefCSs = 3;
		
		moyenne = (noteJava * coefJava )+(noteHtml * coefHtml)+(noteJavascript * coefJavascript)+(noteCss * coefCSs);
		coefGenerale = (coefJava + coefHtml + coefJavascript + coefCSs);
		moyenneGenerale = moyenne / coefGenerale;



		System.out.println("La moyenne = " + moyenneGenerale);

		if(moyenneGenerale > 18) {
			System.out.println("Très bien");
		}else if(moyenneGenerale > 15) {
			System.out.println("Bien");
		}else if(moyenneGenerale > 12) {
			System.out.println("Assez bien");
		}else if(moyenneGenerale > 10) {
			System.out.println("Moyen");
		}else if(moyenneGenerale > 8) {
			System.out.println("Il peut faire mieux");
		}else if(moyenneGenerale > 5) {
			System.out.println("Il faut plus de travail");
		}else {
			System.out.println("A l’année prochaine, même heure, même endroit ;)");
		}



	}
		
		
		
		
		if(moyenneGenerale < 10) {
			
			coefJava = 3 ; 
			coefHtml = 3; 
			coefJavascript = 4 ; 
			coefCSs = 3;
			
			moyenne = (noteJava * coefJava )+(noteHtml * coefHtml)+(noteJavascript * coefJavascript)+(noteCss * coefCSs);
			coefGenerale = (coefJava + coefHtml + coefJavascript + coefCSs);
			moyenneGenerale = moyenne / coefGenerale;



			System.out.println("La moyenne = " + moyenneGenerale);

			if(moyenneGenerale > 18) {
				System.out.println("Très bien");
			}else if(moyenneGenerale > 15) {
				System.out.println("Bien");
			}else if(moyenneGenerale > 12) {
				System.out.println("Assez bien");
			}else if(moyenneGenerale > 10) {
				System.out.println("Moyen");
			}else if(moyenneGenerale > 8) {
				System.out.println("Il peut faire mieux");
			}else if(moyenneGenerale > 5) {
				System.out.println("Il faut plus de travail");
			}else {
				System.out.println("A l’année prochaine, même heure, même endroit ;)");
			}



		}
	
}
}
