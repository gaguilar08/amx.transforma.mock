package mx.com.amx.transforma.mock.dto;

public class RequestBodyFactura {
	private String idCliente;
	private String tipoFacturacion;
	private String numFactura;
	private String periodoDesde;
	private String periodoHasta;
	
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public String getTipoFacturacion() {
		return tipoFacturacion;
	}
	public void setTipoFacturacion(String tipoFacturacion) {
		this.tipoFacturacion = tipoFacturacion;
	}
	public String getNumFactura() {
		return numFactura;
	}
	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}
	public String getPeriodoDesde() {
		return periodoDesde;
	}
	public void setPeriodoDesde(String periodoDesde) {
		this.periodoDesde = periodoDesde;
	}
	public String getPeriodoHasta() {
		return periodoHasta;
	}
	public void setPeriodoHasta(String periodoHasta) {
		this.periodoHasta = periodoHasta;
	}
	

}
