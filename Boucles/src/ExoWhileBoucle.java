
public class ExoWhileBoucle {

	public static void main(String[] args) {

		int a = 1 ;
		// a = a + 1 ;
		while(a <= 100) {
			System.out.println("La variable a = " + a);

			a++;
		}


		int b = 100;
		// b = b - 1 ;
		while(b >= 1) {
			System.out.println("La variable b = " + b);
			b--;

		}

		int nb = 2;
		while(nb<=100) {
			System.out.println("La variable nb = " + nb);
			nb=nb+2;
		}

		int xn = 100 ;
		while(xn>=2) {
			System.out.println("La variable xn =" + xn);
			xn=xn-2;

		}

		int x = 1 ;
		int y = 100;
		while(x <= 100 && y>=1) {
			System.out.println("variable x = " + x   +     "                  variable y  = " + y ); 
			x++; y--;
			
			

		}




	}
}


