
public class CV {

	
	
	
	public static void main(String[] args) {
		System.out.println("Bienvenue chez Ashwin Saravanapavan et Abdessamad Chafry!");
		affiche();
	}
	
	public static void affiche(){
		Constructeur constructeurAbdessamad = new Constructeur("Chafry", "Abdessamad","�tudiant", "Aucune attente", 7);
		
		
		
		System.out.println("Nom : " + constructeurAbdessamad.getNom() + "\nPr�nom : " + constructeurAbdessamad.getPrenom() + "\nFormation : " + constructeurAbdessamad.getFormation() 
				+ "\nExp�riences de travail : " + constructeurAbdessamad.getAnneExperience() + " ans" + "\nComp�tence : " + constructeurAbdessamad + "\nAttentes vis � vis le cours 4B4 : "
				+ constructeurAbdessamad.getAttente());
		
		Constructeur constructeurAshwin = new Constructeur("Chafry", "Abdessamad","�tudiant", "Aucune attente", 7);
		
		System.out.println("Nom : " + constructeurAshwin.getNom() + "\nPr�nom : " + constructeurAshwin.getPrenom() + "\nFormation : " + constructeurAshwin.getFormation() 
		+ "\nExp�riences de travail : " + constructeurAshwin.getAnneExperience() + " ans" + "\nComp�tence : " + constructeurAshwin + "\nAttentes vis � vis le cours 4B4 : "
		+ constructeurAshwin.getAttente());
		
	}
	

}
