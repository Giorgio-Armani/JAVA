package fr.afang.carreEtoile;

import java.util.Scanner;

public class carreEtoile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Saisir un entier :");
		int nombre = sc.nextInt();


		for(int i=0;i<nombre; i++) {
			for(int j = 0;j <nombre; j++) {
				System.out.print("* ");
			}
			System.out.println("");
			
		}




	}

}
