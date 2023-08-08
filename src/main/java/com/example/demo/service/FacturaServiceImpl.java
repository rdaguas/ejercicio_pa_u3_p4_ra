package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IFacturaRepository;
import com.example.demo.repository.modelo.DetalleFactura;
import com.example.demo.repository.modelo.Factura;
import com.example.demo.repository.modelo.Producto;
@Service
public class FacturaServiceImpl implements IFacturaService{

	@Autowired
	private IFacturaRepository facturaRepository;
	
	@Override
	public List<Factura> listareporteFactura(LocalDate fecha, String categoria, String Cantidad) {
		Factura fac = new Factura();
		DetalleFactura df = new DetalleFactura();
		Producto pro = new Producto();
		
		fac.setFecha(fecha);
		df.setCantidad(Cantidad);
		pro.setCategoria(categoria);
		return this.facturaRepository.reporteFactura();
	}

}
