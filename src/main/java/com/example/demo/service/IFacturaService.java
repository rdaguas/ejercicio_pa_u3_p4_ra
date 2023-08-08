package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.repository.modelo.Factura;

public interface IFacturaService {

	public List<Factura> listareporteFactura(LocalDate fecha, String categoria, String Cantidad);
}
