package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente{
	
	public String NATURAL = "Natural";
	private String nombre;
	
	public ClienteNatural(String nombre){
		super();
		this.nombre = nombre;
	}
	
	public String getIdentificador() {
		return null;
	}
	
	public String getTipoCliente() {
		return null;
	}
	
}
