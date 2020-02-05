package mx.com.amx.transforma.mock.service;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;
//import org.apache.commons.io.FileUtils;

import mx.com.amx.transforma.mock.dto.AnotacionesDelivery;
import mx.com.amx.transforma.mock.dto.ConsultarReclamoType;
import mx.com.amx.transforma.mock.dto.Delivery;
import mx.com.amx.transforma.mock.dto.DeliveryCL;
import mx.com.amx.transforma.mock.dto.Disponibilidad;
import mx.com.amx.transforma.mock.dto.DocumentoBase64;
import mx.com.amx.transforma.mock.dto.Factura;
import mx.com.amx.transforma.mock.dto.FacturasGuardada;
import mx.com.amx.transforma.mock.dto.FacturasGuardadaChile;
import mx.com.amx.transforma.mock.dto.IncidenteTecnico;
import mx.com.amx.transforma.mock.dto.Reclamo;
import mx.com.amx.transforma.mock.dto.RequestBodyDelivery;
import mx.com.amx.transforma.mock.dto.RequestBodyDeliveryCL;
import mx.com.amx.transforma.mock.dto.RequestBodyFactura;
import mx.com.amx.transforma.mock.dto.RequestBodyIncidente;

@Service
public class IMockServiceImpl implements IMockService {

	Date objDate = new Date();

	LocalDate date = LocalDate.now();
	String text = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
	LocalDate parsedDate = LocalDate.parse(text, DateTimeFormatter.ISO_LOCAL_DATE);

	@Override
	public List<Factura> buscarTodasFacturas(RequestBodyFactura parametro) {
		List<Factura> listFacturas = new ArrayList<>();

		if (parametro.getIdCliente().equals("45563214") && parametro.getTipoFacturacion().equals("Fija")) {
			Factura fa1 = new Factura("54321", "3,452.34", "12,432.15", parsedDate.minusDays(10),
					parsedDate.plusDays(1));

			Factura fa2 = new Factura("54345", "756.87", "34,456.77", parsedDate.minusDays(15), parsedDate.plusDays(2));

			Factura fa3 = new Factura("55621", "11,456.34", "1,567.53", parsedDate.minusDays(20),
					parsedDate.plusDays(3));

			Factura fa4 = new Factura("65321", "0", "1,456,456.45", parsedDate.minusDays(25), parsedDate.plusDays(4));

			Factura fa5 = new Factura("74334", "-12.12", "700", parsedDate.minusDays(30), parsedDate.plusDays(5));

			listFacturas.add(fa1);
			listFacturas.add(fa2);
			listFacturas.add(fa3);
			listFacturas.add(fa4);
			listFacturas.add(fa5);

		}

		if (parametro.getIdCliente().equals("45563214") && parametro.getTipoFacturacion().equals("Movil")) {
			Factura fa7 = new Factura("98765", "0", "0", parsedDate.minusDays(10), parsedDate.plusDays(1));

			Factura fa8 = new Factura("98123", "0", "0", parsedDate.minusDays(15), parsedDate.plusDays(2));

			Factura fa9 = new Factura("98654", "0", "0", parsedDate.minusDays(20), parsedDate.plusDays(3));

			listFacturas.add(fa7);
			listFacturas.add(fa8);
			listFacturas.add(fa9);
		}

		return listFacturas;
	}

	@Override
	public List<Disponibilidad> buscarDisponiblidadEquipos() {
		List<Disponibilidad> listaDisponibilidad = new ArrayList<>();
		Disponibilidad dp1 = new Disponibilidad("J941", "P003", "000000000004004729", "78");

		listaDisponibilidad.add(dp1);
		return listaDisponibilidad;
	}

