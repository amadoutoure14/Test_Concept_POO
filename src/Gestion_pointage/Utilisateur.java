package Gestion_pointage;
 
public abstract class Utilisateur  implements FonctionDeBase{
	protected int idUtilisateur;
	private String nom;
	private String adresse;
	
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Utilisateur(int idUtilisateur, String nom, String adresse) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.nom = nom;
		this.adresse = adresse;
	}
	public Utilisateur() {
		super();
	}

}
