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
	
	protected abstract String donnerAuteur(); 

	public void frapper(Personnage adversaire) {
		if (force > 0) {
			String nomAdversaire = adversaire.getNom();
			System.out.println("Le " + donnerAuteur() + " " + nom + " donne un grand coup au " + adversaire.donnerAuteur() + nomAdversaire);
			adversaire.recevoirCoup(force/3);
		}
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