package personnages;

import utilitaires.Potion;
import java.security.SecureRandom;
import java.util.Random;

public class Druide extends Personnage {

	private Potion[] potions = new Potion[100];
	private int nombrePotions;
	private Random random;

	public Druide(String nom, int force) {
		super(nom, force);
		nombrePotions = 0;
		try {
			random = SecureRandom.getInstanceStrong();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String donnerAuteur() {
		return "Druide";
	}

	public void fabriquerPotion(int quantite) {
		for (int i = 0; i < quantite; i++) {
			int puissance = 2 + random.nextInt(5);
			nombrePotions++;
			potions[nombrePotions] = new Potion(puissance);
		}
		parler("J'ai concocté " + quantite + " doses de potion magique. Elle a une force de "
				+ potions[nombrePotions - 1].getPuissance());
	}

	public void donnerPotion(Gaulois gaulois) {
		if ("Obelix".equals(gaulois.getNom())) {
			parler("Non, Obélix Non !... Et tu le sais très bien !");
		} else {

			if (nombrePotions > 0) {
				Potion potion = potions[nombrePotions];
				nombrePotions--;
				gaulois.boirePotion(potion);
			} else {
				parler("Désolé " + gaulois.getNom() + " il n'y a plus une seule goutte de potion.");
			}
		}
	}

}