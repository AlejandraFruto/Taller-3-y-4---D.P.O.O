package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.*;
import uniandes.dpoo.aerolinea.modelo.cliente.*;


public class Tiquete {
	
	String codigo;
	int tarifa;
	boolean usado;
	Cliente cliente;
	Vuelo vuelo;
	
	
	public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa ) {
		this.codigo = codigo;
		this.vuelo = vuelo;
		this.cliente = clienteComprador;
		this.tarifa = tarifa;
	}

	public Cliente getCliente() {
		return this.cliente;
	}
	
	
	public Vuelo getVuelo() {
		return vuelo;
	}

	public String getCodigo() {
		return this.codigo;
	}


	public int getTarifa() {
		return this.tarifa;
	}

	
	public void marcarComoUsado() {
		
	}
	
	public boolean esUsado() {
		
		return  true;
	}

	
	
	
	
	
	
	
}
