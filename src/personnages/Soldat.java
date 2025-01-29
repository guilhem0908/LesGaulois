package personnages;

import utilitaires.Equipement;

public class Soldat extends Romain {

	public Grade grade;
	private Equipement casque = null;
	private Equipement bouclier = null;
	private Equipement plastron = null;

	public Soldat(String nom, int force, Grade grade) {
		super(nom, force);
		this.grade = grade;
	}

	@Override
	protected double protection(double force) {
		// Applique la défense de chaque équipement si présent
		if (casque != null) {
			force -= casque.getDefense();
			System.out.println("Le casque attenue les dégats de " + casque.getDefense());
		}
		if (bouclier != null) {
			force -= bouclier.getDefense();
			System.out.println("Le bouclier attenue les dégats de " + bouclier.getDefense());
		}
		if (plastron != null) {
			force -= plastron.getDefense();
			System.out.println("Le plastron attenue les dégats de " + plastron.getDefense());
		}

		return Math.max(0, force); // Assure que la force n'est jamais négative
	}

	public void equiperArmure(Equipement armure) {
		if (armure == Equipement.CASQUE) {
			if (casque == null) {
				casque = Equipement.CASQUE;
				System.out.println("Le soldat " + getNom() + " s'équipe d'un casque.");
			} else
				parler("J'ai déja un casque");
		}

		if (armure == Equipement.PLASTRON) {
			if (plastron == null) {
				plastron = Equipement.PLASTRON;
				System.out.println("Le soldat " + getNom() + " s'équipe d'un plastron.");
			} else
				this.parler("J'ai déja un plastron");
		}

		if (armure == Equipement.BOUCLIER) {
			if (bouclier == null) {
				bouclier = Equipement.BOUCLIER;
				System.out.println("Le soldat " + getNom() + " s'équipe d'un bouclier.");
			} else
				this.parler("J'ai déja un bouclier");
		}

	}

}