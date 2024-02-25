package uniandes.dpoo.aerolinea.persistencia;

import uniandes.dpoo.aerolinea.modelo.*;

public interface IPersistenciaAerolinea {
	
	public void cargarAerolinea(String archivo, Aerolinea aerolinea);
	public void salvarAerolinea(String archivo, Aerolinea aerolinea);
}
