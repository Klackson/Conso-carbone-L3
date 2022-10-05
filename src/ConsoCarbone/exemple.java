package ConsoCarbone;

public class exemple {
	
	public static void main(String[] args) {
		Logement rg60 = new Logement(65,CE.E);
		System.out.println(rg60);
		
		Transport voituredemelvin = new Transport(true, Taille.G, 200, 10);
		System.out.println(voituredemelvin);
	}
}
