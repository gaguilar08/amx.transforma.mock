package mx.com.amx.transforma.mock.dto;

import javax.validation.constraints.NotNull;

public class RequestBodyCobranza {
	
	@NotNull
	public String COD_APLICACION;
	@NotNull
	public String USUARIO_APLICACION;
	@NotNull
	public String TIPO_DOC_ID;
	@NotNull
	public String NRO_DOC_ID;
}
