package mx.com.amx.transforma.mock.dto;

import java.util.List;

public class ConsultaCobranza {
	
	private List<ConsultaCobranzaCabConsulta> ListCobCabecera;
	private List<ConsultaCobranzaDetConsulta> ListCobDetalle;
	private int COD_RPTA;
	private String MSG_RPTA;
	
	public ConsultaCobranza(List<ConsultaCobranzaCabConsulta> listCobCabecera,
			List<ConsultaCobranzaDetConsulta> listCobDetalle, int cOD_RPTA, String mSG_RPTA) {
		super();
		ListCobCabecera = listCobCabecera;
		ListCobDetalle = listCobDetalle;
		COD_RPTA = cOD_RPTA;
		MSG_RPTA = mSG_RPTA;
	}
	
	public List<ConsultaCobranzaCabConsulta> getListCobCabecera() {
		return ListCobCabecera;
	}
	public void setListCobCabecera(List<ConsultaCobranzaCabConsulta> listCobCabecera) {
		ListCobCabecera = listCobCabecera;
	}
	public List<ConsultaCobranzaDetConsulta> getListCobDetalle() {
		return ListCobDetalle;
	}
	public void setListCobDetalle(List<ConsultaCobranzaDetConsulta> listCobDetalle) {
		ListCobDetalle = listCobDetalle;
	}
	public int getCOD_RPTA() {
		return COD_RPTA;
	}
	public void setCOD_RPTA(int cOD_RPTA) {
		COD_RPTA = cOD_RPTA;
	}
	public String getMSG_RPTA() {
		return MSG_RPTA;
	}
	public void setMSG_RPTA(String mSG_RPTA) {
		MSG_RPTA = mSG_RPTA;
	}
	
	


}
