package personnages;

import equipements.Bouclier;
import equipements.Casque;
import equipements.Plastron;

public class Soldat extends Romain {

	public Grade grade;
	Casque casque;
	Bouclier bouclier;
	Plastron plastron;

	public Soldat(String nom, int force, Grade grade) {
		super(nom, force);
		this.grade = grade;
	}
	
	public void equiperCasque() {
		casque = new Casque();
		System.out.println("Le soldat " + getNom() + " s'équipe avec un casque");
	}

	public void equiperPlastron() {
		plastron = new Plastron();
		System.out.println("Le soldat " + getNom() + " s'équipe avec un plastron");
	}

	public void equiperBouclier() {
		bouclier = new Bouclier();
		System.out.println("Le soldat " + getNom() + " s'équipe avec un bouclier");
	}

	private int protection(int force) {
		if (casque.defense > 0) {
			force -= 2;
			System.out.println("Le casque attenue les dégats de " + casque.defense);
		} else {
			casque.defense = 0;
		}
		if (bouclier.defense > 0) {
			force -= 3;
			System.out.println("Le bouclier attenue les dégats de " + bouclier.defense);
		} else {
			bouclier.defense = 0;
		}
		if (plastron.defense > 0) {
			force -= 3;
			System.out.println("Le plastron attenue les dégats de " + plastron.defense);
		} else {
			plastron.defense = 0;
		}
		if (force < 0) {
			force = 0;
		}
		return force;
	}

	@Override
	public void recevoirCoup(int force) {
		force = protection(force);
		this.force -= force;
		if (this.force <= 0) {
			this.force = 0;
			this.parler("J'abandonne...");
		} else {
			this.parler("Aïe !");
		}
	}

}