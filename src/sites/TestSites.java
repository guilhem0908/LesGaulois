package sites;

import personnages.Grade;
import personnages.Gaulois;
import personnages.Soldat;

public class TestSites {

	public static void main(String[] args) {
		
		Gaulois vercingetorix = new Gaulois("Vercingetorix", 5);
		Village village = new Village(vercingetorix); 
		
		Soldat minus = new Soldat("Minus", 2, Grade.CENTURION);
		Camp camp = new Camp(minus); 
		
		vercingetorix.parler("Je suis un grand guerrier et je vais creer mon village"); 
		minus.parler("Je suis en charge de creer un nouveau camp romain"); 
	
		Gaulois agecanomix = new Gaulois("Agecanomix", 1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois asterix = new Gaulois("Astérix", 5);
		Gaulois obelix = new Gaulois("Obelix", 15);
		Gaulois prolix = new Gaulois("Prolix", 2);
		
	
		Soldat brutus = new Soldat("Brutus", 5, Grade.CENTURION); 
		Soldat milexcus = new Soldat("Milexcus", 2, Grade.SOLDAT);
		Soldat tulliusOctopus = new Soldat("Tullius Octopus", 2, Grade.TESSERARIUS);
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus", 3, Grade.OPTIO); 
		
		camp.ajouterSoldat(brutus); 
		camp.ajouterSoldat(milexcus); 
		camp.ajouterSoldat(tulliusOctopus); 
		camp.ajouterSoldat(ballondebaudrus);
	
		village.ajouterVillageois(agecanomix);
		village.ajouterVillageois(assurancetourix);
		village.ajouterVillageois(asterix);
		village.ajouterVillageois(obelix);
		village.ajouterVillageois(prolix);
		
		camp.afficherCamp();
		village.afficherVillageois(village);
	
		Gaulois abraracourcix = new Gaulois("abraracourcix" , 5);
		Soldat briseradius = new Soldat("Briseradius", 4, Grade.SOLDAT);
		Soldat chorus = new Soldat("Chorus", 4, Grade.CENTURION);
	
		village.changerChef(abraracourcix); 
	
		camp.changerCommandant(briseradius);
		camp.changerCommandant(chorus);
	}
}