package ConsoCarbone;

public abstract class ConsoCarbone implements Comparable<ConsoCarbone>{
	private static int nbconso = 1;
	private int id;
	private double impact;
	private String name="";
	
	public ConsoCarbone() {
		this.id=nbconso++;
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
		String end;
		if(getImpact()<=1) end = " tonne de CO2 par an.";
		else end= " tonnes de CO2 par an.";
		return "L'émission de carbonne causée par votre "+this.name+" est de "+ Math.round(getImpact()*100.0)/100.0 +end;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public abstract void calculImpact();
	
	public int getId() {
		return id;
	}
	
	@Override
	public int compareTo(ConsoCarbone o) {
		if(impact>o.getImpact()) return 1;
		if(impact<o.getImpact()) return -1;
		else return 0;
	}
}
