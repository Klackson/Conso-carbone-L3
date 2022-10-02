package ConsoCarbone;

public class BienConso extends ConsoCarbone{
	double montant;
	
	public BienConso() {
		this(0);
	}
	
	public BienConso(double montant) {
		this.montant=montant;
		this.impact=montant/1750;
	}
	
	public void setmontant(double montant) {
		this.montant=montant;
	}
}
