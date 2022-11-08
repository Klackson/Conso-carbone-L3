package ConsoCarbone;

public abstract class ConsoCarbone implements Comparable<ConsoCarbone>{
	private static int nbconso = 1;
	private int id;
	private double impact;
	
	public ConsoCarbone() {
		this.id=nbconso++;
	}

	
	public double getImpact() {
		return this.impact;
	}
	
	public void setImpact(double imp) {
		this.impact=imp;
	}
	

	public abstract void calculImpact();
	
	public int getId() {
		return id;
	}
	
	@Override
	public int compareTo(ConsoCarbone o) {
		if(impact>o.getImpact()) return 1;
		else if(impact<o.getImpact()) return -1;
		else return 0;
	}
}
