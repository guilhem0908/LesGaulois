package personnages;

public class Soldat extends Romain {

	public Grade grade;
	private boolean casque = false;
	private boolean plastron = false;
	private boolean bouclier = false;

	public Soldat(String nom, int force, Grade grade) {
		super(nom, force);
		this.grade = grade;
	}
	
	@Override
	public String donnerAuteur() {
		return "soldat "; 
	}

	public void equiperCasque() {
		casque = true;
		parler("s'équipe avec un casque.");
	}

	public void equiperPlastron() {
		plastron = true;
        parler("s'équipe avec un plastron.");
	}

	public void equiperBouclier() {
		bouclier = true;
        parler("s'équipe avec un bouclier.");
	}

	@Override
	public double calculForceCoup(double forceCoup) {
		if (casque != false) {
			forceCoup = forceCoup - 2;
			System.out.println("Le casque absorbe 2 du coup.");
		}
		if (plastron != false) {
			forceCoup = forceCoup - 3;
			System.out.println("Le plastron absorbe 3 du coup.");
		}
		if (bouclier != false) {
			forceCoup = forceCoup - 3;
			System.out.println("Le bouclier absorbe 3 du coup.");
		}

		if (forceCoup < 0) {
			forceCoup = 0;
		}

		return forceCoup;
	}

	@Override
	public void frapper(Personnage adversaire) {
		double forceCoup = calculForceCoup(force);

		super.parler("donne un grand coup avec une force de " + forceCoup);
		adversaire.recevoirCoup(forceCoup);
	}

	@Override
	public void parler(String message) {
		System.out.println("Le soldat " + grade + " " + getNom() + " : \"" + message + "\".");
	}
}