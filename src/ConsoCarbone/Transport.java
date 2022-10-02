package ConsoCarbone;

public class Transport extends consoCarbone{
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
     this.impact=possede*(Math.pow(kilomAnnee*1.94*10,-4)+(taille.fabrication/amortissement));
   }
   
}
  
     
      
       
      
       
       


