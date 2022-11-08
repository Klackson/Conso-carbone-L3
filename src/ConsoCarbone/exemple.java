package ConsoCarbone;

public class exemple {
	
	public static void main(String[] args) {
		Logement rg60 = new Logement(65,CE.E);
		System.out.println(rg60);
		
		Transport voituredemelvin = new Transport(true, Taille.G, 200, 10);
		System.out.println(voituredemelvin);
		
		Alimentation repasmelvin = new Alimentation(0,1);
		System.out.println(repasmelvin);
		
		System.out.println(voituredemelvin.getId());
		System.out.println(rg60.getId());
		
		Transport.consoMoyenne();
	}
}
