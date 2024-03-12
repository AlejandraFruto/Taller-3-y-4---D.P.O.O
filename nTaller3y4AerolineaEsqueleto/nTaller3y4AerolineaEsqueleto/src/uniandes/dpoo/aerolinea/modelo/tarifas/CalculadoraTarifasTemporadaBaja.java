package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.*;
import uniandes.dpoo.aerolinea.modelo.cliente.*;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteCorporativo;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteNatural;


public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas  {
	
	
	protected final int COSTO_POR_KM_NATURAL = 600;
	protected final int COSTO_POR_KM_CORPORATIVO = 900;
	protected final double DESCUENTO_PEQ = 0.02;
	protected final double DESCUENTO_MEDIANAS = 0.1;
	protected final double DESCUENTO_GRANDES = 0.2;
	
	
	public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		int costoBase = 0;
		int distancia = Aeropuerto.calcularDistancia(vuelo.getRuta().getOrigen(), vuelo.getRuta().getOrigen());
		if (cliente.getTipoCliente() == "Natural") {
			costoBase = COSTO_POR_KM_NATURAL * distancia;
		}
		
		else if (cliente.getTipoCliente() == "Corporativo") {
			costoBase = COSTO_POR_KM_CORPORATIVO * distancia;
		}
		
		return costoBase;
	}
	
	public double calcularPorcentajeDescuento(Cliente cliente) {
		
		double descuento = 0;
		if (cliente.getTipoCliente() == "Natural") {
			descuento = 0;
		}
		

		else if(cliente.getTipoCliente() == "Corporativo") {
			{
				
				if (((ClienteCorporativo) cliente).getTamanoEmpresa() == 1) {
					descuento = DESCUENTO_GRANDES;
				}
				else if( ((ClienteCorporativo) cliente).getTamanoEmpresa() == 2){
					descuento = DESCUENTO_MEDIANAS;
				}
				
				else if (((ClienteCorporativo) cliente).getTamanoEmpresa() == 3) {
					descuento = DESCUENTO_PEQ;
				}
				
			}
		}
		return descuento;
	}
	
	
}
