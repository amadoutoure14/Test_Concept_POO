package Gestion_pointage;

import java.util.Date;
//Classe Pointage
public class Pointage {
	private int idPointage;
	private Date datePointage;
	private String statut;
	public Pointage(int idPointage, Date datePointage, String statut) {
		super();
		this.idPointage = idPointage;
		this.datePointage = datePointage;
		this.statut = statut;
	}
	public Pointage() {
		super();
	}
	// Les getters et les Setters
	public int getIdPointage() {
		return idPointage;
	}
	public void setIdPointage(int idPointage) {
		this.idPointage = idPointage;
	}
	public Date getDatePointage() {
		return datePointage;
	}
	public void setDatePointage(Date datePointage) {
		this.datePointage = datePointage;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	
}
