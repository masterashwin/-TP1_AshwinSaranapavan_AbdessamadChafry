
public class contructeur {

	private String nom;
	private String prenom;
	private String formation;
	private String attente;
	private int anneExperience;

	public contructeur(String nom, String prenom, String formation, String attente, int anneExperience,
			String[] competence) {
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
