package ConsoCarbone;

public class Alimentation extends ConsoCarbone{
	double txBoeuf;
	double txVege;
	
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
	
	public void setvg(double vg) {
		this.txVege=vg;
	}
	
	public void setbf(double bg) {
		this.txBoeuf=bg;
	}
}
