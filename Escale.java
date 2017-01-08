package gestion_Vol;
import java.lang.Math;
public class Escale {
	private static int numEscale=0;
	private int heureDepartEscale;
	private int minuteDepartEscale;
	private int minuteArriveEscale;
	private int heureArriveEscale;
	
	public Escale(int heureDepartEscale, int minuteDepartEscale,int heureArriveEscale, int minuteArriveEscale){
		this.numEscale++;
		this.heureDepartEscale = heureDepartEscale;
		this.minuteDepartEscale = minuteDepartEscale;
		this.minuteArriveEscale = minuteArriveEscale;
		this.heureArriveEscale = heureArriveEscale;
	}
	public int getNumEscale() {
		return numEscale;
	}
	public void setNumEscale(int numEscale) {
		this.numEscale = numEscale;
	}
	public int getHeureDepartEscale() {
		return heureDepartEscale;
	}

	public void setHeureDepartEscale(int heureDepartEscale) {
		this.heureDepartEscale = heureDepartEscale;
	}


	public int getHeureArriveEscale() {
		return heureArriveEscale;
	}
	public int getMinuteArriveEscale() {
		return minuteArriveEscale;
	}
	public int getMinuteDepartEscale() {
		return minuteArriveEscale;
	}
	public void setHeureArriveEscale(int heureArriveEscale) {
		this.heureArriveEscale = heureDepartEscale;
	}

	@Override
	public String toString() {
		return "Esclale [numEscale=" + numEscale + ", heureDepartEscale=" + heureDepartEscale + ", heureArriveEscale="
				+ heureArriveEscale + "]";
	}
	public String getDureeEscale(){
		int h = heureDepartEscale - heureArriveEscale; int M=0;
		M = Math.abs(minuteDepartEscale - minuteArriveEscale);
		// Logiquement une Escale ne peut pas durer plus que 3 Heures.
		if((heureDepartEscale==0 || heureDepartEscale ==1  || heureDepartEscale ==2 ) && heureArriveEscale==23)
			h=1;
		if ((heureDepartEscale==0 || heureDepartEscale ==1  || heureDepartEscale ==2 )&& heureArriveEscale==22)
			h=2;
		if ((heureDepartEscale==0 || heureDepartEscale ==1  || heureDepartEscale ==2 ) && heureArriveEscale==21)
			h=3;
		if(heureDepartEscale==heureArriveEscale){
			M = minuteDepartEscale - minuteArriveEscale; }
			else if(heureDepartEscale == heureArriveEscale +1 || heureDepartEscale == heureArriveEscale +2){
			M = (minuteDepartEscale +60) - minuteArriveEscale;}
			else{
			System.out.println(" Vous avez depasse la duree legale pour une escale!");}
		return "Duree Escale "+h+" Hours, And"+M+" Minutes";
	}
	
}

