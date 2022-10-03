package ConsoCarbone;

public class Transport extends ConsoCarbone{
  boolean possede;
  Taille taille;
  int kilomAnnee;
  int amortissement;
    
   public Transport(){
	 this(false,Taille.P,0,0);
   }
     
   public Transport(boolean possede, Taille taille, int kilomAnnee,int amortissement){
     this.possede=possede;
     this.taille=taille;
     this.kilomAnnee=kilomAnnee;
     this.amortissement=amortissement;
     if(possede)this.impact=(kilomAnnee*1.94*Math.pow(10,-4)+(taille.fabrication/amortissement));
     else this.impact=0;
   }
   
   @Override
   public String toString() {
	   return "Votre émission de carbonne causée par votre voiture est de "+this.impact;
   }
   
}
  
     
      
       
      
       
       


