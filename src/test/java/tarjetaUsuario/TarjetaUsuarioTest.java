package tarjetaUsuario;

import static org.junit.Assert.*;

import org.junit.Test;

public class TarjetaUsuarioTest {
	
	@Test
	public void CrearTargetatest() {
		TarjetaUsuario tarjeta = new TarjetaUsuario("41543118", true);
		assertEquals(tarjeta.getId(), "41543118");
		assertEquals(tarjeta.getActivada(), true);
	}
}
