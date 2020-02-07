package mx.com.amx.transforma.mock.dto;

import java.time.LocalDate;
import java.util.List;

public class Reclamo {
	/*
	private String customerID;	// 000309
	private String cliente;		// Jockey club del Perú
	private LocalDate creacion;	// 09/10/2019 09:57:35 a.m.
	private String tipo;		// SGA
	private String clase;		// Problema
	private String subclase;	// Facturación
	private String estado;		// Concluido
	private String fase;		// Reclamo primera instancia
	private String noReclamo;	// 190259325
	private String condicion;	// Cerrado
	private String tipoServicio;	// Productos corporativos
	private String descripciónProblema;	//Descartes realizados	
	private String conclusiones;
	*/
	
	private List<ConsultarReclamoType> ConsultarReclamoType;
	private LocalDate fechaRespuesta;
	private String codigoRespuesta;
	private String mensajeRespuesta;
	
	
	public Reclamo(List<mx.com.amx.transforma.mock.dto.ConsultarReclamoType> consultarReclamoType,
			LocalDate fechaRespuesta, String codigoRespuesta, String mensajeRespuesta) {
		super();
		ConsultarReclamoType = consultarReclamoType;
		this.fechaRespuesta = fechaRespuesta;
		this.codigoRespuesta = codigoRespuesta;
		this.mensajeRespuesta = mensajeRespuesta;
	}
	
	public List<ConsultarReclamoType> getConsultarReclamoType() {
		return ConsultarReclamoType;
	}
	public void setConsultarReclamoType(List<ConsultarReclamoType> consultarReclamoType) {
		ConsultarReclamoType = consultarReclamoType;
	}
	public LocalDate getFechaRespuesta() {
		return fechaRespuesta;
	}
	public void setFechaRespuesta(LocalDate fechaRespuesta) {
		this.fechaRespuesta = fechaRespuesta;
	}
	public String getCodigoRespuesta() {
		return codigoRespuesta;
	}
	public void setCodigoRespuesta(String codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}
	public String getMensajeRespuesta() {
		return mensajeRespuesta;
	}
	public void setMensajeRespuesta(String mensajeRespuesta) {
		this.mensajeRespuesta = mensajeRespuesta;
	}
}
