package ConsoCarbone;

public final class ServicesPublics extends ConsoCarbone{
	private static ServicesPublics INSTANCE;
	
	private ServicesPublics() {
		setName("utilisation des services publics");
		calculImpact();
	}
	
	public void calculImpact() {
		setImpact(1.5);
	}
	
	public static ServicesPublics getInstance() {
		if (INSTANCE==null) INSTANCE = new ServicesPublics();
		return INSTANCE;
	}
}
