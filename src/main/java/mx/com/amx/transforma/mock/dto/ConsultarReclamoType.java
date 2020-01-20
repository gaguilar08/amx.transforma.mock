package mx.com.amx.transforma.mock.dto;

import java.time.LocalDate;

public class ConsultarReclamoType {
	
	private String FAREV_CLI_NUM_DOC;	// RUC	
	private String FAREV_CLI_NOMBRE; 	// Razon Social
	private String FAREV_NOMBRES;		// Nombres
	private String FAREV_APELLIDOS;		// Apellidos
	private String FAREV_TIPO_DOC;		// Tipo de documento Representante.	Y	-	varchar
	private String FAREV_NRO_DOC;		// Número de documento Representante.	Y	-	varchar
	private String TELEFONO_REFERENCIA;	// Teléfono de referencia movil.	N	-	varchar
	private String FAREN_TFNO_REF_FIJO;	//Teléfono de referencia fijo.	N	-	varchar
	private String FAREV_DIRECCION;		// Dirección del cliente titular.	Y	-	varchar
	private String FAREV_UBIGEO_DPTO;	// Departamento	Y	-	varchar
	private String FAREV_UBIGEO_PROVI;	// Provincia.	Y	-	varchar
	private String FAREV_UBIGEO_DIST;	// Distrito.	Y	-	varchar
	private String FAREV_DESC_FORMANOT;	// Forma de notificación	N	-	varchar
	private String FAREV_EMAIL;			// E-mail de contacto.	N	-	varchar
	private String TIPO_SERVICIO;		// Servicios afectados	Y	-	varchar
	private String V_CONCSERVICIO;		// Lista de servicios.	Y	-	varchar
	private String TIPO_CASO;			// Materia del reclamo.	Y	-	varchar
	private String V_CONCMATERIA;		// Lista de materias seleccionadas.	N	-	varchar
	private String RCONV_DESC_PROBLEM;	// Descripción del problema.	Y	-	text
	private String RCONV_DECART_REALIZ;	// Descartes realizados.	N	-	text
	private String RCONC_CONCLUSIONES;	// Conclusiones.	N	-	text
	private String FAREN_CANT_FOLIOS;	// Cantidad de folios.	N	-	varchar
	private String FAREV_APR_RECL;		// Usuario que aprobará.	N	-	varchar
	private String FAREV_CENTRO_ATEN;	// Centro de atención.	Y	-	varchar
	private String RCONV_DIREC_SERV;	// Dirección de instalación.	N	-	varchar
	private String RCONV_SERV_DPTO;		// Departamento averia.	N	-	varchar
	private String RCONV_SERV_PROVI;	// Provincia averia.	N	-	varchar
	private String RCONV_SERV_DIST;		// Distrito averia.	N	-	varchar
	private String RCONV_SERV_CENT_POBL; //Centro Poblado.	N	-	varchar
	private String RCONV_SERV_TIPO_ZONA;	//Tipo de zona.	N	-	varchar
	private String FAREN_PLAZO_AT;	//	Plazo de atención.	N	-	varchar
	private Integer V_CONCMD;		// Información de montos en disputa.
	private Boolean V_FLAG_MD;		//Indica si existe MD.
	
	private LocalDate FAREV_creacion;	// 09/10/2019 09:57:35 a.m.
	private String FAREV_tipo;		// SGA
	private String FAREV_clase;		// Problema
	private String FAREV_subclase;	// Facturación
	private String FAREV_estado;		// Concluido
	private String FAREV_fase;		// Reclamo primera instancia
	private String FAREV_noReclamo;	// 190259325
	private String FAREV_condicion;	// Cerrado
	
	
	
