package mx.com.amx.transforma.mock.chile;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.amx.transforma.mock.dto.Disponibilidad;
import mx.com.amx.transforma.mock.dto.RequestBodyDisponibilidad;
import mx.com.amx.transforma.mock.service.IMockServiceImpl;

@RestController
@RequestMapping("/api/v1/chile/disponibilidadequipo")

public class DisponibilidadEquipoWS {

	@Autowired
	IMockServiceImpl mockServiceImpl;

	@GetMapping
	public String cnfMockService() {
		return "/api/v1/chile/disponibilidadequipo";
	}

	@PostMapping
	public List<Disponibilidad> cnfMockServicePost(@RequestBody RequestBodyDisponibilidad parametro) {

		List<Disponibilidad> response = new ArrayList<>();

		if (parametro != null && parametro.getCentro() != null && parametro.getCentro() != ""
				&& parametro.getAlmacen() != null && parametro.getAlmacen() != "" && parametro.getMaterial() != null
				&& parametro.getMaterial() != "") {
			response = mockServiceImpl.buscarDisponiblidadEquipos();
		} else {
			Disponibilidad dp1 = new Disponibilidad("Centro, Almacen y Material son obligatorios", null, null, null);
			response.add(dp1);
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
