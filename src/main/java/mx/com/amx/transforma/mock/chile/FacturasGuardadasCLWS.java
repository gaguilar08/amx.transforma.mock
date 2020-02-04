package mx.com.amx.transforma.mock.chile;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.amx.transforma.mock.dto.FacturasGuardada;
import mx.com.amx.transforma.mock.dto.FacturasGuardadaChile;
import mx.com.amx.transforma.mock.dto.RequestBodyFacturaGuardada;
import mx.com.amx.transforma.mock.dto.RequestBodyFacturaGuardadaChile;
import mx.com.amx.transforma.mock.service.IMockServiceImpl;

@RestController
@RequestMapping("/api/v1/chile/facturasguardadas_base64")
public class FacturasGuardadasCLWS {
	@Autowired
	IMockServiceImpl mockServiceImpl;

	@GetMapping
	public String cnfMockService() {
		return "/api/v1/chile/facturasguardadas_base64";
	}

	@PostMapping
	public List<FacturasGuardadaChile> cnfMockServicePost(@RequestBody @Valid RequestBodyFacturaGuardadaChile parametro) {

		List<FacturasGuardadaChile> response = new ArrayList<>();

		if (parametro != null && (parametro.getNumFactura() != null && parametro.getNumFactura() != "")) {	
			System.out.println("Numero de factura: " + parametro.getNumFactura());
			response = mockServiceImpl.consultarFacturaGuardadaChile(parametro.getNumFactura());
		} 
		
		return response;
	}

}
