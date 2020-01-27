package mx.com.amx.transforma.mock.chile;

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

import mx.com.amx.transforma.mock.dto.IncidenteTecnico;
import mx.com.amx.transforma.mock.dto.RequestBodyIncidente;
import mx.com.amx.transforma.mock.service.IMockServiceImpl;

@RestController
@RequestMapping("/api/v1/chile/incidentestecnicos")
public class IncidenteTecnicoWS {
	
	LocalDate date = LocalDate.now();
	String text = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
	LocalDate parsedDate = LocalDate.parse(text, DateTimeFormatter.ISO_LOCAL_DATE);

	
	@Autowired
	IMockServiceImpl mockServiceImpl;

	@GetMapping
	public String cnfMockService() {
		return "/api/v1/chile/incidentestecnicos";
	}
	
	@PostMapping
	public List<IncidenteTecnico> cnfMockServicePost(@RequestBody RequestBodyIncidente parametro) {
		List<IncidenteTecnico> response =  new ArrayList<IncidenteTecnico>();
		
		if (parametro != null && (parametro.getCodigoCliente() != null && parametro.getCodigoCliente() != "")) {
			response = mockServiceImpl.consultaIncidente();
		} else {
			IncidenteTecnico inc = new IncidenteTecnico(null, null, null,
					"Codigo de cliente mandatorio - Identificador tributario", parsedDate, parsedDate, null,
					null, null);
			
			response.add(inc);
		} 
			
		return response;
	}


}
