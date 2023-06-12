package Gestion_pointage;
public class Principale {

	public static void main(String[] args) {
	// Instanciation des objets
	Apprenant ap1 = new Apprenant(01, "Amadou Tour�", "Daoudabougou, pr�s de l'olympe hotel");
	Formateur fm1 = new Formateur(02, "Momouhoud Demb�l�", "Badalabougou, pr�s de la mosqu�e de L'iman Dicko", 241, "G�nie logiciel");
	Pointage pt1 = new Pointage(54, null, "Pr�sent");
	Promotion pn1 = new Promotion(54, "ODK3", null);
	// le polymorphisme d'heritage
     Utilisateur utilisateurApprenant = ap1;
     Utilisateur utilisateurFormateur = fm1;
     System.out.println("L'apprenant se nomm� : "+utilisateurApprenant.getNom()+" et son adresse est : "+ap1.getAdresse());
     System.out.println("Le formateur est : "+fm1.getNom()+" et sa sp�cialit� est le "+fm1.Sp�cialit�);
	 // le polymorphisme de surcharge
	ap1.methode1("Amadou");
	fm1.methode1();
	}
	
}
