package mx.com.amx.transforma.mock.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReclamoResponse {
	
	List<Reclamo> response = new ArrayList<Reclamo>();
	private LocalDate fechaRespuesta;
	private String codigoRespuesta;
	private String ensajeRespuesta;
	
	
	public ReclamoResponse(List<Reclamo> response, LocalDate fechaRespuesta, String codigoRespuesta,
			String ensajeRespuesta) {
		super();
		this.response = response;
		this.fechaRespuesta = fechaRespuesta;
		this.codigoRespuesta = codigoRespuesta;
		this.ensajeRespuesta = ensajeRespuesta;
	}
	public List<Reclamo> getResponse() {
		return response;
	}
	public void setResponse(List<Reclamo> response) {
		this.response = response;
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
	public String getEnsajeRespuesta() {
		return ensajeRespuesta;
	}
	public void setEnsajeRespuesta(String ensajeRespuesta) {
		this.ensajeRespuesta = ensajeRespuesta;
	}
	
	


}
