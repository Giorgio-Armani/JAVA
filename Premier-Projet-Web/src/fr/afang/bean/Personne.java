package fr.afang.bean;

public class Personne {
	private String nom;
	private String prenom;
	private String dateNaissance;
	private String telephone;
	private String numeroEtRue;
	private String ville;
	private String email;
	private String url;
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Personne(String nom, String prenom, String dateNaissance, String telephone, String numeroEtRue, String ville,
			String email, String url) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.telephone = telephone;
		this.numeroEtRue = numeroEtRue;
		this.ville = ville;
		this.email = email;
		this.url = url;
	}
	public Personne(String nom, String prenom, String dateNaissance, String telephone, String numeroEtRue, String ville,
			String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.telephone = telephone;
		this.numeroEtRue = numeroEtRue;
		this.ville = ville;
		this.email = email;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getNumeroEtRue() {
		return numeroEtRue;
	}
	public void setNumeroEtRue(String numeroEtRue) {
		this.numeroEtRue = numeroEtRue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	

}
