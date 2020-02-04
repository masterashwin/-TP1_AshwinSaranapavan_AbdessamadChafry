
public class CV {

	
	
	
	public static void main(String[] args) {
		System.out.println("Bienvenue chez Ashwin Saravanapavan et Abdessamad Chafry!");
		affiche();
	}
	
	public static void affiche(){
		Constructeur constructeurAbdessamad = new Constructeur("Chafry", "Abdessamad","Étudiant", "Aucune attente", 7);
		
		
		
		System.out.println("Nom : " + constructeurAbdessamad.getNom() + "\nPrénom : " + constructeurAbdessamad.getPrenom() + "\nFormation : " + constructeurAbdessamad.getFormation() 
				+ "\nExpériences de travail : " + constructeurAbdessamad.getAnneExperience() + " ans" + "\nCompétence : " + constructeurAbdessamad + "\nAttentes vis à vis le cours 4B4 : "
				+ constructeurAbdessamad.getAttente());
		
		Constructeur constructeurAshwin = new Constructeur("Chafry", "Abdessamad","Étudiant", "Aucune attente", 7);
		
		System.out.println("Nom : " + constructeurAshwin.getNom() + "\nPrénom : " + constructeurAshwin.getPrenom() + "\nFormation : " + constructeurAshwin.getFormation() 
		+ "\nExpériences de travail : " + constructeurAshwin.getAnneExperience() + " ans" + "\nCompétence : " + constructeurAshwin + "\nAttentes vis à vis le cours 4B4 : "
		+ constructeurAshwin.getAttente());
		
	}
	

}
