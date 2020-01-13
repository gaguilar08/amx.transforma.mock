package mx.com.amx.transforma.mock.dto;

import java.util.Date;

public class Factura {
	
	private String numFactura;
	private String total;
	private String saldo;
	private Date fechaEmision;
	private Date fechaVencimiento;
	
	
	public Factura(String numFactura, String total, String saldo, Date fechaEmision, Date fechaVencimiento) {
		super();
		this.numFactura = numFactura;
		this.total = total;
		this.saldo = saldo;
		this.fechaEmision = fechaEmision;
		this.fechaVencimiento = fechaVencimiento;
	}
	public String getNumFactura() {
		return numFactura;
	}
	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getSaldo() {
		return saldo;
	}
	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}
	public Date getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}


}
