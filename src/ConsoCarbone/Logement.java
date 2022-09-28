package ConsoCarbone;

public class Logement {
	int superficie;
	CE ce;
	double impact;
	
	private Logement() {
		this(0,CE.A);
	}
	
	private Logement(int superficie, CE ce) {
		this.superficie=superficie;
		this.ce=ce;
		this.impact=superficie*ce.alpha;
	}
	
	public double getImpact() {
		return this.impact;
	}
	
	public static void main(String[] args) {
		Logement rg60 = new Logement(65,CE.E);
		System.out.print(rg60.getImpact());
	}
}
