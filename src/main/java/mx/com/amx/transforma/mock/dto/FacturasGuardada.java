package mx.com.amx.transforma.mock.dto;

public class FacturasGuardada {
	private String documentoBase64;
	private String codigoRespuest;
	private String descripcionRespuesta;
	
	
	public FacturasGuardada(String documentoBase64, String codigoRespuest, String descripcionRespuesta) {
		super();
		this.documentoBase64 = documentoBase64;
		this.codigoRespuest = codigoRespuest;
		this.descripcionRespuesta = descripcionRespuesta;
	}

	public String getDocumentoBase64() {
		return documentoBase64;
	}
	public void setDocumentoBase64(String documentoBase64) {
		this.documentoBase64 = documentoBase64;
	}
	public String getCodigoRespuest() {
		return codigoRespuest;
	}
	public void setCodigoRespuest(String codigoRespuest) {
		this.codigoRespuest = codigoRespuest;
	}
	public String getDescripcionRespuesta() {
		return descripcionRespuesta;
	}
	public void setDescripcionRespuesta(String descripcionRespuesta) {
		this.descripcionRespuesta = descripcionRespuesta;
	}
	
	
}
