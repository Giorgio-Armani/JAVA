import java.util.Scanner;

public class MaximumValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez saisir un nombre:");
		int number= sc.nextInt();
		int nombrePlusGrand = 0;
		for(int i=0;i<number; i++) {
			int nombreSaisi= sc.nextInt();
			if(nombreSaisi > nombrePlusGrand ) {
				nombrePlusGrand = nombreSaisi;
			}
		}
		System.out.println("Le nombre le plus grand: " + nombrePlusGrand);


	}

}