	public LocalDate getFAREV_creacion() {
		return FAREV_creacion;
	}
	public void setFAREV_creacion(LocalDate fAREV_creacion) {
		FAREV_creacion = fAREV_creacion;
	}
	public String getFAREV_tipo() {
		return FAREV_tipo;
	}
	public void setFAREV_tipo(String fAREV_tipo) {
		FAREV_tipo = fAREV_tipo;
	}
	public String getFAREV_clase() {
		return FAREV_clase;
	}
	public void setFAREV_clase(String fAREV_clase) {
		FAREV_clase = fAREV_clase;
	}
	public String getFAREV_subclase() {
		return FAREV_subclase;
	}
	public void setFAREV_subclase(String fAREV_subclase) {
		FAREV_subclase = fAREV_subclase;
	}
	public String getFAREV_estado() {
		return FAREV_estado;
	}
	public void setFAREV_estado(String fAREV_estado) {
		FAREV_estado = fAREV_estado;
	}
	public String getFAREV_fase() {
		return FAREV_fase;
	}
	public void setFAREV_fase(String fAREV_fase) {
		FAREV_fase = fAREV_fase;
	}
	public String getFAREV_noReclamo() {
		return FAREV_noReclamo;
	}
	public void setFAREV_noReclamo(String fAREV_noReclamo) {
		FAREV_noReclamo = fAREV_noReclamo;
	}
	public String getFAREV_condicion() {
		return FAREV_condicion;
	}
	public void setFAREV_condicion(String fAREV_condicion) {
		FAREV_condicion = fAREV_condicion;
	}
	public String getFAREV_CLI_NUM_DOC() {
		return FAREV_CLI_NUM_DOC;
	}
	public void setFAREV_CLI_NUM_DOC(String fAREV_CLI_NUM_DOC) {
		FAREV_CLI_NUM_DOC = fAREV_CLI_NUM_DOC;
	}
	public String getFAREV_CLI_NOMBRE() {
		return FAREV_CLI_NOMBRE;
	}
	public void setFAREV_CLI_NOMBRE(String fAREV_CLI_NOMBRE) {
		FAREV_CLI_NOMBRE = fAREV_CLI_NOMBRE;
	}
	public String getFAREV_NOMBRES() {
		return FAREV_NOMBRES;
	}
	public void setFAREV_NOMBRES(String fAREV_NOMBRES) {
		FAREV_NOMBRES = fAREV_NOMBRES;
	}
	public String getFAREV_APELLIDOS() {
		return FAREV_APELLIDOS;
	}
	public void setFAREV_APELLIDOS(String fAREV_APELLIDOS) {
		FAREV_APELLIDOS = fAREV_APELLIDOS;
	}
	public String getFAREV_TIPO_DOC() {
		return FAREV_TIPO_DOC;
	}
	public void setFAREV_TIPO_DOC(String fAREV_TIPO_DOC) {
		FAREV_TIPO_DOC = fAREV_TIPO_DOC;
	}
	public String getFAREV_NRO_DOC() {
		return FAREV_NRO_DOC;
	}
	public void setFAREV_NRO_DOC(String fAREV_NRO_DOC) {
		FAREV_NRO_DOC = fAREV_NRO_DOC;
	}
	public String getTELEFONO_REFERENCIA() {
		return TELEFONO_REFERENCIA;
	}
	public void setTELEFONO_REFERENCIA(String tELEFONO_REFERENCIA) {
		TELEFONO_REFERENCIA = tELEFONO_REFERENCIA;
	}
	public String getFAREN_TFNO_REF_FIJO() {
		return FAREN_TFNO_REF_FIJO;
	}
	public void setFAREN_TFNO_REF_FIJO(String fAREN_TFNO_REF_FIJO) {
		FAREN_TFNO_REF_FIJO = fAREN_TFNO_REF_FIJO;
	}
	public String getFAREV_DIRECCION() {
		return FAREV_DIRECCION;
	}
	public void setFAREV_DIRECCION(String fAREV_DIRECCION) {
		FAREV_DIRECCION = fAREV_DIRECCION;
	}
	public String getFAREV_UBIGEO_DPTO() {
		return FAREV_UBIGEO_DPTO;
	}
	public void setFAREV_UBIGEO_DPTO(String fAREV_UBIGEO_DPTO) {
		FAREV_UBIGEO_DPTO = fAREV_UBIGEO_DPTO;
	}
	public String getFAREV_UBIGEO_PROVI() {
		return FAREV_UBIGEO_PROVI;
	}
	public void setFAREV_UBIGEO_PROVI(String fAREV_UBIGEO_PROVI) {
		FAREV_UBIGEO_PROVI = fAREV_UBIGEO_PROVI;
	}
	public String getFAREV_UBIGEO_DIST() {
		return FAREV_UBIGEO_DIST;
	}
	public void setFAREV_UBIGEO_DIST(String fAREV_UBIGEO_DIST) {
		FAREV_UBIGEO_DIST = fAREV_UBIGEO_DIST;
	}
	public String getFAREV_DESC_FORMANOT() {
		return FAREV_DESC_FORMANOT;
	}
	public void setFAREV_DESC_FORMANOT(String fAREV_DESC_FORMANOT) {
		FAREV_DESC_FORMANOT = fAREV_DESC_FORMANOT;
	}
	public String getFAREV_EMAIL() {
		return FAREV_EMAIL;
	}
	public void setFAREV_EMAIL(String fAREV_EMAIL) {
		FAREV_EMAIL = fAREV_EMAIL;
	}
	public String getTIPO_SERVICIO() {
		return TIPO_SERVICIO;
	}
	public void setTIPO_SERVICIO(String tIPO_SERVICIO) {
		TIPO_SERVICIO = tIPO_SERVICIO;
	}
	public String getV_CONCSERVICIO() {
		return V_CONCSERVICIO;
	}
	public void setV_CONCSERVICIO(String v_CONCSERVICIO) {
		V_CONCSERVICIO = v_CONCSERVICIO;
	}
	public String getTIPO_CASO() {
		return TIPO_CASO;
	}
	public void setTIPO_CASO(String tIPO_CASO) {
		TIPO_CASO = tIPO_CASO;
	}
	public String getV_CONCMATERIA() {
		return V_CONCMATERIA;
	}
	public void setV_CONCMATERIA(String v_CONCMATERIA) {
		V_CONCMATERIA = v_CONCMATERIA;
	}
	public String getRCONV_DESC_PROBLEM() {
		return RCONV_DESC_PROBLEM;
	}
	public void setRCONV_DESC_PROBLEM(String rCONV_DESC_PROBLEM) {
		RCONV_DESC_PROBLEM = rCONV_DESC_PROBLEM;
	}
	public String getRCONV_DECART_REALIZ() {
		return RCONV_DECART_REALIZ;
	}
	public void setRCONV_DECART_REALIZ(String rCONV_DECART_REALIZ) {
		RCONV_DECART_REALIZ = rCONV_DECART_REALIZ;
	}
	public String getRCONC_CONCLUSIONES() {
		return RCONC_CONCLUSIONES;
	}
	public void setRCONC_CONCLUSIONES(String rCONC_CONCLUSIONES) {
		RCONC_CONCLUSIONES = rCONC_CONCLUSIONES;
	}
	public String getFAREN_CANT_FOLIOS() {
		return FAREN_CANT_FOLIOS;
	}
	public void setFAREN_CANT_FOLIOS(String fAREN_CANT_FOLIOS) {
		FAREN_CANT_FOLIOS = fAREN_CANT_FOLIOS;
	}
	public String getFAREV_APR_RECL() {
		return FAREV_APR_RECL;
	}
	public void setFAREV_APR_RECL(String fAREV_APR_RECL) {
		FAREV_APR_RECL = fAREV_APR_RECL;
	}
	public String getFAREV_CENTRO_ATEN() {
		return FAREV_CENTRO_ATEN;
	}
	public void setFAREV_CENTRO_ATEN(String fAREV_CENTRO_ATEN) {
		FAREV_CENTRO_ATEN = fAREV_CENTRO_ATEN;
	}
	public String getRCONV_DIREC_SERV() {
		return RCONV_DIREC_SERV;
	}
	public void setRCONV_DIREC_SERV(String rCONV_DIREC_SERV) {
		RCONV_DIREC_SERV = rCONV_DIREC_SERV;
	}
	public String getRCONV_SERV_DPTO() {
		return RCONV_SERV_DPTO;
	}
	public void setRCONV_SERV_DPTO(String rCONV_SERV_DPTO) {
		RCONV_SERV_DPTO = rCONV_SERV_DPTO;
	}
	public String getRCONV_SERV_PROVI() {
		return RCONV_SERV_PROVI;
	}
	public void setRCONV_SERV_PROVI(String rCONV_SERV_PROVI) {
		RCONV_SERV_PROVI = rCONV_SERV_PROVI;
	}
	public String getRCONV_SERV_DIST() {
		return RCONV_SERV_DIST;
	}
	public void setRCONV_SERV_DIST(String rCONV_SERV_DIST) {
		RCONV_SERV_DIST = rCONV_SERV_DIST;
	}
	public String getRCONV_SERV_CENT_POBL() {
		return RCONV_SERV_CENT_POBL;
	}
	public void setRCONV_SERV_CENT_POBL(String rCONV_SERV_CENT_POBL) {
		RCONV_SERV_CENT_POBL = rCONV_SERV_CENT_POBL;
	}
	public String getRCONV_SERV_TIPO_ZONA() {
		return RCONV_SERV_TIPO_ZONA;
	}
	public void setRCONV_SERV_TIPO_ZONA(String rCONV_SERV_TIPO_ZONA) {
		RCONV_SERV_TIPO_ZONA = rCONV_SERV_TIPO_ZONA;
	}
	public String getFAREN_PLAZO_AT() {
		return FAREN_PLAZO_AT;
	}
	public void setFAREN_PLAZO_AT(String fAREN_PLAZO_AT) {
		FAREN_PLAZO_AT = fAREN_PLAZO_AT;
	}
	public Integer getV_CONCMD() {
		return V_CONCMD;
	}
	public void setV_CONCMD(Integer v_CONCMD) {
		V_CONCMD = v_CONCMD;
	}
	public Boolean getV_FLAG_MD() {
		return V_FLAG_MD;
	}
	public void setV_FLAG_MD(Boolean v_FLAG_MD) {
		V_FLAG_MD = v_FLAG_MD;
	}
	
	
	


}
