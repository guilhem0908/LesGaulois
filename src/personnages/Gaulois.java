package personnages;

import utilitaires.Potion;

public class Gaulois extends Personnage {
	private double puissancePotion = 1.0; // Puissance initiale sans potion

	public Gaulois(String nom, int force) {
		super(nom, force);
	}

	public void boirePotion(Potion potion) {
		if ("Obélix".equals(getNom())) {
			this.parler("Non, non, non ! Je n'ai pas le droit de boire de la potion magique !");
			return;
		}
		this.puissancePotion = potion.getPuissance();
		this.parler("boit une potion de puissance " + this.puissancePotion);
	}

	@Override
	public void frapper(Personnage victime) {
		int forceCoup = (int) (this.force * this.puissancePotion);

		if (this.estATerre()) {
			this.parler("Je ne peux plus me battre...");
		} else if (!victime.estATerre() && !this.estATerre()) {

			super.parler(
					"envoie un grand coup dans la mâchoire de " + victime.getNom() + " avec une force de " + forceCoup);
			victime.recevoirCoup(forceCoup);
			this.puissancePotion = Math.max(1.0, this.puissancePotion - 0.5); // Diminue la puissance de la potion

		}
	}

	@Override
	public String donnerAuteur() {
		return "Gaulois";
	}

	public void setPuissancePotion(int puissance) {
		puissancePotion = puissance;

	}
}

/*
 * package personnages;
 * 
 * public class Gaulois extends Personnage{
 * 
 * public Gaulois(String nom, int force) { super(nom, force); }
 * 
 * @Override public String donnerAuteur() { return "gaulois"; } }
 * 
 * public class Gaulois { private String nom; private int force;
 * 
 * public Gaulois(String nom, int force) { this.nom = nom; this.force = force; }
 * 
 * public String getNom() { return nom; }
 * 
 * public void parler(String chaine) { System.out.println("Le gaulois " + nom +
 * " : \"" + chaine + "\"."); }
 * 
 * public void frapper(Romain romain) { String nomRomain = romain.getNom();
 * System.out.println(nom + " envoie un grand coup dans la mâchoire de " +
 * nomRomain); romain.recevoirCoup(force/3); }
 * 
 * // public static void main(String[] args) { // Gaulois asterix = new
 * Gaulois("Astérix", 8); // System.out.println(asterix); //
 * System.out.println(asterix.getNom()); // }
 * 
 * }
 */