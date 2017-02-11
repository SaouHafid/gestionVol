package testGestion_Vol;

import static org.junit.Assert.*;

import org.junit.Test;

import gestion_Vol.Vol;

public class TestOuvrirVol { 

	@Test
	public void test() {
		Vol v = new Vol(1,"11/11/2011","11/11/2011","15:00","22:00");
		boolean output = v.ouvrirVol("ouvrir");
		assertEquals(true, output);
	}
}

