package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Producto;

public interface IProductoService {

	// CRUD
	public void agregar(Producto producto);
	public void actualizar(Producto producto);
	public Producto encontrar(String stock);
	public void eliminar(String stock);
	public List<Producto> buscarListaProductos(String codigoBarras, String cantidad);
}
