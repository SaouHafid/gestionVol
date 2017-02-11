package gestion_Vol;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Locale;

public class Scenario_main {
	public static void main(String[] args) {
		
		String s = "2017-02-16";
		String s2 = "2017-02-16";
		Date d1;
		Date d2;
		d1 = Date.valueOf(s);
		d2 = Date.valueOf(s2);
		Vol v = new Vol(2,d1,d2,"16:00","23:45");
		v.ouvrirVol("ouvrir"); 
		System.out.println(v.toString());
		Reservation r = new Reservation(1,"Nador");
		r.ConfirmerReservation(1);
		Reservation r2 = new Reservation(2,"Berlin");
		r2.ConfirmerReservation(2); 
		r.AnnulerReservation(1);
		Escale e = new Escale(3,2,5,0,50);
		Escale Test2 = new Escale(2,16,30,15,5);
		Escale Test3 = new Escale(1,12,30,11,0);
		System.out.println(Test3.toString());
		System.out.println(Test3.getDureeEscale());
		System.out.println(Test2.toString());
		System.out.println(Test2.getDureeEscale());
		System.out.println(e.toString());
		System.out.println(e.getDureeEscale());
	}
}
