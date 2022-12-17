package ConsoCarbone;

import java.util.*;

public class TransportCommun extends ConsoCarbone {
  private double distanceMetro;
  private double timeMetro;
  private double distanceBus;
  private double timeBus;
  private double distanceRER;
  private double timeRER;
  private double distanceTram;
  private double timeTram;
  private int congepaye;
  private static final double CO2KmMetro=3.8/1000000;
  private static final double vitesseMetro=65;
  private static final double CO2KmBus=104/100000;
  private static final double vitesseBus=14;
  private static final double CO2KmTram=3.9/1000000;
  private static final double vitesseTram=25;
  private static final double CO2KmRER=6.2/1000000;
  private static final double vitesseRER=70;



public TransportCommun(double timeMetro, double timeBus,double timeRER, double timeTram){
  this.timeMetro=timeMetro*52;
  this.timeBus=timeBus*52;
  this.timeRER=timeRER*52;
  this.timeTram=timeTram*52;
  distanceMetro=timeMetro*vitesseMetro; 
  distanceBus=timeBus*vitesseBus;
  distanceRER=timeRER*vitesseRER;
  distanceTram=timeTram*vitesseTram;
  setName("Utilisation des transports en communs");
  calculImpact();

}

public TransportCommun(){
  this(0,0,0,0);
}

public double gettimeMetro() {
  return timeMetro;
}

public double gettimeBus() {
  return timeBus;
}

public double gettimeRER() {
  return timeRER;
}
public double gettimeTram() {
  return timeTram;
}


public void settimeMetro (double distance) {
  timeMetro=distance;
  calculImpact();
}
public void settimeRER (double distanceR) {
  timeRER=distanceR;
  calculImpact();
}
public void settimeTram (double distanceT) {
  timeTram=distanceT;
  calculImpact();
}
public void settimeBus (double distanceB) {
  timeBus=distanceB;
  calculImpact();
}




public void calculImpact() {
  this.setImpact((distanceMetro*CO2KmMetro+distanceBus*CO2KmBus+distanceRER*CO2KmRER+distanceTram*CO2KmTram)*(52-congepaye));
}


public TransportCommun inputTransportCommun() {
  double timeBus=-1;
  double timeRER=-1;
  double timeTram=-1;
  double timeMetro=-1;
  int congepaye=-1;
  Scanner scan = new Scanner(System.in);
  while(timeBus<0) {
   System.out.println("Combien d'heures passez vous en Bus par semaine (hors vacances) ?");
   timeBus=scan.nextDouble();}
  while(timeRER<0) {
    System.out.println("Combien d'heures passez vous en RER par semaine (hors vacances) ?");
    timeRER=scan.nextDouble();}
  while(timeTram<0) {
   System.out.println("Combien d'heures passez vous en Tramway par semaine (hors vacances) ?");
   timeTram=scan.nextDouble();}
  while(timeMetro<0) {
    System.out.println("Combien d'heures passez vous en Metro par semaine (hors vacances) ?");
    timeMetro=scan.nextDouble();}
  Scanner scan = new Scanner(System.in);
  while(congepaye<0) {
   System.out.println("De combien de semaines de congés payés disposez vous ?");
   congepaye=scan.nextDouble();}

if(timeBus==0 && timeRER==0 &&timeMetro==0 &&timeTram==0 && congepaye==52) {
  scan=null;
  return new TransportCommun();}

  scan=null;
  return inputTransportCommun();



}



}
