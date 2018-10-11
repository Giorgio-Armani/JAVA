package fr.afang.oiseaux;

public class Manchot extends Oiseau implements OiseauVolant{



	public Manchot() {
		super();

	}

	public Manchot(String nomP, int tailleP, int poidsP, String raceP, boolean plumesP) {
		super(nomP, tailleP, poidsP, raceP, plumesP);
		// TODO Auto-generated constructor stub
	}

	public void nager() {
		System.out.println(nom + " sait nager");


	}

	@Override
	public void voler() {
		// TODO Auto-generated method stub
		
	}
}
