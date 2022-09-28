package ConsoCarbone;

public class Logement extends ConsoCarbone{
	int superficie;
	CE ce;
	
	private Logement() {
		this(0,CE.A);
	}
	
	private Logement(int superficie, CE ce) {
		this.superficie=superficie;
		this.ce=ce;
		this.impact=superficie*ce.alpha;
	}
	

	
	public void setsup(int sup) {
		this.superficie=sup;
	}
	
	public void setce(CE ce) {
		this.ce=ce;
	}
	
	public static void main(String[] args) {
		Logement rg60 = new Logement(65,CE.E);
		System.out.print(rg60.getImpact());
	}
}