	@Override
	public List<Delivery> buscarSOT(RequestBodyDelivery parametro) {
		List<Delivery> listDelivery = new ArrayList<>();

		if ((parametro.getIdOportunidad() != null && parametro.getIdOportunidad().equals("0063F00000Jk0TrQAJ"))
				&& (parametro.getIdPropuesta() == null)) {
			List<AnotacionesDelivery> list_ad1 = new ArrayList<>();
			AnotacionesDelivery ad1 = new AnotacionesDelivery("Agenda cuadrilla configurable",
					"No se verifica los entregables Gráfico y SCR. Regularizar", "E3003053", parsedDate);
			list_ad1.add(ad1);
			Delivery de1 = new Delivery("33990215", "0005774368", "9963689", "Atendida", "TRASLADO EXTERNO",
					"Red Privada Virtual Full Mesh", parsedDate, parsedDate, parsedDate, list_ad1);

			List<AnotacionesDelivery> list_ad2 = new ArrayList<>();
			AnotacionesDelivery ad2_1 = new AnotacionesDelivery("GIS Instalación PEX",
					"Cierre masivo por auditoría interna", "C14591", parsedDate);
			AnotacionesDelivery ad2_2 = new AnotacionesDelivery("Agenda cuadrilla configurable",
					"No se verifica los entregables Gráfico y SCR. Regularizar", "C14591", parsedDate);
			list_ad2.add(ad2_1);
			list_ad2.add(ad2_2);
			Delivery de2 = new Delivery("29671410", "0005137929", "7977765", "Cerrada", "INSTALACION",
					"Red Privada Virtual Full Mesh", parsedDate, parsedDate, parsedDate, list_ad2);

			listDelivery.add(de1);
			listDelivery.add(de2);

		}
		if ((parametro.getNroSolicitud() != null && parametro.getNroSolicitud().equals("3000577436815"))) {
			List<AnotacionesDelivery> list_ad3 = new ArrayList<>();

			AnotacionesDelivery ad3 = new AnotacionesDelivery("Activación /Desactivación del servicio",
					"\"De: Hernan Reynoso Jeri \r\n" + "Enviado el: lunes, 20 de mayo de 2019 06:29 p.m.\r\n"
							+ "Para: BO Soporte Ventas Fijas\r\n"
							+ "CC: Patricia Ballon; CARLOS FRANCISCO CHUMPITAZ GUERRERO; Elmer Jooel Peña Tocto; ELBA NATALIA INFANTES TATAJE\r\n"
							+ "Asunto: RE: RENOVACION DE CONTRATO G W YICHANG & CIA S A\r\n" + "\r\n"
							+ "Ok, 01.06.2019. Gracias!\r\n" + "\r\n" + "De: BO Soporte Ventas Fijas \r\n"
							+ "Enviado el: lunes 20 de mayo de 2019 06:27 PM\r\n"
							+ "Para: Hernan Reynoso Jeri <hernan.reynoso@claro.com.pe>\r\n"
							+ "CC: Patricia Ballon <pballon@claro.com.pe>; CARLOS FRANCISCO CHUMPITAZ GUERRERO <E3002061@claro.com.pe>; Elmer Jooel Peña Tocto <epena.mdy@claro.com.pe>; ELBA NATALIA INFANTES TATAJE <einfantes.mdy@claro.com.pe>\r\n"
							+ "Asunto: RENOVACION DE CONTRATO G W YICHANG & CIA S A\r\n" + "\r\n"
							+ "Estimado Hernán,\r\n" + "\r\n"
							+ "Se verifica que cuenta con una factura emitida el 01.05.2019 con el periodo del 01.05.2019 al  31.05.2019 lo recomendable seria cerrar con 01.06.2019 para no generar prorrateos o de todas maneras deseas que cerremos la Sot con fecha 01.05.2019. \r\n"
							+ "A la espera de tu confirmación.\r\n" + "\r\n" + "Saludos cordiales\r\n" + "\r\n"
							+ "E3000075\r\n" + "BO Soporte Ventas Fijas\r\n" + "\r\n"
							+ "bosoporteventasfijas@claro.com.pe \r\n" + "\r\n" + " \r\n" + "\r\n"
							+ "De: Hernan Reynoso Jeri \r\n" + "Enviado el: viernes, 17 de mayo de 2019 01:19 p.m.\r\n"
							+ "Para: BO Soporte Ventas Fijas\r\n"
							+ "CC: Patricia Ballon; CARLOS FRANCISCO CHUMPITAZ GUERRERO; Elmer Jooel Peña Tocto; ELBA NATALIA INFANTES TATAJE\r\n"
							+ "Asunto: Re: RENOVACION DE CONTRATO G W YICHANG & CIA S A\r\n" + "\r\n"
							+ "01/05 pf. Gracias\r\n" + "\r\n"
							+ "El 17 may. 2019 12:32 PM, BO Soporte Ventas Fijas <bosoporteventasfijas@claro.com.pe> escribió:\r\n"
							+ "Estimado Hernán.\r\n" + " \r\n"
							+ "Por favor indicar con qué fecha se estaría haciendo la renovación de contrato de la siguiente SOT, ya que hasta el momento siguen como pendiente para su renovación:\r\n"
							+ " \r\n" + "CODIGO CLIENTE  NOMBRE DEL CLIENTE  CATEGORIA  SOT DE RENOVACION PROYECTO\r\n"
							+ "0003910 G W YICHANG & CIA S A PRIVADO 34177596 5846557\r\n" + " \r\n"
							+ "Saludos cordiales\r\n" + " \r\n" + "E3000075\r\n" + "BO Soporte Ventas Fijas\r\n"
							+ "                                                                                                                                                                                                              \r\n"
							+ "bosoporteventasfijas@claro.com.pe \r\n" + " \r\n" + " \r\n" + "\r\n"
							+ "De: Hernan Reynoso Jeri \r\n" + "Enviado el: lunes, 20 de mayo de 2019 06:29 p.m.\r\n"
							+ "Para: BO Soporte Ventas Fijas\r\n"
							+ "CC: Patricia Ballon; CARLOS FRANCISCO CHUMPITAZ GUERRERO; Elmer Jooel Peña Tocto; ELBA NATALIA INFANTES TATAJE\r\n"
							+ "Asunto: RE: RENOVACION DE CONTRATO G W YICHANG & CIA S A\r\n" + "\r\n"
							+ "Ok, 01.06.2019. Gracias!\r\n" + "\r\n" + "De: BO Soporte Ventas Fijas \r\n"
							+ "Enviado el: lunes 20 de mayo de 2019 06:27 PM\r\n"
							+ "Para: Hernan Reynoso Jeri <hernan.reynoso@claro.com.pe>\r\n"
							+ "CC: Patricia Ballon <pballon@claro.com.pe>; CARLOS FRANCISCO CHUMPITAZ GUERRERO <E3002061@claro.com.pe>; Elmer Jooel Peña Tocto <epena.mdy@claro.com.pe>; ELBA NATALIA INFANTES TATAJE <einfantes.mdy@claro.com.pe>\r\n"
							+ "Asunto: RENOVACION DE CONTRATO G W YICHANG & CIA S A\r\n" + "\r\n"
							+ "Estimado Hernán,\r\n" + "\r\n"
							+ "Se verifica que cuenta con una factura emitida el 01.05.2019 con el periodo del 01.05.2019 al  31.05.2019 lo recomendable seria cerrar con 01.06.2019 para no generar prorrateos o de todas maneras deseas que cerremos la Sot con fecha 01.05.2019. \r\n"
							+ "A la espera de tu confirmación.\r\n" + "\r\n" + "Saludos cordiales\r\n" + "\r\n"
							+ "E3000075\r\n" + "BO Soporte Ventas Fijas\r\n" + "bosoporteventasfijas@claro.com.pe \r\n"
							+ "De: Hernan Reynoso Jeri \r\n" + "Enviado el: viernes, 17 de mayo de 2019 01:19 p.m.\r\n"
							+ "Para: BO Soporte Ventas Fijas\r\n"
							+ "CC: Patricia Ballon; CARLOS FRANCISCO CHUMPITAZ GUERRERO; Elmer Jooel Peña Tocto; ELBA NATALIA INFANTES TATAJE\r\n"
							+ "Asunto: Re: RENOVACION DE CONTRATO G W YICHANG & CIA S A\r\n" + "01/05 pf. Gracias\r\n"
							+ "El 17 may. 2019 12:32 PM, BO Soporte Ventas Fijas <bosoporteventasfijas@claro.com.pe> escribió:\r\n"
							+ "Estimado Hernán.\r\n"
							+ "Por favor indicar con qué fecha se estaría haciendo la renovación de contrato de la siguiente SOT, ya que hasta el momento siguen como pendiente para su renovación:\r\n"
							+ "CODIGO CLIENTE  NOMBRE DEL CLIENTE  CATEGORIA  SOT DE RENOVACION PROYECTO\r\n"
							+ "0003910 G W YICHANG & CIA S A PRIVADO 34177596 5846557\r\n" + " \r\n"
							+ "Saludos cordiales\r\n" + "\"\r\n" + "",
					"E3003053", parsedDate);

			list_ad3.add(ad3);

			Delivery de3 = new Delivery("34177596", "5846557", "8020069", "Cerrada", "RENOVACION DE CONTRATO",
					"Acceso Dedicado a Internet", parsedDate, parsedDate, parsedDate, list_ad3);

			listDelivery.add(de3);
		}

		// TODO Auto-generated method stub
		return listDelivery;
	}

