package fr.afang.client.domain;

public class Client {
	private Integer id;
	private Integer numClient;
	private String nom;
	private String prenom;
	private String numTelephone;
	private String portable;
	private String dateNaissance;
	private String email;
	private String adresse;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(Integer id, Integer numClient, String nom, String prenom, String numTelephone, String portable,
			String dateNaissance, String email, String adresse) {
		super();
		this.id = id;
		this.numClient = numClient;
		this.nom = nom;
		this.prenom = prenom;
		this.numTelephone = numTelephone;
		this.portable = portable;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.adresse = adresse;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumClient() {
		return numClient;
	}
	public void setNumClient(Integer numClient) {
		this.numClient = numClient;
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
	public String getNumTelephone() {
		return numTelephone;
	}
	public void setNumTelephone(String numTelephone) {
		this.numTelephone = numTelephone;
	}
	public String getPortable() {
		return portable;
	}
	public void setPortable(String portable) {
		this.portable = portable;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
}
