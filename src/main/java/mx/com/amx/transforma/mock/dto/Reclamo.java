package mx.com.amx.transforma.mock.dto;

import java.time.LocalDate;

public class Reclamo {
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
	
	
	
	public Reclamo(String customerID, String cliente, LocalDate creacion, String tipo, String clase, String subclase,
			String estado, String fase, String noReclamo, String condicion, String tipoServicio,
			String descripciónProblema, String conclusiones) {
		super();
		this.customerID = customerID;
		this.cliente = cliente;
		this.creacion = creacion;
		this.tipo = tipo;
		this.clase = clase;
		this.subclase = subclase;
		this.estado = estado;
		this.fase = fase;
		this.noReclamo = noReclamo;
		this.condicion = condicion;
		this.tipoServicio = tipoServicio;
		this.descripciónProblema = descripciónProblema;
		this.conclusiones = conclusiones;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public LocalDate getCreacion() {
		return creacion;
	}
	public void setCreacion(LocalDate creacion) {
		this.creacion = creacion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public String getSubclase() {
		return subclase;
	}
	public void setSubclase(String subclase) {
		this.subclase = subclase;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getFase() {
		return fase;
	}
	public void setFase(String fase) {
		this.fase = fase;
	}
	public String getNoReclamo() {
		return noReclamo;
	}
	public void setNoReclamo(String noReclamo) {
		this.noReclamo = noReclamo;
	}
	public String getCondicion() {
		return condicion;
	}
	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}
	public String getTipoServicio() {
		return tipoServicio;
	}
	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}
	public String getDescripciónProblema() {
		return descripciónProblema;
	}
	public void setDescripciónProblema(String descripciónProblema) {
		this.descripciónProblema = descripciónProblema;
	}
	public String getConclusiones() {
		return conclusiones;
	}
	public void setConclusiones(String conclusiones) {
		this.conclusiones = conclusiones;
	}	

	

}
