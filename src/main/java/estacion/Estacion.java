package estacion;
import bicicleta.Bicicleta;
import tarjetaUsuario.TarjetaUsuario;
import java.util.concurrent.ThreadLocalRandom;
public class Estacion {
	
	private int numEstacion = 0;
	private String calle = "";
	private int numAnclajes = 0;
	private final Bicicleta [] anclajes;
	
	
	public Estacion(int numEstacion, String calle, int numAnclajes){
		this.numEstacion = numEstacion;
		this.calle = calle;
		this.numAnclajes = numAnclajes;
		this.anclajes = new Bicicleta[numAnclajes];
	}
	
	public int getNumEstacion () {
		return this.numEstacion;
	}
	
	public String getCalle () {
		return this.calle;
	}
	public int getNumAnclajes() {
		return this.numAnclajes;
	}
	
	public Object [] getAnclajes(){
		return this.anclajes;
	}
}