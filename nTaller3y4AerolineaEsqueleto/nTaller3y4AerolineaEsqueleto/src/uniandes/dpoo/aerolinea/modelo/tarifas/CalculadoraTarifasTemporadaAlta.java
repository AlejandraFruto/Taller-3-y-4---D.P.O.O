package uniandes.dpoo.aerolinea.modelo.tarifas;


import uniandes.dpoo.aerolinea.modelo.cliente.*;
import uniandes.dpoo.aerolinea.modelo.*;
import java.util.Random;


public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas {

		protected final int COSTO_POR_KM = 1000;
		
		public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
			int distancia = Aeropuerto.calcularDistancia(vuelo.getRuta().getOrigen(), vuelo.getRuta().getOrigen());
			return COSTO_POR_KM * distancia;
		}
		
		public double calcularPorcentajeDescuento(Cliente cliente) {
			
	        return 0;
			
		}
		
}
