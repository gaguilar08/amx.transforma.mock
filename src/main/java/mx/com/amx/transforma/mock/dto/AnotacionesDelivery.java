package mx.com.amx.transforma.mock.dto;

public class AnotacionesDelivery {
	
	private String anotaTarea;
	private String  anotaObservacion;
	
	public AnotacionesDelivery(String anotaTarea, String anotaObservacion) {
		super();
		this.anotaTarea = anotaTarea;
		this.anotaObservacion = anotaObservacion;
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


}
