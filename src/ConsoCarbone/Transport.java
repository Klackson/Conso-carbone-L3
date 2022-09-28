package ConsoCarbone;

public class Transport extends consoCarbone{
  boolean possede;
  Taille taille;
  int kilomAnnee;
  int amortissement;
    
   public Transport(){
     this.possede=false;
     this.taille=P;
     this.kilomAnnee=0;
     this.amortsissement=0;
   }
     
   public Transport(boolean possede, Taille taille, int kilomAnnee,int amortissement){
     this.possede=possede;
     this.taille=taille;
     this.kilomAnnee=kilomAnnee;
     this.amortissement=amortissement;
     this.impact=possede*kilomAnnee*1.94*10**(-4)+fabrication/amortissement
     
      
       
      
       
       


