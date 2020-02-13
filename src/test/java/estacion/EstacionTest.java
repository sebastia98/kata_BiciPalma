package estacion;

import static org.junit.Assert.*;
import estacion.Estacion;
import org.junit.Test;

import bicicleta.Bicicleta;

public class EstacionTest {

	@Test
	public void CrearEstacionTest() {
		Estacion estacion = new Estacion(1, "Manacor", 6);
		assertEquals(estacion.getNumEstacion(), 1, 0);
		assertEquals(estacion.getCalle(), "Manacor");
		assertEquals(estacion.getNumAnclajes(), 6, 0);
	}
	
	@Test
	public void anclajesTodosLibresTest() {
		Estacion estacion = new Estacion(1, "Manacor", 6);
		assertEquals(estacion.anclajesLibres(), 6, 0);
	}
	@Test
	public void anclarBicisTest() {
		Estacion estacion = new Estacion(1, "Manacor", 6);
		int[] bicicletas = {291, 292, 293, 294};
		Object [] anclajes;
		int posicionAnclaje = 0;
		anclajes = new Object[6];
		for ( int id: bicicletas ){
			Bicicleta bicicleta = new Bicicleta(id);
			estacion.anclarBicicleta(bicicleta);
			anclajes[posicionAnclaje] = bicicleta;
			posicionAnclaje ++;
		}
		assertArrayEquals(anclajes, estacion.getAnclajes());
	}
	
}
