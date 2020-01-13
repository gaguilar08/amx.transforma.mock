package mx.com.amx.transforma.mock.chile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/chile/estadodecuentas")
public class EstadoCuentaWS {
	
	 @GetMapping(value = "/")
	public String cnfMockService(){
		return "/api/v1/chile/estadodecuentas";
	}
	
	@PostMapping
	public String guardar () {
		return "pst";
	}
	

}
