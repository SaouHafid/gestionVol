package gestion_Vol;

public class Reservation {
	private static int numReservation=0;
	private String destination;
	
	public Reservation(String destination) {
		this.numReservation++;
		this.destination = destination;
	}
	public int getNumReservation() {
		return numReservation; 
	} 
	public void setNumReservation(int numReservation) {
		this.numReservation = numReservation;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Reservation [numReservation=" + numReservation + ", destination=" + destination + "]";
	}
	public boolean AnnulerReservation(int idReservation){
		if(idReservation<=numReservation){
			System.out.println("Reservation numero :"+numReservation+" a ete annulee.");
			return true;
			}
		else{
				System.out.println("Aucune reservation ne porte ce numero: "+idReservation);
				return false; 
			}
	}
	public boolean ConfirmerReservation(int idReservation){
		if(idReservation<=numReservation){
			System.out.println("Reservation numero :"+numReservation+" a ete bien confirmee.");
			return true;
			}
		else{
				System.out.println("Aucune reservation ne porte ce numero: "+idReservation);
				return false; 
			}
	}
}
