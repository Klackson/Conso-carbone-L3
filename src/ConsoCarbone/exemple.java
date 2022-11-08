package ConsoCarbone;

public class exemple {
	
	public static void main(String[] args) {
		Logement rg60 = new Logement(65,CE.E);
		System.out.println(rg60.getId());
		System.out.println(rg60);
		
		Transport voituredemelvin = new Transport(true, Taille.G, 200, 10);
		System.out.println(voituredemelvin.getId());
		System.out.println(voituredemelvin);
		
		Alimentation repasmelvin = new Alimentation(0,1);
		System.out.println(repasmelvin);
		
		BienConso.consoMoyenne();
		
		ConsoCarbone argentmelvin = new BienConso(5000);
		System.out.println(argentmelvin);
	}
}
