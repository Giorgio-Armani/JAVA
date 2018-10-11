package fr.afang.oiseaux;

public class Autruche extends Oiseau implements OiseauVolant {
	
	

		public Autruche() {
		super();
		// TODO Auto-generated constructor stub
	}

		public Autruche(String nomP, int tailleP, int poidsP, String raceP, boolean plumesP) {
			super(nomP, tailleP, poidsP, raceP, plumesP);
			
		}

		@Override
		public void voler() {
			System.out.println("Je vole");
			
		}

		
			

}
