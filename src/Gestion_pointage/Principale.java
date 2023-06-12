package Gestion_pointage;
public class Principale {

	public static void main(String[] args) {
	// Instanciation des objets
	Apprenant ap1 = new Apprenant(01, "Amadou Touré", "Daoudabougou, près de l'olympe hotel");
	Formateur fm1 = new Formateur(02, "Momouhoud Dembélé", "Badalabougou, près de la mosquée de L'iman Dicko", 241, "Génie logiciel");
	Pointage pt1 = new Pointage(54, null, "Présent");
	Promotion pn1 = new Promotion(54, "ODK3", null);
	// le polymorphisme d'heritage
     Utilisateur utilisateurApprenant = ap1;
     Utilisateur utilisateurFormateur = fm1;
     System.out.println("L'apprenant se nommé : "+utilisateurApprenant.getNom()+" et son adresse est : "+ap1.getAdresse());
     System.out.println("Le formateur est : "+fm1.getNom()+" et sa spécialité est le "+fm1.Spécialité);
	ap1.methode1("Amadou");
	fm1.methode1();
	}
	
}
