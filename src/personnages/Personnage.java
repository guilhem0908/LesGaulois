package personnages;


public abstract class Personnage {
	
	private String nom; 
	private int force;
	
	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String chaine) {
		System.out.println("Le " + donnerAuteur() + " " + nom + " : \"" + chaine + "\".");
	}
	
	public abstract String donnerAuteur(); 
	

	public double calculForce() {
		return force / 3;
	}
		
	public void frapper(Personnage adversaire) {
		if (force > 0) {
			System.out.println("Le " + donnerAuteur() + nom + " donne un grand coup au " + adversaire.donnerAuteur() + " " + adversaire.getNom());
			adversaire.recevoirCoup(force / 3);
		}
	}

	public double calculForceCoup(double forceCoup) {
		return force = (int) (force - forceCoup);
	}
	
	public void recevoirCoup(double forceCoup) {
		double force = calculForceCoup(forceCoup); 
		if (force <= 0) {
			force = 0; 
			parler("J'abandonne");
		}
		else {
			parler("Aïe !");
		}
	}
	
	public boolean estATerre() {
	    return this.force <= 0;
	}
	

}