package mx.com.amx.transforma.mock.peru;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.amx.transforma.mock.dto.Delivery;
import mx.com.amx.transforma.mock.dto.RequestBodyDelivery;
import mx.com.amx.transforma.mock.dto.RequestBodyDisponibilidad;
import mx.com.amx.transforma.mock.service.IMockServiceImpl;

@RestController
@RequestMapping("/api/v1/peru/delivery")
public class DeliveryWS {

	@Autowired
	IMockServiceImpl mockServiceImpl;

	@GetMapping
	public String cnfMockService() {
		return "/api/v1/peru/delivery";
	}

	@PostMapping
	public List<Delivery> cnfMockServicePost(@RequestBody RequestBodyDelivery parametro) {

		List<Delivery> response = new ArrayList<>();
		
		response = mockServiceImpl.buscarSOT();


		System.out.println("idOportunidad: " + 	parametro.getIdOportunidad());
		System.out.println("IdPropuesta: " + 	parametro.getIdPropuesta());
		System.out.println("IdCotizacion: " + 	parametro.getIdCotizacion());
		System.out.println("codProyecto: " + 	parametro.getCodProyecto());
		System.out.println("CID: " + 			parametro.getCID());
		System.out.println("nroSolicitud: " + 	parametro.getNroSolicitud());

		return response;
	}

}
