package ConsoCarbone;

public class Alimentation extends ConsoCarbone{
	private double txBoeuf;
	private double txVege;
	private int avg = (1144+408+538+263)/1000;
	
	private static double xBoeuf=8;
	private static double xVege = 0.9;
	private static double xVolaille = 1.6;

	public Alimentation(){
		this(0,0);
	}
	
	public Alimentation(double txb, double txv) {
		this.txBoeuf=txb;
		this.txVege=txv;
		this.calculImpact();
		this.setName("alimentation");
	}
	
	public void seTxVege(double vg) {
		this.txVege=vg;
		this.calculImpact();
	}
	
	public void setTxBoeuf(double bg) {
		this.txBoeuf=bg;
		this.calculImpact();
	}
	
	public double getTxVege() {
		return txVege;
	}
	
	public double getTxBoeuf() {
		return txBoeuf;
	}
	
	public void consoMoyenne() {
		System.out.print("L'empreinte carbonne moyenne pour l'alimentation est de : "+this.avg+" tonnes de CO2 par an.");
	}
	
   
   public void calculImpact() {
	   this.setImpact(xBoeuf*txBoeuf + xVolaille*(1-txBoeuf-txVege)+ xVege*txVege);
   }
}
