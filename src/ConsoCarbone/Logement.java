package ConsoCarbone;

public class Logement extends ConsoCarbone{
	int superficie;
	CE ce;
	int avg = (1696+675+355)/1000;
	
	protected Logement() {
		this(0,CE.A);
	}
	
	protected Logement(int superficie, CE ce) {
		this.superficie=superficie;
		this.ce=ce;
		this.impact=superficie*ce.getalpha();
	}
	

	public void setsup(int sup) {
		if(sup<0);
		this.superficie=sup;
	}
	
	public void setce(CE ce) {
		if(!(ce instanceof CE))return;
		this.ce=ce;
	}
	
	public void consoMoyenne() {
		System.out.print("L'empreinte carbonne moyenne pour un logement est de : "+this.avg+" tonnes de CO2 par an.");
	}
}
