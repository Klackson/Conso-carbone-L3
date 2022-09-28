package ConsoCarbone;

public class Alimentation {
	double txBoeuf;
	double txVege;
	double impact;
	
	public static double xBoeuf=8;
	public static double xVege = 0.9;
	public static double xVolaille = 1.6;

	public Alimentation(){
		this(0,0);
	}
	
	public Alimentation(double txb, double txv) {
		this.txBoeuf=txb;
		this.txVege=txv;
		this.impact=xBoeuf*txb + xVolaille*(1-txb-txv)+ xVege*txv;
	}
	
	public double getImpact() {
		return this.impact;
	}
}
