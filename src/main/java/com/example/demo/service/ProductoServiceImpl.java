package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IProductoRepository;
import com.example.demo.repository.modelo.DetalleFactura;
import com.example.demo.repository.modelo.Producto;

@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private IProductoRepository productoRepository;

	@Override
	public void agregar(Producto producto) {
		this.productoRepository.insertar(producto);
		
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Producto encontrar(String stock) {
		// TODO Auto-generated method stub
		return this.productoRepository.seleccionar(stock);
	}

	@Override
	public void eliminar(String stock) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Producto> buscarListaProductos(String codigoBarras, String cantidad) {
		Producto prod = new Producto();
		DetalleFactura defa = new DetalleFactura();
		prod.setCodigoBarras(codigoBarras);
		defa.setCantidad(cantidad);
		
		//this.citaMedicaRepository.insertar(cime);
		return this.productoRepository.listaProductos(codigoBarras, cantidad);
	}

}
