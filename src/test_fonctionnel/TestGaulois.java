package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Grade;
import personnages.Soldat;
import sites.Camp;
import sites.Village;
import utilitaires.Equipement;

public class TestGaulois {
	public static void main(String[] args) {

		// Creation des habitants gaulois
		Gaulois asterix = new Gaulois("Astérix", 5);
		Gaulois vercingetorix = new Gaulois("Vercingétorix", 5);
		Gaulois obelix = new Gaulois("Obélix", 15);
		Gaulois prolix = new Gaulois("Prolix", 2);
		Gaulois agecanonix = new Gaulois("Agecanonix", 1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois abraracourcix = new Gaulois("abraracourcix", 5);
		Druide panoramix = new Druide("Panoramix", 1);
		Village lutece = new Village(vercingetorix);

		// Creation du village gaulois
		// Annonce de la création de Lutece
		vercingetorix.parler("Je suis un grand guerrier et je vais créer mon village");
		lutece.ajouterVillageois(agecanonix);
		lutece.ajouterVillageois(assurancetourix);
		lutece.ajouterVillageois(asterix);
		lutece.ajouterVillageois(obelix);
		lutece.ajouterVillageois(prolix);

		// Creation de l'armée romaine
		Soldat minus = new Soldat("Minus", 6, Grade.CENTURION);
		minus.equiperArmure(Equipement.BOUCLIER);
		minus.equiperArmure(Equipement.CASQUE);
		minus.equiperArmure(Equipement.PLASTRON);
		Soldat brutus = new Soldat("Brutus", 5, Grade.CENTURION);
		Soldat milexcus = new Soldat("Milexcus", 2, Grade.SOLDAT);
		Soldat tulliusOctopus = new Soldat("Tullius Octopus", 2, Grade.TESSERARIUS);
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus", 3, Grade.OPTIO);
		Soldat briseradius = new Soldat("Briseradius", 4, Grade.SOLDAT);
		Soldat chorus = new Soldat("Chorus", 4, Grade.CENTURION);
		Camp campDeMinus = new Camp(minus);

		// Creation d'un camp romain
		// Annonce de la création d'un camp romain par minus
		minus.parler("Je suis en charge de créer un nouveau camp romain");
		campDeMinus.ajouterSoldat(brutus);
		campDeMinus.ajouterSoldat(milexcus);
		campDeMinus.ajouterSoldat(tulliusOctopus);
		campDeMinus.ajouterSoldat(ballondebaudrus);

		campDeMinus.afficherCamp();
		lutece.afficherVillageois();

		lutece.changerChef(abraracourcix);

		campDeMinus.changerCommandant(briseradius);
		campDeMinus.changerCommandant(chorus);

		// Les Gauloi se préparent à l'assaut

		panoramix.fabriquerPotion(3);
		panoramix.donnerPotion(asterix);
		panoramix.donnerPotion(obelix);
		panoramix.donnerPotion(assurancetourix);
		panoramix.donnerPotion(abraracourcix);
		panoramix.donnerPotion(agecanonix);

		// Début de l'assaut

		minus.parler("UN GAU... UN GAUGAU...");

		// Asterix attaque

		while (!(asterix.estATerre() || minus.estATerre())) {
			asterix.frapper(minus);
			minus.frapper(asterix);
		}
	}
}