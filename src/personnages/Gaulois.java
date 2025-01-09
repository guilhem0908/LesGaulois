package personnages;

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
		
		
//	public static void main(String[] args) {
//		Gaulois asterix = new Gaulois("Astérix", 8);
//		System.out.println(asterix);
//		System.out.println(asterix.getNom());
//	}
	
}
