package Utilisateur;

import ConsoCarbone.Alimentation;
import ConsoCarbone.CE;
import ConsoCarbone.Logement;
import ConsoCarbone.Taille;
import ConsoCarbone.Transport;
import ConsoCarbone.BienConso;

public class exemple {
	public static void main(String[] args) {
		Logement rg60 = new Logement(65,CE.A);
		Transport voituremelvin = new Transport(false, Taille.G, 200, 10, 4.5);
		Alimentation repasmelvin = new Alimentation(0,1);
		BienConso thunemelvin = new BienConso(5000);

		
		Utilisateur melvin= new Utilisateur(repasmelvin, voituremelvin, thunemelvin, rg60);
		melvin.calculerEmpreinte();
		System.out.print(melvin);
	}
}
