package mx.com.amx.transforma.mock.dto;

public class Disponibilidad {
	
	private String centro;
	private String almacen; 
	private String material;
	
	
	public Disponibilidad(String centro, String almacen, String material, String cantidad) {
		super();
		this.centro = centro;
		this.almacen = almacen;
		this.material = material;
		this.cantidad = cantidad;
	}
	public String getCentro() {
		return centro;
	}
	public void setCentro(String centro) {
		this.centro = centro;
	}
	public String getAlmacen() {
		return almacen;
	}
	public void setAlmacen(String almacen) {
		this.almacen = almacen;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	private String cantidad; 


}
