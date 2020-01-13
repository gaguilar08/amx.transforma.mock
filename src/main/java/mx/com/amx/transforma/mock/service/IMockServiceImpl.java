package mx.com.amx.transforma.mock.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;

import mx.com.amx.transforma.mock.dto.Disponibilidad;
import mx.com.amx.transforma.mock.dto.Factura;

@Service
public class IMockServiceImpl implements IMockService {
	
	Date objDate = new Date(); 

	@Override
	public List<Factura> buscarTodasFacturas() {
		// TODO Auto-generated method stub
		return armafacturas();
	}
	
	
	private List<Factura> armafacturas(){
		List<Factura> listFacturas = new ArrayList<>();
		
		Factura fa1 = new Factura("54321", "3,452.34", "12,432.15", objDate, objDate);
		
		Factura fa2 = new Factura("54321", "3,452.34", "12,432.15", objDate, objDate);

		Factura fa3 = new Factura("54321", "3,452.34", "12,432.15", objDate, objDate);
		
		Factura fa4 = new Factura("54321", "3,452.34", "12,432.15", objDate, objDate);
		
		Factura fa5 = new Factura("54321", "3,452.34", "12,432.15", objDate, objDate);

		listFacturas.add(fa1);
		listFacturas.add(fa2);
		listFacturas.add(fa3);
		listFacturas.add(fa4);
		listFacturas.add(fa5);
		listFacturas.add(fa1);
		
		return listFacturas;
	}


	@Override
	public List<Disponibilidad> buscarDisponiblidadEquipos() {
		List<Disponibilidad> listaDisponibilidad = new ArrayList<>();
		Disponibilidad dp1 = new Disponibilidad("J941", "P003", "000000000004004729", "78");
		
		listaDisponibilidad.add(dp1);
		return listaDisponibilidad;
	}

}