	@Override
	public List<Reclamo> consultaReclamo(String codCliente) {
		List<Reclamo> listReclamo = new ArrayList<>();

		if (codCliente.equals("20122386229")) {
			ConsultarReclamoType conRec1 = new ConsultarReclamoType();
			conRec1.setFAREV_CLI_NOMBRE("20122386229");
			conRec1.setFAREV_CLI_NOMBRE("Jockey club del Perú");
			conRec1.setFAREV_NOMBRES("TI CLARO");
			conRec1.setFAREV_APELLIDOS("Peru");
			conRec1.setTIPO_SERVICIO("Productos corporativos");
			conRec1.setRCONV_DESC_PROBLEM("Descripción del problema");
			conRec1.setRCONC_CONCLUSIONES("Concluciones");
			conRec1.setV_CONCMD(14367);
			conRec1.setFAREV_creacion(parsedDate);
			conRec1.setFAREV_tipo("SGA");
			conRec1.setFAREV_clase("PROBLEMA");
			conRec1.setFAREV_subclase("Facturación");
			conRec1.setFAREV_estado("Concluido");
			conRec1.setFAREV_fase("Instancia");
			conRec1.setFAREV_noReclamo("190259325");
			conRec1.setFAREV_condicion("Cerrado");

			Reclamo re1 = new Reclamo(conRec1, parsedDate, "codigoRespuesta OK", "mensajeRespuesta");
			listReclamo.add(re1);
		}

		if (codCliente.equals("20530811001")) {
			ConsultarReclamoType conRec2 = new ConsultarReclamoType();

			conRec2.setFAREV_CLI_NOMBRE("20530811001");
			conRec2.setFAREV_CLI_NOMBRE("Coca Cola - Perú");
			conRec2.setFAREV_NOMBRES("TI CLARO");
			conRec2.setFAREV_APELLIDOS("Peru");
			conRec2.setTIPO_SERVICIO("Productos corporativos");
			conRec2.setRCONV_DESC_PROBLEM("Descripción del problema");
			conRec2.setRCONC_CONCLUSIONES("Concluciones");
			conRec2.setV_CONCMD(14367);
			conRec2.setFAREV_creacion(parsedDate);
			conRec2.setFAREV_tipo("SGA");
			conRec2.setFAREV_clase("PROBLEMA");
			conRec2.setFAREV_subclase("Facturación");
			conRec2.setFAREV_estado("Concluido");
			conRec2.setFAREV_fase("Instancia");
			conRec2.setFAREV_noReclamo("190259325");
			conRec2.setFAREV_condicion("Cerrado");

			Reclamo re2 = new Reclamo(conRec2, parsedDate, "codigoRespuesta OK", "mensajeRespuesta");
			listReclamo.add(re2);

		}

		return listReclamo;
	}

