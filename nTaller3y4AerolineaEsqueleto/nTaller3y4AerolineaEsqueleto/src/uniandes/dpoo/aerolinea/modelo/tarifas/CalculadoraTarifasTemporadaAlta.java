package uniandes.dpoo.aerolinea.modelo.tarifas;


import uniandes.dpoo.aerolinea.modelo.cliente.*;
import uniandes.dpoo.aerolinea.modelo.*;


public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas {

		protected int COSTO_POR_KM = 1000;
		
		public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
			return 0;
		}
		
		public double calcularPorcentajeDescuento(Cliente cliente) {
			return 0.0;
		}
		
}
