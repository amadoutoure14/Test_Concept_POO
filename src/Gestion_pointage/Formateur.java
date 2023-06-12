package Gestion_pointage;
//Classe Formateur h�rite de Utilisateur
public class Formateur extends Utilisateur {
	protected int idFormateur;
	protected String Sp�cialit�;
	public Formateur(int idUtilisateur, String nom, String adresse, int idFormateur, String sp�cialit�) {
		super(idUtilisateur, nom, adresse);
		this.idFormateur = idFormateur;
		Sp�cialit� = sp�cialit�;
	}
	public Formateur(int idUtilisateur, String nom, String adresse) {
		super(idUtilisateur, nom, adresse);
	}
	public Formateur(int idFormateur, String sp�cialit�) {
		super();
		this.idFormateur = idFormateur;
		Sp�cialit� = sp�cialit�;
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
	public String getSp�cialit�() {
		return Sp�cialit�;
	}
	public void setSp�cialit�(String sp�cialit�) {
		Sp�cialit� = sp�cialit�;
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
