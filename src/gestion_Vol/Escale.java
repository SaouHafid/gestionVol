package gestion_Vol;
import java.lang.Math;
public class Escale {
	private int numEscale;
	private int heureDepartEscale;
	private int minuteDepartEscale;
	private int minuteArriveEscale;
	private int heureArriveEscale;
	
	public Escale(int numEscale,int heureDepartEscale, int minuteDepartEscale,int heureArriveEscale, int minuteArriveEscale){
		this.numEscale = numEscale;
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
		
		if(heureDepartEscale==heureArriveEscale){
			if(minuteDepartEscale < minuteArriveEscale)
				return "Erreur! Retaper les dates correctement.";
			
			else 
				M = minuteDepartEscale - minuteArriveEscale; }
		else if((heureDepartEscale==0 || heureDepartEscale ==1  || heureDepartEscale ==2 ) && heureArriveEscale==23)
			h=1;
			else if ((heureDepartEscale==0 || heureDepartEscale ==1  || heureDepartEscale ==2 )&& heureArriveEscale==22)
			h=2; 
				else if(heureDepartEscale == heureArriveEscale +1){
				    	if (minuteDepartEscale < minuteArriveEscale)
				    		{
						h=0;
						M = ((minuteDepartEscale+60) - minuteArriveEscale);
				    		}
				    	else{
				    		h=1;
				    		M = (minuteDepartEscale - minuteArriveEscale);
				    	}
					}
					else if(heureDepartEscale == heureArriveEscale +2){
						if (minuteDepartEscale < minuteArriveEscale){
						h = 1;
						M = ((minuteDepartEscale+60) - minuteArriveEscale);
							}
						else{
							h = 2;
							M = minuteDepartEscale - minuteArriveEscale;
							}
					}
						else{
								return " Vous avez depasse la duree legale pour une escale!";
							}
		return "Duree Escale "+h+" Heure(s), Et "+M+" Minute(s)";
	}
	
}

