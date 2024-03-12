package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.cliente.*;

import java.util.Collection;
import uniandes.dpoo.aerolinea.tiquetes.*;
import uniandes.dpoo.aerolinea.modelo.*;



public abstract class CalculadoraTarifas {
	
	public static final double IMPUESTO = 0.28;
	
	
	
	public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
		int descuento = (int) calcularPorcentajeDescuento(cliente);
		int tarifa_inicial = calcularCostoBase(vuelo, cliente) - calcularCostoBase(vuelo, cliente)* descuento ;
		int tarifa_final = (int) (tarifa_inicial - tarifa_inicial*IMPUESTO);
		return tarifa_final;
	}
	
	protected  int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		
		return 0;
	}
	
	protected double calcularPorcentajeDescuento(Cliente cliente) {
		 
		return 0;
	}
	
	protected int calcularDistanciaVuelo(Ruta ruta) {
		int distanciaVuelo = Aeropuerto.calcularDistancia(ruta.getOrigen(), ruta.getDestino());
		return distanciaVuelo;
	}
	
	protected int calcularValorImpuestos(int costoBase) {
		double valorImpuesto = costoBase * IMPUESTO;
		int valorImpuestos = (int) (valorImpuesto);
		
		return valorImpuestos;
	}
	
	
	
	
	
}
