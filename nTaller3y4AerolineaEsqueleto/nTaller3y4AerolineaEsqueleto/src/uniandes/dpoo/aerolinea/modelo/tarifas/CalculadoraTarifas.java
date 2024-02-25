package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.cliente.*;
import uniandes.dpoo.aerolinea.modelo.*;



public abstract class CalculadoraTarifas {
	
	public double IMPUESTO = 0.28;
	
	
	
	public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
		return 0;	
	}
	
	protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		return 0;
	}
	
	protected double calcularPorcentajeDescuento(Cliente cliente) {
		 
		return 0.0;
	}
	
	protected int calcularDistanciaVuelo(Ruta ruta) {
		return 0;
	}
	
	protected int calcularValorImpuestos(int costoBase) {
		return 0;
	}
	
	
	
	
	
}
