package fr.afang.oiseaux;

public class Pigeon extends Oiseau implements OiseauVolant {
	 
	

		public Pigeon() {
		super();
	
	}

		public Pigeon(String nomP, int tailleP, int poidsP, String raceP, boolean plumesP) {
			super(nomP, tailleP, poidsP, raceP, plumesP);
			
		}

		@Override
		public void voler() {
			System.out.println("Je vole");
			
		}

}
			