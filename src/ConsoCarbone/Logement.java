package ConsoCarbone;

public class Logement extends ConsoCarbone{
	private int superficie;
	private CE ce;
	private int avg = (1696+675+355)/1000;
	
	protected Logement() {
		this(0,CE.A);
	}
	
	protected Logement(int superficie, CE ce) {
		this.superficie=superficie;
		this.ce=ce;
		this.calculImpact();
		this.setName("logement");
	}
	

	public void setSuperficie(int sup) {
		this.superficie=sup;
		this.calculImpact();
	}
	
	public void setCE(CE ce) {
		if(!(ce instanceof CE))return;
		this.ce=ce;
		this.calculImpact();
	}
	
	public CE getCE() {
		return ce;
	}
	
	public int getSuperficie() {
		return superficie;
	}
	
	public void consoMoyenne() {
		System.out.print("L'empreinte carbonne moyenne pour un logement est de : "+this.avg+" tonnes de CO2 par an.");
	}
	
   
   public void calculImpact() {
	   this.setImpact(superficie*ce.getAlpha());
   }
}
