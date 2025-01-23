
package test_fonctionnel;

import personnages.Gaulois;
import personnages.Grade;
import personnages.Soldat;
import personnages.Druide;


public class TestGaulois {
	public static void main(String[] args) {
		/*
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);
		System.out.println(asterix.getNom());

		asterix.parler("Bonjour à tous");

		Romain minus = new Romain("Minus", 6);
		minus.parler(" UN GAU...UN GAUGAU...");

		for (int i = 0; i < 3; i++) {
			asterix.frapper(minus);
			minus.frapper(asterix);
		}
		 */
		Gaulois agecanomix = new Gaulois("Agecanomix", 1);
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 2);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 5);
		Gaulois asterix = new Gaulois("Astérix", 5);
		Gaulois obelix = new Gaulois("Obelix", 15);
		
		Soldat minus = new Soldat("Minus", 6, Grade.CENTURION);

        minus.equiperCasque();
        minus.equiperPlastron();
        minus.equiperBouclier();

		Druide panoramix = new Druide("Panoramix", 0);
	    		
	  	panoramix.fabriquerPotion(3);
	  	panoramix.donnerPotion(asterix);
	  	panoramix.donnerPotion(obelix);
	  	panoramix.donnerPotion(assurancetourix);
	  	panoramix.donnerPotion(abraracourcix);
	  	panoramix.donnerPotion(agecanomix);
	  	
	  	asterix.parler("Bonjour a tous");
	  		
	  	minus.parler("UN GAU... UN GAUGAU...");
	  	
		asterix.frapper(minus);
}
}