package ConsoCarbone;

public class Transport extends ConsoCarbone{
	private boolean possede;
	private Taille taille;
	private int kilomAnnee;
	private int amortissement;
	
	private static int avg= 1972;
    
   public Transport(){
	 this(false,Taille.P,0,0);
   }
     
   public Transport(boolean possede, Taille taille, int kilomAnnee,int amortissement){
     this.possede=possede;
     this.taille=taille;
     this.kilomAnnee=kilomAnnee;
     this.amortissement=amortissement;
     if(possede) this.setImpact((kilomAnnee*1.94*Math.pow(10,-4)+(taille.getFabrication()/amortissement)));
     else this.setImpact(0);
     this.setName("voiture");
   }

   
   public void calculImpact() {
	   if(possede) this.setImpact((kilomAnnee*1.94*Math.pow(10,-4)+(taille.getFabrication()/amortissement)));
	   else this.setImpact(0);
   }
   
   public void setKilomAnnee(int klm) {
	   this.kilomAnnee=klm;
   }
   
   public void setAmortissement(int amo) {
	   this.amortissement=amo;
   }
   
   public void setPossede(boolean p) {
	   this.possede=p;
   }
   
   public void setTaille(Taille voiture) {
	   this.taille=voiture;
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
   
	public void consoMoyenne() {
		System.out.print("L'empreinte carbonne moyenne pour la voiture est de : "+avg+" tonnes de CO2 par an.");
	}
}
  
     
      
       
      
       
       


