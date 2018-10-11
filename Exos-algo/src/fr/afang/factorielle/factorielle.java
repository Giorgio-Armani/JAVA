package fr.afang.factorielle;


import java.util.Scanner;

public class factorielle {

	public static void main(String[] args) {	
		
		Scanner in = new Scanner(System.in);
		System.out.println("Saisir un entier pour calculer son factorielle");
		int n, c, fact = 1;

		n = in.nextInt();

		if (n < 0) {
			System.out.println("Nombre positive.");
		}else{
			for (c = 1; c <= n; c++)
				fact = fact*c;

			System.out.println("Factorielle de "+n+" = "+fact);
		}
	}

}
