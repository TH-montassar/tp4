package beanm;



public class client{
	
	private String nom;
	private String prenom;
	private String adresse;
	private String adresse_email;
	private Integer telephone;
	
	
	public client() {
		setNom("");
		setPrenom("");
		setAdresse("");
		setTelephone(0);
		setAdresse_email("");
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


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getAdresse_email() {
		return adresse_email;
	}


	public void setAdresse_email(String adresse_email) {
		this.adresse_email = adresse_email;
	}


	public Integer getTelephone() {
		return telephone;
	}


	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}

	

}
