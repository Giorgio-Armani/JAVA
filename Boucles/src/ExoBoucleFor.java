public class ExoBoucleFor {

	public static void main(String[] args) {
		/*
		 * Declaration et affectation
		 * condition
		 * traitement
		 * incrementer la variable
		 * condition
		 * traitement
		 * incrementer la variable
		 * condition
		 */
         
		/*
		 * int nombre = 1;
		 * nombre <=  100;
		 * system.out.println(nombre);
		 * nombre++
		 * nombre <= 100;
		 * system.out.println(nombre);
		 * nombre++;
		 * nombre<=100;
		 * ......
		 */
		for(int nombre = 1; nombre<=100; nombre = nombre + 45) {
			System.out.println(nombre);
		}
		System.out.println("fin du traitement");
	
	
	
	for(int num = 1; num <= 99; num = num + 2 ) {
		System.out.println(num);
	}
	System.out.println("fin traitement");

}
	
	
}