package Utilisateur;

import ConsoCarbone.ServicesPublics;

public class Utilisateur {
	private Alimentation alimentation;
	private Transport transport;
	private ServicesPublics services;
	private BienConso bienconso;
	private Logement logement;
	private Consocarbone[] attributs;
	
	public Utilisateur() {

	}
	
	public Utilisateur(Alimentation alim, Transport transport, BienConso bien, Logement logement) {
		alimentation=alim;
		this.transport=transport;
		bienconso=bien;
		this.logement=logement;
		services=ServicesPublics.getInstance();
		attributs = {this.alimentation, this.logement, this.bienconso, this.transport, this.services};
	}
	
	public double calculerEmpreinte() {
		double somme;
		for(int i; i<attributs.length;i++) {
			somme+=attributs[i].getImpact();
		}
	}
}
