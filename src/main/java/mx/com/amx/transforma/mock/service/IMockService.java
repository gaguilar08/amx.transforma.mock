package mx.com.amx.transforma.mock.service;

import java.util.List;

import mx.com.amx.transforma.mock.dto.Delivery;
import mx.com.amx.transforma.mock.dto.Disponibilidad;
import mx.com.amx.transforma.mock.dto.Factura;
import mx.com.amx.transforma.mock.dto.FacturasGuardada;
import mx.com.amx.transforma.mock.dto.IncidenteTecnico;
import mx.com.amx.transforma.mock.dto.Reclamo;
import mx.com.amx.transforma.mock.dto.RequestBodyDelivery;
import mx.com.amx.transforma.mock.peru.FacturasGuardadaChile;


public interface IMockService {
	
	List<Factura> buscarTodasFacturas();
	
	List<Disponibilidad> buscarDisponiblidadEquipos();
	
	List<Delivery> buscarSOT(RequestBodyDelivery parametro);
	
	List<Reclamo> consultaReclamo(String codCliente);
	
	FacturasGuardada consultarFacturaGuardada();

	List<IncidenteTecnico> consultaIncidente();
	
	List <FacturasGuardadaChile> consultarFacturaGuardadaChile(String noFactura);

}
