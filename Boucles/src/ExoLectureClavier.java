import java.util.Scanner;

public class ExoLectureClavier {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Debut");
		int debut = sc.nextInt();
		int fin = sc.nextInt();
		
		while (debut <= fin) {
			System.out.println("le nombre est = " + debut );
			debut++;
		}
			
		
	}

}
