
public class CV {

	public static void main(String[] args) {
		System.out.println("Bienvenue chez Ashwin Saravanapavan et Abdessamad Chafry!\n");
		affiche();
	}

	public static void affiche() {

		String[] competenceAbdessamad = { "Jardinier", "Caissier" };
		String[] competenceAshwin = { "Vendeur", "Caissier" };
		Constructeur constructeurAbdessamad = new Constructeur("Chafry", "Abdessamad", "Étudiant", "Aucune attente", 2,
				competenceAbdessamad);

		System.out
				.println("Nom : " + constructeurAbdessamad.getNom() + "\nPrénom : " + constructeurAbdessamad.getPrenom()
						+ "\nFormation : " + constructeurAbdessamad.getFormation() + "\nExpériences de travail : "
						+ constructeurAbdessamad.getAnneExperience() + " ans" + "\nCompétence : "
						+ constructeurAbdessamad.competence[0] + " et " + constructeurAbdessamad.competence[1]
						+ "\nAttentes vis à vis le cours 4B4 : " + constructeurAbdessamad.getAttente());

		Constructeur constructeurAshwin = new Constructeur("Ashwin", "Saravanapavan", "Étudiant", "Aucune attente", 2,
				competenceAshwin);

		System.out.println("\nNom : " + constructeurAshwin.getNom() + "\nPrénom : " + constructeurAshwin.getPrenom()
				+ "\nFormation : " + constructeurAshwin.getFormation() + "\nExpériences de travail : "
				+ constructeurAshwin.getAnneExperience() + " ans" + "\nCompétence : " + constructeurAshwin.competence[0]
				+ " et " + constructeurAshwin.competence[1] + "\nAttentes vis à vis le cours 4B4 : "
				+ constructeurAshwin.getAttente());

	}

}
