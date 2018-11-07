package fr.afang.business.produit;

import java.util.ArrayList;

import fr.afang.bean.Produit;

public class ProduitBusiness {
	
	public ArrayList<Produit> getProduits(){
		Produit abricotP = new Produit("abricot", 10.0, "Ressources/Images/abricot.jpg");
		Produit avocatP = new Produit("avocat", 15.0, "Ressources/Images/avocat.jpg");
		Produit fromageP =  new Produit("fromage", 12.00, "Ressources/Images/fromage.jpg");
		Produit gigotAgneauP = new Produit("gigotAgneau", 100.0, " Ressources/Images/gigot-agneau.jpg");
	    Produit bonbonP = new Produit("bonbon", 10.0, " Ressources/Images/bar-a-bonbons-600x531.jpg");	
	    Produit lentilleP = new Produit("lentille", 16.0, "Ressources/Images/lentille-corail-vrac-bio.jpg ");
	    Produit levureChimiqueP = new Produit("levureChimique", 8.0, "Ressources/Images/Levure-Chimique-X-10.jpg");
		
	    ArrayList<Produit>tabProduitAlimentaire= new ArrayList<Produit>();
	    tabProduitAlimentaire.add(abricotP);
	    tabProduitAlimentaire.add(avocatP);
	    tabProduitAlimentaire.add(fromageP);
	    tabProduitAlimentaire.add(gigotAgneauP);
	    tabProduitAlimentaire.add(bonbonP);
	    tabProduitAlimentaire.add(lentilleP);
	    tabProduitAlimentaire.add(levureChimiqueP);
	    
		return tabProduitAlimentaire;    
		
	}

}
