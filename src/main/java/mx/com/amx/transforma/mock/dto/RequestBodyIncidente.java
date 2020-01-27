package mx.com.amx.transforma.mock.dto;

import java.time.LocalDate;

public class RequestBodyIncidente {
	private Integer 	numeroIncidencia;
	private Integer 	tipoIncidencia;
	private String     	estado;
	private LocalDate 	periodoInicio;
	private LocalDate 	periodoFinal;
	private String     	numeroServicio;
	private String 		ambito;
	private String 		codigoCliente;	// Identicador tributario - Mandatorio

	public Integer getNumeroIncidencia() {
		return numeroIncidencia;
	}
	public void setNumeroIncidencia(Integer numeroIncidencia) {
		this.numeroIncidencia = numeroIncidencia;
	}
	public Integer getTipoIncidencia() {
		return tipoIncidencia;
	}
	public void setTipoIncidencia(Integer tipoIncidencia) {
		this.tipoIncidencia = tipoIncidencia;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public LocalDate getPeriodoInicio() {
		return periodoInicio;
	}
	public void setPeriodoInicio(LocalDate periodoInicio) {
		this.periodoInicio = periodoInicio;
	}
	public LocalDate getPeriodoFinal() {
		return periodoFinal;
	}
	public void setPeriodoFinal(LocalDate periodoFinal) {
		this.periodoFinal = periodoFinal;
	}
	public String getNumeroServicio() {
		return numeroServicio;
	}
	public void setNumeroServicio(String numeroServicio) {
		this.numeroServicio = numeroServicio;
	}
	public String getAmbito() {
		return ambito;
	}
	public void setAmbito(String ambito) {
		this.ambito = ambito;
	}
	public String getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
}