	@Override
	public FacturasGuardada consultarFacturaGuardada() {
		
		File reportFile = new File("file1.txt");
		String fileAsString = null;
		try {
			fileAsString = FileUtils.readFileToString(reportFile);
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println(fileAsString);
		
		byte[] decoder = Base64.getDecoder().decode(fileAsString);

		FacturasGuardada response = new FacturasGuardada(decoder.toString(), "0", "éxito");
		return response;
	}

	@Override
	public List<IncidenteTecnico> consultaIncidente(RequestBodyIncidente parametro) {
		List<IncidenteTecnico> listIncidente = new ArrayList<>();

		if (parametro != null && (parametro.getCodigoCliente() != null && parametro.getCodigoCliente().equals("45563214"))) {

			IncidenteTecnico inc1 = new IncidenteTecnico(18309939, 1, "Registrada",
					"Descripción del diagnóstico de la incidencia", parsedDate, parsedDate,
					"Descripción de la incidencia", "Nombre del Ejecutivo", "Nombre del Asistente");

			IncidenteTecnico inc2 = new IncidenteTecnico(18309940, 2, "Suspendida",
					"Descripción del diagnóstico de la incidencia", parsedDate, parsedDate,
					"Descripción de la incidencia", "Nombre del Ejecutivo", "Nombre del Asistente");

			IncidenteTecnico inc3 = new IncidenteTecnico(18309941, 1, "En progreso",
					"Descripción del diagnóstico de la incidencia", parsedDate, parsedDate,
					"Descripción de la incidencia", "Nombre del Ejecutivo", "Nombre del Asistente");

			listIncidente.add(inc1);
			listIncidente.add(inc2);
			listIncidente.add(inc3);

		}

		if (parametro != null && (parametro.getCodigoCliente() != null && parametro.getCodigoCliente().equals("12345678"))
				&& (parametro.getTipoIncidencia() == null)) {

			IncidenteTecnico inc5 = new IncidenteTecnico(18309798, 1, "Registrada",
					"Descripción del diagnóstico de la incidencia", parsedDate.minusDays(5), parsedDate.plusDays(5),
					"Descripción de la incidencia", "Nombre del Ejecutivo", "Nombre del Asistente");

			IncidenteTecnico inc6 = new IncidenteTecnico(18309800, 2, "Suspendida",
					"Descripción del diagnóstico de la incidencia", parsedDate.minusDays(5), parsedDate.plusDays(1),
					"Descripción de la incidencia", "Nombre del Ejecutivo", "Nombre del Asistente");

			IncidenteTecnico inc7 = new IncidenteTecnico(18309850, 1, "En progreso",
					"Descripción del diagnóstico de la incidencia", parsedDate.minusDays(4), parsedDate.plusDays(2),
					"Descripción de la incidencia", "Nombre del Ejecutivo", "Nombre del Asistente");

			IncidenteTecnico inc8 = new IncidenteTecnico(18309900, 1, "En progreso",
					"Descripción del diagnóstico de la incidencia", parsedDate.minusDays(3), parsedDate.plusDays(3),
					"Descripción de la incidencia", "Nombre del Ejecutivo", "Nombre del Asistente");

			IncidenteTecnico inc9 = new IncidenteTecnico(18309123, 1, "En progreso",
					"Descripción del diagnóstico de la incidencia", parsedDate.minusDays(2), parsedDate.plusDays(4),
					"Descripción de la incidencia", "Nombre del Ejecutivo", "Nombre del Asistente");

			IncidenteTecnico inc10 = new IncidenteTecnico(1830934, 1, "En progreso",
					"Descripción del diagnóstico de la incidencia", parsedDate.minusDays(1), parsedDate.plusDays(5),
					"Descripción de la incidencia", "Nombre del Ejecutivo", "Nombre del Asistente");

			listIncidente.add(inc5);
			listIncidente.add(inc6);
			listIncidente.add(inc7);
			listIncidente.add(inc8);
			listIncidente.add(inc9);
			listIncidente.add(inc10);
		}

		return listIncidente;
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<FacturasGuardadaChile> consultarFacturaGuardadaChile(String noFactura) {
		List<FacturasGuardadaChile> listaFactura = new ArrayList<FacturasGuardadaChile>();
		
		File reportFile = new File("file1.txt");
		String fileAsString = null;
		try {
			fileAsString = FileUtils.readFileToString(reportFile);
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println(fileAsString);
		byte[] decoder = Base64.getDecoder().decode(fileAsString);
		
		
		File reportFile2 = new File("file2.txt");
		String fileAsString2 = null;
		try {
			fileAsString2 = FileUtils.readFileToString(reportFile2);
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println(fileAsString2);
		byte[] decoder2 = Base64.getDecoder().decode(fileAsString2);

		
		if (noFactura.equals("54321")) {
			List<DocumentoBase64> listDocumentos = new ArrayList<>();
				
			
			DocumentoBase64 doc1 = new DocumentoBase64("Factura", decoder.toString());
			DocumentoBase64 doc2 = new DocumentoBase64("Resumen", decoder2.toString());

			listDocumentos.add(doc1);
			listDocumentos.add(doc2);

			FacturasGuardadaChile f1 = new FacturasGuardadaChile((ArrayList<DocumentoBase64>) listDocumentos,
					"0", "descripcionRespuesta - Éxito");

			listaFactura.add(f1);

		}
		if (noFactura.equals("98765")) {
			List<DocumentoBase64> listDocumentos2 = new ArrayList<>();

			DocumentoBase64 doc3 = new DocumentoBase64("Factura", decoder.toString());
			DocumentoBase64 doc4 = new DocumentoBase64("Resumen", decoder2.toString());
			DocumentoBase64 doc5 = new DocumentoBase64("EstadoCuenta", decoder.toString());

			listDocumentos2.add(doc3);
			listDocumentos2.add(doc4);
			listDocumentos2.add(doc5);

			FacturasGuardadaChile f1 = new FacturasGuardadaChile((ArrayList<DocumentoBase64>) listDocumentos2,
					"0", "descripcionRespuesta - Éxito");

			listaFactura.add(f1);

		}

		return listaFactura;
	}

	@Override
	public List<DeliveryCL> buscarSOT(RequestBodyDeliveryCL parametro) {
		List<DeliveryCL> response = new ArrayList<>();

		if (parametro != null && (parametro.getCodigoCliente() != 0 && parametro.getCodigoCliente() == 987654321)) {
			DeliveryCL de1 = new DeliveryCL(34234565, "Proceso", "Observación", parsedDate, parsedDate,
					"descripcionOrden", "usuarioResponsable", "usuarioAsignado");

			DeliveryCL de2 = new DeliveryCL(54346444, "Cerrado", "Observación", parsedDate, parsedDate,
					"descripcionOrden", "usuarioResponsable", "usuarioAsignado");

			DeliveryCL de3 = new DeliveryCL(96734534, "Nuevo", "Observación", parsedDate, parsedDate,
					"descripcionOrden", "usuarioResponsable", "usuarioAsignado");

			DeliveryCL de4 = new DeliveryCL(96784565, "Nuevo", "Observación", parsedDate, parsedDate,
					"descripcionOrden", "usuarioResponsable", "usuarioAsignado");

			DeliveryCL de5 = new DeliveryCL(93454345, "Pendiente", "Observación", parsedDate, parsedDate,
					"descripcionOrden", "usuarioResponsable", "usuarioAsignado");

			response.add(de1);
			response.add(de2);
			response.add(de3);
			response.add(de4);
			response.add(de5);
		}

		if (parametro != null && (parametro.getCodigoCliente() != 0 && parametro.getCodigoCliente() == 123456679)) {
			DeliveryCL de6 = new DeliveryCL(32434544, "Proceso", "Observación", parsedDate, parsedDate,
					"descripcionOrden", "usuarioResponsable", "usuarioAsignado");
			DeliveryCL de7 = new DeliveryCL(67864565, "Proceso", "Observación", parsedDate, parsedDate,
					"descripcionOrden", "usuarioResponsable", "usuarioAsignado");
			DeliveryCL de8 = new DeliveryCL(86784455, "Proceso", "Observación", parsedDate, parsedDate,
					"descripcionOrden", "usuarioResponsable", "usuarioAsignado");

			response.add(de6);
			response.add(de7);
			response.add(de8);
		}

		return response;
	}
}
