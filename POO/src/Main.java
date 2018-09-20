
public class Main {
public static void main(String[] args) {
	System.out.println("Debut du programme : ");
	
	Ville paris = new Ville();
	paris.nom = "paris";
	paris.nombreHabitants = 100;
	paris.sup = 100;
	
	System.out.println("Traitement des donnés de la ville de paris");
	 
	System.out.println("Nom :" + paris.nom);
	System.out.println("Nombre d'habitants : " + paris.nombreHabitants);
	System.out.println("Sup : " + paris.sup);
	
	System.out.println();
	System.out.println("*******************************************************");
	System.out.println();
	
	
	
	Ville marseille = new Ville();
	marseille.nom = "marseille";
	marseille.nombreHabitants = 300;
	marseille.sup = 150;
	
	System.out.println("Traitement des donnés de la ville de marseille");
	 
	System.out.println("Nom :" + marseille.nom);
	System.out.println("Nombre d'habitants : " + marseille.nombreHabitants);
	System.out.println("Sup : " + marseille.sup);
	
	System.out.println();
	System.out.println("*****************************************************");
	Ville liverpool = new Ville("Liverpool",500,50);
	System.out.println(liverpool.nom);
	System.out.println(liverpool.nombreHabitants);
	System.out.println(liverpool.sup);
	
	System.out.println("*******************************************************");
	Ville lille = new Ville("Lille",400);
	System.out.println(lille.nom);
	System.out.println(lille.nombreHabitants);
	System.out.println(lille.sup);
	
	System.out.println("*******************************************************");
	Ville barcelone = new Ville(750,150);
	System.out.println("le nombre d'habitants : "+ barcelone.nombreHabitants);
	System.out.println("La sup : " + barcelone.sup );
	
	System.out.println("*******************lumieres************************************");
	System.out.println("lumieres ville");
	
}
}
