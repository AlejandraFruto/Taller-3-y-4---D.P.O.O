package uniandes.dpoo.aerolinea.modelo;

import java.util.Map;
import uniandes.dpoo.aerolinea.tiquetes.*;
import uniandes.dpoo.aerolinea.modelo.cliente.*;
import uniandes.dpoo.aerolinea.modelo.tarifas.*;

public class Vuelo {
	
	
	private String fecha;
	private Ruta ruta;
	private Avion avion;
	public Map<String, Tiquete> tiquete;
	

	public Vuelo(Ruta ruta, String fecha, Avion avion) {
			this.ruta = ruta;
			this.avion = avion;
			this.fecha = fecha;
	}
	
	
	public String getFecha() {
		return this.fecha;
	}
	
	
	public Ruta getRuta() {
		return this.ruta;
	}
	
	
	public Avion getAvion() {
		return this.avion;
	}


	public Map<String, Tiquete> getTiquetes() {
		return this.tiquete;
	}
	
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
		
		return 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		return (this == obj);
	}
	
	
	
	
	
}
