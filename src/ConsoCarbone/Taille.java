package ConsoCarbone;

public enum Taille {
	P(4.2),G(19);
	private double fabrication;
	
	private Taille(double fabrication){
		this.fabrication=fabrication;
	}
	
	public double getFabrication() {
		return fabrication;
	}
}

