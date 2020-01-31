package mx.com.amx.transforma.mock.service;

import java.util.List;

import mx.com.amx.transforma.mock.dto.Delivery;
import mx.com.amx.transforma.mock.dto.DeliveryCL;
import mx.com.amx.transforma.mock.dto.Disponibilidad;
import mx.com.amx.transforma.mock.dto.Factura;
import mx.com.amx.transforma.mock.dto.FacturasGuardada;
import mx.com.amx.transforma.mock.dto.IncidenteTecnico;
import mx.com.amx.transforma.mock.dto.Reclamo;
import mx.com.amx.transforma.mock.dto.RequestBodyDelivery;
import mx.com.amx.transforma.mock.dto.RequestBodyDeliveryCL;
import mx.com.amx.transforma.mock.dto.RequestBodyFactura;
import mx.com.amx.transforma.mock.dto.RequestBodyIncidente;
import mx.com.amx.transforma.mock.peru.FacturasGuardadaChile;


public interface IMockService {
	
	List<Factura> buscarTodasFacturas(RequestBodyFactura parametro);
	
	List<Disponibilidad> buscarDisponiblidadEquipos();
	
	List<Delivery> buscarSOT(RequestBodyDelivery parametro);
	
	List<Reclamo> consultaReclamo(String codCliente);
	
	FacturasGuardada consultarFacturaGuardada();

	List<IncidenteTecnico> consultaIncidente(RequestBodyIncidente parametro);
	
	List <FacturasGuardadaChile> consultarFacturaGuardadaChile(String noFactura);
	
	List<DeliveryCL> buscarSOT(RequestBodyDeliveryCL parametro);

}
