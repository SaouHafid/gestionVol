package testGestion_Vol;

import static org.junit.Assert.*;

import org.junit.Test;

import gestion_Vol.Reservation;

public class TestConfirmerReservation {

	@Test
	public void test() {
		Reservation r = new Reservation(1,"Frank Fort");
		boolean output = r.ConfirmerReservation(1);
		assertEquals(true, output);
	}

}
