
public class CV {

	public static void main(String[] args) {
		System.out.println("Bienvenue chez Ashwin Saravanapavan et Abdessamad Chafry!\n");
		affiche();
	}

	public static void affiche() {

		String[] competenceAbdessamad = { "Jardinier", "Caissier" };
		String[] competenceAshwin = { "Vendeur", "Caissier" };
		Constructeur constructeurAbdessamad = new Constructeur("Chafry", "Abdessamad", "�tudiant", "Aucune attente", 2,
				competenceAbdessamad);

		System.out
				.println("Nom : " + constructeurAbdessamad.getNom() + "\nPr�nom : " + constructeurAbdessamad.getPrenom()
						+ "\nFormation : " + constructeurAbdessamad.getFormation() + "\nExp�riences de travail : "
						+ constructeurAbdessamad.getAnneExperience() + " ans" + "\nComp�tence : "
						+ constructeurAbdessamad.competence[0] + " et " + constructeurAbdessamad.competence[1]
						+ "\nAttentes vis � vis le cours 4B4 : " + constructeurAbdessamad.getAttente());

		Constructeur constructeurAshwin = new Constructeur("Ashwin", "Saravanapavan", "�tudiant", "Aucune attente", 2,
				competenceAshwin);

		System.out.println("\nNom : " + constructeurAshwin.getNom() + "\nPr�nom : " + constructeurAshwin.getPrenom()
				+ "\nFormation : " + constructeurAshwin.getFormation() + "\nExp�riences de travail : "
				+ constructeurAshwin.getAnneExperience() + " ans" + "\nComp�tence : " + constructeurAshwin.competence[0]
				+ " et " + constructeurAshwin.competence[1] + "\nAttentes vis � vis le cours 4B4 : "
				+ constructeurAshwin.getAttente());

	}

}
