package mx.com.amx.transforma.mock.dto;

import javax.validation.constraints.NotNull;

public class RequestBodyFacturaGuardadaChile {
	
	@NotNull(message="No. de factura es obligatorio")
	private String numFactura;

	public String getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}


}
