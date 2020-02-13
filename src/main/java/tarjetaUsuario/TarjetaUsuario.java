package tarjetaUsuario;

public class TarjetaUsuario {

	private String id;
	private boolean activada;
	
	public TarjetaUsuario (String id, boolean activada) {
		this.id = id;
		this.activada = activada;
	}
	
	public String getId() {
		return this.id;
	}
	public boolean getActivada() {
		return this.activada;
	}

}
