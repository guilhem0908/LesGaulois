package sites;

import personnages.Grade;
import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private Soldat[] armeeRomain = new Soldat[80];
	private int nbSoldat = 0;

	public Camp(Soldat commandant) {
		this.commandant = commandant;
	}

	public Soldat getCommandant() {
		return commandant;
	}

	public boolean ajouterSoldat(Soldat soldat) {

		if (nbSoldat < armeeRomain.length) {
			armeeRomain[nbSoldat] = soldat;
			soldat.parler("Je mets mon epee au service de Rome dans le camp dirige par " + commandant.getNom());
			nbSoldat++;
			return true;
		}
		commandant.parler("Désolé " + soldat.getNom() + " notre camp est complet");
		return false;
	}

	public void afficherCamp() {
		System.out.println("Le camp dirige par " + commandant.getNom() + " est habité par :");

		for (int i = 0; i < nbSoldat; i++) {
			System.out.println("- " + armeeRomain[i].getNom());
		}
	}

	public void changerCommandant(Soldat commandant) {
		if (commandant.grade != Grade.CENTURION) {
			this.commandant = commandant;
			commandant.parler("Je ne suis pas suffisamment gradé pour prendre la direction du camp romain");
		} else {
			commandant.parler("je prends la direction du camp romain");
		}
	}

}