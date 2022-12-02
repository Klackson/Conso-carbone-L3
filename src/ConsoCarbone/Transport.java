package ConsoCarbone;

public class Transport extends ConsoCarbone{
	private boolean possede;
	private Taille taille;
	private int kilomAnnee, amortissement;
	private double heuresavion;
	private double heurestrain;
	
	private static final double avgklg = 1972;
	private static final double avg = avgklg/1000;
	private static final double CO2heureavion = 0.19;
    	private static final double CO2htrain = 0.000452;
   public Transport(){
	 this(false,Taille.P,0,0,0,0);
   }
     
   public Transport(boolean possede, Taille taille, int kilomAnnee,int amortissement, double heuresavion, double heurestrain){
     this.possede=possede;
     this.taille=taille;
     this.kilomAnnee=kilomAnnee;
     this.amortissement=amortissement;
     this.heuresavion=heuresavion;
     this.heurestrain=heurestrain;
     calculImpact();
     this.setName("utilisation des transports");
   }

   
   public void calculImpact() {
	   if(possede) this.setImpact( kilomAnnee*1.94*Math.pow(10,-4)+(taille.getFabrication()/amortissement) );
	   else this.setImpact(0);
	   setImpact(getImpact()+heuresavion*CO2heureavion+heurestrain*CO2htrain);
   }
   
   public void setKilomAnnee(int klm) {
	   this.kilomAnnee=klm;
	   calculImpact();
   }
   
   public void setAmortissement(int amo) {
	   this.amortissement=amo;
	   calculImpact();
   }
   
   public void setPossede(boolean p) {
	   this.possede=p;
	   calculImpact();
   }
   
   public void setTaille(Taille voiture) {
	   this.taille=voiture;
	   calculImpact();
   }
   
   public int getKilomAnnee() {
	   return this.kilomAnnee;
   }
   
   public int getAmortissement() {
	   return this.amortissement;
   }
   
   public Taille getTaille() {
	   return this.taille;
   }
   
   public boolean getPossede() {
	   return this.possede;
   }
   
	public static void consoMoyenne() {
		System.out.print("L'empreinte carbonne moyenne pour la voiture est de "+avg+" tonnes de CO2 par an.");
	}
	
	
		
}
  
     
      
       
      
       
       


