package gestion_Vol;

public class GestionVol_Main {

	public static void main(String[] args) {
		
		Vol v = new Vol("15/01/2017","15/01/2017",22,17);
		v.ouvrirVol("ouvrir");
		System.out.println(v.toString());
		Reservation r = new Reservation("Nador");
		r.ConfirmerReservation(1);
		Reservation r2 = new Reservation("Berlin");
		r2.ConfirmerReservation(2); 
		r.AnnulerReservation(1);
		Escale e = new Escale(20,30,20,0);
		System.out.println(e.toString());
		System.out.println(e.getDureeEscale());
		
	}

}
