
public class Ville {
	String nom;
	int nombreHabitants;
    int sup;
    
    
    //Constructeur sans params
    public Ville() {
    	System.out.println("Creation d'un objet de type Ville");
    }
    
    //Constructeur avec params
    public Ville(String nomP, int nombreHabitantsP, int supP) {
    	System.out .println("Constructeur avec params ");
    	nom = nomP;
    	nombreHabitants = nombreHabitantsP;
    	sup = supP;
    }

	public Ville(String nom, int nombreHabitants) {
		super();
		this.nom = nom;
		this.nombreHabitants = nombreHabitants;
	}
		
	public Ville( int nombreHabitants, int sup) {
		super();
		
		this.nombreHabitants = nombreHabitants;
		this.sup = sup;
	}
	public void allumerLesLumieres( ) {
		System.out.println("Les lumieres de la ville sont alumées");
	}
	public void eteindreLesLumieres( ) {
		System.out.println("Les lumieres de la ville sont eteindre");
	}	
}


