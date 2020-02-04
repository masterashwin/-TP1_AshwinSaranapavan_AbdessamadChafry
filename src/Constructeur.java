
public class Constructeur {

	public String nom;
	public String prenom;
	public String formation;
	public String attente;
	public int anneExperience;
	public String[] competence;

	
	public Constructeur() {
		nom = null;
		prenom = null;
		formation = null;
		attente = null;
		anneExperience = 0;
		
	}
	public Constructeur(String nom, String prenom, String formation, String attente, int anneExperience
			) {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setFormation(formation);
		this.setAttente(attente);
		this.setAnneExperience(anneExperience);
		//this.setCompetence(competence);
		
	}
	
	
	public String getNom() {

		return this.nom;

	}
	public String getPrenom() {

		return this.prenom;

	}
	public String getFormation() {

		return this.formation;

	}
	public String getAttente() {

		return this.attente;

	}
	public int getAnneExperience() {

		return this.anneExperience;

	}
	
	public void setNom( String nom ) {

		this.nom = nom;

	}
	public void setPrenom( String prenom ) {

		this.prenom = prenom;

	}
	public void setFormation( String formation ) {

		this.formation = formation;

	}
	public void setAttente( String attente ) {

		this.attente = attente;

	}
	public void setAnneExperience( int anneExperience ) {

		this.anneExperience = anneExperience;

	}
	
}
