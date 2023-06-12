package Gestion_pointage;

import java.util.Date;
//Classe Promotion impl�mente l'interface FonctionDeBase
public class Promotion {
	protected int idPromotion;
	private String nom;
	private Date Ann�e;
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
	public Date getAnn�e() {
		return Ann�e;
	}
	public void setAnn�e(Date ann�e) {
		Ann�e = ann�e;
	}
	public Promotion(int idPromotion, String nom, Date ann�e) {
		super();
		this.idPromotion = idPromotion;
		this.nom = nom;
		Ann�e = ann�e;
	}
	public Promotion() {
		super();
	}
	// Polymorphisme de surcharge
	public void methode1(String text) {
	    System.out.println("M�thode 1 avec un param�tre de type String dans Promotion");
	}

	public void methode1(int nb) {
	    System.out.println("M�thode 1 avec un param�tre de type int dans Promotion");
	}


}
