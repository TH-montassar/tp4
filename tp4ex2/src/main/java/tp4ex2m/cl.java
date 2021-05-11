package tp4ex2m;
import java.io.*;
//implements Serializable
public class cl implements Serializable
   {  
	private static final long serialVersionUID = 1L;
	private String prenom;
	private String nom;
	
	public cl() {
		setPrenom("");
		setNom("");
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	

}
