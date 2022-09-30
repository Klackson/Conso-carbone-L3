package ConsoCarbone;

public class ConsoCarbone {
	protected static int id;
	protected double impact;
	
	public ConsoCarbone() {
		this(0);
	}
	
	public ConsoCarbone(double impact) {
		this.impact=impact;
		id++;
	}
	
	public double getImpact() {
		return this.impact;
	}
	
}
