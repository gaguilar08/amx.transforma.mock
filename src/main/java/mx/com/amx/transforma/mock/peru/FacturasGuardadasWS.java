package mx.com.amx.transforma.mock.peru;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.amx.transforma.mock.dto.FacturasGuardada;
import mx.com.amx.transforma.mock.dto.RequestBodyFacturaGuardada;
import mx.com.amx.transforma.mock.service.IMockServiceImpl;

@RestController
@RequestMapping("/api/v1/peru/facturasguardadas_base64")
public class FacturasGuardadasWS {
	
	@Autowired
	IMockServiceImpl mockServiceImpl;

	@GetMapping
	public String cnfMockService() {
		return  mockServiceImpl.txtToString();
	}
	
	@PostMapping
	public FacturasGuardada cnfMockServicePost(@RequestBody @Valid RequestBodyFacturaGuardada parametro) {
		
		FacturasGuardada response = null;
		
		if (parametro != null && (parametro.getNombreArchivo() != null && parametro.getNombreArchivo() != "")) {
			response = mockServiceImpl.consultarFacturaGuardada();
		} 
		
		return response;
	}
}
