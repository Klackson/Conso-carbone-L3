package ConsoCarbone;

public class Logement extends ConsoCarbone{
	private int superficie;
	private CE ce;
	private static final double avgklg = 1696 + 675 + 355;
	private static final double avg= avgklg/1000;
	
	public Logement() {
		this(0,CE.A);
	}
	
	public Logement(int superficie, CE ce) {
		this.superficie=superficie;
		this.ce=ce;
		calculImpact();
	}
	

	public void setSuperficie(int sup) {
		this.superficie=sup;
		calculImpact();
	}
	
	public void setCE(CE ce) {
		this.ce=ce;
		calculImpact();
	}
	
	public CE getCE() {
		return ce;
	}
	
	public int getSuperficie() {
		return superficie;
	}
	
	public static void consoMoyenne() {
		System.out.print("L'empreinte carbonne moyenne pour un logement est de "+avg+" tonnes de CO2 par an.\n");
	}
	
   public void calculImpact() {
	   this.setImpact(superficie*ce.getAlpha());
   }
   
	@Override
	public String toString() {
		return ("L'émission de carbonne causée par votre logement est de "+getImpact()+" tonnes par an.");
	}
}
