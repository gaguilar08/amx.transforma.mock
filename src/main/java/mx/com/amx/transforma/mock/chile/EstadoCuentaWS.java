package mx.com.amx.transforma.mock.chile;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.amx.transforma.mock.dto.Factura;
import mx.com.amx.transforma.mock.dto.RequestBodyFactura;
import mx.com.amx.transforma.mock.service.IMockServiceImpl;

@RestController
@RequestMapping("/api/v1/chile/estadodecuentas")
public class EstadoCuentaWS {

	@Autowired
	IMockServiceImpl mockServiceImpl;

	@GetMapping
	public String cnfMockService() {
		return "/api/v1/chile/estadodecuentas";
	}

	@PostMapping
	public List<Factura> cnfMockServicePost(@RequestBody RequestBodyFactura parametro) {

		List<Factura> response = new ArrayList<Factura>();

		if (parametro != null && (parametro.getIdCliente() != null && parametro.getIdCliente() != "")
				&& (parametro.getTipoFacturacion() != null && parametro.getTipoFacturacion() != "")) {
			response = mockServiceImpl.buscarTodasFacturas();
		} else {
			Factura fac1 = new Factura("IdCliente y TipoFacturacion son obligatorios", "", "", null, null);
			response.add(fac1);
		}

		System.out.println("IdCliente: " + parametro.getIdCliente());
		System.out.println("TipoFacturacion: " + parametro.getTipoFacturacion());
		System.out.println("NumFactura: " + parametro.getNumFactura());
		System.out.println("PeriodoDesde: " + parametro.getPeriodoDesde());
		System.out.println("PeriodoHasta: " + parametro.getPeriodoHasta());

		return response;

	}
}
