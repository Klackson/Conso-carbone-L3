package ConsoCarbone;

public enum CE {
	A(0.005),B(0.01),C(0.02),D(0.035),E(0.055),F(0.08),G(0.1);
	
	public final double alpha;
	
	private CE(double alpha) {
		this.alpha=alpha;
	}

	
}
public enum Taille {
	P(4.2),G(19);
}
