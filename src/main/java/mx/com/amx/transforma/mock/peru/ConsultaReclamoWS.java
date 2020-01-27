package mx.com.amx.transforma.mock.peru;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.amx.transforma.mock.dto.Reclamo;
import mx.com.amx.transforma.mock.dto.ReclamoResponse;
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
	public ReclamoResponse cnfMockServicePost(@RequestBody @Valid RequestBodyReclamo parametro) {

		ReclamoResponse response = new ReclamoResponse(null, parsedDate, "0", "OK");
		response.setCodigoRespuesta("0");
		response.setEnsajeRespuesta("OK");
		response.setFechaRespuesta(parsedDate);
		if (parametro != null && (parametro.getCodigoCliente() != null && parametro.getCodigoCliente() != "")) {
			response.setResponse(mockServiceImpl.consultaReclamo(parametro.getCodigoCliente()));
		}

		System.out.println("IdCliente: " + parametro.getCodigoCliente());

		return response;
	}
}
