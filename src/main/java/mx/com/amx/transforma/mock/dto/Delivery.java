package mx.com.amx.transforma.mock.dto;

import java.time.LocalDate;
import java.util.List;

public class Delivery {
	private String noSolicitud;
	private String proyecto;
	private String CID;	
	private String estado;	
	private String tipo;	
	private String tipoServicio;	
	private LocalDate fechaCompromiso;
	private LocalDate fechaInicio;	
	private LocalDate fechaFin;	
	private List AnotacionesDelivery;
	
	

	public Delivery(String noSolicitud, String proyecto, String cID, String estado, String tipo, String tipoServicio,
			LocalDate fechaCompromiso, LocalDate fechaInicio, LocalDate fechaFin, List anotacionesDelivery) {
		super();
		this.noSolicitud = noSolicitud;
		this.proyecto = proyecto;
		CID = cID;
		this.estado = estado;
		this.tipo = tipo;
		this.tipoServicio = tipoServicio;
		this.fechaCompromiso = fechaCompromiso;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		AnotacionesDelivery = anotacionesDelivery;
	}
	public String getNoSolicitud() {
		return noSolicitud;
	}
	public void setNoSolicitud(String noSolicitud) {
		this.noSolicitud = noSolicitud;
	}
	public String getProyecto() {
		return proyecto;
	}
	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}
	public String getCID() {
		return CID;
	}
	public void setCID(String cID) {
		CID = cID;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipoServicio() {
		return tipoServicio;
	}
	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}
	public LocalDate getFechaCompromiso() {
		return fechaCompromiso;
	}
	public void setFechaCompromiso(LocalDate fechaCompromiso) {
		this.fechaCompromiso = fechaCompromiso;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	public List getAnotacionesDelivery() {
		return AnotacionesDelivery;
	}
	public void setAnotacionesDelivery(List anotacionesDelivery) {
		AnotacionesDelivery = anotacionesDelivery;
	}
	
	

	

}
