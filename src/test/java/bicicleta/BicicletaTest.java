package bicicleta;

import static org.junit.Assert.*;

import org.junit.Test;

public class BicicletaTest {

	@Test
	public void CrearBicitest() {
		Bicicleta bicicleta = new Bicicleta(143);
		assertEquals(bicicleta.getId(), 143, 0);
	}

}
