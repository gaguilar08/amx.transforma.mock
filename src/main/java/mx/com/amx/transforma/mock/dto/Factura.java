package mx.com.amx.transforma.mock.dto;

import java.time.LocalDate;
import java.util.Date;

public class Factura {
	
	private String numFactura;
	private String total;
	private String saldo;
	// private Date fechaEmision;
	// private Date fechaVencimiento;
	private LocalDate fechaEmision;
	private LocalDate fechaVencimiento;
	
	
	public Factura(String numFactura, String total, String saldo, LocalDate fechaEmision, LocalDate fechaVencimiento) {
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
	public LocalDate getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}


}
