package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Producto;

public interface IProductoRepository {

	// CRUD
	public void insertar(Producto producto);
	public void actualizar(Producto producto);
	public Producto seleccionar(String stock);
	public void eliminar(String stock);
	
	public List<Producto> listaProductos(String codigoBarras, String cantidad);

}
