package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.repository.modelo.Factura;

public interface IFacturaRepository {
	
	public List<Factura> reporteFactura();

}
