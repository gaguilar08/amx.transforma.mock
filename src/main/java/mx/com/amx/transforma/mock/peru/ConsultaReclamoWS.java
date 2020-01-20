package mx.com.amx.transforma.mock.peru;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
	
	LocalDate date = LocalDate.now();
	String text = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
	LocalDate parsedDate = LocalDate.parse(text, DateTimeFormatter.ISO_LOCAL_DATE);


	@GetMapping
	public String cnfMockService() {
		return "/api/v1/peru/consultareclamo";
	}

	@PostMapping
	public List<Reclamo> cnfMockServicePost(@RequestBody RequestBodyReclamo parametro) {

		List<Reclamo> response = new ArrayList<Reclamo>();

		if (parametro != null && (parametro.getCodigoCliente() != null && parametro.getCodigoCliente() != "")) {
			response = mockServiceImpl.consultaReclamo();
		} else {
			Reclamo re1 = new Reclamo(null, parsedDate, "Error", "El IdCliente es obligatorio");
			response.add(re1);
		}

		System.out.println("IdCliente: " + parametro.getCodigoCliente());

		return response;
	}
}
