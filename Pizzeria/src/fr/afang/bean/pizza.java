package fr.afang.bean;

public class pizza {
	private Integer id;
	private String libelle;
	private String reference;
	private Integer prix;
	private String urlImage;
	
	public pizza() {
		super();
	}
	public pizza(Integer id, String libelle, String reference, Integer prix, String urlImage) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.reference = reference;
		this.prix = prix;
		this.urlImage = urlImage;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Integer getPrix() {
		return prix;
	}
	public void setPrix(Integer prix) {
		this.prix = prix;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

}
