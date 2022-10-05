package ConsoCarbone;

public class ConsoCarbone {
	private static int id = 0;
	private double impact;
	private String name="";
	
	public ConsoCarbone() {
		id=id++;
	}

	
	public double getImpact() {
		return this.impact;
	}
	
	public void setImpact(double imp) {
		this.impact=imp;
	}
	
	public String erreurSaisie() {
		return "Cette valeur n'est pas possible";
	}
	
	@Override
	public String toString() {
		return "L'émission de carbonne causée par votre "+this.name+" est de "+this.getImpact()+" tonnes par an.";
	}
	
	public void setName(String name) {
		this.name=name;
	}
}
