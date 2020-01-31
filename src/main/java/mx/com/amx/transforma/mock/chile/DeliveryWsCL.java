package mx.com.amx.transforma.mock.chile;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.amx.transforma.mock.dto.Delivery;
import mx.com.amx.transforma.mock.dto.DeliveryCL;
import mx.com.amx.transforma.mock.dto.RequestBodyDeliveryCL;
import mx.com.amx.transforma.mock.service.IMockServiceImpl;

@RestController
@RequestMapping("/api/v1/chile/delivery")
public class DeliveryWsCL {
	
	@Autowired
	IMockServiceImpl mockServiceImpl;

	@GetMapping
	public String cnfMockService() {
		return "/api/v1/chile/delivery";
	}
	
	@PostMapping
	public List<DeliveryCL> cnfMockServicePost(@RequestBody @Valid RequestBodyDeliveryCL parametro) {
		
		List<DeliveryCL> response = new ArrayList<>();
		
		response = mockServiceImpl.buscarSOT(parametro);

		return response;
	}


}
