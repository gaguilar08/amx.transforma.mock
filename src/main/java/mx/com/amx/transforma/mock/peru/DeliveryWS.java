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
	public List<Delivery> cnfMockServicePost(@RequestBody RequestBodyDisponibilidad parametro) {

		List<Delivery> response = new ArrayList<>();

		if (parametro != null && parametro.getCentro() != null && parametro.getCentro() != ""
				&& parametro.getAlmacen() != null && parametro.getAlmacen() != "" && parametro.getMaterial() != null
				&& parametro.getMaterial() != "") {

			response = mockServiceImpl.buscarSOT();
		} else {
			Delivery dv1 = new Delivery("Error", null, null, null, null, null, null, null, null, null, null);
			response.add(dv1);
		}

		System.out.println("Centro: " + parametro.getCentro());
		System.out.println("Almacen: " + parametro.getAlmacen());
		System.out.println("Material: " + parametro.getMaterial());
		System.out.println("Batch: " + parametro.getBatch());
		System.out.println("Regla: " + parametro.getRegla());
		System.out.println("Unidad Medida: " + parametro.getUnidadMedida());

		return response;
	}

}
