package mx.com.amx.transforma.mock.peru;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.amx.transforma.mock.dto.Reclamo;
import mx.com.amx.transforma.mock.dto.RequestBodyReclamo;
import mx.com.amx.transforma.mock.service.IMockServiceImpl;

@RestController
@RequestMapping("/api/v1/peru/consultareclamo")
public class ConsultaReclamoWS {

	@Autowired
	IMockServiceImpl mockServiceImpl;

	@GetMapping
	public String cnfMockService() {
		return "/api/v1/peru/consultareclamo";
	}

	@PostMapping
	public List<Reclamo> cnfMockServicePost(@RequestBody RequestBodyReclamo parametro) {

		List<Reclamo> response = new ArrayList<Reclamo>();

		if (parametro != null && (parametro.getCustomerID() != null && parametro.getCustomerID() != "")) {
			response = mockServiceImpl.consultaReclamo();
		} else {
			Reclamo re1 = new Reclamo("El IdCliente es obligatorio", null, null, null, null, null, null, null, null, null, null, null, null);
		}

		System.out.println("IdCliente: " + parametro.getCustomerID());

		return response;
	}
}
