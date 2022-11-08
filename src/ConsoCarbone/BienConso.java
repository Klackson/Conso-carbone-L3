package ConsoCarbone;

public class BienConso extends ConsoCarbone{
	private double montant;
	private static final float avgklg = 1180+682+763;
	private static final float avg=avgklg/1000;
	
	public BienConso() {
		this(0);
	}
	
	public BienConso(double montant) {
		this.montant=montant;
		this.calculImpact();
	}
	
	public static void consoMoyenne() {
		System.out.print("L'empreinte carbonne moyenne pour les dépenses est de "+avg+" tonnes de CO2 par an.\n");
	}

   
   public void calculImpact() {
	   this.setImpact(montant/1750);
   }
   
	public void setMontant(double montant) {
		this.montant=montant;
		this.calculImpact();
	}
	
	public double getMontant() {
		return this.montant;
	}
	
	@Override
	public String toString() {
		return ("L'émission de carbonne causée par vos dépenses est de "+getImpact()+" tonnes par an.");
	}
}
