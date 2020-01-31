package mx.com.amx.transforma.mock.dto;

import javax.validation.constraints.NotNull;

public class RequestBodyFacturaGuardada {
	
	@NotNull
	private String nombreArchivo;
	private String tipoArchivo;
	private String ubicacionArchivo;
	private String extensionArchivo;
	private String numeroRecibo;
	private String idCON;
	private String mes;
	private String anio;

	
	public RequestBodyFacturaGuardada(String nombreArchivo, String tipoArchivo, String ubicacionArchivo,
			String extensionArchivo, String numeroRecibo, String idCON, String mes, String anio) {
		super();
		this.nombreArchivo = nombreArchivo;
		this.tipoArchivo = tipoArchivo;
		this.ubicacionArchivo = ubicacionArchivo;
		this.extensionArchivo = extensionArchivo;
		this.numeroRecibo = numeroRecibo;
		this.idCON = idCON;
		this.mes = mes;
		this.anio = anio;
	}
	public String getNombreArchivo() {
		return nombreArchivo;
	}
	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	public String getTipoArchivo() {
		return tipoArchivo;
	}
	public void setTipoArchivo(String tipoArchivo) {
		this.tipoArchivo = tipoArchivo;
	}
	public String getUbicacionArchivo() {
		return ubicacionArchivo;
	}
	public void setUbicacionArchivo(String ubicacionArchivo) {
		this.ubicacionArchivo = ubicacionArchivo;
	}
	public String getExtensionArchivo() {
		return extensionArchivo;
	}
	public void setExtensionArchivo(String extensionArchivo) {
		this.extensionArchivo = extensionArchivo;
	}
	public String getNumeroRecibo() {
		return numeroRecibo;
	}
	public void setNumeroRecibo(String numeroRecibo) {
		this.numeroRecibo = numeroRecibo;
	}
	public String getIdCON() {
		return idCON;
	}
	public void setIdCON(String idCON) {
		this.idCON = idCON;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}


}
