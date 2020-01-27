package mx.com.amx.transforma.mock.dto;

public class DocumentoBase64 {

	private String tipo;
	private String documento;
	
	
	
	public DocumentoBase64(String tipo, String documento) {
		super();
		this.tipo = tipo;
		this.documento = documento;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	
}
