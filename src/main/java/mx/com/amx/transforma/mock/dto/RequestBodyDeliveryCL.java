package mx.com.amx.transforma.mock.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

public class RequestBodyDeliveryCL {
	
	private int numeroOrden;
	private String IdOportunidad;
	private int tipoTrabajo;
	private String estado;
	private LocalDate periodoInicio;
	private LocalDate periodoFinal;
	@NotNull
	private Double codigoCliente;
	
	public int getNumeroOrden() {
		return numeroOrden;
	}
	public void setNumeroOrden(int numeroOrden) {
		this.numeroOrden = numeroOrden;
	}
	public String getIdOportunidad() {
		return IdOportunidad;
	}
	public void setIdOportunidad(String idOportunidad) {
		IdOportunidad = idOportunidad;
	}
	public int getTipoTrabajo() {
		return tipoTrabajo;
	}
	public void setTipoTrabajo(int tipoTrabajo) {
		this.tipoTrabajo = tipoTrabajo;
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
	public Double getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(Double codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
	


}
