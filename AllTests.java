package testGestion_Vol;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAnnulerResrvation.class, TestConfirmerReservation.class, 
		TestEscale.class, TestFermerVol.class,
		TestOuvrirVol.class })
public class AllTests {

}
