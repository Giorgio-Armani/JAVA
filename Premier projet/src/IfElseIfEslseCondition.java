public class IfElseIfEslseCondition {

	public static void main(String[] args) {

		/*
		 * LA condition IF ELSE IF ELSE
		 * if(condition1) {
		 *        traitement1;
		 * } else if (condition2){
		 *        traitement2;
		 * }else if(conditionN){
		 *        traitementN;
		 * }else{
		 *      {traitement dans le cas ou aucune condition n'est valide);
		 * }                          
		 */
		//declaration
		int note;
		//affectation
		note = 10;

		if(note > 15) {
			System.out.println("La note est >= 15");
		}else if(note > 10) {
			System.out.println("La note est > 10");
		}else if(note== 10) {
			System.out.println("La note est = 10");
		}else {
			System.out.println("La note est < 10");
		}
		System.out.println("Ici c'est la fin du programme");

	}
}