package mx.com.amx.transforma.mock.dto;

import java.time.LocalDate;

public class IncidenteTecnico {
	private Integer numeroIncidencia;
	private Integer ambito;
	private String estadoIncidencia;
	private String  diagnósticoIncidencia;
	private LocalDate fechaApertura;
	private LocalDate fechaSolucion; 
	private String descripcion_inc;
	private String nombreEjecutivo;
	private String nombreAsistente;
	
	
	public IncidenteTecnico(Integer numeroIncidencia, Integer ambito, String estadoIncidencia,
			String diagnósticoIncidencia, LocalDate fechaApertura, LocalDate fechaSolucion, String descripcion_inc,
			String nombreEjecutivo, String nombreAsistente) {
		super();
		this.numeroIncidencia = numeroIncidencia;
		this.ambito = ambito;
		this.estadoIncidencia = estadoIncidencia;
		this.diagnósticoIncidencia = diagnósticoIncidencia;
		this.fechaApertura = fechaApertura;
		this.fechaSolucion = fechaSolucion;
		this.descripcion_inc = descripcion_inc;
		this.nombreEjecutivo = nombreEjecutivo;
		this.nombreAsistente = nombreAsistente;
	}
	public Integer getNumeroIncidencia() {
		return numeroIncidencia;
	}
	public void setNumeroIncidencia(Integer numeroIncidencia) {
		this.numeroIncidencia = numeroIncidencia;
	}
	public Integer getAmbito() {
		return ambito;
	}
	public void setAmbito(Integer ambito) {
		this.ambito = ambito;
	}
	public String getEstadoIncidencia() {
		return estadoIncidencia;
	}
	public void setEstadoIncidencia(String estadoIncidencia) {
		this.estadoIncidencia = estadoIncidencia;
	}
	public String getDiagnósticoIncidencia() {
		return diagnósticoIncidencia;
	}
	public void setDiagnósticoIncidencia(String diagnósticoIncidencia) {
		this.diagnósticoIncidencia = diagnósticoIncidencia;
	}
	public LocalDate getFechaApertura() {
		return fechaApertura;
	}
	public void setFechaApertura(LocalDate fechaApertura) {
		this.fechaApertura = fechaApertura;
	}
	public LocalDate getFechaSolucion() {
		return fechaSolucion;
	}
	public void setFechaSolucion(LocalDate fechaSolucion) {
		this.fechaSolucion = fechaSolucion;
	}
	public String getDescripcion_inc() {
		return descripcion_inc;
	}
	public void setDescripcion_inc(String descripcion_inc) {
		this.descripcion_inc = descripcion_inc;
	}
	public String getNombreEjecutivo() {
		return nombreEjecutivo;
	}
	public void setNombreEjecutivo(String nombreEjecutivo) {
		this.nombreEjecutivo = nombreEjecutivo;
	}
	public String getNombreAsistente() {
		return nombreAsistente;
	}
	public void setNombreAsistente(String nombreAsistente) {
		this.nombreAsistente = nombreAsistente;
	}
	
	
	
	
	


}
