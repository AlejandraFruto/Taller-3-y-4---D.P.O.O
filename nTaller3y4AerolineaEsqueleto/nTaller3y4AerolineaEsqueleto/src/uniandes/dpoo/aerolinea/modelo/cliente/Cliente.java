package uniandes.dpoo.aerolinea.modelo.cliente;
import java.util.Collection;
import java.util.List;

import uniandes.dpoo.aerolinea.tiquetes.*;
import uniandes.dpoo.aerolinea.modelo.*;

public abstract class Cliente {
	
	
	private List<Tiquete> tiquetesSinUsar;
	private List<Tiquete> tiquetesUsados;
	
	public Cliente(){	
	}
	
	public String getTipoCliente() {
		return null;	
	}
	
	public String getIdentificador() {
		return null;
		
		
	}
	
	public void agregarTiquete(Tiquete tiquete) {
		
		tiquetesSinUsar.add(tiquete);
	}
	
	public int calcularValorTotalTiquetes( ) {
		int valorTotal = 0;
		for (Tiquete tiquete: tiquetesSinUsar) {
			valorTotal += tiquete.getTarifa();
		}
		
		for (Tiquete tiquete: tiquetesUsados) {
			valorTotal += tiquete.getTarifa();
		}
		
		return valorTotal;	
		
	}
	
	public void usarTiquetes(Vuelo vuelo){
		Collection<Tiquete> tiquetesVuelo = vuelo.getTiquetes().values();
		for (Tiquete tiquete: tiquetesVuelo) {
			if(tiquetesSinUsar.contains(tiquete)){
				tiquetesSinUsar.remove(tiquete);
				tiquetesUsados.add(tiquete);
			}
		}
		
		
	}
	
	
}
