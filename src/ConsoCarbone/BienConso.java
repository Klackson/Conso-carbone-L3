package ConsoCarbone;

public class BienConso extends ConsoCarbone{
	private double montant;
	private int avg = 1180+682+763;
	
	public BienConso() {
		this(0);
	}
	
	public BienConso(double montant) {
		this.montant=montant;
		this.calculImpact();
		this.setName("consommation");
	}
	
	public void consoMoyenne() {
		System.out.print("L'empreinte carbonne moyenne pour les dépenses est de : "+this.avg+" tonnes de CO2 par an.");
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
	

}
