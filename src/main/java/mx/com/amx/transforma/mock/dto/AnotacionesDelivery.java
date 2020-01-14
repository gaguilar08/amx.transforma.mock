package mx.com.amx.transforma.mock.dto;

import java.time.LocalDate;

public class AnotacionesDelivery {
	
	private String 		anotaTarea;
	private String  	anotaObservacion;
	private String  	usuario;
	private LocalDate 	fecha;	

	public AnotacionesDelivery(String anotaTarea, String anotaObservacion, String usuario, LocalDate fecha) {
		super();
		this.anotaTarea = anotaTarea;
		this.anotaObservacion = anotaObservacion;
		this.usuario = usuario;
		this.fecha = fecha;
	}
	public String getAnotaTarea() {
		return anotaTarea;
	}
	public void setAnotaTarea(String anotaTarea) {
		this.anotaTarea = anotaTarea;
	}
	public String getAnotaObservacion() {
		return anotaObservacion;
	}
	public void setAnotaObservacion(String anotaObservacion) {
		this.anotaObservacion = anotaObservacion;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


}
