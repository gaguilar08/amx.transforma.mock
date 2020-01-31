package mx.com.amx.transforma.mock.dto;

import java.time.LocalDate;

public class DeliveryCL {
	
	
	private int numeroOrden;
	private String estado;
	private String observacion;
	private LocalDate fechaGeneracion;
	private LocalDate fechaCompromiso;
	private String descripcionOrden;
	private String usuarioResponsable;
	private String usuarioAsignado;
	
	
	
	public int getNumeroOrden() {
		return numeroOrden;
	}public DeliveryCL(int numeroOrden, String estado, String observacion, LocalDate fechaGeneracion,
			LocalDate fechaCompromiso, String descripcionOrden, String usuarioResponsable, String usuarioAsignado) {
		super();
		this.numeroOrden = numeroOrden;
		this.estado = estado;
		this.observacion = observacion;
		this.fechaGeneracion = fechaGeneracion;
		this.fechaCompromiso = fechaCompromiso;
		this.descripcionOrden = descripcionOrden;
		this.usuarioResponsable = usuarioResponsable;
		this.usuarioAsignado = usuarioAsignado;
	}

	public void setNumeroOrden(int numeroOrden) {
		this.numeroOrden = numeroOrden;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public LocalDate getFechaGeneracion() {
		return fechaGeneracion;
	}
	public void setFechaGeneracion(LocalDate fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}
	public LocalDate getFechaCompromiso() {
		return fechaCompromiso;
	}
	public void setFechaCompromiso(LocalDate fechaCompromiso) {
		this.fechaCompromiso = fechaCompromiso;
	}
	public String getDescripcionOrden() {
		return descripcionOrden;
	}
	public void setDescripcionOrden(String descripcionOrden) {
		this.descripcionOrden = descripcionOrden;
	}
	public String getUsuarioResponsable() {
		return usuarioResponsable;
	}
	public void setUsuarioResponsable(String usuarioResponsable) {
		this.usuarioResponsable = usuarioResponsable;
	}
	public String getUsuarioAsignado() {
		return usuarioAsignado;
	}
	public void setUsuarioAsignado(String usuarioAsignado) {
		this.usuarioAsignado = usuarioAsignado;
	}
}
