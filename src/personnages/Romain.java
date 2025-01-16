package personnages;

public class Romain extends Personnage{
	
	public Romain(String nom, int force) {
		super(nom, force); 
	}
	
	@Override
	public String donnerAuteur() {
		return "romain"; 
	}

}

/*
public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String chaine) {
		System.out.println("Le romain " + nom + " : \"" + chaine + "\".");
	}

	public void recevoirCoup(int forceCoup) {
		force = force - forceCoup;
		if (force <= 0) {
			force = 0;
			parler("J'abandonne");
		} else {
			parler("Aïe !");
		}
	}
}
*/