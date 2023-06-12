package Gestion_pointage;
//Classe Formateur hérite de Utilisateur
public class Formateur extends Utilisateur {
	protected int idFormateur;
	protected String Spécialité;
	public Formateur(int idUtilisateur, String nom, String adresse, int idFormateur, String spécialité) {
		super(idUtilisateur, nom, adresse);
		this.idFormateur = idFormateur;
		Spécialité = spécialité;
	}
	public Formateur(int idUtilisateur, String nom, String adresse) {
		super(idUtilisateur, nom, adresse);
	}
	public Formateur(int idFormateur, String spécialité) {
		super();
		this.idFormateur = idFormateur;
		Spécialité = spécialité;
	}
	public Formateur() {
		super();
	}
	public int getIdFormateur() {
		return idFormateur;
	}
	public void setIdFormateur(int idFormateur) {
		this.idFormateur = idFormateur;
	}
	public String getSpécialité() {
		return Spécialité;
	}
	public void setSpécialité(String spécialité) {
		Spécialité = spécialité;
	}
	@Override
	public void methode1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void methode2() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String methode1(String nom) {
		// TODO Auto-generated method stub
		
		return "Le nom du formateur est +"+nom;
	}
	
}
