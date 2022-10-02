package ConsoCarbone;

public class ConsoCarbone {
	protected static int id;
	protected double impact;
	
	public ConsoCarbone() {
		id++;
	}

	
	public double getImpact() {
		return this.impact;
	}
	
}
