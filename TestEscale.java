package testGestion_Vol;

import static org.junit.Assert.*;

import org.junit.Test;

import gestion_Vol.Escale;

public class TestEscale {

	@Test
	public void test() {
		Escale Test = new Escale(1,2,5,0,50);
		String output = Test.getDureeEscale(); 
		assertEquals("Duree Escale 1 Heure(s), Et 15 Minute(s)", output);
		
		Escale Test2 = new Escale(2,16,30,15,5);
		String output2 = Test2.getDureeEscale();
		assertEquals("Duree Escale 1 Heure(s), Et 25 Minute(s)", output2);
	}
}
