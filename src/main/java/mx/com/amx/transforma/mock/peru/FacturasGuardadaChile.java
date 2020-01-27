package mx.com.amx.transforma.mock.peru;

import java.util.ArrayList;

import mx.com.amx.transforma.mock.dto.DocumentoBase64;

public class FacturasGuardadaChile  {
	
	private ArrayList<DocumentoBase64> documentList = new ArrayList<>();
	private String codigoRespuest;
	private String descripcionRespuesta;
	
	
	
	public FacturasGuardadaChile(ArrayList<DocumentoBase64> documentList, String codigoRespuest,
			String descripcionRespuesta) {
		super();
		this.documentList = documentList;
		this.codigoRespuest = codigoRespuest;
		this.descripcionRespuesta = descripcionRespuesta;
	}
	public ArrayList<DocumentoBase64> getDocumentList() {
		return documentList;
	}
	public void setDocumentList(ArrayList<DocumentoBase64> documentList) {
		this.documentList = documentList;
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
