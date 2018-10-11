package fr.afang.oiseaux;

public class Canard extends Oiseau implements OiseauNageur {

	public Canard() {
		super();
		
	}

	public Canard(String nomP, int tailleP, int poidsP, String raceP, boolean plumesP) {
		super(nomP, tailleP, poidsP, raceP, plumesP);
		
	}

	@Override
	public void nager() {
		System.out.println(nom + "sait nager");
		
	}

	public void voler() {
		System.out.println(nom + "vole");
		
	}

	
		
	

}
