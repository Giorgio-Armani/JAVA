import java.util.Scanner;

public class MinimumValue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez saisir un nombre : ");
		int nombre =sc.nextInt();
		int nombrelepluspetit=Integer.MAX_VALUE;

		for(int i=1; i<=nombre; i++) {
			System.out.println("Veuillez saisir la valeur : ");
			int nombreSaisi =sc.nextInt();
			if(nombreSaisi < nombrelepluspetit) {
				nombrelepluspetit= nombreSaisi;
			}		
		}

		System.out.println("Le nombre le plus petit est : "+ nombrelepluspetit);
	}

}
