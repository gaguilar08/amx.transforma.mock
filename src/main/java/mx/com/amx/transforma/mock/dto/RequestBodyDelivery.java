package mx.com.amx.transforma.mock.dto;

import javax.validation.constraints.NotNull;

//@CheckAtLeastOneNotNull(fieldNames={"idOportunidad","IdPropuesta", "IdCotizacion", "codProyecto", "CID","nroSolicitud" })
public class RequestBodyDelivery {
	//@NotNull
	private String idOportunidad;	// 72346796324
	private String idPropuesta;		// 26853482425
	private String IdCotizacion;	// 873283
	private String codProyecto;		// 9963689
	private String CID;				// 0005774368
	private String nroSolicitud; 	// 33990215
	
	public String getIdOportunidad() {
		return idOportunidad;
	}
	public void setIdOportunidad(String idOportunidad) {
		this.idOportunidad = idOportunidad;
	}
	public String getIdPropuesta() {
		return idPropuesta;
	}
	public void setIdPropuesta(String idPropuesta) {
		this.idPropuesta = idPropuesta;
	}
	public String getIdCotizacion() {
		return IdCotizacion;
	}
	public void setIdCotizacion(String idCotizacion) {
		IdCotizacion = idCotizacion;
	}
	public String getCodProyecto() {
		return codProyecto;
	}
	public void setCodProyecto(String codProyecto) {
		this.codProyecto = codProyecto;
	}
	public String getCID() {
		return CID;
	}
	public void setCID(String cID) {
		CID = cID;
	}
	public String getNroSolicitud() {
		return nroSolicitud;
	}
	public void setNroSolicitud(String nroSolicitud) {
		this.nroSolicitud = nroSolicitud;
	}

}
