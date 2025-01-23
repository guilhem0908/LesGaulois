package personnages;

import utilitaires.Potion;

public class Gaulois extends Personnage{
	
	private double booster = 1; 
	
	public Gaulois(String nom, int force) {
		super(nom, force); 
	}
	
	@Override
	public String donnerAuteur() {
		return "gaulois"; 
	}
	
	public void boirePotion(Potion potion) {
        this.booster *= potion.getPuissance();
        this.parler("Tiens " + getNom() + " une peu de potion magique");
    }
	 
}


/*package personnages;

public class Gaulois extends Personnage{
	
	public Gaulois(String nom, int force) {
		super(nom, force); 
	}
	
	@Override
	public String donnerAuteur() {
		return "gaulois"; 
	}
}

public class Gaulois {
	private String nom;
	private int force;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String chaine) {
		System.out.println("Le gaulois " + nom + " : \"" + chaine + "\".");
	}

	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomRomain);
		romain.recevoirCoup(force/3);
	}

//	public static void main(String[] args) {
//		Gaulois asterix = new Gaulois("Astérix", 8);
//		System.out.println(asterix);
//		System.out.println(asterix.getNom());
//	}

}
*/