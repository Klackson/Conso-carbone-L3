package Utilisateur;

import ConsoCarbone.ServicesPublics;
import ConsoCarbone.Alimentation;
import ConsoCarbone.Logement;
import ConsoCarbone.BienConso;
import ConsoCarbone.Transport;



public class Utilisateur {
	private Alimentation alimentation;
	private Transport transport;
	private ServicesPublics services;
	private BienConso bienconso;
	private Logement logement;
	//private Object[] attributs;
	private double consototale=0;
	
	public Utilisateur() {
		this(new Alimentation(), new Transport(), new BienConso(), new Logement());
	}
	
	public Utilisateur(Alimentation alim, Transport transport, BienConso bien, Logement logement) {
		alimentation=alim;
		this.transport=transport;
		bienconso=bien;
		this.logement=logement;
		services=ServicesPublics.getInstance();
		//Object[] attributes = {this.alimentation, this.logement, this.bienconso, this.transport, this.services};
	}
	
	@Override
	public String toString() {
		return "Votre émission carbone totale est de "+consototale+" tonnes de CO2."+
				"\nEmissions détaillées\n-Alimentation : "+alimentation.getImpact()+"\n-Transports : "+transport.getImpact()+
				"\n-Services sociaux : "+services.getImpact()+"\n-Dépenses : "+bienconso.getImpact()+"\n-Logement : "+logement.getImpact();
	}
	
	public void calculerEmpreinte() {
		consototale= alimentation.getImpact() + transport.getImpact() + bienconso.getImpact() + logement.getImpact() + services.getImpact();

	}

	public double getConsototale() {
		return Math.round(consototale*100.0)/100.0;
	}

	public void setConsototale(double consototale) {
		this.consototale = consototale;
	}
}
