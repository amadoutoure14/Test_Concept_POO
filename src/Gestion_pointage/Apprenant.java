package Gestion_pointage;
//Classe Apprenant hérite de Utilisateur
public class Apprenant extends Utilisateur{
	protected int idApprenant;
	private Pointage pointage;
	private Promotion promotion;
	public Apprenant(int idUtilisateur, String nom, String adresse, int idApprenant) {
		super(idUtilisateur, nom, adresse);
		this.idApprenant = idApprenant;
	}

	public Apprenant(int idUtilisateur, String nom, String adresse) {
		super(idUtilisateur, nom, adresse);
	}

	public int getIdApprenant() {
		return idApprenant;
	}

	public void setIdApprenant(int idApprenant) {
		this.idApprenant = idApprenant;
	}

	public Apprenant(int idApprenant) {
		super();
		this.idApprenant = idApprenant;
	}

	public Apprenant() {
		super();
	}

	/**
	 * @return the pointage
	 */
	public Pointage getPointage() {
		return pointage;
	}

	/**
	 * @param pointage the pointage to set
	 */
	public void setPointage(Pointage pointage) {
		this.pointage = pointage;
	}

	/**
	 * @return the promotion
	 */
	public Promotion getPromotion() {
		return promotion;
	}

	/**
	 * @param promotion the promotion to set
	 */
	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
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
		return "Le nom de l'apprenant est "+nom;
	}
	
}
