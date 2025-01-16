package personnages;

public abstract class Personnage {
	
	private String nom; 
	private int force; 
	
	public Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}

	public void parler(String chaine) {
		System.out.println("Le gaulois " + nom + " : \"" + chaine + "\".");
	}
	
	public abstract String donnerAuteur(); 

	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomRomain);
		romain.recevoirCoup(force/3);
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