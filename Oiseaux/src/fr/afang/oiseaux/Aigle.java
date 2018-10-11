package fr.afang.oiseaux;

public class Aigle extends Oiseau implements OiseauVolant {
	
	
	

		public Aigle() {
		super();
		
	}

		public Aigle(String nomP, int tailleP, int poidsP, String raceP, boolean plumesP) {
			super(nomP, tailleP, poidsP, raceP, plumesP);
			
		}
		public void chasser() {
			System.out.println(nom + " sait chasser");
}

		@Override
		public void voler() {
			System.out.println("Je vole");
			
		}
}		
