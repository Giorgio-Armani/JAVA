package fr.afang.oiseaux;

public class Perruche extends Oiseau implements OiseauVolant{

	public Perruche() {
		super();
		
	}

	public Perruche(String nomP, int tailleP, int poidsP, String raceP, boolean plumesP) {
		super(nomP, tailleP, poidsP, raceP, plumesP);
		
	}

	@Override
	public void voler() {
		System.out.println("Je vole");
		
	}
	

}
