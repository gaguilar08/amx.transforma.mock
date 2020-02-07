package mx.com.amx.transforma.mock.peru;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.amx.transforma.mock.dto.ConsultaCobranza;
import mx.com.amx.transforma.mock.dto.RequestBodyCobranza;
import mx.com.amx.transforma.mock.service.IMockServiceImpl;

@RestController
@RequestMapping("/api/v1/peru/consultacobranza")
public class ConsultaCobranzaWS {
	
	@Autowired
	IMockServiceImpl mockServiceImpl;

	@GetMapping
	public String cnfMockService() {
		return "/api/v1/peru/consultacobranza";
	}

	@PostMapping
	public ConsultaCobranza cnfMockServicePost(@RequestBody @Valid RequestBodyCobranza parametro) {

		ConsultaCobranza cobranza = mockServiceImpl.consultaCobranza(parametro);
		return cobranza;
	}

}
