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
	public void consultarEstacion() {
		System.out.println("Id: " + this.numEstacion);
		System.out.println("Calle: " + this.calle);
		System.out.println("numeroAnclajes: " + this.numAnclajes);
		
	}
	
	public int anclajesLibres() {
		int acumulador = 0;
		for (Object bicicleta : this.anclajes) {
			if (bicicleta == null) {
				acumulador = acumulador + 1;
			}
		}
		return acumulador;
	}
	
	public void anclarBicicleta(Bicicleta bicicleta) {
		int posicionBici = 0;
		for(int i = 0; i < this.numAnclajes; i ++) {
			posicionBici++;
			if (this.anclajes[i] == null) {
				this.anclajes[i] = bicicleta;
				System.out.println("bicicleta: " + bicicleta.getId() + " anclada en el anclaje: " + (posicionBici));
				break;	
			}
		}
	}
}