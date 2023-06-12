package Gestion_pointage;

import java.util.Date;
//Classe Promotion implémente l'interface FonctionDeBase
public class Promotion {
	protected int idPromotion;
	private String nom;
	private Date Année;
	public int getIdPromotion() {
		return idPromotion;
	}
	public void setIdPromotion(int idPromotion) {
		this.idPromotion = idPromotion;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getAnnée() {
		return Année;
	}
	public void setAnnée(Date année) {
		Année = année;
	}
	public Promotion(int idPromotion, String nom, Date année) {
		super();
		this.idPromotion = idPromotion;
		this.nom = nom;
		Année = année;
	}
	public Promotion() {
		super();
	}
	// Polymorphisme de surcharge
	public void methode1(String text) {
	    System.out.println("Méthode 1 avec un paramètre de type String dans Promotion");
	}

	public void methode1(int nb) {
	    System.out.println("Méthode 1 avec un paramètre de type int dans Promotion");
	}


}
