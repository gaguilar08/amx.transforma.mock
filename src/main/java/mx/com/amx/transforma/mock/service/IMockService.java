package mx.com.amx.transforma.mock.service;

import java.util.List;

import mx.com.amx.transforma.mock.dto.Delivery;
import mx.com.amx.transforma.mock.dto.Disponibilidad;
import mx.com.amx.transforma.mock.dto.Factura;
import mx.com.amx.transforma.mock.dto.Reclamo;


public interface IMockService {
	
	List<Factura> buscarTodasFacturas();
	
	List<Disponibilidad> buscarDisponiblidadEquipos();
	
	List<Delivery> buscarSOT();
	
	List<Reclamo> consultaReclamo();

}
