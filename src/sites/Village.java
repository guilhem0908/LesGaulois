package sites;

import personnages.Gaulois;

public class Village {
	private Gaulois chef;
	private Gaulois[] armeeGaulois = new Gaulois[50];
	private int nbGaulois = 0;

	public Village(Gaulois chef) {
		this.chef = chef;
	}

	public Gaulois chef() {
		return chef;
	}

	public boolean ajouterVillageois(Gaulois gaulois) {

		if (nbGaulois < armeeGaulois.length) {
			armeeGaulois[nbGaulois] = gaulois;
			nbGaulois++;
			chef.parler("Bienvenue " + gaulois.getNom());
			return true;
		}
		chef.parler("Désolé " + gaulois.getNom() + " mon village est deja bien rempli");
		return false;
	}

	public void afficherVillageois() {
		System.out.println("Le village de " + chef.getNom() + " est habité par : ");

		for (int i = 0; i < nbGaulois; i++) {
			System.out.println("- " + armeeGaulois[i].getNom());
		}
	}

	public void changerChef(Gaulois nouveauChef) {
		chef.parler("Je laisse mon grand bouclier au grand " + nouveauChef.getNom());
		nouveauChef.parler("Merci");
		this.chef = nouveauChef;
	}
}